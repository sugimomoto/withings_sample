package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;
import sugimomoto.withings4j.model.*;
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
        UserGetdeviceQueryParameters param = new UserGetdeviceQueryParameters();
        
        FormBody formBody = param.getQueryParameters();

        assertEquals(1, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("getdevice", formBody.value(0));
    }
    
    @Test
    public void UserGetgoalsQueryParametersTest(){
        UserGetgoalsQueryParameters param = new UserGetgoalsQueryParameters();

        FormBody formBody = param.getQueryParameters();

        assertEquals(1, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("getgoals", formBody.value(0));
    }
    
    @Test
    public void UserGetQueryParametersTest(){
        UserGetQueryParameters param = new UserGetQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setEmail("sample@example.com");

        FormBody formBody = param.getQueryParameters();
        
        assertEquals(5, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("get", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("email", formBody.name(3));
        assertEquals("sample@example.com", formBody.value(3));

        assertEquals("signature", formBody.name(4));
        assertEquals("5c34950abc251bd012d1189ee1872093002f3e9897d746cd12a932f0f34b0614", formBody.value(4));
    }
    
    @Test
    public void UserLinkQueryParametersTest(){
        UserLinkQueryParameters param = new UserLinkQueryParameters();
        param.setMacAddresses(Arrays.asList("00:24:e4:xx:xx:xx","00:24:e4:xx:xx:xx"));

        FormBody formBody = param.getQueryParameters();

        assertEquals(2, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("link", formBody.value(0));

        assertEquals("mac_addresses", formBody.name(1));
        assertEquals("[\"00:24:e4:xx:xx:xx\",\"00:24:e4:xx:xx:xx\"]", formBody.value(1));
    }
    
    @Test
    public void UserUnlinkQueryParametersTest(){
        UserUnlinkQueryParameters param = new UserUnlinkQueryParameters();
        param.setMacAddresses(Arrays.asList("00:24:e4:xx:xx:xx","00:24:e4:xx:xx:xx"));

        FormBody formBody = param.getQueryParameters();

        assertEquals(2, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("unlink", formBody.value(0));

        assertEquals("mac_addresses", formBody.name(1));
        assertEquals("[\"00:24:e4:xx:xx:xx\",\"00:24:e4:xx:xx:xx\"]", formBody.value(1));
    }
    
    @Test
    public void Userv2ActivateTest() throws WithingsAPIException, IOException{
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


        UserDeviceBase userDeviceBase = client.userActivate(param);

        assertEquals((Integer)0, userDeviceBase.getStatus());

        assertEquals("490ed603fe9bd2ce10027bdba0c932069cd27085", userDeviceBase.getBody().getUser().getCode());
        assertEquals(UUID.fromString("3b7a6db0-ec7e-479b-9675-2a3d8d6a7e51"), userDeviceBase.getBody().getUser().getExternalID());

        assertEquals(1, userDeviceBase.getBody().getDevices().size());

        Device device = userDeviceBase.getBody().getDevices().get(0);

        assertEquals("00:24:e4:69:b2:30", device.getMACAddress());
        assertEquals("Scale", device.getType());
        assertEquals("Body Cardio", device.getModel());
        assertEquals(6, device.getModelID());
        assertEquals("medium", device.getBattery());
        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", device.getDeviceid());
        assertEquals("Europe/Paris", device.getTimezone());
        assertEquals(1594159644, device.getLastSessionDate());
    }
    
    @Test
    public void Userv2GetTest() throws WithingsAPIException, IOException{
        UserGetQueryParameters param = new UserGetQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setEmail("sample@example.com");

        UserBase userBase = client.userGet(param);

        assertEquals((Integer)0, userBase.getStatus());

        assertEquals("john.doe@my.email", userBase.getBody().getUser().getEmail());
        assertEquals("John", userBase.getBody().getUser().getFirstname());
        assertEquals("Doe", userBase.getBody().getUser().getLastname());
        assertEquals("JDO", userBase.getBody().getUser().getShortname());
        assertEquals(0, userBase.getBody().getUser().getGender());
        assertEquals(1577829600, userBase.getBody().getUser().getBirthdate());
        assertEquals("fr_FR", userBase.getBody().getUser().getPreflang());
        assertEquals("Europe/Paris", userBase.getBody().getUser().getTimezone());
        assertEquals(true, userBase.getBody().getUser().getMailingpref());
        assertEquals(1, userBase.getBody().getUser().getUnitPref().getWeight());
        assertEquals(6, userBase.getBody().getUser().getUnitPref().getHeight());
        assertEquals(11, userBase.getBody().getUser().getUnitPref().getTemperature());
        assertEquals(6, userBase.getBody().getUser().getUnitPref().getDistance());
        assertEquals("+33612345678", userBase.getBody().getUser().getPhonenumber());
    }
    
    @Test
    public void Userv2GetdeviceTest() throws WithingsAPIException, IOException{
        UserGetdeviceQueryParameters param = new UserGetdeviceQueryParameters();

        DeviceBase deviceBase = client.userGetDevice(param);

        assertEquals((Integer)0, deviceBase.getStatus());
        assertEquals(1, deviceBase.getBody().getDevices().size());

        Device device = deviceBase.getBody().getDevices().get(0);

        assertEquals("Scale", device.getType());
        assertEquals("Body Cardio", device.getModel());
        assertEquals(6, device.getModelID());
        assertEquals("medium", device.getBattery());
        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", device.getDeviceid());
        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", device.getHashDeviceid());
        assertEquals("Europe/Paris", device.getTimezone());
        assertEquals(1594159644, device.getLastSessionDate());
    }
    
    @Test
    public void Userv2GetgoalsTest() throws WithingsAPIException, IOException{
        UserGetgoalsQueryParameters param = new UserGetgoalsQueryParameters();

        GoalsBase goalsBase = client.userGetGoals(param);

        assertEquals((Integer)0, goalsBase.getStatus());
        assertEquals(10000, goalsBase.getBody().getGoals().getSteps());
        assertEquals(28800, goalsBase.getBody().getGoals().getSleep());
        assertEquals(70500, goalsBase.getBody().getGoals().getWeight().getValue());
        assertEquals(-3, goalsBase.getBody().getGoals().getWeight().getUnit());
    }
    
    @Test
    public void Userv2LinkTest() throws WithingsAPIException, IOException{
        UserLinkQueryParameters param = new UserLinkQueryParameters();
        param.setMacAddresses(Arrays.asList("00:24:e4:xx:xx:xx","00:24:e4:xx:xx:xx"));

        DeviceBase deviceBase = client.userLink(param);

        assertEquals((Integer)0, deviceBase.getStatus());
        assertEquals(1, deviceBase.getBody().getDevices().size());

        Device device = deviceBase.getBody().getDevices().get(0);

        assertEquals("00:24:e4:69:b2:30", device.getMACAddress());
        assertEquals("Scale", device.getType());
        assertEquals("Body Cardio", device.getModel());
        assertEquals(6, device.getModelID());
        assertEquals("medium", device.getBattery());
        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", device.getDeviceid());
        assertEquals("Europe/Paris", device.getTimezone());
        assertEquals(1594159644, device.getLastSessionDate());
    }
    
    @Test
    public void Userv2UnlinkTest() throws WithingsAPIException, IOException{
        UserUnlinkQueryParameters param = new UserUnlinkQueryParameters();
        param.setMacAddresses(Arrays.asList("00:24:e4:xx:xx:xx","00:24:e4:xx:xx:xx"));

        ResponseBase responseBase = client.userUnlink(param);

        assertEquals((Integer)0, responseBase.getStatus());
    }

}
