package sugimomoto.withings4j;

import java.io.IOException;

import sugimomoto.withings4j.model.AccessTokenResponse;
import sugimomoto.withings4j.model.BaseResponse;

public interface AuthenticationService {

    public BaseResponse getAccessToken(String code) throws IOException;

    public BaseResponse getRefreshToken(AccessTokenResponse accessToken) throws IOException;

    public String getAuthorizationUrl(String state);

    public String getAuthorizationUrl(String state, Boolean mode);
}
