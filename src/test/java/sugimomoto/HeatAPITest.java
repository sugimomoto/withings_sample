package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class HeatAPITest extends APIClientTestSettup{

    @Test
    public void HeartGetQueryParametersTest(){
        HeartGetQueryParameters param = new HeartGetQueryParameters();
        param.setSignalId("1");
        
        FormBody formBody = param.getQueryParameters();

        assertEquals(2, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("get", formBody.value(0));

        assertEquals("signalid", formBody.name(1));
        assertEquals("1", formBody.value(1));
    }

    @Test
    public void HeartListQueryParametersTest(){
        HeartListQueryParameters param = new HeartListQueryParameters();
        param.setStartDate(1594159644);
        param.setEndDate(1594159645);
        param.setOffset(1);

        FormBody formBody = param.getQueryParameters();

        assertEquals(4, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("list", formBody.value(0));

        assertEquals("startdate", formBody.name(1));
        assertEquals("1594159644", formBody.value(1));

        assertEquals("enddate", formBody.name(2));
        assertEquals("1594159645", formBody.value(2));

        assertEquals("offset", formBody.name(3));
        assertEquals("1", formBody.value(3));
    }
    
    @Test
    public void Heartv2GetTest() throws WithingsAPIException, IOException{
        HeartGetQueryParameters param = new HeartGetQueryParameters();
        param.setSignalId("48");

        HeartBase heartBase = client.heartGet(param);

        assertEquals((Integer)0, heartBase.getStatus());

        HeartBody heartBody = heartBase.getBody();

        assertEquals("[1,2,3,4,5,6,7,8,9]", heartBody.getSignal());
        assertEquals(500, heartBody.getSamplingFrequency());
        assertEquals(1, heartBody.getWearposition());
    }

    @Test
    public void Heartv2ListTest() throws WithingsAPIException, IOException{
        HeartListQueryParameters param = new HeartListQueryParameters();
        param.setStartDate(1594159644);
        param.setEndDate(1594159645);
        param.setOffset(1);

        HeartListBase heartListBase = client.heartList(param);

        assertEquals((Integer)0, heartListBase.getStatus());
        
        HeartListBody heartListBody = heartListBase.getBody();

        assertEquals(1, heartListBody.getSeries().size());
        assertEquals(true, heartListBody.getMore());
        assertEquals(0, heartListBody.getOffset());

        Series series = heartListBody.getSeries().get(0);

        assertEquals("892359876fd8805ac45bab078c4828692f0276b1", series.getDeviceid());
        assertEquals(44, series.getModel());
        assertEquals(48, series.getEcg().getSignalid());
        assertEquals(1, series.getEcg().getAfib());
        assertEquals(100, series.getBloodpressure().getDiastole());
        assertEquals(101, series.getBloodpressure().getSystole());
        assertEquals(82, series.getHeartRate());
        assertEquals(1594159644, series.getTimestamp());
    }
}
