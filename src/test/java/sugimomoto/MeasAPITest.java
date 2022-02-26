package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class MeasAPITest extends APIClientTestSettup {


    @Test
    public void MeasureGetintradayactivityQueryParametersTest(){
        MeasureGetintradayactivityQueryParameters param = new MeasureGetintradayactivityQueryParameters();
        param.setStartDate(1594159644);
        param.setEndDate(1594159645);
        param.setDataFileds("steps,elevation");

        FormBody formBody = param.getQueryParameters();

        assertEquals(4, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("getintradayactivity", formBody.value(0));

        assertEquals("startdate", formBody.name(1));
        assertEquals("1594159644", formBody.value(1));

        assertEquals("enddate", formBody.name(2));
        assertEquals("1594159645", formBody.value(2));

        assertEquals("data_fields", formBody.name(3));
        assertEquals("steps,elevation", formBody.value(3));
    }

    @Test
    public void MeasureGetmeasQueryParametersTest(){
        MeasureGetmeasQueryParameters param = new MeasureGetmeasQueryParameters();
        param.setMeasType(MeasType.Weight);
        param.setMeasTypes(new MeasType[]{MeasType.Weight,MeasType.Height,MeasType.MuscleMass});
        param.setCategory(MeasCategory.RealMeasures);
        param.setStartDate("2021-01-01");
        param.setEndDate("2021-01-02");
        param.setLastUpdate(12345);
        param.setOffset(23456);

        FormBody body = param.getQueryParameters();

        assertEquals(8, body.size());
        assertEquals("action", body.name(0));
        assertEquals("getmeas", body.value(0));

        assertEquals("meastype", body.name(1));
        assertEquals("1", body.value(1));

        assertEquals("meastypes", body.name(2));
        assertEquals("1,4,76", body.value(2));

        assertEquals("category", body.name(3));
        assertEquals("1", body.value(3));

        assertEquals("startdate", body.name(4));
        assertEquals("2021-01-01", body.value(4));

        assertEquals("enddate", body.name(5));
        assertEquals("2021-01-02", body.value(5));

        assertEquals("lastupdate", body.name(6));
        assertEquals("12345", body.value(6));

        assertEquals("offset", body.name(7));
        assertEquals("23456", body.value(7));
    }

    @Test
    public void MeasureGetworkoutsQueryParametersTest(){
        MeasureGetworkoutsQueryParameters param = new MeasureGetworkoutsQueryParameters();
        param.setStartDateYMD("2021-01-01");
        param.setEndDateYMD("2021-01-02");
        param.setLastUpdate(12345);
        param.setOffset(23456);
        param.setDataFileds("steps,distance");

        FormBody body = param.getQueryParameters();

        assertEquals(6, body.size());
        assertEquals("action", body.name(0));
        assertEquals("getworkouts", body.value(0));

        assertEquals("startdateymd", body.name(1));
        assertEquals("2021-01-01", body.value(1));

        assertEquals("enddateymd", body.name(2));
        assertEquals("2021-01-02", body.value(2));

        assertEquals("lastupdate", body.name(3));
        assertEquals("12345", body.value(3));

        assertEquals("offset", body.name(4));
        assertEquals("23456", body.value(4));

        assertEquals("data_fields", body.name(5));
        assertEquals("steps,distance", body.value(5));
    }

    @Test
    public void MeasurevGetactivityQueryParametersTest(){

        MeasurevGetactivityQueryParameters param = new MeasurevGetactivityQueryParameters();
        param.setStartDateYMD("2021-01-01");
        param.setEndDateYMD("2021-01-02");
        param.setLastUpdate(12345);
        param.setOffset(23456);
        param.setDataFileds("steps,distance");

        FormBody body = param.getQueryParameters();

        assertEquals(6, body.size());
        assertEquals("action", body.name(0));
        assertEquals("getactivity", body.value(0));

        assertEquals("startdateymd", body.name(1));
        assertEquals("2021-01-01", body.value(1));

        assertEquals("enddateymd", body.name(2));
        assertEquals("2021-01-02", body.value(2));

        assertEquals("lastupdate", body.name(3));
        assertEquals("12345", body.value(3));

        assertEquals("offset", body.name(4));
        assertEquals("23456", body.value(4));

        assertEquals("data_fields", body.name(5));
        assertEquals("steps,distance", body.value(5));
    }
    
    @Test
    public void MeasureGetmeasTest() throws WithingsAPIException, IOException{
        MeasureGetmeasQueryParameters param = new MeasureGetmeasQueryParameters();
        param.setMeasType(MeasType.Weight);
        param.setStartDate("2021-01-01");
        param.setEndDate("2021-01-02");

        MeasBase measBase = client.measureGetmeas(param);

        assertEquals((Integer)0, measBase.getStatus());

        MeasBody measBody = measBase.getBody();

        assertEquals(1, measBody.getMore());
        assertEquals(0, measBody.getOffset());
        assertEquals("Asia/Tokyo", measBody.getTimezone());
        assertEquals("1640818701", measBody.getUpdatetime());

        List<Measuregrp> measuregrps = measBody.getMeasuregrps();
        assertEquals(41, measuregrps.size());

        Measuregrp measuregrp = measuregrps.get(0);

        assertEquals(0, measuregrp.getAttrib());
        assertEquals(1, measuregrp.getCategory());
        assertEquals("hello", measuregrp.getComment());
        assertEquals(1640815483, measuregrp.getCreated());
        assertEquals(1640815445, measuregrp.getDate());
        assertEquals("d60dfb80d09098b63204a32bca96cfed581dc5ce", measuregrp.getDeviceid());
        assertEquals("d60dfb80d09098b63204a32bca96cfed581dc5c1", measuregrp.getHashDeviceid());
        assertEquals(Long.parseLong("3259812118"), measuregrp.getGrpid());

        List<Measure> measures = measuregrp.getMeasures();

        assertEquals(1, measures.size());

        Measure measure = measures.get(0);

        assertEquals(79400, measure.getValue());
        assertEquals(1, measure.getType());
        assertEquals(-3, measure.getUnit());
        assertEquals(3, measure.getAlgo());
        assertEquals(131, measure.getFm());
    }

    @Test
    public void Measurev2GetactivityTest() throws WithingsAPIException, IOException{
        MeasurevGetactivityQueryParameters param = new MeasurevGetactivityQueryParameters();    
        param.setStartDateYMD("2020-12-01");
        param.setEndDateYMD("2020-12-02");

        ActivityBase response = client.MeasureGetactivity(param);

        List<Activity> activities = response.getBody().getActivities();

        int count = 0;

        assertEquals(27, activities.size());
        Activity activity = activities.get(0);

        assertEquals((Integer)6676, activity.getSteps());
        assertEquals(5078.594, activity.getDistance(),0);
        assertEquals((Integer)0, activity.getElevation());
        assertEquals((Integer)9095, activity.getSoft());
        assertEquals((Integer)1049, activity.getModerate());
        assertEquals((Integer)58, activity.getIntense());
        assertEquals((Integer)1107, activity.getActive());
        assertEquals(210.68, activity.getCalories(),0);
        assertEquals(2014.409, activity.getTotalcalories(),0);
        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", activity.getDeviceid());
        assertEquals("892359876fd8805ac45bab078c4828692f0276b2", activity.getHashDeviceid());
        assertEquals("Asia/Tokyo", activity.getTimezone());
        assertEquals("Sat Nov 06 09:00:00 JST 2021", activity.getDate().toString());
        assertEquals((Integer)18, activity.getBrand());
        assertEquals(false, activity.getIsTracker());
}

    @Test
    public void Measurev2GetintradayactivityTest(){
        throw new NotImplementedError();
    }

    @Test
    public void Measurev2GetworkoutsTest() throws WithingsAPIException, IOException{
        MeasureGetworkoutsQueryParameters param = new MeasureGetworkoutsQueryParameters();
        param.setStartDateYMD("2020-12-01");
        param.setEndDateYMD("2020-12-02");

        WorkoutsBase workoutsBase = client.measureGetworkouts(param);

        assertEquals((Integer)0, workoutsBase.getStatus());

        assertEquals(true, workoutsBase.getBody().getMore());
        assertEquals(0, workoutsBase.getBody().getOffset());

        assertEquals(1, workoutsBase.getBody().getSeries().size());

        WorkoutSeries workoutSeries = workoutsBase.getBody().getSeries().get(0);

        assertEquals(36, workoutSeries.getCategory());
        assertEquals("Europe/Paris", workoutSeries.getTimezone());
        assertEquals(59, workoutSeries.getModel());
        assertEquals(0, workoutSeries.getAttrib());
        assertEquals(1594245600, workoutSeries.getStartdate());
        assertEquals(1594257200, workoutSeries.getEnddate());
        assertEquals(LocalDate.of(2020,7,9), workoutSeries.getDate());
        assertEquals(1594257200, workoutSeries.getModified());
        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", workoutSeries.getDeviceid());

        assertEquals(0, workoutSeries.getData().getAlgoPauseDuration());
        assertEquals(1, workoutSeries.getData().getCalories());
        assertEquals(2, workoutSeries.getData().getDistance());
        assertEquals(3, workoutSeries.getData().getElevation());
        assertEquals(4, workoutSeries.getData().getHrAverage());
        assertEquals(5, workoutSeries.getData().getHrMax());
        assertEquals(6, workoutSeries.getData().getHrMin());
        assertEquals(7, workoutSeries.getData().getHrZone0());
        assertEquals(8, workoutSeries.getData().getHrZone1());
        assertEquals(9, workoutSeries.getData().getHrZone2());
        assertEquals(10, workoutSeries.getData().getHrZone3());
        assertEquals(11, workoutSeries.getData().getIntensity());
        assertEquals(12, workoutSeries.getData().getManualCalories());
        assertEquals(13, workoutSeries.getData().getManualDistance());
        assertEquals(14, workoutSeries.getData().getPauseDuration());
        assertEquals(15, workoutSeries.getData().getPoolLaps());
        assertEquals(16, workoutSeries.getData().getPoolLength());
        assertEquals(17, workoutSeries.getData().getSpo2Average());
        assertEquals(18, workoutSeries.getData().getSteps());
        assertEquals(19, workoutSeries.getData().getStrokes());
    }
}
