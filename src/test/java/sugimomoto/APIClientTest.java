package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.junit.Rule;
import org.junit.Test;

import okhttp3.FormBody;

public class APIClientTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8081);

    private String mockUrl = "http://localhost:8081";

    private WithingsAPIClient client;

    public void init(){
        AccessTokenResponse token = new AccessTokenResponse();
        token.setAccessToken("dummy_token");

        client = new WithingsAPIClient(token);
        client.setEndpointUrl(mockUrl);
    }


    @Test
    public void parameterTest(){

        ActivitiesQueryParameters param = new ActivitiesQueryParameters();
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

        ActivitiesQueryParameters param = new ActivitiesQueryParameters();    
        param.setStartDateYMD("2020-12-01");
        param.setEndDateYMD("2020-12-02");

        ActivityBase response = client.getActivities(param);

        List<Activity> activities = response.getBody().getActivities();

        int count = 0;

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
        
        assertEquals(27, count);
    }

    @Test
    public void getMeasureTest(){


    }
}
