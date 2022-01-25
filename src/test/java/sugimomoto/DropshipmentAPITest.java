package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import junit.framework.AssertionFailedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.query.*;

public class DropshipmentAPITest extends APIClientTestSettup {
    
    @Test
    public void DropshipmentCreateOrderQueryParametersTest() throws JsonProcessingException{
        DropshipmentCreateOrderQueryParameters param = new DropshipmentCreateOrderQueryParameters();

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
        assertEquals("sample", formBody.value(6));
    }

    @Test
    public void DropshipmentCreateUserOrderQueryParametersTest(){

        DropshipmentCreateUserOrderQueryParameters param = new DropshipmentCreateUserOrderQueryParameters();
        
        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setMailingpref(false);
        param.setBirthdate(1563746400);


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
        assertEquals("sample", formBody.value(6));
    }

    @Test
    public void DropshipmentDeleteQueryParametersTest(){
        DropshipmentDeleteQueryParameters param = new DropshipmentDeleteQueryParameters();
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
        assertEquals("sample", formBody.value(4));
    }

    @Test
    public void DropshipmentGetorderstatusQueryParametersTest(){

        DropshipmentGetorderstatusQueryParameters param = new DropshipmentGetorderstatusQueryParameters();
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
        assertEquals("sample", formBody.value(6));
    }

    @Test
    public void DropshipmentUpdateQueryParametersTest() throws JsonProcessingException{
        DropshipmentUpdateQueryParameters param = new DropshipmentUpdateQueryParameters();
        
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
        assertEquals("sample", formBody.value(5));
    }

    @Test
    public void Dropshipmentv2CreateorderTest(){
        throw new AssertionFailedError();
    }

    @Test
    public void Dropshipmentv2CreateuserorderTest(){
        throw new AssertionFailedError();
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

}
