package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserOrderBody {
    private User user;
    private List<Order> orders;

    @JsonProperty("user")
    public User getUser() { return user; }
    @JsonProperty("user")
    public void setUser(User value) { this.user = value; }

    @JsonProperty("orders")
    public List<Order> getOrders() { return orders; }
    @JsonProperty("orders")
    public void setOrders(List<Order> value) { this.orders = value; }
}
