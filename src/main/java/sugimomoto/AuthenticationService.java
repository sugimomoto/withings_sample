package sugimomoto;

public interface AuthenticationService {

    public String GetAuthorizationCode(AuthorizationParameters paramers);

    public AccessTokenResponse GetAccessToken();

    public RefreshTokenResponse GetRefreshToken();
}
