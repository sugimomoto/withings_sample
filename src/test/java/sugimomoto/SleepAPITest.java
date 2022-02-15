package sugimomoto;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class SleepAPITest extends APIClientTestSettup {
    
    @Test
    public void SleepGetQueryParametersTest(){
        SleepGetQueryParameters param = new SleepGetQueryParameters();
        param.setStartDate(1594159644);
        param.setEndDate(1594159645);
        param.setDataFileds("hr,rr");

        FormBody formBody = param.getQueryParameters();

        assertEquals(4, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("get", formBody.value(0));

        assertEquals("startdate", formBody.name(1));
        assertEquals("1594159644", formBody.value(1));

        assertEquals("enddate", formBody.name(2));
        assertEquals("1594159645", formBody.value(2));

        assertEquals("data_fields", formBody.name(3));
        assertEquals("hr,rr", formBody.value(3));
    }
    
    @Test
    public void SleepGetsummaryQueryParametersTest(){
        SleepGetsummaryQueryParameters param = new SleepGetsummaryQueryParameters();
        param.setStartDateYMD("2021-01-01");
        param.setEndDateYMD("2021-01-02");
        param.setLastUpdate(12345);
        param.setDataFileds("hr,rr");

        FormBody body = param.getQueryParameters();

        assertEquals(5, body.size());
        assertEquals("action", body.name(0));
        assertEquals("getsummary", body.value(0));

        assertEquals("startdateymd", body.name(1));
        assertEquals("2021-01-01", body.value(1));

        assertEquals("enddateymd", body.name(2));
        assertEquals("2021-01-02", body.value(2));

        assertEquals("lastupdate", body.name(3));
        assertEquals("12345", body.value(3));

        assertEquals("data_fields", body.name(4));
        assertEquals("hr,rr", body.value(4));
    }
    
    @Test
    public void Sleepv2GetTest() throws WithingsAPIException, IOException{
        SleepGetQueryParameters param = new SleepGetQueryParameters();
        param.setStartDate(1594159644);
        param.setEndDate(1594159645);

        SleepBase sleepBase = client.sleepGet(param);

        assertEquals((Integer)0, sleepBase.getStatus());

        assertEquals(1594159200, sleepBase.getBody().getSeries().getStartdate());
        assertEquals(1594202400, sleepBase.getBody().getSeries().getEnddate());
        assertEquals(1, sleepBase.getBody().getSeries().getHr().getTimestamp());
        assertEquals(0, sleepBase.getBody().getSeries().getRr().getTimestamp());
        assertEquals(1, sleepBase.getBody().getSeries().getSnoring().getTimestamp());
        assertEquals("Aura Sensor V2", sleepBase.getBody().getModel());
        assertEquals(63, sleepBase.getBody().getModelID());
    }
    
    @Test
    public void Sleepv2GetsummaryTest() throws WithingsAPIException, IOException{
        SleepGetsummaryQueryParameters param = new SleepGetsummaryQueryParameters();
        param.setStartDateYMD("2020-12-01");
        param.setEndDateYMD("2020-12-02");

        SleepSummaryBase sleepSummaryBase = client.sleepGetsummary(param);

        assertEquals((Integer)0, sleepSummaryBase.getStatus());
        
        assertEquals(1, sleepSummaryBase.getBody().getSeries().size());
        SleepSummarySeries sleepSummarySeries = sleepSummaryBase.getBody().getSeries().get(0);

        assertEquals("Europe/Paris", sleepSummarySeries.getTimezone());
        assertEquals(16, sleepSummarySeries.getModel());
        assertEquals(51, sleepSummarySeries.getModelID());
        assertEquals(1594245600, sleepSummarySeries.getStartdate());
        assertEquals(1594257200, sleepSummarySeries.getEnddate());
        assertEquals("2020-07-09", sleepSummarySeries.getDate());
        assertEquals(1594257200, sleepSummarySeries.getCreated());
        assertEquals(1594257200, sleepSummarySeries.getModified());

        assertEquals(0, sleepSummarySeries.getData().getApneaHypopneaIndex());
        assertEquals(1, sleepSummarySeries.getData().getAsleepduration());
        assertEquals(2, sleepSummarySeries.getData().getBreathingDisturbancesIntensity());
        assertEquals(3, sleepSummarySeries.getData().getDeepsleepduration());
        assertEquals(4, sleepSummarySeries.getData().getDurationtosleep());
        assertEquals(5, sleepSummarySeries.getData().getDurationtowakeup());
        assertEquals(6, sleepSummarySeries.getData().getHrAverage());
        assertEquals(7, sleepSummarySeries.getData().getHrMax());
        assertEquals(8, sleepSummarySeries.getData().getHrMin());
        assertEquals(9, sleepSummarySeries.getData().getLightsleepduration());
        assertEquals(10, sleepSummarySeries.getData().getNbRemEpisodes());

        assertEquals(0, sleepSummarySeries.getData().getNightEvents().size());

        assertEquals(11, sleepSummarySeries.getData().getOutOfBedCount());
        assertEquals(12, sleepSummarySeries.getData().getRemsleepduration());
        assertEquals(13, sleepSummarySeries.getData().getRrAverage());
        assertEquals(14, sleepSummarySeries.getData().getRrMax());
        assertEquals(15, sleepSummarySeries.getData().getRrMin());
        assertEquals(16, sleepSummarySeries.getData().getSleepEfficiency());
        assertEquals(17, sleepSummarySeries.getData().getSleepLatency());
        assertEquals(18, sleepSummarySeries.getData().getSleepScore());
        assertEquals(19, sleepSummarySeries.getData().getSnoring());
        assertEquals(20, sleepSummarySeries.getData().getSnoringepisodecount());
        assertEquals(21, sleepSummarySeries.getData().getTotalSleepTime());
        assertEquals(22, sleepSummarySeries.getData().getTotalTimeinbed());
        assertEquals(23, sleepSummarySeries.getData().getWakeupLatency());
        assertEquals(24, sleepSummarySeries.getData().getWakeupcount());
        assertEquals(25, sleepSummarySeries.getData().getWakeupduration());
        assertEquals(26, sleepSummarySeries.getData().getWaso());
    }
}
