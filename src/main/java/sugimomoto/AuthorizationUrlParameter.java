package sugimomoto;

public class AuthorizationUrlParameter {

    public static String toQueryParameter(ResponseType responseType, String clientId, String state, Scope[] scope, String redirectUrl, Boolean mode) {
        String query = "response_type=" + responseType.getValue()  + "&client_id=" + clientId + "&state=" + state + "&redirect_uri=" + redirectUrl;

        if(scope != null && scope.length != 0){
            for (Scope item : scope) {
                query = query.contains("&scope") ? query + "," + item.getValue() : query + "&scope=" + item.getValue() ;
            }
        }

        if (mode) {
            query = query + "&mode=demo";
        }

        return query;
    }
}
