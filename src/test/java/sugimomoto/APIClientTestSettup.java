package sugimomoto;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.junit.Before;
import org.junit.Rule;

import sugimomoto.withings4j.WithingsAPIClient;
import sugimomoto.withings4j.model.AccessToken;

public abstract class APIClientTestSettup {
    
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8081);

    private String mockUrl = "http://localhost:8081";

    protected WithingsAPIClient client;

    @Before
    public void init(){
        AccessToken token = new AccessToken();
        token.setAccessToken("dummy_token");

        client = new WithingsAPIClient(token);
        client.setEndpointUrl(mockUrl);
    }

}
