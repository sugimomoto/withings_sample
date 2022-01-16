package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoalsParameter {
    private long steps;
    private long sleep;
    private WeightParameter weight;

    @JsonProperty("steps")
    public long getSteps() { return steps; }
    @JsonProperty("steps")
    public void setSteps(long value) { this.steps = value; }

    @JsonProperty("sleep")
    public long getSleep() { return sleep; }
    @JsonProperty("sleep")
    public void setSleep(long value) { this.sleep = value; }

    @JsonProperty("weight")
    public WeightParameter getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(WeightParameter value) { this.weight = value; }

}
