package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderStatusBase extends ResponseBaseAbstract {
    private OrderStatusBody body;

    @JsonProperty("body")
    public OrderStatusBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(OrderStatusBody value) { this.body = value; }
}
