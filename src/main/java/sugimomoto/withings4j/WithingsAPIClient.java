package sugimomoto.withings4j;

import java.io.IOException;

import okhttp3.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class WithingsAPIClient extends APIClient {

    private AccessToken token;

    private final String API_ENDPOINT = "https://wbsapi.withings.net";

    public WithingsAPIClient(AccessToken token) {
        this.token = token;
        this.endpointUrl = API_ENDPOINT;
    }

    @Override
    protected Headers getHeaderSettings(){
        return Headers.of("Authorization","Bearer " + token.getAccessToken());
    }

    private String getUrl(Resource resource){
        return this.endpointUrl + resource.getValue();
    }

    public ActivityBase getActivities(GetActivityQueryParameters param) throws IOException,WithingsAPIException {
        return (ActivityBase)getAPIResponse(getUrl(Resource.V2_MEASURE), param, ActivityBase.class);
    }

    public MeasBase getMeasures(GetMeasQueryParameters param) throws IOException,WithingsAPIException {
        return (MeasBase)getAPIResponse(getUrl(Resource.V1_MEASURE), param, MeasBase.class);
    }

    public void setToken(AccessToken token){
        this.token = token;
    }

    public AccessToken getToken(){
        return token;
    }
}
