package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.junit.Rule;
import org.junit.Test;

import okhttp3.FormBody;
import sugimomoto.withings4j.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class APIClientTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8081);

    private String mockUrl = "http://localhost:8081";

    private WithingsAPIClient client;

    public void init(){
        AccessToken token = new AccessToken();
        token.setAccessToken("dummy_token");

        client = new WithingsAPIClient(token);
        client.setEndpointUrl(mockUrl);
    }

    @Test
    public void MeasQueryParametersTest(){
        GetMeasQueryParameters param = new GetMeasQueryParameters();
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
    public void ActivitiesQueryParametersTest(){

        GetActivityQueryParameters param = new GetActivityQueryParameters();
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
    public void getActivityTest() throws WithingsAPIException, IOException{
        init();

        GetActivityQueryParameters param = new GetActivityQueryParameters();    
        param.setStartDateYMD("2020-12-01");
        param.setEndDateYMD("2020-12-02");

        ActivityBase response = client.getActivities(param);

        List<Activity> activities = response.getBody().getActivities();

        int count = 0;

        assertEquals(27, activities.size());

        for (Activity activity : activities) {
            if(count == 0){
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
            
            count++;
        }
    }

    @Test
    public void getMeasureTest() throws WithingsAPIException, IOException{
        init();

        GetMeasQueryParameters param = new GetMeasQueryParameters();
        param.setMeasType(MeasType.Weight);
        param.setStartDate("2021-01-01");
        param.setEndDate("2021-01-02");

        MeasBase measBase = client.getMeasures(param);

        assertEquals((Integer)0, measBase.getStatus());

        MeasBody measBody = measBase.getBody();

        assertEquals(1, measBody.getMore());
        assertEquals(0, measBody.getOffset());
        assertEquals("Asia/Tokyo", measBody.getTimezone());
        assertEquals("1640818701", measBody.getUpdatetime());

        List<Measuregrp> measuregrps = measBody.getMeasuregrps();
        assertEquals(41, measuregrps.size());

        int count = 0;
        for (Measuregrp measuregrp : measuregrps) {

            if(count == 0){
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
            count++;
        }
    }
}
