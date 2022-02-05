package sugimomoto.withings4j;

import java.io.IOException;
import java.util.function.ObjDoubleConsumer;

import okhttp3.*;
import sugimomoto.withings4j.model.*;
import sugimomoto.withings4j.query.*;

public class WithingsAPIClient extends APIClient {

    private AccessToken token;

    public WithingsAPIClient(AccessToken token) {
        this.token = token;
        this.endpointUrl = WithingsConst.ENDPOINT_URL;
    }

    @Override
    protected Headers getHeaderSettings(){
        return Headers.of(
            "Authorization","Bearer " + token.getAccessToken(),
            "User-Agent",WithingsConst.WITHINGS_4J_USER_AGENT_NAME
            );
    }

    private String getUrl(Resource resource){
        return this.endpointUrl + resource.getValue();
    }

    public OrderBase dropshipmentCreateorder(DropshipmentCreateOrderQueryParameters param) throws WithingsAPIException, IOException {
        return (OrderBase)getAPIResponse(getUrl(Resource.V2_DROPSHIPMENT), param, OrderBase.class);
    }

    public UserOrderBase dropshipmentCreateuserorder(DropshipmentCreateUserOrderQueryParameters param) throws WithingsAPIException, IOException{
        return (UserOrderBase)getAPIResponse(getUrl(Resource.V2_DROPSHIPMENT), param, UserOrderBase.class);
    }

    public ResponseBase dropshipmentDelete(DropshipmentDeleteQueryParameters param) throws WithingsAPIException, IOException{
        return (ResponseBase)getAPIResponse(getUrl(Resource.V2_DROPSHIPMENT), param, ResponseBase.class);
    }

    public OrderStatusBase dropshipmentGetorderstatus(DropshipmentGetorderstatusQueryParameters param) throws WithingsAPIException, IOException{
        return (OrderStatusBase)getAPIResponse(getUrl(Resource.V2_DROPSHIPMENT), param, OrderStatusBase.class);
    }

    public OrderBase dropshipmentUpdate(DropshipmentUpdateQueryParameters param) throws WithingsAPIException, IOException{
        return (OrderBase)getAPIResponse(getUrl(Resource.V2_DROPSHIPMENT), param, OrderBase.class);
    }

    public HeartBase heartGet(HeartGetQueryParameters param) throws WithingsAPIException, IOException{
        return (HeartBase)getAPIResponse(getUrl(Resource.V2_HEART), param, HeartBase.class);
    }

    public HeartListBase heartList(HeartListQueryParameters param) throws WithingsAPIException, IOException{
        return (HeartListBase)getAPIResponse(getUrl(Resource.V2_HEART), param, HeartListBase.class);
    }

    public ActivityBase MeasureGetactivity(MeasurevGetactivityQueryParameters param) throws IOException, WithingsAPIException {
        return (ActivityBase)getAPIResponse(getUrl(Resource.V2_MEASURE), param, ActivityBase.class);
    }

    public MeasBase measureGetmeas(MeasureGetmeasQueryParameters param) throws IOException, WithingsAPIException {
        return (MeasBase)getAPIResponse(getUrl(Resource.V1_MEASURE), param, MeasBase.class);
    }

    public IntradayActivityBase measureGetintradayactivity(MeasureGetintradayactivityQueryParameters param) throws WithingsAPIException, IOException{
        return (IntradayActivityBase)getAPIResponse(getUrl(Resource.V2_MEASURE), param, IntradayActivityBase.class);
    }

    public WorkoutsBase measureGetworkouts(MeasureGetworkoutsQueryParameters param) throws WithingsAPIException, IOException{
        return (WorkoutsBase)getAPIResponse(getUrl(Resource.V2_MEASURE), param, WorkoutsBase.class);
    }

    public NotifyBase notifyGet(NotifyGetQueryParameters param) throws WithingsAPIException, IOException{
        return (NotifyBase)getAPIResponse(getUrl(Resource.V1_NOTIFY), param, NotifyBase.class);
    }

    public NotifyListBase notifyList(NotifyListQueryParameters param) throws WithingsAPIException, IOException{
        return (NotifyListBase)getAPIResponse(getUrl(Resource.V1_NOTIFY), param, NotifyListBase.class);
    }

    public ResponseBase notifyRevoke(NotifyRevokeQueryParameters param) throws WithingsAPIException, IOException{
        return (ResponseBase)getAPIResponse(getUrl(Resource.V1_NOTIFY), param, ResponseBase.class);
    }

    public ResponseBase notifySubscribe(NotifySubscribeQueryParameters param) throws WithingsAPIException, IOException{
        return (ResponseBase)getAPIResponse(getUrl(Resource.V1_NOTIFY), param, ResponseBase.class);
    }

    public ResponseBase notifyUpdate(NotifyUpdateQueryParameters param) throws WithingsAPIException, IOException{
        return (ResponseBase)getAPIResponse(getUrl(Resource.V1_NOTIFY), param, ResponseBase.class);
    }

    public SignatureBase signatureGetnonce(SignatureGetnonceQueryParameters param) throws WithingsAPIException, IOException{
        return (SignatureBase)getAPIResponse(getUrl(Resource.V2_SIGNATURE), param, SignatureBase.class);
    }

    public SleepBase sleepGet(SleepGetQueryParameters param) throws WithingsAPIException, IOException{
        return (SleepBase)getAPIResponse(getUrl(Resource.V2_SLEEP), param, SleepBase.class);
    }

    public SleepSummaryBase sleepGetsummary(SleepGetsummaryQueryParameters param) throws WithingsAPIException, IOException{
        return (SleepSummaryBase)getAPIResponse(getUrl(Resource.V2_SLEEP), param, SleepSummaryBase.class);
    }

    public UserDeviceBase userActivate(UserActivateQueryParameters param) throws WithingsAPIException, IOException{
        return (UserDeviceBase)getAPIResponse(getUrl(Resource.V2_USER), param, UserDeviceBase.class);
    }

    public UserBase userGet(UserGetQueryParameters param) throws WithingsAPIException, IOException{
        return (UserBase)getAPIResponse(getUrl(Resource.V2_USER), param, UserBase.class);
    }

    public DeviceBase userGetDevice(UserGetdeviceQueryParameters param) throws WithingsAPIException, IOException{
        return (DeviceBase)getAPIResponse(getUrl(Resource.V2_USER), param, DeviceBase.class);
    }

    public GoalsBase userGetGoals(UserGetgoalsQueryParameters param) throws WithingsAPIException, IOException{
        return (GoalsBase)getAPIResponse(getUrl(Resource.V2_USER), param, GoalsBase.class);
    }

    public DeviceBase userLink(UserLinkQueryParameters param) throws WithingsAPIException, IOException{
        return (DeviceBase)getAPIResponse(getUrl(Resource.V2_USER), param, DeviceBase.class);
    }

    public ResponseBase userUnlink(UserUnlinkQueryParameters param) throws WithingsAPIException, IOException{
        return (ResponseBase)getAPIResponse(getUrl(Resource.V2_USER), param, ResponseBase.class);
    }

    public void setToken(AccessToken token){
        this.token = token;
    }

    public AccessToken getToken(){
        return token;
    }

}
