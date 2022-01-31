package sugimomoto.withings4j.query;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentDeleteQueryParameters extends QueryParameters{

    public DropshipmentDeleteQueryParameters() {
        this.parameters.put("action", WithingsActionType.DROPSHIPMENT_V2_DELETE_DELETE.getValue());
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.parameters.put("nonce", nonce);
    }

    public void setOrderId(String orderId) {
        this.parameters.put("order_id", orderId);
    }
}
