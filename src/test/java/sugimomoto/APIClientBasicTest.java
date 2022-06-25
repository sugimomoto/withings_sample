package sugimomoto;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import sugimomoto.withings4j.model.AccessToken;

import static org.junit.Assert.assertEquals;

public class APIClientBasicTest extends APIClientTestSettup {

    @Test
    public void AccessTokenTest(){

        assertEquals("dummy_token",client.getToken().getAccessToken());

        AccessToken accessToken = new AccessToken();
        accessToken.setAccessToken("update_token");

        client.setToken(accessToken);

        assertEquals("update_token",client.getToken().getAccessToken());

    }
}
