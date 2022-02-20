package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;
import sugimomoto.withings4j.model.SignatureBase;
import sugimomoto.withings4j.query.SignatureGetnonceQueryParameters;

public class SignatureAPITest extends APIClientTestSettup {
    
    @Test
    public void SignatureGetnonceQueryParametersTest(){
        SignatureGetnonceQueryParameters param = new SignatureGetnonceQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setTimestamp(1594257200);

        FormBody formBody = param.getQueryParameters();

        assertEquals(4, formBody.size());
        
        assertEquals("action", formBody.name(0));
        assertEquals("getnonce", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));

        assertEquals("timestamp", formBody.name(2));
        assertEquals("1594257200", formBody.value(2));

        assertEquals("signature", formBody.name(3));
        assertEquals("813fa95f1669e344946e4cc248876293f05ec3de0335566c6529e12dd2f07d9a", formBody.value(3));
    }

    @Test
    public void Signaturev2Getnonce() throws WithingsAPIException, IOException{
        SignatureGetnonceQueryParameters param = new SignatureGetnonceQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setTimestamp(1594257200);

        SignatureBase signatureBase = client.signatureGetnonce(param);

        assertEquals((Integer)0, signatureBase.getStatus());
        assertEquals("aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d", signatureBase.getBody().getNonce());

    }
}
