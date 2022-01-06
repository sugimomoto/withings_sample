package sugimomoto;

import okhttp3.FormBody;

public abstract class QueryParameters implements IQueryParameters {

    protected FormBody.Builder builder = new FormBody.Builder();

    public FormBody getQueryParameters() {
        return builder.build();
    }
}
