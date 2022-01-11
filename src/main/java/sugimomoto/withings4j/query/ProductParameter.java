package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductParameter {
    private long quantity;
    private String ean;

    @JsonProperty("quantity")
    public long getQuantity() { return quantity; }
    @JsonProperty("quantity")
    public void setQuantity(long value) { this.quantity = value; }

    @JsonProperty("ean")
    public String getEan() { return ean; }
    @JsonProperty("ean")
    public void setEan(String value) { this.ean = value; }
}
