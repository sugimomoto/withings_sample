package sugimomoto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity { 
    private Integer steps;
    private double distance;
    private Integer elevation;
    private Integer soft;
    private Integer moderate;
    private Integer intense;
    private Integer active;
    private double calories;
    private double totalcalories;
    private String deviceid;
    private String hashDeviceid;
    private String timezone;
    private Date date;
    private Integer brand;
    private boolean isTracker;

    @JsonProperty("steps")
    public Integer getSteps() { return steps; }
    @JsonProperty("steps")
    public void setSteps(Integer value) { this.steps = value; }

    @JsonProperty("distance")
    public double getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(double value) { this.distance = value; }

    @JsonProperty("elevation")
    public Integer getElevation() { return elevation; }
    @JsonProperty("elevation")
    public void setElevation(Integer value) { this.elevation = value; }

    @JsonProperty("soft")
    public Integer getSoft() { return soft; }
    @JsonProperty("soft")
    public void setSoft(Integer value) { this.soft = value; }

    @JsonProperty("moderate")
    public Integer getModerate() { return moderate; }
    @JsonProperty("moderate")
    public void setModerate(Integer value) { this.moderate = value; }

    @JsonProperty("intense")
    public Integer getIntense() { return intense; }
    @JsonProperty("intense")
    public void setIntense(Integer value) { this.intense = value; }

    @JsonProperty("active")
    public Integer getActive() { return active; }
    @JsonProperty("active")
    public void setActive(Integer value) { this.active = value; }

    @JsonProperty("calories")
    public double getCalories() { return calories; }
    @JsonProperty("calories")
    public void setCalories(double value) { this.calories = value; }

    @JsonProperty("totalcalories")
    public double getTotalcalories() { return totalcalories; }
    @JsonProperty("totalcalories")
    public void setTotalcalories(double value) { this.totalcalories = value; }

    @JsonProperty("deviceid")
    public String getDeviceid() { return deviceid; }
    @JsonProperty("deviceid")
    public void setDeviceid(String value) { this.deviceid = value; }

    @JsonProperty("hash_deviceid")
    public String getHashDeviceid() { return hashDeviceid; }
    @JsonProperty("hash_deviceid")
    public void setHashDeviceid(String value) { this.hashDeviceid = value; }

    @JsonProperty("timezone")
    public String getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(String value) { this.timezone = value; }

    @JsonProperty("date")
    public Date getDate() { return date; }
    @JsonProperty("date")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("brand")
    public Integer getBrand() { return brand; }
    @JsonProperty("brand")
    public void setBrand(Integer value) { this.brand = value; }

    @JsonProperty("is_tracker")
    public boolean getIsTracker() { return isTracker; }
    @JsonProperty("is_tracker")
    public void setIsTracker(boolean value) { this.isTracker = value; }
}
