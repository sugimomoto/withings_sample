package sugimomoto.withings4j.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSummaryData {

    private long apneaHypopneaIndex;
    private long asleepduration;
    private long breathingDisturbancesIntensity;
    private long deepsleepduration;
    private long durationtosleep;
    private long durationtowakeup;
    private long hrAverage;
    private long hrMax;
    private long hrMin;
    private long lightsleepduration;
    private long nbRemEpisodes;
    private List<Object> nightEvents;
    private long outOfBedCount;
    private long remsleepduration;
    private long rrAverage;
    private long rrMax;
    private long rrMin;
    private long sleepEfficiency;
    private long sleepLatency;
    private long sleepScore;
    private long snoring;
    private long snoringepisodecount;
    private long totalSleepTime;
    private long totalTimeinbed;
    private long wakeupLatency;
    private long wakeupcount;
    private long wakeupduration;
    private long waso;

    @JsonProperty("apnea_hypopnea_index")
    public long getApneaHypopneaIndex() { return apneaHypopneaIndex; }
    @JsonProperty("apnea_hypopnea_index")
    public void setApneaHypopneaIndex(long value) { this.apneaHypopneaIndex = value; }

    @JsonProperty("asleepduration")
    public long getAsleepduration() { return asleepduration; }
    @JsonProperty("asleepduration")
    public void setAsleepduration(long value) { this.asleepduration = value; }

    @JsonProperty("breathing_disturbances_intensity")
    public long getBreathingDisturbancesIntensity() { return breathingDisturbancesIntensity; }
    @JsonProperty("breathing_disturbances_intensity")
    public void setBreathingDisturbancesIntensity(long value) { this.breathingDisturbancesIntensity = value; }

    @JsonProperty("deepsleepduration")
    public long getDeepsleepduration() { return deepsleepduration; }
    @JsonProperty("deepsleepduration")
    public void setDeepsleepduration(long value) { this.deepsleepduration = value; }

    @JsonProperty("durationtosleep")
    public long getDurationtosleep() { return durationtosleep; }
    @JsonProperty("durationtosleep")
    public void setDurationtosleep(long value) { this.durationtosleep = value; }

    @JsonProperty("durationtowakeup")
    public long getDurationtowakeup() { return durationtowakeup; }
    @JsonProperty("durationtowakeup")
    public void setDurationtowakeup(long value) { this.durationtowakeup = value; }

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

    @JsonProperty("lightsleepduration")
    public long getLightsleepduration() { return lightsleepduration; }
    @JsonProperty("lightsleepduration")
    public void setLightsleepduration(long value) { this.lightsleepduration = value; }

    @JsonProperty("nb_rem_episodes")
    public long getNbRemEpisodes() { return nbRemEpisodes; }
    @JsonProperty("nb_rem_episodes")
    public void setNbRemEpisodes(long value) { this.nbRemEpisodes = value; }

    @JsonProperty("night_events")
    public List<Object> getNightEvents() { return nightEvents; }
    @JsonProperty("night_events")
    public void setNightEvents(List<Object> value) { this.nightEvents = value; }

    @JsonProperty("out_of_bed_count")
    public long getOutOfBedCount() { return outOfBedCount; }
    @JsonProperty("out_of_bed_count")
    public void setOutOfBedCount(long value) { this.outOfBedCount = value; }

    @JsonProperty("remsleepduration")
    public long getRemsleepduration() { return remsleepduration; }
    @JsonProperty("remsleepduration")
    public void setRemsleepduration(long value) { this.remsleepduration = value; }

    @JsonProperty("rr_average")
    public long getRrAverage() { return rrAverage; }
    @JsonProperty("rr_average")
    public void setRrAverage(long value) { this.rrAverage = value; }

    @JsonProperty("rr_max")
    public long getRrMax() { return rrMax; }
    @JsonProperty("rr_max")
    public void setRrMax(long value) { this.rrMax = value; }

    @JsonProperty("rr_min")
    public long getRrMin() { return rrMin; }
    @JsonProperty("rr_min")
    public void setRrMin(long value) { this.rrMin = value; }

    @JsonProperty("sleep_efficiency")
    public long getSleepEfficiency() { return sleepEfficiency; }
    @JsonProperty("sleep_efficiency")
    public void setSleepEfficiency(long value) { this.sleepEfficiency = value; }

    @JsonProperty("sleep_latency")
    public long getSleepLatency() { return sleepLatency; }
    @JsonProperty("sleep_latency")
    public void setSleepLatency(long value) { this.sleepLatency = value; }

    @JsonProperty("sleep_score")
    public long getSleepScore() { return sleepScore; }
    @JsonProperty("sleep_score")
    public void setSleepScore(long value) { this.sleepScore = value; }

    @JsonProperty("snoring")
    public long getSnoring() { return snoring; }
    @JsonProperty("snoring")
    public void setSnoring(long value) { this.snoring = value; }

    @JsonProperty("snoringepisodecount")
    public long getSnoringepisodecount() { return snoringepisodecount; }
    @JsonProperty("snoringepisodecount")
    public void setSnoringepisodecount(long value) { this.snoringepisodecount = value; }

    @JsonProperty("total_sleep_time")
    public long getTotalSleepTime() { return totalSleepTime; }
    @JsonProperty("total_sleep_time")
    public void setTotalSleepTime(long value) { this.totalSleepTime = value; }

    @JsonProperty("total_timeinbed")
    public long getTotalTimeinbed() { return totalTimeinbed; }
    @JsonProperty("total_timeinbed")
    public void setTotalTimeinbed(long value) { this.totalTimeinbed = value; }

    @JsonProperty("wakeup_latency")
    public long getWakeupLatency() { return wakeupLatency; }
    @JsonProperty("wakeup_latency")
    public void setWakeupLatency(long value) { this.wakeupLatency = value; }

    @JsonProperty("wakeupcount")
    public long getWakeupcount() { return wakeupcount; }
    @JsonProperty("wakeupcount")
    public void setWakeupcount(long value) { this.wakeupcount = value; }

    @JsonProperty("wakeupduration")
    public long getWakeupduration() { return wakeupduration; }
    @JsonProperty("wakeupduration")
    public void setWakeupduration(long value) { this.wakeupduration = value; }

    @JsonProperty("waso")
    public long getWaso() { return waso; }
    @JsonProperty("waso")
    public void setWaso(long value) { this.waso = value; }
}
