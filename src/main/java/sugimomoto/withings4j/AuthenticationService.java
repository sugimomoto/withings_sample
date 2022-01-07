package sugimomoto.withings4j;

import java.io.IOException;

import sugimomoto.withings4j.model.AccessToken;
import sugimomoto.withings4j.model.AccessTokenBase;

public interface AuthenticationService {

    public AccessTokenBase getAccessToken(String code) throws IOException;

    public AccessTokenBase getRefreshToken(AccessToken accessToken) throws IOException;

    public String getAuthorizationUrl(String state);

    public String getAuthorizationUrl(String state, Boolean mode);
}
