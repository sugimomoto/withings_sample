package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import okhttp3.FormBody;

public class APIClientTest {

    @Test
    public void parameterTest(){

        ActivitiesQueryParameters param = new ActivitiesQueryParameters();
        param.setStartDateYMD("2021-01-01");
        param.setEndDateYMD("2021-01-02");
        param.setLastUpdate(12345);
        param.setOffset(23456);
        param.setDataFileds("steps,distance");

        FormBody body = param.getQueryParameters();

        assertEquals(5, body.size());
        assertEquals("startdateymd", body.name(0));
        assertEquals("2021-01-01", body.value(0));

        assertEquals("enddateymd", body.name(1));
        assertEquals("2021-01-02", body.value(1));

        assertEquals("lastupdate", body.name(2));
        assertEquals("12345", body.value(2));

        assertEquals("offset", body.name(3));
        assertEquals("23456", body.value(3));

        assertEquals("data_fields", body.name(4));
        assertEquals("steps,distance", body.value(4));
    }
    
    @Test
    public void getActivityTest(){
        AccessTokenResponse token = new AccessTokenResponse();

        WithingsAPIClient client = new WithingsAPIClient(token);

        ActivitiesQueryParameters param = new ActivitiesQueryParameters();    
        param.setStartDateYMD("2021-01-01");
        param.setEndDateYMD("2021-01-02");

        ActivityBase response = client.getActivities(param);

        List<Activity> activities = response.getBody().getActivities();

        int count = 0;

        for (Activity activity : activities) {
            assertEquals((Integer)6676, activity.getSteps());
            assertEquals(5078.594, activity.getDistance(),0);
            assertEquals((Integer)0, activity.getElevation());
            assertEquals((Integer)9095, activity.getSoft());
            assertEquals((Integer)1049, activity.getModerate());
            assertEquals((Integer)58, activity.getIntense());
            assertEquals((Integer)1107, activity.getActive());
            assertEquals(210.68, activity.getCalories(),0);
            assertEquals(2014.409, activity.getTotalcalories(),0);
            assertEquals("deviceid", activity.getDeviceid());
            assertEquals("hashdeviceid", activity.getHashDeviceid());
            assertEquals("Asia/Tokyo", activity.getTimezone());
            assertEquals(LocalDate.parse("2021-11-06"), activity.getDate());
            assertEquals((Integer)18, activity.getBrand());
            assertEquals(false, activity.getIsTracker());
            count++;
        }
        
        assertEquals(200, count);
    }

    @Test
    public void getMeasureTest(){


    }
}
