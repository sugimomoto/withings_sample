package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class SignatureGetnonceQueryParameters extends QueryParameters {

    public SignatureGetnonceQueryParameters() {
        this.builder.add("action", WithingsActionType.SIGNATURE_V2_GETNONCE_GETNONCE.getValue());
    }
    
}
