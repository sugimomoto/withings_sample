package sugimomoto.withings4j;

import java.io.IOException;

import okhttp3.*;

public abstract class APIClient {

    private static final OkHttpClient client = new OkHttpClient();

    protected String endpointUrl;

    public void setEndpointUrl(String mockUrl) {
        this.endpointUrl = mockUrl;
    }

    public String getEndpointUrl(){
        return endpointUrl;
    }

    public String buildRequest(String url, FormBody body, Headers headers) throws IOException{
        Request requst = new Request.Builder()
            .url(url)
            .headers(headers)
            .post(body)
            .build();

        Response response = client.newCall(requst).execute();

        return response.body().string();
    }
}
