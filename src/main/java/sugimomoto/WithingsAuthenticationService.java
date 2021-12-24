package sugimomoto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import okhttp3.OkHttpClient;

public class WithingsAuthenticationService implements AuthenticationService {

    private String endpointUrl;

    private String clientId;

    private String clientSecret;

    private String redirectUrl;

    private Scope[] scope;

    private final String grantType = "authorization_code";

    private final String authenticationEndpointVersion = "v2";

    private final String authenticationUrl = "https://account.withings.com/oauth2_user/authorize2";

    private static final OkHttpClient client = new OkHttpClient();

    public WithingsAuthenticationService(String clientId, String clientSecret, String redirectUrl, Scope[] scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.scope = scope;
        this.endpointUrl = " https://wbsapi.withings.net/" + authenticationEndpointVersion + "/oauth2";
    }

    @Override
    public void setEndpointUrl(String mockUrl) {
        this.endpointUrl = mockUrl;
    }

    @Override
    public BaseResponse<AccessTokenResponse> getAccessToken(String code) {
        BaseResponse<AccessTokenResponse> response = new BaseResponse<AccessTokenResponse>();

        return response;
    }

    @Override
    public BaseResponse<AccessTokenResponse> getRefreshToken(AccessTokenResponse token) {
        BaseResponse<AccessTokenResponse> response = new BaseResponse<AccessTokenResponse>();

        return response;
    }

    @Override
    public String getAuthorizationUrl(String state) {
        return getAuthorizationUrl(state,false);
    }

    @Override
    public String getAuthorizationUrl(String state, Boolean mode) {
        return authenticationUrl + "?" + AuthorizationUrlParameter.toQueryParameter(ResponseType.AUTHORIZATION_CODE,clientId,state,scope,redirectUrl,mode);
    }
}
