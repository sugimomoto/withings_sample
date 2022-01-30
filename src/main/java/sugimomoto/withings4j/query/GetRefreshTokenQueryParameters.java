package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.GrantType;
import sugimomoto.withings4j.model.WithingsActionType;

public class GetRefreshTokenQueryParameters extends QueryParameters {

    public GetRefreshTokenQueryParameters() {
        this.parameters.put("action", WithingsActionType.OAUTH_20_REFRESH_YOUR_ACCESS_TOKEN_REQUESTTOKEN.getValue());
        this.parameters.put("grant_type", GrantType.REFRESH_TOKEN.getValue());
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setClientSecret(String clientSecret) {
        this.parameters.put("client_secret", clientSecret);
    }

    public void setRefreshToken(String refreshToken) {
        this.parameters.put("refresh_token", refreshToken);
    }
}
