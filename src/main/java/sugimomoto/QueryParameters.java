package sugimomoto;

import okhttp3.FormBody;

public abstract class QueryParameters {

    protected FormBody.Builder builder = new FormBody.Builder();

    public FormBody getQueryParameters() {
        return builder.build();
    }
}
