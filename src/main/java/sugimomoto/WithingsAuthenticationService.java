package sugimomoto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.print.attribute.standard.Media;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;


public class WithingsAuthenticationService implements AuthenticationService {

    private String endpointUrl;

    private String clientId;

    private String clientSecret;

    private String redirectUrl;

    private Scope[] scope;

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
    public BaseResponse getAccessToken(String code) throws IOException {

        RequestBody body = this.buildRequestBodyWithCode(code);
        
        Request requst = new Request.Builder()
            .url("http://localhost:8081/v2/oauth2")
            .post(body)
            .build();

        Response response = client.newCall(requst).execute();
        String result = response.body().string();
        ObjectMapper mapper = new ObjectMapper();
        
        BaseResponse token = mapper.readValue(result, BaseResponse.class);

        return token;
    }

    @Override
    public BaseResponse getRefreshToken(AccessTokenResponse refreshToken) throws IOException {
        RequestBody body = this.buildRequestBodyWithRefreshToken(refreshToken.getRefreshToken());

        Request requst = new Request.Builder()
            .url(endpointUrl)
            .post(body)
            .build();

        Response response = client.newCall(requst).execute();

        ObjectMapper mapper = new ObjectMapper();
        
        BaseResponse token = mapper.readValue(response.body().byteStream(), BaseResponse.class);

        return token;
    }


    private RequestBody buildRequestBodyWithRefreshToken(String refreshToken) {
        return new FormBody.Builder()
            .add("action", "requesttoken")
            .add("client_id", clientId)
            .add("client_secret", clientSecret)
            .add("grant_type", GrantType.REFRESH_TOKEN.getValue())
            .add("refresh_token", refreshToken)
            .build();
    }

    private RequestBody buildRequestBodyWithCode(String code) {
        return new FormBody.Builder()
            .add("action", "requesttoken")
            .add("client_id", clientId)
            .add("client_secret", clientSecret)
            .add("grant_type", GrantType.AUTHORIZATION_CODE.getValue())
            .add("code", code)
            .add("redirect_uri", redirectUrl)
            .build();
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
