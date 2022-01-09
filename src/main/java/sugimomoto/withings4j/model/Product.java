package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private String ean;
    private long quantity;

    @JsonProperty("ean")
    public String getEan() { return ean; }
    @JsonProperty("ean")
    public void setEan(String value) { this.ean = value; }

    @JsonProperty("quantity")
    public long getQuantity() { return quantity; }
    @JsonProperty("quantity")
    public void setQuantity(long value) { this.quantity = value; }
}
