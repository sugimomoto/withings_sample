package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Goals {
    
    private long steps;
    private long sleep;
    private Weight weight;

    @JsonProperty("steps")
    public long getSteps() { return steps; }
    @JsonProperty("steps")
    public void setSteps(long value) { this.steps = value; }

    @JsonProperty("sleep")
    public long getSleep() { return sleep; }
    @JsonProperty("sleep")
    public void setSleep(long value) { this.sleep = value; }

    @JsonProperty("weight")
    public Weight getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(Weight value) { this.weight = value; }
}
