package sugimomoto;

import java.util.ArrayList;
import java.util.Arrays;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.junit.Before;
import org.junit.Rule;

import sugimomoto.withings4j.WithingsAPIClient;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public abstract class APIClientTestSettup {
    
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8081);

    private String mockUrl = "http://localhost:8081";

    protected WithingsAPIClient client;

    @Before
    public void init(){
        AccessToken token = new AccessToken();
        token.setAccessToken("dummy_token");

        client = new WithingsAPIClient(token);
        client.setEndpointUrl(mockUrl);
    }

    public MeasuresParameter getSamplMeasure(){
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

    
    public ArrayList<OrderParameter> getSampleOrders(){
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

    public UnitPreferencesParameter getSampleUnitPref() {
        UnitPreferencesParameter unitPreference = new UnitPreferencesParameter();
        unitPreference.setWeight(1);
        unitPreference.setHeight(7);
        unitPreference.setDistance(8);
        unitPreference.setTemperature(13);

        return unitPreference;
    }

    
    public GoalsParameter getSampleGoals() {
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
