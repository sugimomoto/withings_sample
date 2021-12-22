package sugimomoto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

import com.sun.tools.javac.util.List;

public class AuthorizationUrlParameter {

    private ResponseType responseType;

    private String clinetId;

    private String state;

    private Scope[] scope;

    private String redirectUrl;

    private Boolean mode;

    public AuthorizationUrlParameter(ResponseType responseType, String clientId, String state, Scope[] scope, String redirectUrl, Boolean mode){
        this.responseType = responseType;
        this.clinetId = clientId;
        this.state = state;
        this.scope = scope;
        this.redirectUrl = redirectUrl;
        this.mode = mode;
    }

    public String toQueryParameter() {
        String query = "response_type=" + responseType.getValue()  + "&client_id=" + clinetId + "&state=" + state + "&redirect_uri=" + redirectUrl;

        for (Scope item : scope) {
            query = query.contains("&scope") ? query + "," + item.getValue() : query + "&scope=" + item.getValue() ;
        }

        if (mode) {
            query = query + "&mode=demo";
        }

        return query;
    }
}
