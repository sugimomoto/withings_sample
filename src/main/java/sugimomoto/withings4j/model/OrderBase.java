package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderBase extends ResponseBaseAbstract {
    private OrderBody body;

    @JsonProperty("body")
    public OrderBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(OrderBody value) { this.body = value; }
}
