package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.GrantType;
import sugimomoto.withings4j.model.WithingsActionType;

public class GetAccessTokenQueryParameters extends QueryParameters {

    public GetAccessTokenQueryParameters() {
        this.builder.add("action", WithingsActionType.OAUTH_20_GET_YOUR_ACCESS_TOKEN_REQUESTTOKEN.getValue());
        this.builder.add("grant_type", GrantType.AUTHORIZATION_CODE.getValue());
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    public void setClientSecret(String clientSecret) {
        this.builder.add("client_secret", clientSecret);
    }

    public void setCode(String code) {
        this.builder.add("code", code);
    }

    public void setRedirectUri(String redirectUri) {
        this.builder.add("redirect_uri", redirectUri);
    }
}
