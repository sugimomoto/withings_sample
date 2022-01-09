package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderStatusBody {
    private List<OrderStatus> orders;

    @JsonProperty("orders")
    public List<OrderStatus> getOrders() { return orders; }
    @JsonProperty("orders")
    public void setOrders(List<OrderStatus> value) { this.orders = value; }
}