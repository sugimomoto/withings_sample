package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class UserActivateQueryParameters extends QueryParameters {

    public UserActivateQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_ACTIVATE_ACTIVATE.getValue());
    }
    
    @Override
    public FormBody getQueryParameters() {
        setSignature();
        return builder.build();
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.builder.add("nonce", nonce);
    }

    private void setSignature(){
        this.builder.add("signature", "");
    }
    
    public void setMailingpref(Boolean mailingpref) {
        this.builder.add("mailingpref", String.valueOf(mailingpref));
    }

    public void setBirthdate(int birthdate) {
        this.builder.add("birthdate", String.valueOf(birthdate));
    }

    public void setMeasures(MeasuresParameter measures) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        this.builder.add("measures", mapper.writeValueAsString(measures));
    }

    public void setGender(int gender) {
        this.builder.add("gender", String.valueOf(gender));
    }

    public void setPreflang(String preflang) {
        this.builder.add("preflang", preflang);
    }

    public void setUnitPref(UnitPreferencesParameter unitPref) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        this.builder.add("unit_pref", mapper.writeValueAsString(unitPref));
    }

    public void setEmail(String email) {
        this.builder.add("email", email);
    }

    public void setTimezone(String timezone) {
        this.builder.add("timezone", timezone);
    }

    public void setShortname(String shortname) {
        this.builder.add("shortname", shortname);
    }

    public void setExternalId(String externalId) {
        this.builder.add("external_id", externalId);
    }

    public void setMacAddresses(String macAddresses) {
        this.builder.add("mac_addresses", macAddresses);
    }

    public void setFirstName(String firstName) {
        this.builder.add("firstname", firstName);
    }

    public void setLastName(String lastName) {
        this.builder.add("lastname", lastName);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.builder.add("phonenumber", phoneNumber);
    }

    public void setRecoveryCode(String recoveryCode) {
        this.builder.add("recovery_code", recoveryCode);
    }

    public void setGoals(GoalsParameter goals) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        this.builder.add("goals", mapper.writeValueAsString(goals));
    }
}
