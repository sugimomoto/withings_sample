package sugimomoto.withings4j.query;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentDeleteQueryParameters extends QueryParameters{

    public DropshipmentDeleteQueryParameters() {
        this.builder.add("action", WithingsActionType.DROPSHIPMENT_V2_DELETE_DELETE.getValue());
    }

    @Override
    public FormBody getQueryParameters() {
        setSignature();
        return builder.build();
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.builder.add("nonce", nonce);
    }

    public void setOrderId(String orderId) {
        this.builder.add("orderid", orderId);
    }
    
    private void setSignature() {
    }

}
