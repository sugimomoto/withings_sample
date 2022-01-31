package sugimomoto.withings4j.query;

import java.util.List;
import java.util.stream.Collectors;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentGetorderstatusQueryParameters extends QueryParameters{

    public DropshipmentGetorderstatusQueryParameters() {
        this.parameters.put("action", WithingsActionType.DROPSHIPMENT_V2_GETORDERSTATUS_GETORDERSTATUS.getValue());
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.parameters.put("nonce", nonce);
    }

    public void setOrderIds(List<String> orderIds) {
        this.parameters.put("order_ids", "[" + orderIds.stream().collect(Collectors.joining(",")) + "]");
    }

    public void setCustomerRefIds(List<String> customerRefIds) {
        this.parameters.put("customer_lef_ids", "[" + customerRefIds.stream().collect(Collectors.joining(",")) + "]");
    }

    public void setCustomerId(String customerId) {
        this.parameters.put("customerid", customerId);
    }
}
