package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class NotifyAPITest extends APIClientTestSettup {
    
    @Test
    public void NotifyGetQueryParametersTest(){
        NotifyGetQueryParameters param = new NotifyGetQueryParameters();
        param.setCallbackurl("http://example.com");
        param.setAppli(4);

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(3, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("get", formBody.value(0));

        assertEquals("callbackurl", formBody.name(1));
        assertEquals("http://example.com", formBody.value(1));

        assertEquals("appli", formBody.name(2));
        assertEquals("4", formBody.value(2));
    }

    @Test
    public void NotifyListQueryParametersTest(){
        NotifyListQueryParameters param = new NotifyListQueryParameters();
        param.setAppli(4);

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(2, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("list", formBody.value(0));

        assertEquals("appli", formBody.name(1));
        assertEquals("4", formBody.value(1));
    }

    @Test
    public void NotifyRevokeQueryParametersTest(){
        NotifyRevokeQueryParameters param = new NotifyRevokeQueryParameters();
        param.setCallbackurl("http://example.com");
        param.setAppli(4);

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(3, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("revoke", formBody.value(0));

        assertEquals("callbackurl", formBody.name(1));
        assertEquals("http://example.com", formBody.value(1));

        assertEquals("appli", formBody.name(2));
        assertEquals("4", formBody.value(2));
    }

    @Test
    public void NotifySubscribeQueryParametersTest(){
        NotifySubscribeQueryParameters param = new NotifySubscribeQueryParameters("secretKey");
        param.setCallbackurl("http://example.com");
        param.setAppli(4);
        param.setNonce("test_nonce");
        param.setClientId("test_client_id");
        param.setComment("test_comment");

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(7, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("subscribe", formBody.value(0));

        assertEquals("callbackurl", formBody.name(1));
        assertEquals("http://example.com", formBody.value(1));

        assertEquals("appli", formBody.name(2));
        assertEquals("4", formBody.value(2));

        assertEquals("nonce", formBody.name(3));
        assertEquals("test_nonce", formBody.value(3));

        assertEquals("client_id", formBody.name(4));
        assertEquals("test_client_id", formBody.value(4));
        
        assertEquals("comment", formBody.name(5));
        assertEquals("test_comment", formBody.value(5));

        assertEquals("signature", formBody.name(6));
        assertEquals("e7eef8f48f91aebeb642a92b88daa672d46b910a5b4d81f1dd73996c0680d529", formBody.value(6));
    }

    @Test
    public void NotifyUpdateQueryParametersTest(){
        NotifyUpdateQueryParameters param = new NotifyUpdateQueryParameters();
        param.setCallbackurl("http://example.com");
        param.setAppli(4);
        param.setNewCallbackurl("http://example.com/update");
        param.setNewAppli(5);
        param.setComment("update_comment");

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(6, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("update", formBody.value(0));

        assertEquals("callbackurl", formBody.name(1));
        assertEquals("http://example.com", formBody.value(1));

        assertEquals("appli", formBody.name(2));
        assertEquals("4", formBody.value(2));

        assertEquals("new_callbackurl", formBody.name(3));
        assertEquals("http://example.com/update", formBody.value(3));

        assertEquals("new_appli", formBody.name(4));
        assertEquals("5", formBody.value(4));

        assertEquals("comment", formBody.name(5));
        assertEquals("update_comment", formBody.value(5));
    }

    @Test
    public void NotifyGetTest() throws WithingsAPIException, IOException{
        NotifyGetQueryParameters param = new NotifyGetQueryParameters();
        param.setCallbackurl("http://example.com");
        param.setAppli(12345);

        NotifyBase notifyBase = client.notifyGet(param);
        assertEquals((Integer)0, notifyBase.getStatus());

        assertEquals(4, notifyBase.getBody().getAppli());
        assertEquals("https://www.withings.com", notifyBase.getBody().getCallbackurl());
        assertEquals("My notification subcription comment", notifyBase.getBody().getComment());
    }

    @Test
    public void NotifyListTest() throws WithingsAPIException, IOException{
        NotifyListQueryParameters param = new NotifyListQueryParameters();
        param.setAppli(12345);

        NotifyListBase notifyListBase = client.notifyList(param);
        assertEquals((Integer)0, notifyListBase.getStatus());

        assertEquals(1, notifyListBase.getBody().getProfiles().size());

        Profile profile = notifyListBase.getBody().getProfiles().get(0);

        assertEquals(1, profile.getAppli());
        assertEquals("https://www.withings.com", profile.getCallbackurl());
        assertEquals(2147483647, profile.getExpires());
        assertEquals("My notification subscription", profile.getComment());
    }

    @Test
    public void NotifyRevokeTest(){
        throw new NotImplementedError();
        
    }

    @Test
    public void NotifySubscribeTest(){
        throw new NotImplementedError();
        
    }

    @Test
    public void NotifyUpdateTest(){
        throw new NotImplementedError();
        
    }
}
