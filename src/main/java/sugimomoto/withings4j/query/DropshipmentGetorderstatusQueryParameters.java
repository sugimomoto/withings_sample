package sugimomoto.withings4j.query;

import java.util.List;
import java.util.stream.Collectors;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentGetorderstatusQueryParameters extends QueryParameters{

    public DropshipmentGetorderstatusQueryParameters() {
        this.builder.add("action", WithingsActionType.DROPSHIPMENT_V2_GETORDERSTATUS_GETORDERSTATUS.getValue());
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

    public void setOrderIds(List<String> orderIds) {
        this.builder.add("order_ids", "[" + orderIds.stream().collect(Collectors.joining(",")) + "]");
    }

    public void setCustomerRefIds(List<String> customerRefIds) {
        this.builder.add("customer_lef_ids", "[" + customerRefIds.stream().collect(Collectors.joining(",")) + "]");
    }

    public void setCustomerId(String customerId) {
        this.builder.add("customerid", customerId);
    }
    
    private void setSignature() {
        this.builder.add("signature", "arg1");
    }
}
