package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import junit.framework.AssertionFailedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIClient;
import sugimomoto.withings4j.WithingsAPIException;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class DropshipmentAPITest extends APIClientTestSettup {
    
    @Test
    public void DropshipmentCreateOrderQueryParametersTest() throws JsonProcessingException{
        DropshipmentCreateOrderQueryParameters param = new DropshipmentCreateOrderQueryParameters("secretKey");

        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setOrder(getSampleOrders());
        param.setCustomerId("test_customer_id");
        param.setTestMode(1);

        FormBody formBody = param.getQueryParameters();

        assertEquals(7, formBody.size());
        
        assertEquals("action", formBody.name(0));
        assertEquals("createorder", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("order", formBody.name(3));
        assertEquals("[{\"address\":{\"name\":\"John Wayne\",\"email\":\"john.wayne@farwest.com\",\"address1\":\"1st Avenue\",\"address2\":\"Apartment 12\",\"city\":\"New-York\",\"zip\":\"10001\",\"state\":\"NY\",\"country\":\"US\"},\"customer_ref_id\":\"IMAGINARY_CUSTOMER_REF_1\",\"products\":[{\"quantity\":1,\"ean\":\"WI220002EAN\"},{\"quantity\":3,\"ean\":\"WI330002EAN\"}]},{\"address\":{\"name\":\"Calamity Jane\",\"email\":\"calamity.jane@farwest.com\",\"address1\":\"SW 8th St\",\"address2\":\"Block 1\",\"city\":\"Miami\",\"zip\":\"33135\",\"state\":\"FL\",\"country\":\"US\"},\"customer_ref_id\":\"IMAGINARY_CUSTOMER_REF_2\",\"products\":[{\"quantity\":2,\"ean\":\"WI220002EAN\"},{\"quantity\":1,\"ean\":\"WI440002EAN\"},{\"quantity\":1,\"ean\":\"WI550002EAN\"}]}]", formBody.value(3));

        assertEquals("customerid", formBody.name(4));
        assertEquals("test_customer_id", formBody.value(4));

        assertEquals("testmode", formBody.name(5));
        assertEquals("1", formBody.value(5));

        assertEquals("signature", formBody.name(6));
        assertEquals("8a94158b758b02f2764c859370736265ead7a9a90c8f7b340ccfa952efc5a46e", formBody.value(6));
    }

    @Test
    public void DropshipmentCreateUserOrderQueryParametersTest() throws JsonProcessingException{

        DropshipmentCreateUserOrderQueryParameters param = new DropshipmentCreateUserOrderQueryParameters("secretKey");
        
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setMailingpref(false);
        param.setBirthdate(1563746400);
        param.setMeasures(getSamplMeasure());
        param.setGender(0);
        param.setPreflang("en_EN");
        param.setUnitPref(getSampleUnitPref());
        param.setEmail("sample@example.com");
        param.setTimezone("America/New_York");
        param.setShortname("test_shortname");
        param.setExternalId("test_external_Id");
        param.setOrder(getSampleOrders());
        param.setFirstName("test_firstname");
        param.setLastName("test_lastname");
        param.setPhoneNumber("000-0000-0000");
        param.setRecoveryCode("test_recovery_code");
        param.setGoals(getSampleGoals());
        param.setTestMode(1);

        FormBody formBody = param.getQueryParameters();

        assertEquals(21, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("createuserorder", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("mailingpref", formBody.name(3));
        assertEquals("false", formBody.value(3));
        
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
        assertEquals("test_shortname", formBody.value(11));
        
        assertEquals("external_id", formBody.name(12));
        assertEquals("test_external_Id", formBody.value(12));
        
        assertEquals("order", formBody.name(13));
        assertEquals("[{\"address\":{\"name\":\"John Wayne\",\"email\":\"john.wayne@farwest.com\",\"address1\":\"1st Avenue\",\"address2\":\"Apartment 12\",\"city\":\"New-York\",\"zip\":\"10001\",\"state\":\"NY\",\"country\":\"US\"},\"customer_ref_id\":\"IMAGINARY_CUSTOMER_REF_1\",\"products\":[{\"quantity\":1,\"ean\":\"WI220002EAN\"},{\"quantity\":3,\"ean\":\"WI330002EAN\"}]},{\"address\":{\"name\":\"Calamity Jane\",\"email\":\"calamity.jane@farwest.com\",\"address1\":\"SW 8th St\",\"address2\":\"Block 1\",\"city\":\"Miami\",\"zip\":\"33135\",\"state\":\"FL\",\"country\":\"US\"},\"customer_ref_id\":\"IMAGINARY_CUSTOMER_REF_2\",\"products\":[{\"quantity\":2,\"ean\":\"WI220002EAN\"},{\"quantity\":1,\"ean\":\"WI440002EAN\"},{\"quantity\":1,\"ean\":\"WI550002EAN\"}]}]", formBody.value(13));

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

        assertEquals("testmode", formBody.name(19));
        assertEquals("1", formBody.value(19));

        assertEquals("signature", formBody.name(20));
        assertEquals("d857ebb83045153b7f598b58d141e3c26010810561c9a2d439f2d615417878e5", formBody.value(20));
    }

    @Test
    public void DropshipmentDeleteQueryParametersTest(){
        DropshipmentDeleteQueryParameters param = new DropshipmentDeleteQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setOrderId("test_order_id");

        FormBody formBody = param.getQueryParameters();
        assertEquals(5, formBody.size());
        
        assertEquals("action", formBody.name(0));
        assertEquals("delete", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("order_id", formBody.name(3));
        assertEquals("test_order_id", formBody.value(3));

        assertEquals("signature", formBody.name(4));
        assertEquals("7a239636bd323b182586425c5887c613cd622cfb100d5cf5ee2c880f14c68d73", formBody.value(4));
    }

    @Test
    public void DropshipmentGetorderstatusQueryParametersTest(){

        DropshipmentGetorderstatusQueryParameters param = new DropshipmentGetorderstatusQueryParameters("secretKey");
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setOrderIds(Arrays.asList("test_order_id_1","test_order_id_2"));
        param.setCustomerRefIds(Arrays.asList("test_customer_ref_id_1","test_customer_ref_id_2"));
        param.setCustomerId("test_customer_id");

        FormBody formBody = param.getQueryParameters();
        assertEquals(7, formBody.size());
        
        assertEquals("action", formBody.name(0));
        assertEquals("getorderstatus", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("order_ids", formBody.name(3));
        assertEquals("[\"test_order_id_1\",\"test_order_id_2\"]", formBody.value(3));

        assertEquals("customer_ref_ids", formBody.name(4));
        assertEquals("[\"test_customer_ref_id_1\",\"test_customer_ref_id_2\"]", formBody.value(4));

        assertEquals("customerid", formBody.name(5));
        assertEquals("test_customer_id", formBody.value(5));

        assertEquals("signature", formBody.name(6));
        assertEquals("f81544d00f4e675dc8f61de57d33ae9460fd34bc983b76807d268fddf8e11ca6", formBody.value(6));
    }

    @Test
    public void DropshipmentUpdateQueryParametersTest() throws JsonProcessingException{
        DropshipmentUpdateQueryParameters param = new DropshipmentUpdateQueryParameters("secretKey");
        
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setOrderId("test_order_id");
        param.setOrder(getSampleOrders());

        FormBody formBody = param.getQueryParameters();

        assertEquals(6, formBody.size());
        
        assertEquals("action", formBody.name(0));
        assertEquals("update", formBody.value(0));
        
        assertEquals("client_id", formBody.name(1));
        assertEquals("test_client_id", formBody.value(1));
        
        assertEquals("nonce", formBody.name(2));
        assertEquals("test_nonce", formBody.value(2));

        assertEquals("order_id", formBody.name(3));
        assertEquals("test_order_id", formBody.value(3));

        assertEquals("order", formBody.name(4));
        assertEquals("[{\"address\":{\"name\":\"John Wayne\",\"email\":\"john.wayne@farwest.com\",\"address1\":\"1st Avenue\",\"address2\":\"Apartment 12\",\"city\":\"New-York\",\"zip\":\"10001\",\"state\":\"NY\",\"country\":\"US\"},\"customer_ref_id\":\"IMAGINARY_CUSTOMER_REF_1\",\"products\":[{\"quantity\":1,\"ean\":\"WI220002EAN\"},{\"quantity\":3,\"ean\":\"WI330002EAN\"}]},{\"address\":{\"name\":\"Calamity Jane\",\"email\":\"calamity.jane@farwest.com\",\"address1\":\"SW 8th St\",\"address2\":\"Block 1\",\"city\":\"Miami\",\"zip\":\"33135\",\"state\":\"FL\",\"country\":\"US\"},\"customer_ref_id\":\"IMAGINARY_CUSTOMER_REF_2\",\"products\":[{\"quantity\":2,\"ean\":\"WI220002EAN\"},{\"quantity\":1,\"ean\":\"WI440002EAN\"},{\"quantity\":1,\"ean\":\"WI550002EAN\"}]}]", formBody.value(4));

        assertEquals("signature", formBody.name(5));
        assertEquals("7b496fcf012c29cf6d5b4743d1f3a8a0d5b59e48f716b1a086a54efbc36dba5d", formBody.value(5));
    }

    @Test
    public void Dropshipmentv2CreateorderTest() throws WithingsAPIException, IOException{

        DropshipmentCreateOrderQueryParameters param = new DropshipmentCreateOrderQueryParameters("secretKey");

        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setOrder(getSampleOrders());
        param.setCustomerId("test_customer_id");
        param.setTestMode(1);

        OrderBase orderBase = client.dropshipmentCreateorder(param);

        assertEquals((Integer)0, orderBase.getStatus());

        assertEquals(1, orderBase.getBody().getOrders().size());

        Order order = orderBase.getBody().getOrders().get(0);
        assertEquals("D12345678", order.getOrderID());
        assertEquals("MOUVEMENTREFERENCE12345678", order.getCustomerRefID());
        assertEquals("VERIFIED", order.getStatus());
        assertEquals(1, order.getProducts().size());

        Product product = order.getProducts().get(0);                
        assertEquals("3700546702518", product.getEan());
        assertEquals(3, product.getQuantity());
    }

    @Test
    public void Dropshipmentv2CreateuserorderTest() throws WithingsAPIException, IOException{
        DropshipmentCreateUserOrderQueryParameters param = new DropshipmentCreateUserOrderQueryParameters("secretKey");
        
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setMailingpref(false);
        param.setBirthdate(1563746400);
        param.setMeasures(getSamplMeasure());
        param.setGender(0);
        param.setPreflang("en_EN");
        param.setUnitPref(getSampleUnitPref());
        param.setEmail("sample@example.com");
        param.setTimezone("America/New_York");
        param.setShortname("test_shortname");
        param.setExternalId("test_external_Id");
        param.setOrder(getSampleOrders());
        param.setRecoveryCode("test_recovery_code");
        param.setGoals(getSampleGoals());
        param.setTestMode(1);

        UserOrderBase userOrderBase = client.dropshipmentCreateuserorder(param);

        assertEquals((Integer)0, userOrderBase.getStatus());
        assertEquals("490ed603fe9bd2ce10027bdba0c932069cd27085", userOrderBase.getBody().getUser().getCode());
        assertEquals("3b7a6db0-ec7e-479b-9675-2a3d8d6a7e51", userOrderBase.getBody().getUser().getCode());

        assertEquals(1, userOrderBase.getBody().getOrders().size());

        Order order = userOrderBase.getBody().getOrders().get(0);
        assertEquals("D12345678", order.getOrderID());
        assertEquals("MOUVEMENTREFERENCE12345678", order.getCustomerRefID());
        assertEquals("VERIFIED", order.getStatus());
        assertEquals(1, order.getProducts().size());

        Product product = order.getProducts().get(0);                
        assertEquals("3700546702518", product.getEan());
        assertEquals(3, product.getQuantity());
    }

    @Test
    public void Dropshipmentv2DeleteTest(){
        throw new AssertionFailedError();
    }  

    @Test
    public void Dropshipmentv2GetorderstatusTest(){
        throw new AssertionFailedError();
    }

    @Test
    public void Dropshipmentv2UpdateTest(){
        throw new AssertionFailedError();
    }

    private MeasuresParameter getSamplMeasure(){
        MeasureParameter measure1 = new MeasureParameter();
        measure1.setValue(180);
        measure1.setUnit(-2);
        measure1.setType(4);

        MeasureParameter measure2 = new MeasureParameter();
        measure2.setValue(8000);
        measure2.setUnit(-2);
        measure2.setType(1);

        MeasuresParameter measures = new MeasuresParameter();
        measures.setPreflang("en_EN");
        measures.setBirthdate("12345678");
        measures.setGender(1);
        measures.setShortname("ABC");
        measures.setMeasures(Arrays.asList(measure1,measure2));

        return measures;
    }

    
    private ArrayList<OrderParameter> getSampleOrders(){
        AddressParameter address1 = new AddressParameter();
        address1.setName("John Wayne");
        address1.setEmail("john.wayne@farwest.com");
        address1.setAddress1("1st Avenue");
        address1.setAddress2("Apartment 12");
        address1.setCity("New-York");
        address1.setZip("10001");
        address1.setState("NY");
        address1.setCountry("US");

        AddressParameter address2 = new AddressParameter();
        address2.setName("Calamity Jane");
        address2.setEmail("calamity.jane@farwest.com");
        address2.setAddress1("SW 8th St");
        address2.setAddress2("Block 1");
        address2.setCity("Miami");
        address2.setZip("33135");
        address2.setState("FL");
        address2.setCountry("US");

        ProductParameter product1_1 = new ProductParameter();
        product1_1.setQuantity(1);
        product1_1.setEan("WI220002EAN");

        ProductParameter product1_2 = new ProductParameter();
        product1_2.setQuantity(3);
        product1_2.setEan("WI330002EAN");

        ProductParameter product2_1 = new ProductParameter();
        product2_1.setQuantity(2);
        product2_1.setEan("WI220002EAN");

        ProductParameter product2_2 = new ProductParameter();
        product2_2.setQuantity(1);
        product2_2.setEan("WI440002EAN");

        ProductParameter product2_3 = new ProductParameter();
        product2_3.setQuantity(1);
        product2_3.setEan("WI550002EAN");

        ArrayList<ProductParameter> products1 = new ArrayList<>();
        products1.add(product1_1);
        products1.add(product1_2);

        ArrayList<ProductParameter> products2 = new ArrayList<>();
        products2.add(product2_1);
        products2.add(product2_2);
        products2.add(product2_3);

        OrderParameter order1 = new OrderParameter();
        order1.setCustomerRefID("IMAGINARY_CUSTOMER_REF_1");
        order1.setAddress(address1);
        order1.setProducts(products1);

        OrderParameter order2 = new OrderParameter();
        order2.setCustomerRefID("IMAGINARY_CUSTOMER_REF_2");
        order2.setAddress(address2);
        order2.setProducts(products2);

        ArrayList<OrderParameter> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        return orders;
    }

    private UnitPreferencesParameter getSampleUnitPref() {
        UnitPreferencesParameter unitPreference = new UnitPreferencesParameter();
        unitPreference.setWeight(1);
        unitPreference.setHeight(7);
        unitPreference.setDistance(8);
        unitPreference.setTemperature(13);

        return unitPreference;
    }

    
    private GoalsParameter getSampleGoals() {
        WeightParameter weight = new WeightParameter();
        weight.setValue(70500);
        weight.setUnit(-3);

        GoalsParameter goals = new GoalsParameter();
        goals.setSteps(10000);
        goals.setSleep(28800);
        goals.setWeight(weight);

        return goals;
    }

}
