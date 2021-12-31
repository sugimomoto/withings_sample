package sugimomoto;

import java.io.IOException;

public interface AuthenticationService {

    public BaseResponse getAccessToken(String code) throws IOException;

    public BaseResponse getRefreshToken(AccessTokenResponse accessToken) throws IOException;

    public String getAuthorizationUrl(String state);

    public String getAuthorizationUrl(String state, Boolean mode);

    public void setEndpointUrl(String mockUrl);

    public String getEndpointUrl();
}
