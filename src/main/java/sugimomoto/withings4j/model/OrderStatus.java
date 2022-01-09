package sugimomoto.withings4j.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderStatus {
    private String orderID;
    private String customerRefID;
    private String status;
    private List<Product> products;
    private String carrier;
    private String carrierService;
    private String trackingNumber;
    private String parcelStatus;

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

    @JsonProperty("carrier")
    public String getCarrier() { return carrier; }
    @JsonProperty("carrier")
    public void setCarrier(String value) { this.carrier = value; }

    @JsonProperty("carrier_service")
    public String getCarrierService() { return carrierService; }
    @JsonProperty("carrier_service")
    public void setCarrierService(String value) { this.carrierService = value; }

    @JsonProperty("tracking_number")
    public String getTrackingNumber() { return trackingNumber; }
    @JsonProperty("tracking_number")
    public void setTrackingNumber(String value) { this.trackingNumber = value; }

    @JsonProperty("parcel_status")
    public String getParcelStatus() { return parcelStatus; }
    @JsonProperty("parcel_status")
    public void setParcelStatus(String value) { this.parcelStatus = value; }
}
