package sugimomoto.withings4j;

import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public abstract class APIClient {

    private static final OkHttpClient client = new OkHttpClient();

    protected String endpointUrl;

    public void setEndpointUrl(String mockUrl) {
        this.endpointUrl = mockUrl;
    }

    public String getEndpointUrl(){
        return endpointUrl;
    }

    protected abstract Headers getHeaderSettings();

    protected <T extends IResponse> IResponse getAPIResponse(String url, IQueryParameters param, Class<T> valueType) throws IOException, WithingsAPIException{
        String result = buildRequest(url, param.getQueryParameters(), getHeaderSettings());

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        IResponse response = mapper.readValue(result, valueType);

        if(response.getStatus() != 0){
            throw new WithingsAPIException(response.getError(),response.getStatus());
        }

        return response;
    }

    public String buildRequest(String url, FormBody body, Headers headers) throws IOException{
        Request requst = new Request.Builder()
            .url(url)
            .headers(headers)
            .post(body)
            .build();

        Response response = client.newCall(requst).execute();

        return response.body().string();
    }
}
