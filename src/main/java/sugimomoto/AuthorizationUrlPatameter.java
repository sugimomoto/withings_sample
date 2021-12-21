package sugimomoto;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class AuthorizationUrlPatameter {

    private ResponseType responseType;

    private String clinetId;

    private String state;

    private Scope[] scope;

    private String redirectUrl;

    private Boolean mode;

    public AuthorizationUrlPatameter(ResponseType responseType, String clientId, String state, Scope[] scope, String redirectUrl, Boolean mode){
        this.responseType = responseType;
        this.clinetId = clientId;
        this.state = state;
        this.scope = scope;
        this.redirectUrl = redirectUrl;
        this.mode = mode;
    }

    public String toQueryParameter() {
        String query = "response_type=" + responseType  + "&client_id=" + clinetId + "&state=" + state + "&redirect_uri=" + redirectUrl;

        query = query + "&scope=" + String.join(",", Arrays.asList(scope));

        if (mode) {
            query = query + "&mode=demo";
        }

        return query;
    }

    

}
