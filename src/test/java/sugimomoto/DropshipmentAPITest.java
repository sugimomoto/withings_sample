package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import junit.framework.AssertionFailedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.query.*;

public class DropshipmentAPITest extends APIClientTestSettup {
    
    @Test
    public void DropshipmentCreateOrderQueryParametersTest() throws JsonProcessingException{
        DropshipmentCreateOrderQueryParameters param = new DropshipmentCreateOrderQueryParameters();

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

        param.setClientId("test_client_id");
        param.setNonce("test_nonce");
        param.setOrder(orders);
        param.setCustomerId("test_customer_id");
        param.setTestMode(1);

        FormBody formBody = param.getQueryParameters();

        assertEquals(7, formBody.size());
        
        

        throw new AssertionFailedError();
    }

    @Test
    public void DropshipmentDeleteQueryParametersTest(){
        throw new AssertionFailedError();
    }

    @Test
    public void DropshipmentGetorderstatusQueryParametersTest(){
        throw new AssertionFailedError();
    }

    @Test
    public void DropshipmentUpdateQueryParametersTest(){
        throw new AssertionFailedError();
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

}
