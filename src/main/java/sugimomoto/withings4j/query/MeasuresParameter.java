package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasuresParameter {
    private String preflang;
    private String birthdate;
    private long gender;
    private String shortname;
    private List<MeasureParameter> measures;

    @JsonProperty("preflang")
    public String getPreflang() { return preflang; }
    @JsonProperty("preflang")
    public void setPreflang(String value) { this.preflang = value; }

    @JsonProperty("birthdate")
    public String getBirthdate() { return birthdate; }
    @JsonProperty("birthdate")
    public void setBirthdate(String value) { this.birthdate = value; }

    @JsonProperty("gender")
    public long getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(long value) { this.gender = value; }

    @JsonProperty("shortname")
    public String getShortname() { return shortname; }
    @JsonProperty("shortname")
    public void setShortname(String value) { this.shortname = value; }

    @JsonProperty("measures")
    public List<MeasureParameter> getMeasures() { return measures; }
    @JsonProperty("measures")
    public void setMeasures(List<MeasureParameter> value) { this.measures = value; }

}
