package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private String ean;
    private long quantity;
    private List<String> macAddresses;

    @JsonProperty("ean")
    public String getEan() { return ean; }
    @JsonProperty("ean")
    public void setEan(String value) { this.ean = value; }

    @JsonProperty("quantity")
    public long getQuantity() { return quantity; }
    @JsonProperty("quantity")
    public void setQuantity(long value) { this.quantity = value; }

    @JsonProperty("mac_addresses")
    public List<String> getMacAddrsses() { return macAddresses; }
    @JsonProperty("mac_addresses")
    public void setMacAddresses(List<String> value) { this.macAddresses = value; }
}
