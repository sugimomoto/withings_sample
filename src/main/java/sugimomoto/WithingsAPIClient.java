package sugimomoto;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;

public class WithingsAPIClient extends APIClient {

    private AccessTokenResponse token;

    private final String version = "v2";

    public WithingsAPIClient(AccessTokenResponse token) {
        this.token = token;
        this.endpointUrl = "https://wbsapi.withings.net";
    }

    private Headers getHeaderSettings(){
        return Headers.of("Authorization","Bearer " + token.getAccessToken());
    }

    private String getUrl(String resource){
        return this.endpointUrl + "/" + this.version + "/" + resource;
    }

    private <T extends IResponse> IResponse getAPIResponse(String resource, IQueryParameters param,Class<T> valueType) throws IOException{
        String result = buildRequest(getUrl("measure"), param.getQueryParameters(), getHeaderSettings());

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        IResponse response = mapper.readValue(result, valueType);

        if(response.getStatus() != 0){
            throw new WithingsAPIException(response.getError(),response.getStatus());
        }

        return response;
    }

    public ActivityBase getActivities(ActivitiesQueryParameters param) throws IOException,WithingsAPIException {
        return (ActivityBase)getAPIResponse("measure", param, ActivityBase.class);
    }

    public MeasBase getMeasures(MeasQueryParameters param) throws IOException,WithingsAPIException {
        return (MeasBase)getAPIResponse("measure", param, MeasBase.class);
    }
}
