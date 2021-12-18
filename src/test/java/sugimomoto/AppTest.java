package sugimomoto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URI;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void oAuthTest(){
        String clientId = "test_client_id";
        String clientSecret = "test_client_secret";
        String redirectUrl = "http://localhost:33333";
        String scope = "user.metrics";

        AuthenticationService authService = new WithingsAuthenticationService(clientId,clientSecret,redirectUrl,scope);

        String authorizationUrl = authService.getAuthorizationUrl();

        String expectAuthorizationUrl = "https://account.withings.com/oauth2_user/authorize2?response_type=code&client_id=XXXX&state=12345&scope=user.metrics&redirect_uri=http://localhost:33333";
        assertEquals("http://", authorizationUrl);

        String code = "dummy";

        AccessTokenResponse token = authService.GetAccessToken(code);

        assertEquals("expected", token.getAccessToken());
    }
}
