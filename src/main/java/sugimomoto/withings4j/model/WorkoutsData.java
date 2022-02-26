package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkoutsData {
    private long algoPauseDuration;
    private long calories;
    private long distance;
    private long elevation;
    private long hrAverage;
    private long hrMax;
    private long hrMin;
    private long hrZone0;
    private long hrZone1;
    private long hrZone2;
    private long hrZone3;
    private long intensity;
    private long manualCalories;
    private long manualDistance;
    private long pauseDuration;
    private long poolLaps;
    private long poolLength;
    private long spo2Average;
    private long steps;
    private long strokes;

    @JsonProperty("algo_pause_duration")
    public long getAlgoPauseDuration() { return algoPauseDuration; }
    @JsonProperty("algo_pause_duration")
    public void setAlgoPauseDuration(long value) { this.algoPauseDuration = value; }

    @JsonProperty("calories")
    public long getCalories() { return calories; }
    @JsonProperty("calories")
    public void setCalories(long value) { this.calories = value; }

    @JsonProperty("distance")
    public long getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(long value) { this.distance = value; }

    @JsonProperty("elevation")
    public long getElevation() { return elevation; }
    @JsonProperty("elevation")
    public void setElevation(long value) { this.elevation = value; }

    @JsonProperty("hr_average")
    public long getHrAverage() { return hrAverage; }
    @JsonProperty("hr_average")
    public void setHrAverage(long value) { this.hrAverage = value; }

    @JsonProperty("hr_max")
    public long getHrMax() { return hrMax; }
    @JsonProperty("hr_max")
    public void setHrMax(long value) { this.hrMax = value; }

    @JsonProperty("hr_min")
    public long getHrMin() { return hrMin; }
    @JsonProperty("hr_min")
    public void setHrMin(long value) { this.hrMin = value; }

    @JsonProperty("hr_zone_0")
    public long getHrZone0() { return hrZone0; }
    @JsonProperty("hr_zone_0")
    public void setHrZone0(long value) { this.hrZone0 = value; }

    @JsonProperty("hr_zone_1")
    public long getHrZone1() { return hrZone1; }
    @JsonProperty("hr_zone_1")
    public void setHrZone1(long value) { this.hrZone1 = value; }

    @JsonProperty("hr_zone_2")
    public long getHrZone2() { return hrZone2; }
    @JsonProperty("hr_zone_2")
    public void setHrZone2(long value) { this.hrZone2 = value; }

    @JsonProperty("hr_zone_3")
    public long getHrZone3() { return hrZone3; }
    @JsonProperty("hr_zone_3")
    public void setHrZone3(long value) { this.hrZone3 = value; }

    @JsonProperty("intensity")
    public long getIntensity() { return intensity; }
    @JsonProperty("intensity")
    public void setIntensity(long value) { this.intensity = value; }

    @JsonProperty("manual_calories")
    public long getManualCalories() { return manualCalories; }
    @JsonProperty("manual_calories")
    public void setManualCalories(long value) { this.manualCalories = value; }

    @JsonProperty("manual_distance")
    public long getManualDistance() { return manualDistance; }
    @JsonProperty("manual_distance")
    public void setManualDistance(long value) { this.manualDistance = value; }

    @JsonProperty("pause_duration")
    public long getPauseDuration() { return pauseDuration; }
    @JsonProperty("pause_duration")
    public void setPauseDuration(long value) { this.pauseDuration = value; }

    @JsonProperty("pool_laps")
    public long getPoolLaps() { return poolLaps; }
    @JsonProperty("pool_laps")
    public void setPoolLaps(long value) { this.poolLaps = value; }

    @JsonProperty("pool_length")
    public long getPoolLength() { return poolLength; }
    @JsonProperty("pool_length")
    public void setPoolLength(long value) { this.poolLength = value; }

    @JsonProperty("spo2_average")
    public long getSpo2Average() { return spo2Average; }
    @JsonProperty("spo2_average")
    public void setSpo2Average(long value) { this.spo2Average = value; }

    @JsonProperty("steps")
    public long getSteps() { return steps; }
    @JsonProperty("steps")
    public void setSteps(long value) { this.steps = value; }

    @JsonProperty("strokes")
    public long getStrokes() { return strokes; }
    @JsonProperty("strokes")
    public void setStrokes(long value) { this.strokes = value; }

}
