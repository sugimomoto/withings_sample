package sugimomoto;

import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.junit.Rule;
import org.junit.Test;

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

    AuthenticationService authService;

    public void init(){
        authService = new WithingsAuthenticationService(clientId,clientSecret,redirectUrl,scopes);
        authService.setEndpointUrl(mockUrl);
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
    public void oAuthGetAccessTokenTest(){
        this.init();
        authService.setEndpointUrl(mockUrl);

        BaseResponse<AccessTokenResponse> token = authService.getAccessToken("dummy_code");

        AccessTokenResponse response = token.getBody();
        assertEquals("a508999978b28369eebf173ef78f2f248321e163", response.getAccessToken());
        assertEquals("296ab698174e87e29417a24032aa88f14baaebd7", response.getRefreshToken());
        assertEquals("27718374", response.getUserid());
        assertEquals((Integer)10800, response.getExpiresIn());
        assertEquals("user.metrics", response.getScope());
        assertEquals("Bearer", response.getTokenType());
    }

    @Test
    public void oAuthGetRefreshAccessTokenTest(){
        this.init();

        BaseResponse<AccessTokenResponse> token = authService.getAccessToken("dummy_code");
        BaseResponse<AccessTokenResponse> refreshToken = authService.getRefreshToken(token.getBody());

        AccessTokenResponse response = refreshToken.getBody();
        assertEquals("a075f8c14fb8df40b08ebc8508533dc332a6910a", response.getAccessToken());
        assertEquals("f631236f02b991810feb774765b6ae8e6c6839ca", response.getRefreshToken());
        assertEquals("361", response.getUserid());
        assertEquals((Integer)10801, response.getExpiresIn());
        assertEquals("user.info,user.metrics", response.getScope());
        assertEquals("Bearer", response.getTokenType());
    }

}
