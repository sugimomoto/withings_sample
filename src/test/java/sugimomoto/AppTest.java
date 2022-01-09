package sugimomoto;

import static org.junit.Assert.*;

import java.io.IOException;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.junit.Rule;
import org.junit.Test;

import sugimomoto.withings4j.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8081);

    private String clientId = "test_client_id";
    private String clientSecret = "test_client_secret";
    private String redirectUrl = "http://localhost:33333";
    private Scope[] scopes = {Scope.USER_METRICS};

    private String mockUrl = "http://localhost:8081";

    WithingsOAuthClient authService;

    public void init(){
        authService = new WithingsOAuthClient(clientId,clientSecret,redirectUrl,scopes);
        authService.setEndpointUrl(mockUrl + "/v2/oauth2");
    }

    @Test
    public void endpointUrlTest(){
        WithingsOAuthClient normalService = new WithingsOAuthClient(clientId,clientSecret,redirectUrl,scopes);
        assertEquals("https://wbsapi.withings.net/v2/oauth2", normalService.getEndpointUrl());
    }

    @Test
    public void oAuthAuthorizationUrlTest(){
        this.init();
        String authorizationUrl = authService.getAuthorizationUrl("12345");
        assertEquals("https://account.withings.com/oauth2_user/authorize2?response_type=code&client_id=test_client_id&state=12345&redirect_uri=http://localhost:33333&scope=user.metrics", authorizationUrl);

        authorizationUrl = authService.getAuthorizationUrl("12345",true);
        assertEquals("https://account.withings.com/oauth2_user/authorize2?response_type=code&client_id=test_client_id&state=12345&redirect_uri=http://localhost:33333&scope=user.metrics&mode=demo", authorizationUrl);
    }

    @Test
    public void authorizationParameterTest(){
        Scope[] scope = {Scope.USER_METRICS};
        String result1 = AuthorizationUrlParameter.toQueryParameter(ResponseType.AUTHORIZATION_CODE,clientId,"12345",scope,redirectUrl,true);
        assertEquals("response_type=code&client_id=test_client_id&state=12345&redirect_uri=http://localhost:33333&scope=user.metrics&mode=demo", result1);

        Scope[] scope2 = {Scope.USER_METRICS,Scope.USER_ACTIVITY};
        String result2 = AuthorizationUrlParameter.toQueryParameter(ResponseType.AUTHORIZATION_CODE,clientId,"12345",scope2,redirectUrl,false);
        assertEquals("response_type=code&client_id=test_client_id&state=12345&redirect_uri=http://localhost:33333&scope=user.metrics,user.activity", result2);

        String result3 = AuthorizationUrlParameter.toQueryParameter(ResponseType.AUTHORIZATION_CODE,clientId,"12345",null,redirectUrl,false);
        assertEquals("response_type=code&client_id=test_client_id&state=12345&redirect_uri=http://localhost:33333", result3);
    }

    @Test
    public void oAuthGetAccessTokenTest() throws IOException{
        this.init();

        AccessTokenBase token = authService.getAccessToken("dummy_code");

        AccessToken response = token.getBody();
        assertEquals("a508999978b28369eebf173ef78f2f248321e163", response.getAccessToken());
        assertEquals("296ab698174e87e29417a24032aa88f14baaebd7", response.getRefreshToken());
        assertEquals("27718374", response.getUserid());
        assertEquals((Integer)10800, response.getExpiresIn());
        assertEquals("user.metrics", response.getScope());
        assertEquals("Bearer", response.getTokenType());
    }

    @Test
    public void oAuthGetRefreshAccessTokenTest() throws IOException{
        this.init();

        AccessTokenBase token = authService.getAccessToken("dummy_code");
        AccessTokenBase refreshToken = authService.getRefreshToken(token.getBody());

        AccessToken response = refreshToken.getBody();
        assertEquals("18ccc6828e660a6e350f503ef1fb98790884087c", response.getAccessToken());
        assertEquals("1cd132b9bcd80b3d4d5ad2017dddcdd14be9d0bf", response.getRefreshToken());
        assertEquals("362", response.getUserid());
        assertEquals((Integer)10800, response.getExpiresIn());
        assertEquals("user.metrics", response.getScope());
        assertEquals("Bearer", response.getTokenType());
    }

    @Test
    public void oAuthGetAccessTokenInvalidCodeTest() throws IOException{
        this.init();

        String message = "";
        Integer status = 0;

        try{
            AccessTokenBase token = authService.getAccessToken("exception_code");
        }catch(WithingsAPIException ex){
            message = ex.getMessage();
            status = ex.getStatus();
        }

        assertEquals("Invalid Params: invalid code", message);
        assertEquals((Integer)503, status);
    }

    @Test
    public void oAuthGetRefreshTokenInvalidRefreshTokenTest() throws IOException{
        this.init();

        String message = "";
        Integer status = 0;

        AccessToken accessToken = new AccessToken();
        accessToken.setAccessToken("18ccc6828e660a6e350f503ef1fb98790884087c");
        accessToken.setExpiresIn((Integer)10800);
        accessToken.setRefreshToken("invalid_refresth_token");
        accessToken.setScope("user.metrics");
        accessToken.setTokenType("Bearer");
        accessToken.setUserid("362");

        try{
            AccessTokenBase token = authService.getRefreshToken(accessToken);
        }catch(WithingsAPIException ex){
            message = ex.getMessage();
            status = ex.getStatus();
        }

        assertEquals("Invalid Params: invalid refresh_token", message);
        assertEquals((Integer)503, status);
    }

}
