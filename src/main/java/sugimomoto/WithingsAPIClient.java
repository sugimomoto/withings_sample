package sugimomoto;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http1.HeadersReader;

public class WithingsAPIClient extends APIClient {

    private AccessTokenResponse token;

    private static final OkHttpClient client = new OkHttpClient();

    private final String version = "v2";

    public WithingsAPIClient(AccessTokenResponse token) {
        this.token = token;
        this.endpointUrl = "https://wbsapi.withings.net";
    }

    public ActivityBase getActivities(ActivitiesQueryParameters param) throws IOException,WithingsAPIException {

        Headers headers = Headers.of("Authorization","Bearer " + token.getAccessToken());
        String result = buildRequest(this.endpointUrl + "/" + this.version + "/measure", param.getQueryParameters(),headers);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        ActivityBase activity = mapper.readValue(result, ActivityBase.class);

        if(activity.getStatus() != 0){
            throw new WithingsAPIException(activity.getError(),activity.getStatus());
        }

        return activity;
    }

}
