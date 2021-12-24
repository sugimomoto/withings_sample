package sugimomoto;

public interface AuthenticationService {

    public BaseResponse<AccessTokenResponse> getAccessToken(String code);

    public BaseResponse<AccessTokenResponse> getRefreshToken(AccessTokenResponse accessToken);

    public String getAuthorizationUrl(String state);

    public String getAuthorizationUrl(String state, Boolean mode);

    public void setEndpointUrl(String mockUrl);
}
