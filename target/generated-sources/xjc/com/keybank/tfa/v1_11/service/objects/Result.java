
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.operations.AdminGroupsResult;
import com.keybank.tfa.v1_11.service.operations.AdminRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.AggregatorGraceDateTimeResult;
import com.keybank.tfa.v1_11.service.operations.AllUserGroupsResult;
import com.keybank.tfa.v1_11.service.operations.AssociateGSOResourceResult;
import com.keybank.tfa.v1_11.service.operations.AssociateGroupsResult;
import com.keybank.tfa.v1_11.service.operations.AuthorizeAggregatorResult;
import com.keybank.tfa.v1_11.service.operations.ChallengeUserResult;
import com.keybank.tfa.v1_11.service.operations.ChangeUsernameResult;
import com.keybank.tfa.v1_11.service.operations.CompleteRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.DeleteUserResult;
import com.keybank.tfa.v1_11.service.operations.DeviceRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.DeviceUnregistrationResult;
import com.keybank.tfa.v1_11.service.operations.DisableUserResult;
import com.keybank.tfa.v1_11.service.operations.DisassociateGroupsResult;
import com.keybank.tfa.v1_11.service.operations.EnableUserResult;
import com.keybank.tfa.v1_11.service.operations.FraudAlertResult;
import com.keybank.tfa.v1_11.service.operations.GracePeriodResult;
import com.keybank.tfa.v1_11.service.operations.LastActivityDateResult;
import com.keybank.tfa.v1_11.service.operations.ListApplicationUsersResult;
import com.keybank.tfa.v1_11.service.operations.ListDevicesResult;
import com.keybank.tfa.v1_11.service.operations.ListGroupUsersResult;
import com.keybank.tfa.v1_11.service.operations.ListUserResult;
import com.keybank.tfa.v1_11.service.operations.LoginMultiResult;
import com.keybank.tfa.v1_11.service.operations.LoginSingleResult;
import com.keybank.tfa.v1_11.service.operations.MaintainAppIdCIXResult;
import com.keybank.tfa.v1_11.service.operations.MaintainFIKeyResult;
import com.keybank.tfa.v1_11.service.operations.MaintainPINResult;
import com.keybank.tfa.v1_11.service.operations.MaintainUserPartyIdResult;
import com.keybank.tfa.v1_11.service.operations.MobileDeviceRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.MobileEnrollmentResult;
import com.keybank.tfa.v1_11.service.operations.MobileLoginMultiResult;
import com.keybank.tfa.v1_11.service.operations.MobileMultiLoginResult;
import com.keybank.tfa.v1_11.service.operations.MobileRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.MobileUnregistrationResult;
import com.keybank.tfa.v1_11.service.operations.PasswordExpirationResult;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyCallResult;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyPollResult;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyCallResult;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyPollResult;
import com.keybank.tfa.v1_11.service.operations.PhoneNumberResult;
import com.keybank.tfa.v1_11.service.operations.PhoneNumberUpdateResult;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordCallResult;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordPollResult;
import com.keybank.tfa.v1_11.service.operations.ResetPasswordResult;
import com.keybank.tfa.v1_11.service.operations.ResetServiceCounterResult;
import com.keybank.tfa.v1_11.service.operations.SearchByNameResult;
import com.keybank.tfa.v1_11.service.operations.SearchGroupsResult;
import com.keybank.tfa.v1_11.service.operations.SearchUsersResult;
import com.keybank.tfa.v1_11.service.operations.SecurityQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.SelfRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.SendTempPINByEmailResult;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyCallResult;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyPollResult;
import com.keybank.tfa.v1_11.service.operations.UserAnswersResult;
import com.keybank.tfa.v1_11.service.operations.UserDetailStatusResult;
import com.keybank.tfa.v1_11.service.operations.UserGroupsResult;
import com.keybank.tfa.v1_11.service.operations.UserMaintenanceResult;
import com.keybank.tfa.v1_11.service.operations.UserPINResult;
import com.keybank.tfa.v1_11.service.operations.UserPartyIdResult;
import com.keybank.tfa.v1_11.service.operations.UserQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResetUserResult;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.VerIDChallengeUserResult;
import com.keybank.tfa.v1_11.service.operations.VerifyChallengeResult;
import com.keybank.tfa.v1_11.service.operations.VerifyPINChallengeResult;
import com.keybank.tfa.v1_11.service.operations.VerifyPINResult;
import com.keybank.tfa.v1_11.service.operations.VerifyQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPINResetUserResult;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPINResult;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Header"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "responseType"
})
@XmlSeeAlso({
    ListUserResult.class,
    AdminGroupsResult.class,
    AdminRegistrationResult.class,
    AssociateGSOResourceResult.class,
    AssociateGroupsResult.class,
    DeleteUserResult.class,
    DisableUserResult.class,
    DisassociateGroupsResult.class,
    EnableUserResult.class,
    GracePeriodResult.class,
    ListApplicationUsersResult.class,
    MaintainAppIdCIXResult.class,
    MaintainPINResult.class,
    ResetPasswordResult.class,
    UserAnswersResult.class,
    UserGroupsResult.class,
    UserPINResult.class,
    UserPartyIdResult.class,
    MaintainUserPartyIdResult.class,
    ResetServiceCounterResult.class,
    FraudAlertResult.class,
    ChallengeUserResult.class,
    LoginMultiResult.class,
    MobileLoginMultiResult.class,
    LoginSingleResult.class,
    PhoneNumberResult.class,
    PhoneNumberUpdateResult.class,
    VerifyPINResult.class,
    VerifyQuestionsResult.class,
    VerifyTempPINResult.class,
    VerIDChallengeUserResult.class,
    VerIDAnswerQuestionsResult.class,
    CompleteRegistrationResult.class,
    DeviceRegistrationResult.class,
    MobileDeviceRegistrationResult.class,
    MobileRegistrationResult.class,
    MobileEnrollmentResult.class,
    MobileMultiLoginResult.class,
    MobileUnregistrationResult.class,
    DeviceUnregistrationResult.class,
    SelfRegistrationResult.class,
    UserMaintenanceResult.class,
    BaseResult.class,
    VerifyChallengeResult.class,
    VerifyPINChallengeResult.class,
    VerifyTempPINResetUserResult.class,
    SendTempPINByEmailResult.class,
    VerIDAnswerQuestionsResetUserResult.class,
    AuthorizeAggregatorResult.class,
    MaintainFIKeyResult.class,
    ChangeUsernameResult.class,
    SecurityQuestionsResult.class,
    UserQuestionsResult.class,
    PasswordExpirationResult.class,
    AllUserGroupsResult.class,
    ListDevicesResult.class,
    UserDetailStatusResult.class,
    LastActivityDateResult.class,
    ListGroupUsersResult.class,
    SearchByNameResult.class,
    SearchGroupsResult.class,
    SearchUsersResult.class,
    AggregatorGraceDateTimeResult.class,
    PhoneResetPasswordCallResult.class,
    PhoneResetPasswordPollResult.class,
    TestPhoneCodeVerifyCallResult.class,
    PhoneCodeVerifyCallResult.class,
    TestPhoneCodeVerifyPollResult.class,
    PhoneCodeVerifyPollResult.class,
    PhoneFundsVerifyCallResult.class,
    PhoneFundsVerifyPollResult.class
})
public class Result
    extends Header
{

    @XmlElement(name = "ResponseType", required = true)
    protected String responseType;

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
