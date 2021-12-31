package sugimomoto;

import java.util.ArrayList;
import java.util.List;

public abstract class QueryParameters {
    protected List<NameValuePair> parameters = new ArrayList<NameValuePair>();

    public List<NameValuePair> getParamList() {
        return parameters;
    }
}
