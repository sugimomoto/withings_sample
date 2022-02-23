package sugimomoto.withings4j.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String code;
    private UUID externalID;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("external_id")
    public UUID getExternalID() { return externalID; }
    @JsonProperty("external_id")
    public void setExternalID(UUID value) { this.externalID = value; }

    private String email;
    private String firstname;
    private String lastname;
    private String shortname;
    private long gender;
    private long birthdate;
    private String preflang;
    private String timezone;
    private boolean mailingpref;
    private UnitPref unitPref;
    private String phonenumber;

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("firstname")
    public String getFirstname() { return firstname; }
    @JsonProperty("firstname")
    public void setFirstname(String value) { this.firstname = value; }

    @JsonProperty("lastname")
    public String getLastname() { return lastname; }
    @JsonProperty("lastname")
    public void setLastname(String value) { this.lastname = value; }

    @JsonProperty("shortname")
    public String getShortname() { return shortname; }
    @JsonProperty("shortname")
    public void setShortname(String value) { this.shortname = value; }

    @JsonProperty("gender")
    public long getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(long value) { this.gender = value; }

    @JsonProperty("birthdate")
    public long getBirthdate() { return birthdate; }
    @JsonProperty("birthdate")
    public void setBirthdate(long value) { this.birthdate = value; }

    @JsonProperty("preflang")
    public String getPreflang() { return preflang; }
    @JsonProperty("preflang")
    public void setPreflang(String value) { this.preflang = value; }

    @JsonProperty("timezone")
    public String getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(String value) { this.timezone = value; }

    @JsonProperty("mailingpref")
    public boolean getMailingpref() { return mailingpref; }
    @JsonProperty("mailingpref")
    public void setMailingpref(boolean value) { this.mailingpref = value; }

    @JsonProperty("unit_pref")
    public UnitPref getUnitPref() { return unitPref; }
    @JsonProperty("unit_pref")
    public void setUnitPref(UnitPref value) { this.unitPref = value; }

    @JsonProperty("phonenumber")
    public String getPhonenumber() { return phonenumber; }
    @JsonProperty("phonenumber")
    public void setPhonenumber(String value) { this.phonenumber = value; }

}
