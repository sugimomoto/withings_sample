package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    private String orderID;
    private String customerRefID;
    private String status;
    private List<Product> products;

    @JsonProperty("order_id")
    public String getOrderID() { return orderID; }
    @JsonProperty("order_id")
    public void setOrderID(String value) { this.orderID = value; }

    @JsonProperty("customer_ref_id")
    public String getCustomerRefID() { return customerRefID; }
    @JsonProperty("customer_ref_id")
    public void setCustomerRefID(String value) { this.customerRefID = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("products")
    public List<Product> getProducts() { return products; }
    @JsonProperty("products")
    public void setProducts(List<Product> value) { this.products = value; }
}