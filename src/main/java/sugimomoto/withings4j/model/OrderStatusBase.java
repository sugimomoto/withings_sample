package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderStatusBase extends ResponseBase {
    private OrderStatus body;

    @JsonProperty("body")
    public OrderStatus getBody() { return body; }
    @JsonProperty("body")
    public void setBody(OrderStatus value) { this.body = value; }
}
