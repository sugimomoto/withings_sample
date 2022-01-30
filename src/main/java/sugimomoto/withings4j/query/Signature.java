package sugimomoto.withings4j.query;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Signature {

    public static String SignedByHmacSHA256(String action, String clientId, String nonce, String secretKey) throws NoSuchAlgorithmException, InvalidKeyException {

        String algo = "HmacSHA256";
        String text = action + "," + clientId + "," + nonce;

        SecretKeySpec sk = new SecretKeySpec(secretKey.getBytes(), algo);
        Mac mac = Mac.getInstance(algo);
        mac.init(sk);

        byte[] mac_bytes = mac.doFinal(text.getBytes());

        StringBuilder sb = new StringBuilder(2 * mac_bytes.length);
        for(byte b: mac_bytes) {
                sb.append(String.format("%02x", b&0xff) );
        }

        return sb.toString();
    }
}
