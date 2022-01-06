package sugimomoto;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;

public class WithingsAPIClient extends APIClient {

    private AccessTokenResponse token;

    private final String API_VERSION = "v2";

    private final String API_ENDPOINT = "https://wbsapi.withings.net";

    public WithingsAPIClient(AccessTokenResponse token) {
        this.token = token;
        this.endpointUrl = API_ENDPOINT;
    }

    private Headers getHeaderSettings(){
        return Headers.of("Authorization","Bearer " + token.getAccessToken());
    }

    private String getUrl(String resource){
        return this.endpointUrl + "/" + API_VERSION + "/" + resource;
    }

    private <T extends IResponse> IResponse getAPIResponse(String url, IQueryParameters param, Class<T> valueType) throws IOException{
        String result = buildRequest(url, param.getQueryParameters(), getHeaderSettings());

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        IResponse response = mapper.readValue(result, valueType);

        if(response.getStatus() != 0){
            throw new WithingsAPIException(response.getError(),response.getStatus());
        }

        return response;
    }

    public ActivityBase getActivities(ActivitiesQueryParameters param) throws IOException,WithingsAPIException {
        return (ActivityBase)getAPIResponse(getUrl("measure"), param, ActivityBase.class);
    }

    public MeasBase getMeasures(MeasQueryParameters param) throws IOException,WithingsAPIException {
        return (MeasBase)getAPIResponse(getUrl("measure"), param, MeasBase.class);
    }

    public void setToken(AccessTokenResponse token){
        this.token = token;
    }

    public AccessTokenResponse getToken(){
        return token;
    }
}
