package sugimomoto;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
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
        String authorizationUrl = authService.getAuthorizationUrl();

        String expectAuthorizationUrl = "https://account.withings.com/oauth2_user/authorize2?response_type=code&client_id=test_client_id&state=12345&scope=user.metrics&redirect_uri=http://localhost:33333";
        assertEquals(expectAuthorizationUrl, authorizationUrl);
    }

    @Test
    public void authorizationParameterTest(){
        Scope[] scope = {Scope.USER_METRICS};
        AuthorizationUrlPatameter parameter = new AuthorizationUrlPatameter("code",clientId,"1234",scope,redirectUrl,true);

        assertEquals("response_type=code&client_id=test_client_id&state=12345&scope=user.metrics&redirect_uri=http://localhost:33333&mode=demo", parameter.toQueryParameter());
    }

    @Test
    public void oAuthGetAccessTokenTest(){
        this.init();

        BaseResponse<AccessTokenResponse> token = authService.getAccessToken("dummy_code");

        AccessTokenResponse response = token.getBody();
        assertEquals("a075f8c14fb8df40b08ebc8508533dc332a6910a", response.getAccessToken());
        assertEquals("f631236f02b991810feb774765b6ae8e6c6839ca", response.getRefreshToken());
        assertEquals("363", response.getUserid());
        assertEquals((Integer)10800, response.getExpiresIn());
        assertEquals("user.info,user.metrics", response.getScope());
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
