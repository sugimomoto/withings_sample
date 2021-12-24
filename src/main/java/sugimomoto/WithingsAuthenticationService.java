package sugimomoto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class WithingsAuthenticationService implements AuthenticationService {

    private String endpointUrl;

    private String clientId;

    private String clientSecret;

    private String redirectUrl;

    private Scope[] scope;

    private String state;

    private final String grantType = "authorization_code";

    private final String authenticationEndpointVersion = "v2";

    private final String authenticationUrl = "https://account.withings.com/oauth2_user/authorize2";

    public WithingsAuthenticationService(String clientId, String clientSecret, String redirectUrl, Scope[] scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.scope = scope;
        this.endpointUrl = " https://wbsapi.withings.net/" + authenticationEndpointVersion + "/oauth2";
    }

    @Override
    public String getAuthorizationCode(AuthorizationParameters paramers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseResponse<AccessTokenResponse> getRefreshToken(AccessTokenResponse token) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getAuthorizationUrl(String state) {
        return getAuthorizationUrl(state,false);
    }

    @Override
    public String getAuthorizationUrl(String state, Boolean mode) {
        return authenticationUrl + "?" + AuthorizationUrlParameter.toQueryParameter(ResponseType.AUTHORIZATION_CODE,clientId,state,scope,redirectUrl,mode);
    }
    
    @Override
    public BaseResponse<AccessTokenResponse> getAccessToken(String code) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setEndpointUrl(String mockUrl) {
        // TODO Auto-generated method stub
        
    }
    
}
