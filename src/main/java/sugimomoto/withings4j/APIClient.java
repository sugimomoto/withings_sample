package sugimomoto.withings4j;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import okhttp3.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public abstract class APIClient {

    private static final OkHttpClient client = new OkHttpClient();

    protected String endpointUrl;

    public void setEndpointUrl(String mockUrl) {
        this.endpointUrl = mockUrl;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    protected abstract Headers getHeaderSettings();

    protected <T extends IResponse> IResponse getAPIResponse(String url, IQueryParameters param, Class<T> valueType) throws WithingsAPIException {
        String result = buildRequest(url, param.getQueryParameters(), getHeaderSettings());

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.registerModule(new JavaTimeModule());

        try {
            IResponse response = mapper.readValue(result, valueType);

            if (response.getStatus() != 0) {
                throw new WithingsAPIException(response.getError(), response.getStatus());
            }

            return response;
        } catch (JsonProcessingException ex) {
            throw new WithingsAPIException("For some reason, Cannot read and mapped JSON Object as Withing API Object." + ex.getStackTrace());
        }
    }

    public String buildRequest(String url, FormBody body, Headers headers) throws WithingsAPIException {
        Request requst = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(body)
                .build();

        try (Response response = client.newCall(requst).execute()) {
            if (!response.isSuccessful()) {
                throw new WithingsAPIException("For some reason HTTP response don't catch correctly.", response.code());
            }

            // Basic Withing API Error. 
            if (response.code() != 200) {
                throw new WithingsAPIException(response.body().string(), response.code());
            }

            return response.body().string();
        } catch (IOException ex) {
            /*
            https://square.github.io/okhttp/4.x/okhttp/okhttp3/-call/execute/
            if the request could not be executed due to cancellation, a connectivity problem or timeout. Because networks can fail during an exchange, it is possible that the remote server accepted the request before the failure.
            */
            throw new WithingsAPIException(ex.getMessage());
        }
    }
}
