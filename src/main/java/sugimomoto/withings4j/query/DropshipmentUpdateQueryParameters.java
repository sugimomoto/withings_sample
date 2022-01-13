package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentUpdateQueryParameters extends QueryParameters{
    public DropshipmentUpdateQueryParameters() {
        this.builder.add("action", WithingsActionType.DROPSHIPMENT_V2_UPDATE_UPDATE.getValue());
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
        this.builder.add("order_id", orderId);
    }
    
    public void setOrder(List<OrderParameter> orderParameter) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        this.builder.add("order", mapper.writeValueAsString(orderParameter));
    }

    private void setSignature() {
        this.builder.add("signature", "arg1");
    }
}
