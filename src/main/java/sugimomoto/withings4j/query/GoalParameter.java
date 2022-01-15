package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoalParameter {
    private int steps;
    private int sleep;
    private WeightParameter weight;

    @JsonProperty("steps")
    public int getSteps() { return steps; }
    @JsonProperty("steps")
    public void setSteps(int value) { this.steps = value; }

    @JsonProperty("sleep")
    public int getSleep() { return sleep; }
    @JsonProperty("sleep")
    public void setSleep(int value) { this.sleep = value; }

    @JsonProperty("weight")
    public WeightParameter getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(WeightParameter value) { this.weight = value; }

}
