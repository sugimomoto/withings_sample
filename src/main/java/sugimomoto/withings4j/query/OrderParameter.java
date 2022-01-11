package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderParameter {
    private AddressParameter address;
    private String customerRefID;
    private List<ProductParameter> products;

    @JsonProperty("address")
    public AddressParameter getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(AddressParameter value) { this.address = value; }

    @JsonProperty("customer_ref_id")
    public String getCustomerRefID() { return customerRefID; }
    @JsonProperty("customer_ref_id")
    public void setCustomerRefID(String value) { this.customerRefID = value; }

    @JsonProperty("products")
    public List<ProductParameter> getProducts() { return products; }
    @JsonProperty("products")
    public void setProducts(List<ProductParameter> value) { this.products = value; }

}
