package sugimomoto;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WithingsAPIClient {

    private AccessTokenResponse token;

    private static final OkHttpClient client = new OkHttpClient();

    private String endpointUrl;

    private final String version = "v2";

    public WithingsAPIClient(AccessTokenResponse token) {
        this.token = token;
        this.endpointUrl = "https://wbsapi.withings.net";
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public ActivityBase getActivities(ActivitiesQueryParameters param) throws IOException,WithingsAPIException {

        String result = buildRequest(this.endpointUrl + "/" + this.version + "/measure", param.getQueryParameters());

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        ActivityBase activity = mapper.readValue(result, ActivityBase.class);

        if(activity.getStatus() != 0){
            throw new WithingsAPIException(activity.getError(),activity.getStatus());
        }

        return activity;
    }

    public String buildRequest(String url, FormBody body) throws IOException{
        Request requst = new Request.Builder()
            .url(url)
            .header("Authorization", "Bearer " + token.getAccessToken())
            .post(body)
            .build();

        Response response = client.newCall(requst).execute();

        return response.body().string();
    }
}
