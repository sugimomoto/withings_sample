package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;

public class APIClientTest {
    
    @Test
    public void getActivityTest(){
        AccessTokenResponse token = new AccessTokenResponse();

        WithingsAPIClient client = new WithingsAPIClient(token);

        ActivitiesQueryParam param = new ActivitiesQueryParam();    
        param.setStartDateYMD("2021-01-01");
        param.setEndDateYMD("2021-01-02");

        ActivityBase response = client.getActivities(param);

        List<Activity> activities = response.getActivities();

        int count = 0;

        for (Activity activity : activities) {
            assertEquals(6676, activity.getSteps());
            assertEquals(5078.594, activity.getDistance());
            assertEquals(0, activity.getElevation());
            assertEquals(9095, activity.getSoft());
            assertEquals(1049, activity.getModerate());
            assertEquals(58, activity.getInstanse());
            assertEquals(1107, activity.getActive());
            assertEquals(210.68, activity.getCalories());
            assertEquals(2014.409, activity.getTotalCalories());
            assertEquals("deviceid", activity.getDeviceId());
            assertEquals("hashdeviceid", activity.getHashDeviceId());
            assertEquals("Asia/Tokyo", activity.getTimezone());
            assertEquals("2021-11-06", activity.getDate());
            assertEquals(18, activity.getBrand());
            assertEquals(false, activity.getIsTracker());

            /*
                "steps": 6676,
                "distance": 5078.594,
                "elevation": 0,
                "soft": 9095,
                "moderate": 1049,
                "intense": 58,
                "active": 1107,
                "calories": 210.68,
                "totalcalories": 2014.409,
                "deviceid": null,
                "hash_deviceid": null,
                "timezone": "Asia/Tokyo",
                "date": "2021-11-06",
                "brand": 18,
                "is_tracker": false
                */

            count++;
        }
        
        assertEquals(200, count);

    }

    @Test
    public void getMeasureTest(){


    }
}
