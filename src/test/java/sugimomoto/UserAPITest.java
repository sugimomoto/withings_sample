package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.query.*;

public class UserAPITest extends APIClientTestSettup {
    
    @Test
    public void UserActivateQueryParametersTest() throws JsonProcessingException{
        UserActivateQueryParameters param = new UserActivateQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setMailingpref(true);
        param.setBirthdate(1563746400);
        param.setMeasures(getSamplMeasure());
        param.setGender(0);
        param.setPreflang("en_EN");
        param.setUnitPref(getSampleUnitPref());
        param.setEmail("sample@example.com");
        param.setTimezone("America/New_York");
        param.setShortname("abc");
        param.setExternalId("test_external_id");
        param.setMacAddresses(Arrays.asList("00:24:e4:xx:xx:xx","00:24:e4:xx:xx:xx"));
        param.setFirstName("test_firstname");
        param.setLastName("test_lastname");
        param.setPhoneNumber("000-0000-0000");
        param.setRecoveryCode("test_recovery_code");
        param.setGoals(getSampleGoals());

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(20, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("activate", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("mailingpref", formBody.name(3));
        assertEquals("true", formBody.value(3));
        
        assertEquals("birthdate", formBody.name(4));
        assertEquals("1563746400", formBody.value(4));

        assertEquals("measures", formBody.name(5));
        assertEquals("{\"preflang\":\"en_EN\",\"birthdate\":\"12345678\",\"gender\":1,\"shortname\":\"ABC\",\"measures\":[{\"value\":180,\"unit\":-2,\"type\":4},{\"value\":8000,\"unit\":-2,\"type\":1}]}", formBody.value(5));

        assertEquals("gender", formBody.name(6));
        assertEquals("0", formBody.value(6));
        
        assertEquals("preflang", formBody.name(7));
        assertEquals("en_EN", formBody.value(7));

        assertEquals("unit_pref", formBody.name(8));
        assertEquals("{\"weight\":1,\"height\":7,\"distance\":8,\"temperature\":13}", formBody.value(8));

        assertEquals("email", formBody.name(9));
        assertEquals("sample@example.com", formBody.value(9));
        
        assertEquals("timezone", formBody.name(10));
        assertEquals("America/New_York", formBody.value(10));
        
        assertEquals("shortname", formBody.name(11));
        assertEquals("abc", formBody.value(11));
        
        assertEquals("external_id", formBody.name(12));
        assertEquals("test_external_id", formBody.value(12));
        
        assertEquals("mac_addresses", formBody.name(13));
        assertEquals("[\"00:24:e4:xx:xx:xx\",\"00:24:e4:xx:xx:xx\"]", formBody.value(13));

        assertEquals("firstname", formBody.name(14));
        assertEquals("test_firstname", formBody.value(14));
        
        assertEquals("lastname", formBody.name(15));
        assertEquals("test_lastname", formBody.value(15));
        
        assertEquals("phonenumber", formBody.name(16));
        assertEquals("000-0000-0000", formBody.value(16));
        
        assertEquals("recovery_code", formBody.name(17));
        assertEquals("test_recovery_code", formBody.value(17));

        assertEquals("goals", formBody.name(18));
        assertEquals("{\"steps\":10000,\"sleep\":28800,\"weight\":{\"value\":70500,\"unit\":-3}}", formBody.value(18));

        assertEquals("signature", formBody.name(19));
        assertEquals("9c00b5cb8e2adcf454ebfebfd41e94b8fdfec61d730fefc6cd16a51d0095bd73", formBody.value(19));
    }
    
    @Test
    public void UserGetdeviceQueryParametersTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void UserGetgoalsQueryParametersTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void UserGetQueryParametersTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void UserLinkQueryParametersTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void UserUnlinkQueryParametersTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void Userv2ActivateTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void Userv2GetTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void Userv2GetdeviceTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void Userv2GetgoalsTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void Userv2LinkTest(){
        throw new NotImplementedError();
    }
    
    @Test
    public void Userv2UnlinkTest(){
        throw new NotImplementedError();
    }

}
