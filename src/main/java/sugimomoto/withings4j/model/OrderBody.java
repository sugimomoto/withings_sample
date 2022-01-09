package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderBody {
    private List<Order> orders;

    @JsonProperty("orders")
    public List<Order> getOrders() { return orders; }
    @JsonProperty("orders")
    public void setOrders(List<Order> value) { this.orders = value; }
}