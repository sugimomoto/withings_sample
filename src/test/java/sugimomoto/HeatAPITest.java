package sugimomoto;

import static org.junit.Assert.assertEquals;

import java.text.Normalizer.Form;

import org.junit.Test;

import kotlin.NotImplementedError;
import okhttp3.FormBody;
import sugimomoto.withings4j.query.*;

public class HeatAPITest extends APIClientTestSettup{

    @Test
    public void HeartGetQueryParametersTest(){
        HeartGetQueryParameters heartGetQueryParameters = new HeartGetQueryParameters();
        heartGetQueryParameters.setSignalId("1");
        
        FormBody formBody = heartGetQueryParameters.getQueryParameters();

        assertEquals(2, formBody.size());

        assertEquals("action", formBody.name(0));
        assertEquals("get", formBody.value(0));

        assertEquals("signalid", formBody.name(1));
        assertEquals("1", formBody.value(1));
    }

    @Test
    public void HeartListQueryParametersTest(){
        HeartListQueryParameters heartListQueryParameters = new HeartListQueryParameters();
        heartListQueryParameters.setStartDate(1594159644);
        heartListQueryParameters.setEndDate(1594159645);
        heartListQueryParameters.setOffset(1);

        FormBody formBody = heartListQueryParameters.getQueryParameters();

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
    public void Heartv2GetTest(){
        throw new NotImplementedError();
    }

    @Test
    public void Heartv2ListTest(){
        throw new NotImplementedError();
    }
}
