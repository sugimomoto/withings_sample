package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoalsBody {
    
    private Goals goals;

    @JsonProperty("goals")
    public Goals getGoals() { return goals; }
    @JsonProperty("goals")
    public void setGoals(Goals value) { this.goals = value; }
}
