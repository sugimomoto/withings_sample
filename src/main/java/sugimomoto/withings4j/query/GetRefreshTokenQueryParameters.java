package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.GrantType;
import sugimomoto.withings4j.model.WithingsActionType;

public class GetRefreshTokenQueryParameters extends QueryParameters {

    public GetRefreshTokenQueryParameters() {
        this.builder.add("action", WithingsActionType.OAUTH_20_REFRESH_YOUR_ACCESS_TOKEN_REQUESTTOKEN.getValue());
        this.builder.add("grant_type", GrantType.REFRESH_TOKEN.getValue());
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    public void setClientSecret(String clientSecret) {
        this.builder.add("client_secret", clientSecret);
    }

    public void setRefreshToken(String refreshToken) {
        this.builder.add("refresh_token", refreshToken);
    }
}
