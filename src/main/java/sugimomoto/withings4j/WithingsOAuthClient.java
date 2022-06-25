package sugimomoto.withings4j;

import okhttp3.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class WithingsOAuthClient extends APIClient implements AuthenticationService {

    private String clientId;

    private String clientSecret;

    private String redirectUrl;

    private Scope[] scope;

    public WithingsOAuthClient(String clientId, String clientSecret, String redirectUrl, Scope[] scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.scope = scope;
        this.endpointUrl = WithingsConst.ENDPOINT_URL + Resource.V2_OAUTH2.getValue();
    }

    @Override
    public AccessTokenBase getAccessToken(String code) throws WithingsAPIException {
        GetAccessTokenQueryParameters query = new GetAccessTokenQueryParameters();

        if(Utilities.isNullOrEmpty(code,this.clientId,this.clientSecret,this.redirectUrl)){
            throw new WithingsAPIException("Code, ClientId, ClientSecret,RedirectUrl can not use as null or empty.");
        }

        query.setClientId(this.clientId);
        query.setClientSecret(this.clientSecret);
        query.setCode(code);
        query.setRedirectUri(this.redirectUrl);

        return (AccessTokenBase)getAPIResponse(this.endpointUrl,query,AccessTokenBase.class);
    }

    @Override
    public AccessTokenBase getRefreshToken(AccessToken refreshToken) throws WithingsAPIException {
        GetRefreshTokenQueryParameters query = new GetRefreshTokenQueryParameters();

        if(Utilities.isNullOrEmpty(refreshToken.getRefreshToken(),clientId,this.clientSecret)){
            throw new WithingsAPIException("Code, ClientId, ClientSecret,RedirectUrl can not use as null or empty.");
        }

        query.setClientId(this.clientId);
        query.setClientSecret(this.clientSecret);
        query.setRefreshToken(refreshToken.getRefreshToken());

        return (AccessTokenBase)getAPIResponse(this.endpointUrl,query,AccessTokenBase.class);
    }

    @Override
    public String getAuthorizationUrl(String state) {
        return getAuthorizationUrl(state,false);
    }

    @Override
    public String getAuthorizationUrl(String state, Boolean mode) {
        return WithingsConst.AUTHENTICATION_URL + "?" + AuthorizationUrlParameter.toQueryParameter(ResponseType.AUTHORIZATION_CODE,clientId,state,scope,redirectUrl,mode);
    }

    @Override
    protected Headers getHeaderSettings() {
        return Headers.of("User-Agent",WithingsConst.WITHINGS_4J_USER_AGENT_NAME);
    }
}
