package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import sugimomoto.withings4j.query.Signature;

public class UtilitiesTest {
    
    @Test
    public void SignatureTest() throws InvalidKeyException, NoSuchAlgorithmException{

        String sign = Signature.SignedByHmacSHA256("action","clientId","nonce","secretKey");

        assertEquals("bfcdf77330a5f4da566f53f848c378c2d412d6ea6fdb963604e3c014d3d02a34", sign);
    }
}
