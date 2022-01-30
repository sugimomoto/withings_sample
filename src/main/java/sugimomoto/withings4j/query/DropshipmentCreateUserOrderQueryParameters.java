package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sugimomoto.withings4j.model.WithingsActionType;

public class DropshipmentCreateUserOrderQueryParameters extends QueryParameters {

    public DropshipmentCreateUserOrderQueryParameters(){
        this.parameters.put("action", WithingsActionType.DROPSHIPMENT_V2_CREATEUSERORDER_CREATEUSERORDER.getValue());
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.parameters.put("nonce", nonce);
    }

    public void setMailingpref(Boolean mailingpref) {
        this.parameters.put("mailingpref", String.valueOf(mailingpref));
    }

    public void setBirthdate(int birthdate) {
        this.parameters.put("birthdate", String.valueOf(birthdate));
    }

    public void setMeasures(MeasuresParameter measures) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        this.parameters.put("measures", mapper.writeValueAsString(measures));
    }

    public void setGender(int gender) {
        this.parameters.put("gender", String.valueOf(gender));
    }

    public void setPreflang(String preflang) {
        this.parameters.put("preflang", preflang);
    }

    public void setUnitPref(UnitPreferencesParameter unitPref) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        this.parameters.put("unit_pref", mapper.writeValueAsString(unitPref));
    }

    public void setEmail(String email) {
        this.parameters.put("email", email);
    }

    public void setTimezone(String timezone) {
        this.parameters.put("timezone", timezone);
    }

    public void setShortname(String shortname) {
        this.parameters.put("shortname", shortname);
    }

    public void setExternalId(String externalId) {
        this.parameters.put("external_id", externalId);
    }

    public void setOrder(List<OrderParameter> orderParameter) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        this.parameters.put("order", mapper.writeValueAsString(orderParameter));
    }
    
    public void setFirstName(String firstName) {
        this.parameters.put("firstname", firstName);
    }

    public void setLastName(String lastName) {
        this.parameters.put("lastname", lastName);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.parameters.put("phonenumber", phoneNumber);
    }

    public void setRecoveryCode(String recoveryCode) {
        this.parameters.put("recovery_code", recoveryCode);
    }

    public void setGoals(GoalsParameter goals) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        this.parameters.put("goals", mapper.writeValueAsString(goals));
    }
    
    public void setTestMode(int testmode) {
        this.parameters.put("testmode", String.valueOf(testmode));
    }
}
