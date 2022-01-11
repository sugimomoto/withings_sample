package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressParameter {
    
    private String name;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String zip;
    private String state;
    private String country;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("address1")
    public String getAddress1() { return address1; }
    @JsonProperty("address1")
    public void setAddress1(String value) { this.address1 = value; }

    @JsonProperty("address2")
    public String getAddress2() { return address2; }
    @JsonProperty("address2")
    public void setAddress2(String value) { this.address2 = value; }

    @JsonProperty("city")
    public String getCity() { return city; }
    @JsonProperty("city")
    public void setCity(String value) { this.city = value; }

    @JsonProperty("zip")
    public String getZip() { return zip; }
    @JsonProperty("zip")
    public void setZip(String value) { this.zip = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }
}
