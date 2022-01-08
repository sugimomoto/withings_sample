package sugimomoto.withings4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;
import sugimomoto.withings4j.model.AccessToken;
import sugimomoto.withings4j.model.AccessTokenBase;
import sugimomoto.withings4j.model.GrantType;
import sugimomoto.withings4j.model.ResponseType;
import sugimomoto.withings4j.model.Scope;
import sugimomoto.withings4j.query.AuthorizationUrlParameter;


public class WithingsAuthenticationService extends APIClient implements AuthenticationService {

    private String clientId;

    private String clientSecret;

    private String redirectUrl;

    private Scope[] scope;

    private final String authenticationEndpointVersion = "v2";

    private final String authenticationUrl = "https://account.withings.com/oauth2_user/authorize2";

    public WithingsAuthenticationService(String clientId, String clientSecret, String redirectUrl, Scope[] scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.scope = scope;
        this.endpointUrl = "https://wbsapi.withings.net/" + authenticationEndpointVersion + "/oauth2";
    }

    @Override
    public AccessTokenBase getAccessToken(String code) throws IOException {
        return getToken(this.buildRequestBodyWithCode(code));
    }

    @Override
    public AccessTokenBase getRefreshToken(AccessToken refreshToken) throws IOException {
        return getToken(this.buildRequestBodyWithRefreshToken(refreshToken.getRefreshToken()));
    }

    private AccessTokenBase getToken(FormBody body) throws IOException, WithingsAPIException{
        Headers headers = Headers.of("User-Agent","Withings4J");
        String result = buildRequest(endpointUrl, body, headers);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        
        AccessTokenBase token = mapper.readValue(result, AccessTokenBase.class);

        if(token.getStatus() != 0){
            throw new WithingsAPIException(token.getError(),token.getStatus());
        }

        return token;
    }

    private FormBody buildRequestBodyWithRefreshToken(String refreshToken) {
        return new FormBody.Builder()
            .add("action", "requesttoken")
            .add("client_id", clientId)
            .add("client_secret", clientSecret)
            .add("grant_type", GrantType.REFRESH_TOKEN.getValue())
            .add("refresh_token", refreshToken)
            .build();
    }

    private FormBody buildRequestBodyWithCode(String code) {
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

    @Override
    protected Headers getHeaderSettings() {
        // TODO Auto-generated method stub
        return null;
    }
}
