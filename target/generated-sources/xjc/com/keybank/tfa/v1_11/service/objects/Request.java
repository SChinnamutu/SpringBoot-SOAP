
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.operations.AdminGroups;
import com.keybank.tfa.v1_11.service.operations.AdminRegistration;
import com.keybank.tfa.v1_11.service.operations.AggregatorGraceDateTime;
import com.keybank.tfa.v1_11.service.operations.AllUserGroups;
import com.keybank.tfa.v1_11.service.operations.AssociateGSOResource;
import com.keybank.tfa.v1_11.service.operations.AssociateGroups;
import com.keybank.tfa.v1_11.service.operations.AuthorizeAggregator;
import com.keybank.tfa.v1_11.service.operations.ChallengeUser;
import com.keybank.tfa.v1_11.service.operations.ChangeUsername;
import com.keybank.tfa.v1_11.service.operations.CompleteRegistration;
import com.keybank.tfa.v1_11.service.operations.DeleteUser;
import com.keybank.tfa.v1_11.service.operations.DeviceRegistration;
import com.keybank.tfa.v1_11.service.operations.DeviceUnregistration;
import com.keybank.tfa.v1_11.service.operations.DisableUser;
import com.keybank.tfa.v1_11.service.operations.DisassociateGroups;
import com.keybank.tfa.v1_11.service.operations.EnableUser;
import com.keybank.tfa.v1_11.service.operations.FraudAlert;
import com.keybank.tfa.v1_11.service.operations.GOUID;
import com.keybank.tfa.v1_11.service.operations.GOUIDUpdate;
import com.keybank.tfa.v1_11.service.operations.GemaltoFlag;
import com.keybank.tfa.v1_11.service.operations.GemaltoFlagUpdate;
import com.keybank.tfa.v1_11.service.operations.GemaltoInformation;
import com.keybank.tfa.v1_11.service.operations.GemaltoInformationUpdate;
import com.keybank.tfa.v1_11.service.operations.GemaltoReport;
import com.keybank.tfa.v1_11.service.operations.GracePeriod;
import com.keybank.tfa.v1_11.service.operations.LastActivityDate;
import com.keybank.tfa.v1_11.service.operations.ListApplicationUsers;
import com.keybank.tfa.v1_11.service.operations.ListDevices;
import com.keybank.tfa.v1_11.service.operations.ListGroupUsers;
import com.keybank.tfa.v1_11.service.operations.ListUser;
import com.keybank.tfa.v1_11.service.operations.LoginMulti;
import com.keybank.tfa.v1_11.service.operations.LoginSingle;
import com.keybank.tfa.v1_11.service.operations.MaintainAppIdCIX;
import com.keybank.tfa.v1_11.service.operations.MaintainFIKey;
import com.keybank.tfa.v1_11.service.operations.MaintainPIN;
import com.keybank.tfa.v1_11.service.operations.MaintainUserPartyId;
import com.keybank.tfa.v1_11.service.operations.MobileDeviceRegistration;
import com.keybank.tfa.v1_11.service.operations.MobileEnrollment;
import com.keybank.tfa.v1_11.service.operations.MobileLoginMulti;
import com.keybank.tfa.v1_11.service.operations.MobileMultiLogin;
import com.keybank.tfa.v1_11.service.operations.MobileRegistration;
import com.keybank.tfa.v1_11.service.operations.MobileUnregistration;
import com.keybank.tfa.v1_11.service.operations.PasswordExpiration;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyCall;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyPoll;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyCall;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyPoll;
import com.keybank.tfa.v1_11.service.operations.PhoneNumber;
import com.keybank.tfa.v1_11.service.operations.PhoneNumberUpdate;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordCall;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordPoll;
import com.keybank.tfa.v1_11.service.operations.ResetPassword;
import com.keybank.tfa.v1_11.service.operations.ResetServiceCounter;
import com.keybank.tfa.v1_11.service.operations.SearchByName;
import com.keybank.tfa.v1_11.service.operations.SearchGroups;
import com.keybank.tfa.v1_11.service.operations.SearchUsers;
import com.keybank.tfa.v1_11.service.operations.SecurityQuestions;
import com.keybank.tfa.v1_11.service.operations.SelfRegistration;
import com.keybank.tfa.v1_11.service.operations.SendTempPINByEmail;
import com.keybank.tfa.v1_11.service.operations.StepUp;
import com.keybank.tfa.v1_11.service.operations.StepUpUpdate;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyCall;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyPoll;
import com.keybank.tfa.v1_11.service.operations.TokenShipDate;
import com.keybank.tfa.v1_11.service.operations.TokenShipDateUpdate;
import com.keybank.tfa.v1_11.service.operations.UserAnswers;
import com.keybank.tfa.v1_11.service.operations.UserDetailStatus;
import com.keybank.tfa.v1_11.service.operations.UserGroups;
import com.keybank.tfa.v1_11.service.operations.UserMaintenance;
import com.keybank.tfa.v1_11.service.operations.UserPIN;
import com.keybank.tfa.v1_11.service.operations.UserPartyId;
import com.keybank.tfa.v1_11.service.operations.UserQuestions;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestions;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResetUser;
import com.keybank.tfa.v1_11.service.operations.VerIDChallengeUser;
import com.keybank.tfa.v1_11.service.operations.VerifyChallenge;
import com.keybank.tfa.v1_11.service.operations.VerifyPIN;
import com.keybank.tfa.v1_11.service.operations.VerifyPINChallenge;
import com.keybank.tfa.v1_11.service.operations.VerifyQuestions;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPIN;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPINResetUser;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Header"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmailList" type="{http://tfa.keybank.com/v1_11/service/objects}EmailList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "tla",
    "emailList"
})
@XmlSeeAlso({
    ListUser.class,
    AdminGroups.class,
    AdminRegistration.class,
    AssociateGSOResource.class,
    AssociateGroups.class,
    DeleteUser.class,
    DisableUser.class,
    DisassociateGroups.class,
    EnableUser.class,
    GracePeriod.class,
    ListApplicationUsers.class,
    MaintainAppIdCIX.class,
    MaintainPIN.class,
    ResetPassword.class,
    UserAnswers.class,
    UserGroups.class,
    UserPIN.class,
    UserPartyId.class,
    MaintainUserPartyId.class,
    ResetServiceCounter.class,
    FraudAlert.class,
    ChallengeUser.class,
    LoginMulti.class,
    MobileLoginMulti.class,
    LoginSingle.class,
    PhoneNumber.class,
    PhoneNumberUpdate.class,
    VerifyPIN.class,
    VerifyQuestions.class,
    VerifyTempPIN.class,
    VerIDChallengeUser.class,
    VerIDAnswerQuestions.class,
    CompleteRegistration.class,
    DeviceRegistration.class,
    MobileDeviceRegistration.class,
    MobileRegistration.class,
    MobileEnrollment.class,
    MobileMultiLogin.class,
    MobileUnregistration.class,
    DeviceUnregistration.class,
    SelfRegistration.class,
    UserMaintenance.class,
    TokenShipDateUpdate.class,
    TokenShipDate.class,
    GemaltoInformationUpdate.class,
    GemaltoInformation.class,
    GemaltoReport.class,
    StepUpUpdate.class,
    StepUp.class,
    GOUIDUpdate.class,
    GOUID.class,
    GemaltoFlagUpdate.class,
    GemaltoFlag.class,
    VerifyChallenge.class,
    VerifyPINChallenge.class,
    VerifyTempPINResetUser.class,
    SendTempPINByEmail.class,
    VerIDAnswerQuestionsResetUser.class,
    AuthorizeAggregator.class,
    MaintainFIKey.class,
    ChangeUsername.class,
    SecurityQuestions.class,
    UserQuestions.class,
    PasswordExpiration.class,
    AllUserGroups.class,
    ListDevices.class,
    UserDetailStatus.class,
    LastActivityDate.class,
    ListGroupUsers.class,
    SearchByName.class,
    SearchGroups.class,
    SearchUsers.class,
    AggregatorGraceDateTime.class,
    PhoneResetPasswordCall.class,
    PhoneResetPasswordPoll.class,
    TestPhoneCodeVerifyCall.class,
    PhoneCodeVerifyCall.class,
    TestPhoneCodeVerifyPoll.class,
    PhoneCodeVerifyPoll.class,
    PhoneFundsVerifyCall.class,
    PhoneFundsVerifyPoll.class
})
public class Request
    extends Header
{

    @XmlElement(name = "TLA", required = true)
    protected String tla;
    @XmlElement(name = "EmailList")
    protected EmailList emailList;

    /**
     * Gets the value of the tla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLA() {
        return tla;
    }

    /**
     * Sets the value of the tla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLA(String value) {
        this.tla = value;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link EmailList }
     *     
     */
    public EmailList getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailList }
     *     
     */
    public void setEmailList(EmailList value) {
        this.emailList = value;
    }

}
