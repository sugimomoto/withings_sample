package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.GrantType;
import sugimomoto.withings4j.model.WithingsActionType;

public class GetAccessTokenQueryParameters extends QueryParameters {

    public GetAccessTokenQueryParameters() {
        this.parameters.put("action", WithingsActionType.OAUTH_20_GET_YOUR_ACCESS_TOKEN_REQUESTTOKEN.getValue());
        this.parameters.put("grant_type", GrantType.AUTHORIZATION_CODE.getValue());
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setClientSecret(String clientSecret) {
        this.parameters.put("client_secret", clientSecret);
    }

    public void setCode(String code) {
        this.parameters.put("code", code);
    }

    public void setRedirectUri(String redirectUri) {
        this.parameters.put("redirect_uri", redirectUri);
    }
}
