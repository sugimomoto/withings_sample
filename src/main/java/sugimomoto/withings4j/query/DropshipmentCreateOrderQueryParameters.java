package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentCreateOrderQueryParameters extends QueryParameters {

    public DropshipmentCreateOrderQueryParameters(String secretKey){
        this.parameters.put("action", WithingsActionType.DROPSHIPMENT_V2_CREATEORDER_CREATEORDER.getValue());
        this.secretKey = secretKey;
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.parameters.put("nonce", nonce);
    }

    public void setOrder(List<OrderParameter> orderParameter) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        this.parameters.put("order", mapper.writeValueAsString(orderParameter));
    }
    
    public void setCustomerId(String customerId) {
        this.parameters.put("customerid", customerId);
    }

    public void setTestMode(int testmode) {
        this.parameters.put("testmode", String.valueOf(testmode));
    }
}
