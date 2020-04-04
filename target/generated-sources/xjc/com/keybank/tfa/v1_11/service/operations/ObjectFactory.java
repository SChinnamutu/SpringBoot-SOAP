
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.keybank.tfa.v1_11.service.objects.BaseResult;
import com.keybank.tfa.v1_11.service.objects.LDAPAttrBooleanResult;
import com.keybank.tfa.v1_11.service.objects.LDAPAttrDateTimeResult;
import com.keybank.tfa.v1_11.service.objects.LDAPAttrStringResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.keybank.tfa.v1_11.service.operations package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListUser");
    private final static QName _ListUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListUserResult");
    private final static QName _AdminGroups_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AdminGroups");
    private final static QName _AdminGroupsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AdminGroupsResult");
    private final static QName _AdminRegistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AdminRegistration");
    private final static QName _AdminRegistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AdminRegistrationResult");
    private final static QName _AssociateGSOResource_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AssociateGSOResource");
    private final static QName _AssociateGSOResourceResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AssociateGSOResourceResult");
    private final static QName _AssociateGroups_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AssociateGroups");
    private final static QName _AssociateGroupsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AssociateGroupsResult");
    private final static QName _DeleteUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DeleteUser");
    private final static QName _DeleteUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DeleteUserResult");
    private final static QName _DisableUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DisableUser");
    private final static QName _DisableUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DisableUserResult");
    private final static QName _DisassociateGroups_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DisassociateGroups");
    private final static QName _DisassociateGroupsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DisassociateGroupsResult");
    private final static QName _EnableUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "EnableUser");
    private final static QName _EnableUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "EnableUserResult");
    private final static QName _GracePeriod_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GracePeriod");
    private final static QName _GracePeriodResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GracePeriodResult");
    private final static QName _ListApplicationUsers_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListApplicationUsers");
    private final static QName _ListApplicationUsersResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListApplicationUsersResult");
    private final static QName _MaintainAppIdCIX_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainAppIdCIX");
    private final static QName _MaintainAppIdCIXResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainAppIdCIXResult");
    private final static QName _MaintainPIN_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainPIN");
    private final static QName _MaintainPINResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainPINResult");
    private final static QName _ResetPassword_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ResetPassword");
    private final static QName _ResetPasswordResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ResetPasswordResult");
    private final static QName _UserAnswers_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserAnswers");
    private final static QName _UserAnswersResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserAnswersResult");
    private final static QName _UserGroups_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserGroups");
    private final static QName _UserGroupsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserGroupsResult");
    private final static QName _UserPIN_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserPIN");
    private final static QName _UserPINResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserPINResult");
    private final static QName _UserPartyId_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserPartyId");
    private final static QName _UserPartyIdResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserPartyIdResult");
    private final static QName _MaintainUserPartyId_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainUserPartyId");
    private final static QName _MaintainUserPartyIdResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainUserPartyIdResult");
    private final static QName _ResetServiceCounter_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ResetServiceCounter");
    private final static QName _ResetServiceCounterResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ResetServiceCounterResult");
    private final static QName _FraudAlert_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "FraudAlert");
    private final static QName _FraudAlertResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "FraudAlertResult");
    private final static QName _ChallengeUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ChallengeUser");
    private final static QName _ChallengeUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ChallengeUserResult");
    private final static QName _LoginMulti_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "LoginMulti");
    private final static QName _LoginMultiResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "LoginMultiResult");
    private final static QName _MobileLoginMulti_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileLoginMulti");
    private final static QName _MobileLoginMultiResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileLoginMultiResult");
    private final static QName _LoginSingle_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "LoginSingle");
    private final static QName _LoginSingleResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "LoginSingleResult");
    private final static QName _PhoneNumber_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneNumber");
    private final static QName _PhoneNumberResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneNumberResult");
    private final static QName _PhoneNumberUpdate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneNumberUpdate");
    private final static QName _PhoneNumberUpdateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneNumberUpdateResult");
    private final static QName _VerifyPIN_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyPIN");
    private final static QName _VerifyPINResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyPINResult");
    private final static QName _VerifyQuestions_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyQuestions");
    private final static QName _VerifyQuestionsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyQuestionsResult");
    private final static QName _VerifyTempPIN_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyTempPIN");
    private final static QName _VerifyTempPINResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyTempPINResult");
    private final static QName _VerIDChallengeUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerIDChallengeUser");
    private final static QName _VerIDChallengeUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerIDChallengeUserResult");
    private final static QName _VerIDAnswerQuestions_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerIDAnswerQuestions");
    private final static QName _VerIDAnswerQuestionsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerIDAnswerQuestionsResult");
    private final static QName _CompleteRegistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "CompleteRegistration");
    private final static QName _CompleteRegistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "CompleteRegistrationResult");
    private final static QName _DeviceRegistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DeviceRegistration");
    private final static QName _DeviceRegistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DeviceRegistrationResult");
    private final static QName _MobileDeviceRegistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileDeviceRegistration");
    private final static QName _MobileDeviceRegistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileDeviceRegistrationResult");
    private final static QName _MobileRegistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileRegistration");
    private final static QName _MobileRegistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileRegistrationResult");
    private final static QName _MobileEnrollment_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileEnrollment");
    private final static QName _MobileEnrollmentResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileEnrollmentResult");
    private final static QName _MobileMultiLogin_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileMultiLogin");
    private final static QName _MobileMultiLoginResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileMultiLoginResult");
    private final static QName _MobileUnregistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileUnregistration");
    private final static QName _MobileUnregistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MobileUnregistrationResult");
    private final static QName _DeviceUnregistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DeviceUnregistration");
    private final static QName _DeviceUnregistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "DeviceUnregistrationResult");
    private final static QName _SelfRegistration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SelfRegistration");
    private final static QName _SelfRegistrationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SelfRegistrationResult");
    private final static QName _UserMaintenance_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserMaintenance");
    private final static QName _UserMaintenanceResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserMaintenanceResult");
    private final static QName _TokenShipDateUpdate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TokenShipDateUpdate");
    private final static QName _TokenShipDateUpdateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TokenShipDateUpdateResult");
    private final static QName _TokenShipDate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TokenShipDate");
    private final static QName _TokenShipDateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TokenShipDateResult");
    private final static QName _GemaltoInformationUpdate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoInformationUpdate");
    private final static QName _GemaltoInformationUpdateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoInformationUpdateResult");
    private final static QName _GemaltoInformation_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoInformation");
    private final static QName _GemaltoInformationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoInformationResult");
    private final static QName _GemaltoReport_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoReport");
    private final static QName _GemaltoReportResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoReportResult");
    private final static QName _StepUpUpdate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "StepUpUpdate");
    private final static QName _StepUpUpdateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "StepUpUpdateResult");
    private final static QName _StepUp_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "StepUp");
    private final static QName _StepUpResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "StepUpResult");
    private final static QName _GOUIDUpdate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GOUIDUpdate");
    private final static QName _GOUIDUpdateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GOUIDUpdateResult");
    private final static QName _GOUID_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GOUID");
    private final static QName _GOUIDResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GOUIDResult");
    private final static QName _GemaltoFlagUpdate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoFlagUpdate");
    private final static QName _GemaltoFlagUpdateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoFlagUpdateResult");
    private final static QName _GemaltoFlag_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoFlag");
    private final static QName _GemaltoFlagResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "GemaltoFlagResult");
    private final static QName _VerifyChallenge_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyChallenge");
    private final static QName _VerifyChallengeResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyChallengeResult");
    private final static QName _VerifyPINChallenge_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyPINChallenge");
    private final static QName _VerifyPINChallengeResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyPINChallengeResult");
    private final static QName _VerifyTempPINResetUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyTempPINResetUser");
    private final static QName _VerifyTempPINResetUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerifyTempPINResetUserResult");
    private final static QName _SendTempPINByEmail_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SendTempPINByEmail");
    private final static QName _SendTempPINByEmailResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SendTempPINByEmailResult");
    private final static QName _VerIDAnswerQuestionsResetUser_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerIDAnswerQuestionsResetUser");
    private final static QName _VerIDAnswerQuestionsResetUserResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "VerIDAnswerQuestionsResetUserResult");
    private final static QName _AuthorizeAggregator_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AuthorizeAggregator");
    private final static QName _AuthorizeAggregatorResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AuthorizeAggregatorResult");
    private final static QName _MaintainFIKey_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainFIKey");
    private final static QName _MaintainFIKeyResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "MaintainFIKeyResult");
    private final static QName _ChangeUsername_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ChangeUsername");
    private final static QName _ChangeUsernameResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ChangeUsernameResult");
    private final static QName _SecurityQuestions_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SecurityQuestions");
    private final static QName _SecurityQuestionsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SecurityQuestionsResult");
    private final static QName _UserQuestions_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserQuestions");
    private final static QName _UserQuestionsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserQuestionsResult");
    private final static QName _PasswordExpiration_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PasswordExpiration");
    private final static QName _PasswordExpirationResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PasswordExpirationResult");
    private final static QName _AllUserGroups_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AllUserGroups");
    private final static QName _AllUserGroupsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AllUserGroupsResult");
    private final static QName _ListDevices_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListDevices");
    private final static QName _ListDevicesResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListDevicesResult");
    private final static QName _UserDetailStatus_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserDetailStatus");
    private final static QName _UserDetailStatusResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "UserDetailStatusResult");
    private final static QName _LastActivityDate_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "LastActivityDate");
    private final static QName _LastActivityDateResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "LastActivityDateResult");
    private final static QName _ListGroupUsers_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListGroupUsers");
    private final static QName _ListGroupUsersResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "ListGroupUsersResult");
    private final static QName _SearchByName_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SearchByName");
    private final static QName _SearchByNameResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SearchByNameResult");
    private final static QName _SearchGroups_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SearchGroups");
    private final static QName _SearchGroupsResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SearchGroupsResult");
    private final static QName _SearchUsers_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SearchUsers");
    private final static QName _SearchUsersResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "SearchUsersResult");
    private final static QName _AggregatorGraceDateTime_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AggregatorGraceDateTime");
    private final static QName _AggregatorGraceDateTimeResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "AggregatorGraceDateTimeResult");
    private final static QName _PhoneResetPasswordCall_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneResetPasswordCall");
    private final static QName _PhoneResetPasswordCallResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneResetPasswordCallResult");
    private final static QName _PhoneResetPasswordPoll_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneResetPasswordPoll");
    private final static QName _PhoneResetPasswordPollResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneResetPasswordPollResult");
    private final static QName _TestPhoneCodeVerifyCall_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TestPhoneCodeVerifyCall");
    private final static QName _TestPhoneCodeVerifyCallResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TestPhoneCodeVerifyCallResult");
    private final static QName _PhoneCodeVerifyCall_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneCodeVerifyCall");
    private final static QName _PhoneCodeVerifyCallResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneCodeVerifyCallResult");
    private final static QName _TestPhoneCodeVerifyPoll_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TestPhoneCodeVerifyPoll");
    private final static QName _TestPhoneCodeVerifyPollResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "TestPhoneCodeVerifyPollResult");
    private final static QName _PhoneCodeVerifyPoll_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneCodeVerifyPoll");
    private final static QName _PhoneCodeVerifyPollResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneCodeVerifyPollResult");
    private final static QName _PhoneFundsVerifyCall_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneFundsVerifyCall");
    private final static QName _PhoneFundsVerifyCallResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneFundsVerifyCallResult");
    private final static QName _PhoneFundsVerifyPoll_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneFundsVerifyPoll");
    private final static QName _PhoneFundsVerifyPollResult_QNAME = new QName("http://tfa.keybank.com/v1_11/service/operations", "PhoneFundsVerifyPollResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.keybank.tfa.v1_11.service.operations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListUser }
     * 
     */
    public ListUser createListUser() {
        return new ListUser();
    }

    /**
     * Create an instance of {@link ListUserResult }
     * 
     */
    public ListUserResult createListUserResult() {
        return new ListUserResult();
    }

    /**
     * Create an instance of {@link AdminGroups }
     * 
     */
    public AdminGroups createAdminGroups() {
        return new AdminGroups();
    }

    /**
     * Create an instance of {@link AdminGroupsResult }
     * 
     */
    public AdminGroupsResult createAdminGroupsResult() {
        return new AdminGroupsResult();
    }

    /**
     * Create an instance of {@link AdminRegistration }
     * 
     */
    public AdminRegistration createAdminRegistration() {
        return new AdminRegistration();
    }

    /**
     * Create an instance of {@link AdminRegistrationResult }
     * 
     */
    public AdminRegistrationResult createAdminRegistrationResult() {
        return new AdminRegistrationResult();
    }

    /**
     * Create an instance of {@link AssociateGSOResource }
     * 
     */
    public AssociateGSOResource createAssociateGSOResource() {
        return new AssociateGSOResource();
    }

    /**
     * Create an instance of {@link AssociateGSOResourceResult }
     * 
     */
    public AssociateGSOResourceResult createAssociateGSOResourceResult() {
        return new AssociateGSOResourceResult();
    }

    /**
     * Create an instance of {@link AssociateGroups }
     * 
     */
    public AssociateGroups createAssociateGroups() {
        return new AssociateGroups();
    }

    /**
     * Create an instance of {@link AssociateGroupsResult }
     * 
     */
    public AssociateGroupsResult createAssociateGroupsResult() {
        return new AssociateGroupsResult();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResult }
     * 
     */
    public DeleteUserResult createDeleteUserResult() {
        return new DeleteUserResult();
    }

    /**
     * Create an instance of {@link DisableUser }
     * 
     */
    public DisableUser createDisableUser() {
        return new DisableUser();
    }

    /**
     * Create an instance of {@link DisableUserResult }
     * 
     */
    public DisableUserResult createDisableUserResult() {
        return new DisableUserResult();
    }

    /**
     * Create an instance of {@link DisassociateGroups }
     * 
     */
    public DisassociateGroups createDisassociateGroups() {
        return new DisassociateGroups();
    }

    /**
     * Create an instance of {@link DisassociateGroupsResult }
     * 
     */
    public DisassociateGroupsResult createDisassociateGroupsResult() {
        return new DisassociateGroupsResult();
    }

    /**
     * Create an instance of {@link EnableUser }
     * 
     */
    public EnableUser createEnableUser() {
        return new EnableUser();
    }

    /**
     * Create an instance of {@link EnableUserResult }
     * 
     */
    public EnableUserResult createEnableUserResult() {
        return new EnableUserResult();
    }

    /**
     * Create an instance of {@link GracePeriod }
     * 
     */
    public GracePeriod createGracePeriod() {
        return new GracePeriod();
    }

    /**
     * Create an instance of {@link GracePeriodResult }
     * 
     */
    public GracePeriodResult createGracePeriodResult() {
        return new GracePeriodResult();
    }

    /**
     * Create an instance of {@link ListApplicationUsers }
     * 
     */
    public ListApplicationUsers createListApplicationUsers() {
        return new ListApplicationUsers();
    }

    /**
     * Create an instance of {@link ListApplicationUsersResult }
     * 
     */
    public ListApplicationUsersResult createListApplicationUsersResult() {
        return new ListApplicationUsersResult();
    }

    /**
     * Create an instance of {@link MaintainAppIdCIX }
     * 
     */
    public MaintainAppIdCIX createMaintainAppIdCIX() {
        return new MaintainAppIdCIX();
    }

    /**
     * Create an instance of {@link MaintainAppIdCIXResult }
     * 
     */
    public MaintainAppIdCIXResult createMaintainAppIdCIXResult() {
        return new MaintainAppIdCIXResult();
    }

    /**
     * Create an instance of {@link MaintainPIN }
     * 
     */
    public MaintainPIN createMaintainPIN() {
        return new MaintainPIN();
    }

    /**
     * Create an instance of {@link MaintainPINResult }
     * 
     */
    public MaintainPINResult createMaintainPINResult() {
        return new MaintainPINResult();
    }

    /**
     * Create an instance of {@link ResetPassword }
     * 
     */
    public ResetPassword createResetPassword() {
        return new ResetPassword();
    }

    /**
     * Create an instance of {@link ResetPasswordResult }
     * 
     */
    public ResetPasswordResult createResetPasswordResult() {
        return new ResetPasswordResult();
    }

    /**
     * Create an instance of {@link UserAnswers }
     * 
     */
    public UserAnswers createUserAnswers() {
        return new UserAnswers();
    }

    /**
     * Create an instance of {@link UserAnswersResult }
     * 
     */
    public UserAnswersResult createUserAnswersResult() {
        return new UserAnswersResult();
    }

    /**
     * Create an instance of {@link UserGroups }
     * 
     */
    public UserGroups createUserGroups() {
        return new UserGroups();
    }

    /**
     * Create an instance of {@link UserGroupsResult }
     * 
     */
    public UserGroupsResult createUserGroupsResult() {
        return new UserGroupsResult();
    }

    /**
     * Create an instance of {@link UserPIN }
     * 
     */
    public UserPIN createUserPIN() {
        return new UserPIN();
    }

    /**
     * Create an instance of {@link UserPINResult }
     * 
     */
    public UserPINResult createUserPINResult() {
        return new UserPINResult();
    }

    /**
     * Create an instance of {@link UserPartyId }
     * 
     */
    public UserPartyId createUserPartyId() {
        return new UserPartyId();
    }

    /**
     * Create an instance of {@link UserPartyIdResult }
     * 
     */
    public UserPartyIdResult createUserPartyIdResult() {
        return new UserPartyIdResult();
    }

    /**
     * Create an instance of {@link MaintainUserPartyId }
     * 
     */
    public MaintainUserPartyId createMaintainUserPartyId() {
        return new MaintainUserPartyId();
    }

    /**
     * Create an instance of {@link MaintainUserPartyIdResult }
     * 
     */
    public MaintainUserPartyIdResult createMaintainUserPartyIdResult() {
        return new MaintainUserPartyIdResult();
    }

    /**
     * Create an instance of {@link ResetServiceCounter }
     * 
     */
    public ResetServiceCounter createResetServiceCounter() {
        return new ResetServiceCounter();
    }

    /**
     * Create an instance of {@link ResetServiceCounterResult }
     * 
     */
    public ResetServiceCounterResult createResetServiceCounterResult() {
        return new ResetServiceCounterResult();
    }

    /**
     * Create an instance of {@link FraudAlert }
     * 
     */
    public FraudAlert createFraudAlert() {
        return new FraudAlert();
    }

    /**
     * Create an instance of {@link FraudAlertResult }
     * 
     */
    public FraudAlertResult createFraudAlertResult() {
        return new FraudAlertResult();
    }

    /**
     * Create an instance of {@link ChallengeUser }
     * 
     */
    public ChallengeUser createChallengeUser() {
        return new ChallengeUser();
    }

    /**
     * Create an instance of {@link ChallengeUserResult }
     * 
     */
    public ChallengeUserResult createChallengeUserResult() {
        return new ChallengeUserResult();
    }

    /**
     * Create an instance of {@link LoginMulti }
     * 
     */
    public LoginMulti createLoginMulti() {
        return new LoginMulti();
    }

    /**
     * Create an instance of {@link LoginMultiResult }
     * 
     */
    public LoginMultiResult createLoginMultiResult() {
        return new LoginMultiResult();
    }

    /**
     * Create an instance of {@link MobileLoginMulti }
     * 
     */
    public MobileLoginMulti createMobileLoginMulti() {
        return new MobileLoginMulti();
    }

    /**
     * Create an instance of {@link MobileLoginMultiResult }
     * 
     */
    public MobileLoginMultiResult createMobileLoginMultiResult() {
        return new MobileLoginMultiResult();
    }

    /**
     * Create an instance of {@link LoginSingle }
     * 
     */
    public LoginSingle createLoginSingle() {
        return new LoginSingle();
    }

    /**
     * Create an instance of {@link LoginSingleResult }
     * 
     */
    public LoginSingleResult createLoginSingleResult() {
        return new LoginSingleResult();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link PhoneNumberResult }
     * 
     */
    public PhoneNumberResult createPhoneNumberResult() {
        return new PhoneNumberResult();
    }

    /**
     * Create an instance of {@link PhoneNumberUpdate }
     * 
     */
    public PhoneNumberUpdate createPhoneNumberUpdate() {
        return new PhoneNumberUpdate();
    }

    /**
     * Create an instance of {@link PhoneNumberUpdateResult }
     * 
     */
    public PhoneNumberUpdateResult createPhoneNumberUpdateResult() {
        return new PhoneNumberUpdateResult();
    }

    /**
     * Create an instance of {@link VerifyPIN }
     * 
     */
    public VerifyPIN createVerifyPIN() {
        return new VerifyPIN();
    }

    /**
     * Create an instance of {@link VerifyPINResult }
     * 
     */
    public VerifyPINResult createVerifyPINResult() {
        return new VerifyPINResult();
    }

    /**
     * Create an instance of {@link VerifyQuestions }
     * 
     */
    public VerifyQuestions createVerifyQuestions() {
        return new VerifyQuestions();
    }

    /**
     * Create an instance of {@link VerifyQuestionsResult }
     * 
     */
    public VerifyQuestionsResult createVerifyQuestionsResult() {
        return new VerifyQuestionsResult();
    }

    /**
     * Create an instance of {@link VerifyTempPIN }
     * 
     */
    public VerifyTempPIN createVerifyTempPIN() {
        return new VerifyTempPIN();
    }

    /**
     * Create an instance of {@link VerifyTempPINResult }
     * 
     */
    public VerifyTempPINResult createVerifyTempPINResult() {
        return new VerifyTempPINResult();
    }

    /**
     * Create an instance of {@link VerIDChallengeUser }
     * 
     */
    public VerIDChallengeUser createVerIDChallengeUser() {
        return new VerIDChallengeUser();
    }

    /**
     * Create an instance of {@link VerIDChallengeUserResult }
     * 
     */
    public VerIDChallengeUserResult createVerIDChallengeUserResult() {
        return new VerIDChallengeUserResult();
    }

    /**
     * Create an instance of {@link VerIDAnswerQuestions }
     * 
     */
    public VerIDAnswerQuestions createVerIDAnswerQuestions() {
        return new VerIDAnswerQuestions();
    }

    /**
     * Create an instance of {@link VerIDAnswerQuestionsResult }
     * 
     */
    public VerIDAnswerQuestionsResult createVerIDAnswerQuestionsResult() {
        return new VerIDAnswerQuestionsResult();
    }

    /**
     * Create an instance of {@link CompleteRegistration }
     * 
     */
    public CompleteRegistration createCompleteRegistration() {
        return new CompleteRegistration();
    }

    /**
     * Create an instance of {@link CompleteRegistrationResult }
     * 
     */
    public CompleteRegistrationResult createCompleteRegistrationResult() {
        return new CompleteRegistrationResult();
    }

    /**
     * Create an instance of {@link DeviceRegistration }
     * 
     */
    public DeviceRegistration createDeviceRegistration() {
        return new DeviceRegistration();
    }

    /**
     * Create an instance of {@link DeviceRegistrationResult }
     * 
     */
    public DeviceRegistrationResult createDeviceRegistrationResult() {
        return new DeviceRegistrationResult();
    }

    /**
     * Create an instance of {@link MobileDeviceRegistration }
     * 
     */
    public MobileDeviceRegistration createMobileDeviceRegistration() {
        return new MobileDeviceRegistration();
    }

    /**
     * Create an instance of {@link MobileDeviceRegistrationResult }
     * 
     */
    public MobileDeviceRegistrationResult createMobileDeviceRegistrationResult() {
        return new MobileDeviceRegistrationResult();
    }

    /**
     * Create an instance of {@link MobileRegistration }
     * 
     */
    public MobileRegistration createMobileRegistration() {
        return new MobileRegistration();
    }

    /**
     * Create an instance of {@link MobileRegistrationResult }
     * 
     */
    public MobileRegistrationResult createMobileRegistrationResult() {
        return new MobileRegistrationResult();
    }

    /**
     * Create an instance of {@link MobileEnrollment }
     * 
     */
    public MobileEnrollment createMobileEnrollment() {
        return new MobileEnrollment();
    }

    /**
     * Create an instance of {@link MobileEnrollmentResult }
     * 
     */
    public MobileEnrollmentResult createMobileEnrollmentResult() {
        return new MobileEnrollmentResult();
    }

    /**
     * Create an instance of {@link MobileMultiLogin }
     * 
     */
    public MobileMultiLogin createMobileMultiLogin() {
        return new MobileMultiLogin();
    }

    /**
     * Create an instance of {@link MobileMultiLoginResult }
     * 
     */
    public MobileMultiLoginResult createMobileMultiLoginResult() {
        return new MobileMultiLoginResult();
    }

    /**
     * Create an instance of {@link MobileUnregistration }
     * 
     */
    public MobileUnregistration createMobileUnregistration() {
        return new MobileUnregistration();
    }

    /**
     * Create an instance of {@link MobileUnregistrationResult }
     * 
     */
    public MobileUnregistrationResult createMobileUnregistrationResult() {
        return new MobileUnregistrationResult();
    }

    /**
     * Create an instance of {@link DeviceUnregistration }
     * 
     */
    public DeviceUnregistration createDeviceUnregistration() {
        return new DeviceUnregistration();
    }

    /**
     * Create an instance of {@link DeviceUnregistrationResult }
     * 
     */
    public DeviceUnregistrationResult createDeviceUnregistrationResult() {
        return new DeviceUnregistrationResult();
    }

    /**
     * Create an instance of {@link SelfRegistration }
     * 
     */
    public SelfRegistration createSelfRegistration() {
        return new SelfRegistration();
    }

    /**
     * Create an instance of {@link SelfRegistrationResult }
     * 
     */
    public SelfRegistrationResult createSelfRegistrationResult() {
        return new SelfRegistrationResult();
    }

    /**
     * Create an instance of {@link UserMaintenance }
     * 
     */
    public UserMaintenance createUserMaintenance() {
        return new UserMaintenance();
    }

    /**
     * Create an instance of {@link UserMaintenanceResult }
     * 
     */
    public UserMaintenanceResult createUserMaintenanceResult() {
        return new UserMaintenanceResult();
    }

    /**
     * Create an instance of {@link TokenShipDateUpdate }
     * 
     */
    public TokenShipDateUpdate createTokenShipDateUpdate() {
        return new TokenShipDateUpdate();
    }

    /**
     * Create an instance of {@link TokenShipDate }
     * 
     */
    public TokenShipDate createTokenShipDate() {
        return new TokenShipDate();
    }

    /**
     * Create an instance of {@link GemaltoInformationUpdate }
     * 
     */
    public GemaltoInformationUpdate createGemaltoInformationUpdate() {
        return new GemaltoInformationUpdate();
    }

    /**
     * Create an instance of {@link GemaltoInformation }
     * 
     */
    public GemaltoInformation createGemaltoInformation() {
        return new GemaltoInformation();
    }

    /**
     * Create an instance of {@link GemaltoInformationResult }
     * 
     */
    public GemaltoInformationResult createGemaltoInformationResult() {
        return new GemaltoInformationResult();
    }

    /**
     * Create an instance of {@link GemaltoReport }
     * 
     */
    public GemaltoReport createGemaltoReport() {
        return new GemaltoReport();
    }

    /**
     * Create an instance of {@link StepUpUpdate }
     * 
     */
    public StepUpUpdate createStepUpUpdate() {
        return new StepUpUpdate();
    }

    /**
     * Create an instance of {@link StepUp }
     * 
     */
    public StepUp createStepUp() {
        return new StepUp();
    }

    /**
     * Create an instance of {@link GOUIDUpdate }
     * 
     */
    public GOUIDUpdate createGOUIDUpdate() {
        return new GOUIDUpdate();
    }

    /**
     * Create an instance of {@link GOUID }
     * 
     */
    public GOUID createGOUID() {
        return new GOUID();
    }

    /**
     * Create an instance of {@link GemaltoFlagUpdate }
     * 
     */
    public GemaltoFlagUpdate createGemaltoFlagUpdate() {
        return new GemaltoFlagUpdate();
    }

    /**
     * Create an instance of {@link GemaltoFlag }
     * 
     */
    public GemaltoFlag createGemaltoFlag() {
        return new GemaltoFlag();
    }

    /**
     * Create an instance of {@link VerifyChallenge }
     * 
     */
    public VerifyChallenge createVerifyChallenge() {
        return new VerifyChallenge();
    }

    /**
     * Create an instance of {@link VerifyChallengeResult }
     * 
     */
    public VerifyChallengeResult createVerifyChallengeResult() {
        return new VerifyChallengeResult();
    }

    /**
     * Create an instance of {@link VerifyPINChallenge }
     * 
     */
    public VerifyPINChallenge createVerifyPINChallenge() {
        return new VerifyPINChallenge();
    }

    /**
     * Create an instance of {@link VerifyPINChallengeResult }
     * 
     */
    public VerifyPINChallengeResult createVerifyPINChallengeResult() {
        return new VerifyPINChallengeResult();
    }

    /**
     * Create an instance of {@link VerifyTempPINResetUser }
     * 
     */
    public VerifyTempPINResetUser createVerifyTempPINResetUser() {
        return new VerifyTempPINResetUser();
    }

    /**
     * Create an instance of {@link VerifyTempPINResetUserResult }
     * 
     */
    public VerifyTempPINResetUserResult createVerifyTempPINResetUserResult() {
        return new VerifyTempPINResetUserResult();
    }

    /**
     * Create an instance of {@link SendTempPINByEmail }
     * 
     */
    public SendTempPINByEmail createSendTempPINByEmail() {
        return new SendTempPINByEmail();
    }

    /**
     * Create an instance of {@link SendTempPINByEmailResult }
     * 
     */
    public SendTempPINByEmailResult createSendTempPINByEmailResult() {
        return new SendTempPINByEmailResult();
    }

    /**
     * Create an instance of {@link VerIDAnswerQuestionsResetUser }
     * 
     */
    public VerIDAnswerQuestionsResetUser createVerIDAnswerQuestionsResetUser() {
        return new VerIDAnswerQuestionsResetUser();
    }

    /**
     * Create an instance of {@link VerIDAnswerQuestionsResetUserResult }
     * 
     */
    public VerIDAnswerQuestionsResetUserResult createVerIDAnswerQuestionsResetUserResult() {
        return new VerIDAnswerQuestionsResetUserResult();
    }

    /**
     * Create an instance of {@link AuthorizeAggregator }
     * 
     */
    public AuthorizeAggregator createAuthorizeAggregator() {
        return new AuthorizeAggregator();
    }

    /**
     * Create an instance of {@link AuthorizeAggregatorResult }
     * 
     */
    public AuthorizeAggregatorResult createAuthorizeAggregatorResult() {
        return new AuthorizeAggregatorResult();
    }

    /**
     * Create an instance of {@link MaintainFIKey }
     * 
     */
    public MaintainFIKey createMaintainFIKey() {
        return new MaintainFIKey();
    }

    /**
     * Create an instance of {@link MaintainFIKeyResult }
     * 
     */
    public MaintainFIKeyResult createMaintainFIKeyResult() {
        return new MaintainFIKeyResult();
    }

    /**
     * Create an instance of {@link ChangeUsername }
     * 
     */
    public ChangeUsername createChangeUsername() {
        return new ChangeUsername();
    }

    /**
     * Create an instance of {@link ChangeUsernameResult }
     * 
     */
    public ChangeUsernameResult createChangeUsernameResult() {
        return new ChangeUsernameResult();
    }

    /**
     * Create an instance of {@link SecurityQuestions }
     * 
     */
    public SecurityQuestions createSecurityQuestions() {
        return new SecurityQuestions();
    }

    /**
     * Create an instance of {@link SecurityQuestionsResult }
     * 
     */
    public SecurityQuestionsResult createSecurityQuestionsResult() {
        return new SecurityQuestionsResult();
    }

    /**
     * Create an instance of {@link UserQuestions }
     * 
     */
    public UserQuestions createUserQuestions() {
        return new UserQuestions();
    }

    /**
     * Create an instance of {@link UserQuestionsResult }
     * 
     */
    public UserQuestionsResult createUserQuestionsResult() {
        return new UserQuestionsResult();
    }

    /**
     * Create an instance of {@link PasswordExpiration }
     * 
     */
    public PasswordExpiration createPasswordExpiration() {
        return new PasswordExpiration();
    }

    /**
     * Create an instance of {@link PasswordExpirationResult }
     * 
     */
    public PasswordExpirationResult createPasswordExpirationResult() {
        return new PasswordExpirationResult();
    }

    /**
     * Create an instance of {@link AllUserGroups }
     * 
     */
    public AllUserGroups createAllUserGroups() {
        return new AllUserGroups();
    }

    /**
     * Create an instance of {@link AllUserGroupsResult }
     * 
     */
    public AllUserGroupsResult createAllUserGroupsResult() {
        return new AllUserGroupsResult();
    }

    /**
     * Create an instance of {@link ListDevices }
     * 
     */
    public ListDevices createListDevices() {
        return new ListDevices();
    }

    /**
     * Create an instance of {@link ListDevicesResult }
     * 
     */
    public ListDevicesResult createListDevicesResult() {
        return new ListDevicesResult();
    }

    /**
     * Create an instance of {@link UserDetailStatus }
     * 
     */
    public UserDetailStatus createUserDetailStatus() {
        return new UserDetailStatus();
    }

    /**
     * Create an instance of {@link UserDetailStatusResult }
     * 
     */
    public UserDetailStatusResult createUserDetailStatusResult() {
        return new UserDetailStatusResult();
    }

    /**
     * Create an instance of {@link LastActivityDate }
     * 
     */
    public LastActivityDate createLastActivityDate() {
        return new LastActivityDate();
    }

    /**
     * Create an instance of {@link LastActivityDateResult }
     * 
     */
    public LastActivityDateResult createLastActivityDateResult() {
        return new LastActivityDateResult();
    }

    /**
     * Create an instance of {@link ListGroupUsers }
     * 
     */
    public ListGroupUsers createListGroupUsers() {
        return new ListGroupUsers();
    }

    /**
     * Create an instance of {@link ListGroupUsersResult }
     * 
     */
    public ListGroupUsersResult createListGroupUsersResult() {
        return new ListGroupUsersResult();
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link SearchByNameResult }
     * 
     */
    public SearchByNameResult createSearchByNameResult() {
        return new SearchByNameResult();
    }

    /**
     * Create an instance of {@link SearchGroups }
     * 
     */
    public SearchGroups createSearchGroups() {
        return new SearchGroups();
    }

    /**
     * Create an instance of {@link SearchGroupsResult }
     * 
     */
    public SearchGroupsResult createSearchGroupsResult() {
        return new SearchGroupsResult();
    }

    /**
     * Create an instance of {@link SearchUsers }
     * 
     */
    public SearchUsers createSearchUsers() {
        return new SearchUsers();
    }

    /**
     * Create an instance of {@link SearchUsersResult }
     * 
     */
    public SearchUsersResult createSearchUsersResult() {
        return new SearchUsersResult();
    }

    /**
     * Create an instance of {@link AggregatorGraceDateTime }
     * 
     */
    public AggregatorGraceDateTime createAggregatorGraceDateTime() {
        return new AggregatorGraceDateTime();
    }

    /**
     * Create an instance of {@link AggregatorGraceDateTimeResult }
     * 
     */
    public AggregatorGraceDateTimeResult createAggregatorGraceDateTimeResult() {
        return new AggregatorGraceDateTimeResult();
    }

    /**
     * Create an instance of {@link PhoneResetPasswordCall }
     * 
     */
    public PhoneResetPasswordCall createPhoneResetPasswordCall() {
        return new PhoneResetPasswordCall();
    }

    /**
     * Create an instance of {@link PhoneResetPasswordCallResult }
     * 
     */
    public PhoneResetPasswordCallResult createPhoneResetPasswordCallResult() {
        return new PhoneResetPasswordCallResult();
    }

    /**
     * Create an instance of {@link PhoneResetPasswordPoll }
     * 
     */
    public PhoneResetPasswordPoll createPhoneResetPasswordPoll() {
        return new PhoneResetPasswordPoll();
    }

    /**
     * Create an instance of {@link PhoneResetPasswordPollResult }
     * 
     */
    public PhoneResetPasswordPollResult createPhoneResetPasswordPollResult() {
        return new PhoneResetPasswordPollResult();
    }

    /**
     * Create an instance of {@link TestPhoneCodeVerifyCall }
     * 
     */
    public TestPhoneCodeVerifyCall createTestPhoneCodeVerifyCall() {
        return new TestPhoneCodeVerifyCall();
    }

    /**
     * Create an instance of {@link TestPhoneCodeVerifyCallResult }
     * 
     */
    public TestPhoneCodeVerifyCallResult createTestPhoneCodeVerifyCallResult() {
        return new TestPhoneCodeVerifyCallResult();
    }

    /**
     * Create an instance of {@link PhoneCodeVerifyCall }
     * 
     */
    public PhoneCodeVerifyCall createPhoneCodeVerifyCall() {
        return new PhoneCodeVerifyCall();
    }

    /**
     * Create an instance of {@link PhoneCodeVerifyCallResult }
     * 
     */
    public PhoneCodeVerifyCallResult createPhoneCodeVerifyCallResult() {
        return new PhoneCodeVerifyCallResult();
    }

    /**
     * Create an instance of {@link TestPhoneCodeVerifyPoll }
     * 
     */
    public TestPhoneCodeVerifyPoll createTestPhoneCodeVerifyPoll() {
        return new TestPhoneCodeVerifyPoll();
    }

    /**
     * Create an instance of {@link TestPhoneCodeVerifyPollResult }
     * 
     */
    public TestPhoneCodeVerifyPollResult createTestPhoneCodeVerifyPollResult() {
        return new TestPhoneCodeVerifyPollResult();
    }

    /**
     * Create an instance of {@link PhoneCodeVerifyPoll }
     * 
     */
    public PhoneCodeVerifyPoll createPhoneCodeVerifyPoll() {
        return new PhoneCodeVerifyPoll();
    }

    /**
     * Create an instance of {@link PhoneCodeVerifyPollResult }
     * 
     */
    public PhoneCodeVerifyPollResult createPhoneCodeVerifyPollResult() {
        return new PhoneCodeVerifyPollResult();
    }

    /**
     * Create an instance of {@link PhoneFundsVerifyCall }
     * 
     */
    public PhoneFundsVerifyCall createPhoneFundsVerifyCall() {
        return new PhoneFundsVerifyCall();
    }

    /**
     * Create an instance of {@link PhoneFundsVerifyCallResult }
     * 
     */
    public PhoneFundsVerifyCallResult createPhoneFundsVerifyCallResult() {
        return new PhoneFundsVerifyCallResult();
    }

    /**
     * Create an instance of {@link PhoneFundsVerifyPoll }
     * 
     */
    public PhoneFundsVerifyPoll createPhoneFundsVerifyPoll() {
        return new PhoneFundsVerifyPoll();
    }

    /**
     * Create an instance of {@link PhoneFundsVerifyPollResult }
     * 
     */
    public PhoneFundsVerifyPollResult createPhoneFundsVerifyPollResult() {
        return new PhoneFundsVerifyPollResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListUser")
    public JAXBElement<ListUser> createListUser(ListUser value) {
        return new JAXBElement<ListUser>(_ListUser_QNAME, ListUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListUserResult")
    public JAXBElement<ListUserResult> createListUserResult(ListUserResult value) {
        return new JAXBElement<ListUserResult>(_ListUserResult_QNAME, ListUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdminGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AdminGroups")
    public JAXBElement<AdminGroups> createAdminGroups(AdminGroups value) {
        return new JAXBElement<AdminGroups>(_AdminGroups_QNAME, AdminGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminGroupsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdminGroupsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AdminGroupsResult")
    public JAXBElement<AdminGroupsResult> createAdminGroupsResult(AdminGroupsResult value) {
        return new JAXBElement<AdminGroupsResult>(_AdminGroupsResult_QNAME, AdminGroupsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminRegistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdminRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AdminRegistration")
    public JAXBElement<AdminRegistration> createAdminRegistration(AdminRegistration value) {
        return new JAXBElement<AdminRegistration>(_AdminRegistration_QNAME, AdminRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminRegistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdminRegistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AdminRegistrationResult")
    public JAXBElement<AdminRegistrationResult> createAdminRegistrationResult(AdminRegistrationResult value) {
        return new JAXBElement<AdminRegistrationResult>(_AdminRegistrationResult_QNAME, AdminRegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateGSOResource }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssociateGSOResource }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AssociateGSOResource")
    public JAXBElement<AssociateGSOResource> createAssociateGSOResource(AssociateGSOResource value) {
        return new JAXBElement<AssociateGSOResource>(_AssociateGSOResource_QNAME, AssociateGSOResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateGSOResourceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssociateGSOResourceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AssociateGSOResourceResult")
    public JAXBElement<AssociateGSOResourceResult> createAssociateGSOResourceResult(AssociateGSOResourceResult value) {
        return new JAXBElement<AssociateGSOResourceResult>(_AssociateGSOResourceResult_QNAME, AssociateGSOResourceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssociateGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AssociateGroups")
    public JAXBElement<AssociateGroups> createAssociateGroups(AssociateGroups value) {
        return new JAXBElement<AssociateGroups>(_AssociateGroups_QNAME, AssociateGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateGroupsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssociateGroupsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AssociateGroupsResult")
    public JAXBElement<AssociateGroupsResult> createAssociateGroupsResult(AssociateGroupsResult value) {
        return new JAXBElement<AssociateGroupsResult>(_AssociateGroupsResult_QNAME, AssociateGroupsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DeleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DeleteUserResult")
    public JAXBElement<DeleteUserResult> createDeleteUserResult(DeleteUserResult value) {
        return new JAXBElement<DeleteUserResult>(_DeleteUserResult_QNAME, DeleteUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisableUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DisableUser")
    public JAXBElement<DisableUser> createDisableUser(DisableUser value) {
        return new JAXBElement<DisableUser>(_DisableUser_QNAME, DisableUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisableUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DisableUserResult")
    public JAXBElement<DisableUserResult> createDisableUserResult(DisableUserResult value) {
        return new JAXBElement<DisableUserResult>(_DisableUserResult_QNAME, DisableUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisassociateGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisassociateGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DisassociateGroups")
    public JAXBElement<DisassociateGroups> createDisassociateGroups(DisassociateGroups value) {
        return new JAXBElement<DisassociateGroups>(_DisassociateGroups_QNAME, DisassociateGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisassociateGroupsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisassociateGroupsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DisassociateGroupsResult")
    public JAXBElement<DisassociateGroupsResult> createDisassociateGroupsResult(DisassociateGroupsResult value) {
        return new JAXBElement<DisassociateGroupsResult>(_DisassociateGroupsResult_QNAME, DisassociateGroupsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnableUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "EnableUser")
    public JAXBElement<EnableUser> createEnableUser(EnableUser value) {
        return new JAXBElement<EnableUser>(_EnableUser_QNAME, EnableUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnableUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "EnableUserResult")
    public JAXBElement<EnableUserResult> createEnableUserResult(EnableUserResult value) {
        return new JAXBElement<EnableUserResult>(_EnableUserResult_QNAME, EnableUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GracePeriod }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GracePeriod }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GracePeriod")
    public JAXBElement<GracePeriod> createGracePeriod(GracePeriod value) {
        return new JAXBElement<GracePeriod>(_GracePeriod_QNAME, GracePeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GracePeriodResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GracePeriodResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GracePeriodResult")
    public JAXBElement<GracePeriodResult> createGracePeriodResult(GracePeriodResult value) {
        return new JAXBElement<GracePeriodResult>(_GracePeriodResult_QNAME, GracePeriodResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListApplicationUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListApplicationUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListApplicationUsers")
    public JAXBElement<ListApplicationUsers> createListApplicationUsers(ListApplicationUsers value) {
        return new JAXBElement<ListApplicationUsers>(_ListApplicationUsers_QNAME, ListApplicationUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListApplicationUsersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListApplicationUsersResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListApplicationUsersResult")
    public JAXBElement<ListApplicationUsersResult> createListApplicationUsersResult(ListApplicationUsersResult value) {
        return new JAXBElement<ListApplicationUsersResult>(_ListApplicationUsersResult_QNAME, ListApplicationUsersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainAppIdCIX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainAppIdCIX }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainAppIdCIX")
    public JAXBElement<MaintainAppIdCIX> createMaintainAppIdCIX(MaintainAppIdCIX value) {
        return new JAXBElement<MaintainAppIdCIX>(_MaintainAppIdCIX_QNAME, MaintainAppIdCIX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainAppIdCIXResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainAppIdCIXResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainAppIdCIXResult")
    public JAXBElement<MaintainAppIdCIXResult> createMaintainAppIdCIXResult(MaintainAppIdCIXResult value) {
        return new JAXBElement<MaintainAppIdCIXResult>(_MaintainAppIdCIXResult_QNAME, MaintainAppIdCIXResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainPIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainPIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainPIN")
    public JAXBElement<MaintainPIN> createMaintainPIN(MaintainPIN value) {
        return new JAXBElement<MaintainPIN>(_MaintainPIN_QNAME, MaintainPIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainPINResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainPINResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainPINResult")
    public JAXBElement<MaintainPINResult> createMaintainPINResult(MaintainPINResult value) {
        return new JAXBElement<MaintainPINResult>(_MaintainPINResult_QNAME, MaintainPINResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPassword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResetPassword }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ResetPassword")
    public JAXBElement<ResetPassword> createResetPassword(ResetPassword value) {
        return new JAXBElement<ResetPassword>(_ResetPassword_QNAME, ResetPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPasswordResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResetPasswordResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ResetPasswordResult")
    public JAXBElement<ResetPasswordResult> createResetPasswordResult(ResetPasswordResult value) {
        return new JAXBElement<ResetPasswordResult>(_ResetPasswordResult_QNAME, ResetPasswordResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAnswers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserAnswers }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserAnswers")
    public JAXBElement<UserAnswers> createUserAnswers(UserAnswers value) {
        return new JAXBElement<UserAnswers>(_UserAnswers_QNAME, UserAnswers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAnswersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserAnswersResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserAnswersResult")
    public JAXBElement<UserAnswersResult> createUserAnswersResult(UserAnswersResult value) {
        return new JAXBElement<UserAnswersResult>(_UserAnswersResult_QNAME, UserAnswersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserGroups")
    public JAXBElement<UserGroups> createUserGroups(UserGroups value) {
        return new JAXBElement<UserGroups>(_UserGroups_QNAME, UserGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroupsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserGroupsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserGroupsResult")
    public JAXBElement<UserGroupsResult> createUserGroupsResult(UserGroupsResult value) {
        return new JAXBElement<UserGroupsResult>(_UserGroupsResult_QNAME, UserGroupsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserPIN")
    public JAXBElement<UserPIN> createUserPIN(UserPIN value) {
        return new JAXBElement<UserPIN>(_UserPIN_QNAME, UserPIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPINResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPINResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserPINResult")
    public JAXBElement<UserPINResult> createUserPINResult(UserPINResult value) {
        return new JAXBElement<UserPINResult>(_UserPINResult_QNAME, UserPINResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPartyId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPartyId }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserPartyId")
    public JAXBElement<UserPartyId> createUserPartyId(UserPartyId value) {
        return new JAXBElement<UserPartyId>(_UserPartyId_QNAME, UserPartyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPartyIdResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPartyIdResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserPartyIdResult")
    public JAXBElement<UserPartyIdResult> createUserPartyIdResult(UserPartyIdResult value) {
        return new JAXBElement<UserPartyIdResult>(_UserPartyIdResult_QNAME, UserPartyIdResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainUserPartyId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainUserPartyId }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainUserPartyId")
    public JAXBElement<MaintainUserPartyId> createMaintainUserPartyId(MaintainUserPartyId value) {
        return new JAXBElement<MaintainUserPartyId>(_MaintainUserPartyId_QNAME, MaintainUserPartyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainUserPartyIdResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainUserPartyIdResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainUserPartyIdResult")
    public JAXBElement<MaintainUserPartyIdResult> createMaintainUserPartyIdResult(MaintainUserPartyIdResult value) {
        return new JAXBElement<MaintainUserPartyIdResult>(_MaintainUserPartyIdResult_QNAME, MaintainUserPartyIdResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetServiceCounter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResetServiceCounter }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ResetServiceCounter")
    public JAXBElement<ResetServiceCounter> createResetServiceCounter(ResetServiceCounter value) {
        return new JAXBElement<ResetServiceCounter>(_ResetServiceCounter_QNAME, ResetServiceCounter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetServiceCounterResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResetServiceCounterResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ResetServiceCounterResult")
    public JAXBElement<ResetServiceCounterResult> createResetServiceCounterResult(ResetServiceCounterResult value) {
        return new JAXBElement<ResetServiceCounterResult>(_ResetServiceCounterResult_QNAME, ResetServiceCounterResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FraudAlert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FraudAlert }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "FraudAlert")
    public JAXBElement<FraudAlert> createFraudAlert(FraudAlert value) {
        return new JAXBElement<FraudAlert>(_FraudAlert_QNAME, FraudAlert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FraudAlertResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FraudAlertResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "FraudAlertResult")
    public JAXBElement<FraudAlertResult> createFraudAlertResult(FraudAlertResult value) {
        return new JAXBElement<FraudAlertResult>(_FraudAlertResult_QNAME, FraudAlertResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChallengeUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChallengeUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ChallengeUser")
    public JAXBElement<ChallengeUser> createChallengeUser(ChallengeUser value) {
        return new JAXBElement<ChallengeUser>(_ChallengeUser_QNAME, ChallengeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChallengeUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChallengeUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ChallengeUserResult")
    public JAXBElement<ChallengeUserResult> createChallengeUserResult(ChallengeUserResult value) {
        return new JAXBElement<ChallengeUserResult>(_ChallengeUserResult_QNAME, ChallengeUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginMulti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginMulti }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "LoginMulti")
    public JAXBElement<LoginMulti> createLoginMulti(LoginMulti value) {
        return new JAXBElement<LoginMulti>(_LoginMulti_QNAME, LoginMulti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginMultiResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginMultiResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "LoginMultiResult")
    public JAXBElement<LoginMultiResult> createLoginMultiResult(LoginMultiResult value) {
        return new JAXBElement<LoginMultiResult>(_LoginMultiResult_QNAME, LoginMultiResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileLoginMulti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileLoginMulti }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileLoginMulti")
    public JAXBElement<MobileLoginMulti> createMobileLoginMulti(MobileLoginMulti value) {
        return new JAXBElement<MobileLoginMulti>(_MobileLoginMulti_QNAME, MobileLoginMulti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileLoginMultiResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileLoginMultiResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileLoginMultiResult")
    public JAXBElement<MobileLoginMultiResult> createMobileLoginMultiResult(MobileLoginMultiResult value) {
        return new JAXBElement<MobileLoginMultiResult>(_MobileLoginMultiResult_QNAME, MobileLoginMultiResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSingle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginSingle }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "LoginSingle")
    public JAXBElement<LoginSingle> createLoginSingle(LoginSingle value) {
        return new JAXBElement<LoginSingle>(_LoginSingle_QNAME, LoginSingle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSingleResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginSingleResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "LoginSingleResult")
    public JAXBElement<LoginSingleResult> createLoginSingleResult(LoginSingleResult value) {
        return new JAXBElement<LoginSingleResult>(_LoginSingleResult_QNAME, LoginSingleResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneNumber")
    public JAXBElement<PhoneNumber> createPhoneNumber(PhoneNumber value) {
        return new JAXBElement<PhoneNumber>(_PhoneNumber_QNAME, PhoneNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumberResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneNumberResult")
    public JAXBElement<PhoneNumberResult> createPhoneNumberResult(PhoneNumberResult value) {
        return new JAXBElement<PhoneNumberResult>(_PhoneNumberResult_QNAME, PhoneNumberResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberUpdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumberUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneNumberUpdate")
    public JAXBElement<PhoneNumberUpdate> createPhoneNumberUpdate(PhoneNumberUpdate value) {
        return new JAXBElement<PhoneNumberUpdate>(_PhoneNumberUpdate_QNAME, PhoneNumberUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberUpdateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumberUpdateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneNumberUpdateResult")
    public JAXBElement<PhoneNumberUpdateResult> createPhoneNumberUpdateResult(PhoneNumberUpdateResult value) {
        return new JAXBElement<PhoneNumberUpdateResult>(_PhoneNumberUpdateResult_QNAME, PhoneNumberUpdateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyPIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyPIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyPIN")
    public JAXBElement<VerifyPIN> createVerifyPIN(VerifyPIN value) {
        return new JAXBElement<VerifyPIN>(_VerifyPIN_QNAME, VerifyPIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyPINResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyPINResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyPINResult")
    public JAXBElement<VerifyPINResult> createVerifyPINResult(VerifyPINResult value) {
        return new JAXBElement<VerifyPINResult>(_VerifyPINResult_QNAME, VerifyPINResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyQuestions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyQuestions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyQuestions")
    public JAXBElement<VerifyQuestions> createVerifyQuestions(VerifyQuestions value) {
        return new JAXBElement<VerifyQuestions>(_VerifyQuestions_QNAME, VerifyQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyQuestionsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyQuestionsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyQuestionsResult")
    public JAXBElement<VerifyQuestionsResult> createVerifyQuestionsResult(VerifyQuestionsResult value) {
        return new JAXBElement<VerifyQuestionsResult>(_VerifyQuestionsResult_QNAME, VerifyQuestionsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTempPIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyTempPIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyTempPIN")
    public JAXBElement<VerifyTempPIN> createVerifyTempPIN(VerifyTempPIN value) {
        return new JAXBElement<VerifyTempPIN>(_VerifyTempPIN_QNAME, VerifyTempPIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTempPINResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyTempPINResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyTempPINResult")
    public JAXBElement<VerifyTempPINResult> createVerifyTempPINResult(VerifyTempPINResult value) {
        return new JAXBElement<VerifyTempPINResult>(_VerifyTempPINResult_QNAME, VerifyTempPINResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerIDChallengeUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerIDChallengeUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerIDChallengeUser")
    public JAXBElement<VerIDChallengeUser> createVerIDChallengeUser(VerIDChallengeUser value) {
        return new JAXBElement<VerIDChallengeUser>(_VerIDChallengeUser_QNAME, VerIDChallengeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerIDChallengeUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerIDChallengeUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerIDChallengeUserResult")
    public JAXBElement<VerIDChallengeUserResult> createVerIDChallengeUserResult(VerIDChallengeUserResult value) {
        return new JAXBElement<VerIDChallengeUserResult>(_VerIDChallengeUserResult_QNAME, VerIDChallengeUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerIDAnswerQuestions")
    public JAXBElement<VerIDAnswerQuestions> createVerIDAnswerQuestions(VerIDAnswerQuestions value) {
        return new JAXBElement<VerIDAnswerQuestions>(_VerIDAnswerQuestions_QNAME, VerIDAnswerQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestionsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestionsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerIDAnswerQuestionsResult")
    public JAXBElement<VerIDAnswerQuestionsResult> createVerIDAnswerQuestionsResult(VerIDAnswerQuestionsResult value) {
        return new JAXBElement<VerIDAnswerQuestionsResult>(_VerIDAnswerQuestionsResult_QNAME, VerIDAnswerQuestionsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRegistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "CompleteRegistration")
    public JAXBElement<CompleteRegistration> createCompleteRegistration(CompleteRegistration value) {
        return new JAXBElement<CompleteRegistration>(_CompleteRegistration_QNAME, CompleteRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRegistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteRegistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "CompleteRegistrationResult")
    public JAXBElement<CompleteRegistrationResult> createCompleteRegistrationResult(CompleteRegistrationResult value) {
        return new JAXBElement<CompleteRegistrationResult>(_CompleteRegistrationResult_QNAME, CompleteRegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceRegistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DeviceRegistration")
    public JAXBElement<DeviceRegistration> createDeviceRegistration(DeviceRegistration value) {
        return new JAXBElement<DeviceRegistration>(_DeviceRegistration_QNAME, DeviceRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceRegistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceRegistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DeviceRegistrationResult")
    public JAXBElement<DeviceRegistrationResult> createDeviceRegistrationResult(DeviceRegistrationResult value) {
        return new JAXBElement<DeviceRegistrationResult>(_DeviceRegistrationResult_QNAME, DeviceRegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileDeviceRegistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileDeviceRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileDeviceRegistration")
    public JAXBElement<MobileDeviceRegistration> createMobileDeviceRegistration(MobileDeviceRegistration value) {
        return new JAXBElement<MobileDeviceRegistration>(_MobileDeviceRegistration_QNAME, MobileDeviceRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileDeviceRegistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileDeviceRegistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileDeviceRegistrationResult")
    public JAXBElement<MobileDeviceRegistrationResult> createMobileDeviceRegistrationResult(MobileDeviceRegistrationResult value) {
        return new JAXBElement<MobileDeviceRegistrationResult>(_MobileDeviceRegistrationResult_QNAME, MobileDeviceRegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileRegistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileRegistration")
    public JAXBElement<MobileRegistration> createMobileRegistration(MobileRegistration value) {
        return new JAXBElement<MobileRegistration>(_MobileRegistration_QNAME, MobileRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileRegistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileRegistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileRegistrationResult")
    public JAXBElement<MobileRegistrationResult> createMobileRegistrationResult(MobileRegistrationResult value) {
        return new JAXBElement<MobileRegistrationResult>(_MobileRegistrationResult_QNAME, MobileRegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileEnrollment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileEnrollment }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileEnrollment")
    public JAXBElement<MobileEnrollment> createMobileEnrollment(MobileEnrollment value) {
        return new JAXBElement<MobileEnrollment>(_MobileEnrollment_QNAME, MobileEnrollment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileEnrollmentResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileEnrollmentResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileEnrollmentResult")
    public JAXBElement<MobileEnrollmentResult> createMobileEnrollmentResult(MobileEnrollmentResult value) {
        return new JAXBElement<MobileEnrollmentResult>(_MobileEnrollmentResult_QNAME, MobileEnrollmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileMultiLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileMultiLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileMultiLogin")
    public JAXBElement<MobileMultiLogin> createMobileMultiLogin(MobileMultiLogin value) {
        return new JAXBElement<MobileMultiLogin>(_MobileMultiLogin_QNAME, MobileMultiLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileMultiLoginResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileMultiLoginResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileMultiLoginResult")
    public JAXBElement<MobileMultiLoginResult> createMobileMultiLoginResult(MobileMultiLoginResult value) {
        return new JAXBElement<MobileMultiLoginResult>(_MobileMultiLoginResult_QNAME, MobileMultiLoginResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileUnregistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileUnregistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileUnregistration")
    public JAXBElement<MobileUnregistration> createMobileUnregistration(MobileUnregistration value) {
        return new JAXBElement<MobileUnregistration>(_MobileUnregistration_QNAME, MobileUnregistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileUnregistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MobileUnregistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MobileUnregistrationResult")
    public JAXBElement<MobileUnregistrationResult> createMobileUnregistrationResult(MobileUnregistrationResult value) {
        return new JAXBElement<MobileUnregistrationResult>(_MobileUnregistrationResult_QNAME, MobileUnregistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceUnregistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceUnregistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DeviceUnregistration")
    public JAXBElement<DeviceUnregistration> createDeviceUnregistration(DeviceUnregistration value) {
        return new JAXBElement<DeviceUnregistration>(_DeviceUnregistration_QNAME, DeviceUnregistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceUnregistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceUnregistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "DeviceUnregistrationResult")
    public JAXBElement<DeviceUnregistrationResult> createDeviceUnregistrationResult(DeviceUnregistrationResult value) {
        return new JAXBElement<DeviceUnregistrationResult>(_DeviceUnregistrationResult_QNAME, DeviceUnregistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelfRegistration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelfRegistration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SelfRegistration")
    public JAXBElement<SelfRegistration> createSelfRegistration(SelfRegistration value) {
        return new JAXBElement<SelfRegistration>(_SelfRegistration_QNAME, SelfRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelfRegistrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SelfRegistrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SelfRegistrationResult")
    public JAXBElement<SelfRegistrationResult> createSelfRegistrationResult(SelfRegistrationResult value) {
        return new JAXBElement<SelfRegistrationResult>(_SelfRegistrationResult_QNAME, SelfRegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserMaintenance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserMaintenance }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserMaintenance")
    public JAXBElement<UserMaintenance> createUserMaintenance(UserMaintenance value) {
        return new JAXBElement<UserMaintenance>(_UserMaintenance_QNAME, UserMaintenance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserMaintenanceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserMaintenanceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserMaintenanceResult")
    public JAXBElement<UserMaintenanceResult> createUserMaintenanceResult(UserMaintenanceResult value) {
        return new JAXBElement<UserMaintenanceResult>(_UserMaintenanceResult_QNAME, UserMaintenanceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenShipDateUpdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenShipDateUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TokenShipDateUpdate")
    public JAXBElement<TokenShipDateUpdate> createTokenShipDateUpdate(TokenShipDateUpdate value) {
        return new JAXBElement<TokenShipDateUpdate>(_TokenShipDateUpdate_QNAME, TokenShipDateUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TokenShipDateUpdateResult")
    public JAXBElement<BaseResult> createTokenShipDateUpdateResult(BaseResult value) {
        return new JAXBElement<BaseResult>(_TokenShipDateUpdateResult_QNAME, BaseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenShipDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenShipDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TokenShipDate")
    public JAXBElement<TokenShipDate> createTokenShipDate(TokenShipDate value) {
        return new JAXBElement<TokenShipDate>(_TokenShipDate_QNAME, TokenShipDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPAttrDateTimeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDAPAttrDateTimeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TokenShipDateResult")
    public JAXBElement<LDAPAttrDateTimeResult> createTokenShipDateResult(LDAPAttrDateTimeResult value) {
        return new JAXBElement<LDAPAttrDateTimeResult>(_TokenShipDateResult_QNAME, LDAPAttrDateTimeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GemaltoInformationUpdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GemaltoInformationUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoInformationUpdate")
    public JAXBElement<GemaltoInformationUpdate> createGemaltoInformationUpdate(GemaltoInformationUpdate value) {
        return new JAXBElement<GemaltoInformationUpdate>(_GemaltoInformationUpdate_QNAME, GemaltoInformationUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoInformationUpdateResult")
    public JAXBElement<BaseResult> createGemaltoInformationUpdateResult(BaseResult value) {
        return new JAXBElement<BaseResult>(_GemaltoInformationUpdateResult_QNAME, BaseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GemaltoInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GemaltoInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoInformation")
    public JAXBElement<GemaltoInformation> createGemaltoInformation(GemaltoInformation value) {
        return new JAXBElement<GemaltoInformation>(_GemaltoInformation_QNAME, GemaltoInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GemaltoInformationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GemaltoInformationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoInformationResult")
    public JAXBElement<GemaltoInformationResult> createGemaltoInformationResult(GemaltoInformationResult value) {
        return new JAXBElement<GemaltoInformationResult>(_GemaltoInformationResult_QNAME, GemaltoInformationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GemaltoReport }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GemaltoReport }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoReport")
    public JAXBElement<GemaltoReport> createGemaltoReport(GemaltoReport value) {
        return new JAXBElement<GemaltoReport>(_GemaltoReport_QNAME, GemaltoReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoReportResult")
    public JAXBElement<String> createGemaltoReportResult(String value) {
        return new JAXBElement<String>(_GemaltoReportResult_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StepUpUpdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StepUpUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "StepUpUpdate")
    public JAXBElement<StepUpUpdate> createStepUpUpdate(StepUpUpdate value) {
        return new JAXBElement<StepUpUpdate>(_StepUpUpdate_QNAME, StepUpUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "StepUpUpdateResult")
    public JAXBElement<BaseResult> createStepUpUpdateResult(BaseResult value) {
        return new JAXBElement<BaseResult>(_StepUpUpdateResult_QNAME, BaseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StepUp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StepUp }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "StepUp")
    public JAXBElement<StepUp> createStepUp(StepUp value) {
        return new JAXBElement<StepUp>(_StepUp_QNAME, StepUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPAttrStringResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDAPAttrStringResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "StepUpResult")
    public JAXBElement<LDAPAttrStringResult> createStepUpResult(LDAPAttrStringResult value) {
        return new JAXBElement<LDAPAttrStringResult>(_StepUpResult_QNAME, LDAPAttrStringResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GOUIDUpdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GOUIDUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GOUIDUpdate")
    public JAXBElement<GOUIDUpdate> createGOUIDUpdate(GOUIDUpdate value) {
        return new JAXBElement<GOUIDUpdate>(_GOUIDUpdate_QNAME, GOUIDUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GOUIDUpdateResult")
    public JAXBElement<Boolean> createGOUIDUpdateResult(Boolean value) {
        return new JAXBElement<Boolean>(_GOUIDUpdateResult_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GOUID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GOUID }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GOUID")
    public JAXBElement<GOUID> createGOUID(GOUID value) {
        return new JAXBElement<GOUID>(_GOUID_QNAME, GOUID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GOUIDResult")
    public JAXBElement<String> createGOUIDResult(String value) {
        return new JAXBElement<String>(_GOUIDResult_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GemaltoFlagUpdate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GemaltoFlagUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoFlagUpdate")
    public JAXBElement<GemaltoFlagUpdate> createGemaltoFlagUpdate(GemaltoFlagUpdate value) {
        return new JAXBElement<GemaltoFlagUpdate>(_GemaltoFlagUpdate_QNAME, GemaltoFlagUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoFlagUpdateResult")
    public JAXBElement<BaseResult> createGemaltoFlagUpdateResult(BaseResult value) {
        return new JAXBElement<BaseResult>(_GemaltoFlagUpdateResult_QNAME, BaseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GemaltoFlag }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GemaltoFlag }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoFlag")
    public JAXBElement<GemaltoFlag> createGemaltoFlag(GemaltoFlag value) {
        return new JAXBElement<GemaltoFlag>(_GemaltoFlag_QNAME, GemaltoFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPAttrBooleanResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDAPAttrBooleanResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "GemaltoFlagResult")
    public JAXBElement<LDAPAttrBooleanResult> createGemaltoFlagResult(LDAPAttrBooleanResult value) {
        return new JAXBElement<LDAPAttrBooleanResult>(_GemaltoFlagResult_QNAME, LDAPAttrBooleanResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyChallenge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyChallenge }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyChallenge")
    public JAXBElement<VerifyChallenge> createVerifyChallenge(VerifyChallenge value) {
        return new JAXBElement<VerifyChallenge>(_VerifyChallenge_QNAME, VerifyChallenge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyChallengeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyChallengeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyChallengeResult")
    public JAXBElement<VerifyChallengeResult> createVerifyChallengeResult(VerifyChallengeResult value) {
        return new JAXBElement<VerifyChallengeResult>(_VerifyChallengeResult_QNAME, VerifyChallengeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyPINChallenge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyPINChallenge }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyPINChallenge")
    public JAXBElement<VerifyPINChallenge> createVerifyPINChallenge(VerifyPINChallenge value) {
        return new JAXBElement<VerifyPINChallenge>(_VerifyPINChallenge_QNAME, VerifyPINChallenge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyPINChallengeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyPINChallengeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyPINChallengeResult")
    public JAXBElement<VerifyPINChallengeResult> createVerifyPINChallengeResult(VerifyPINChallengeResult value) {
        return new JAXBElement<VerifyPINChallengeResult>(_VerifyPINChallengeResult_QNAME, VerifyPINChallengeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTempPINResetUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyTempPINResetUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyTempPINResetUser")
    public JAXBElement<VerifyTempPINResetUser> createVerifyTempPINResetUser(VerifyTempPINResetUser value) {
        return new JAXBElement<VerifyTempPINResetUser>(_VerifyTempPINResetUser_QNAME, VerifyTempPINResetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTempPINResetUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifyTempPINResetUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerifyTempPINResetUserResult")
    public JAXBElement<VerifyTempPINResetUserResult> createVerifyTempPINResetUserResult(VerifyTempPINResetUserResult value) {
        return new JAXBElement<VerifyTempPINResetUserResult>(_VerifyTempPINResetUserResult_QNAME, VerifyTempPINResetUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendTempPINByEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendTempPINByEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SendTempPINByEmail")
    public JAXBElement<SendTempPINByEmail> createSendTempPINByEmail(SendTempPINByEmail value) {
        return new JAXBElement<SendTempPINByEmail>(_SendTempPINByEmail_QNAME, SendTempPINByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendTempPINByEmailResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendTempPINByEmailResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SendTempPINByEmailResult")
    public JAXBElement<SendTempPINByEmailResult> createSendTempPINByEmailResult(SendTempPINByEmailResult value) {
        return new JAXBElement<SendTempPINByEmailResult>(_SendTempPINByEmailResult_QNAME, SendTempPINByEmailResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestionsResetUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestionsResetUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerIDAnswerQuestionsResetUser")
    public JAXBElement<VerIDAnswerQuestionsResetUser> createVerIDAnswerQuestionsResetUser(VerIDAnswerQuestionsResetUser value) {
        return new JAXBElement<VerIDAnswerQuestionsResetUser>(_VerIDAnswerQuestionsResetUser_QNAME, VerIDAnswerQuestionsResetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestionsResetUserResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerIDAnswerQuestionsResetUserResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "VerIDAnswerQuestionsResetUserResult")
    public JAXBElement<VerIDAnswerQuestionsResetUserResult> createVerIDAnswerQuestionsResetUserResult(VerIDAnswerQuestionsResetUserResult value) {
        return new JAXBElement<VerIDAnswerQuestionsResetUserResult>(_VerIDAnswerQuestionsResetUserResult_QNAME, VerIDAnswerQuestionsResetUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeAggregator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthorizeAggregator }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AuthorizeAggregator")
    public JAXBElement<AuthorizeAggregator> createAuthorizeAggregator(AuthorizeAggregator value) {
        return new JAXBElement<AuthorizeAggregator>(_AuthorizeAggregator_QNAME, AuthorizeAggregator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeAggregatorResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthorizeAggregatorResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AuthorizeAggregatorResult")
    public JAXBElement<AuthorizeAggregatorResult> createAuthorizeAggregatorResult(AuthorizeAggregatorResult value) {
        return new JAXBElement<AuthorizeAggregatorResult>(_AuthorizeAggregatorResult_QNAME, AuthorizeAggregatorResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainFIKey }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainFIKey }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainFIKey")
    public JAXBElement<MaintainFIKey> createMaintainFIKey(MaintainFIKey value) {
        return new JAXBElement<MaintainFIKey>(_MaintainFIKey_QNAME, MaintainFIKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainFIKeyResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintainFIKeyResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "MaintainFIKeyResult")
    public JAXBElement<MaintainFIKeyResult> createMaintainFIKeyResult(MaintainFIKeyResult value) {
        return new JAXBElement<MaintainFIKeyResult>(_MaintainFIKeyResult_QNAME, MaintainFIKeyResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ChangeUsername")
    public JAXBElement<ChangeUsername> createChangeUsername(ChangeUsername value) {
        return new JAXBElement<ChangeUsername>(_ChangeUsername_QNAME, ChangeUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeUsernameResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeUsernameResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ChangeUsernameResult")
    public JAXBElement<ChangeUsernameResult> createChangeUsernameResult(ChangeUsernameResult value) {
        return new JAXBElement<ChangeUsernameResult>(_ChangeUsernameResult_QNAME, ChangeUsernameResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityQuestions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurityQuestions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SecurityQuestions")
    public JAXBElement<SecurityQuestions> createSecurityQuestions(SecurityQuestions value) {
        return new JAXBElement<SecurityQuestions>(_SecurityQuestions_QNAME, SecurityQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityQuestionsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurityQuestionsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SecurityQuestionsResult")
    public JAXBElement<SecurityQuestionsResult> createSecurityQuestionsResult(SecurityQuestionsResult value) {
        return new JAXBElement<SecurityQuestionsResult>(_SecurityQuestionsResult_QNAME, SecurityQuestionsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserQuestions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserQuestions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserQuestions")
    public JAXBElement<UserQuestions> createUserQuestions(UserQuestions value) {
        return new JAXBElement<UserQuestions>(_UserQuestions_QNAME, UserQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserQuestionsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserQuestionsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserQuestionsResult")
    public JAXBElement<UserQuestionsResult> createUserQuestionsResult(UserQuestionsResult value) {
        return new JAXBElement<UserQuestionsResult>(_UserQuestionsResult_QNAME, UserQuestionsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordExpiration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PasswordExpiration }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PasswordExpiration")
    public JAXBElement<PasswordExpiration> createPasswordExpiration(PasswordExpiration value) {
        return new JAXBElement<PasswordExpiration>(_PasswordExpiration_QNAME, PasswordExpiration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordExpirationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PasswordExpirationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PasswordExpirationResult")
    public JAXBElement<PasswordExpirationResult> createPasswordExpirationResult(PasswordExpirationResult value) {
        return new JAXBElement<PasswordExpirationResult>(_PasswordExpirationResult_QNAME, PasswordExpirationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllUserGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllUserGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AllUserGroups")
    public JAXBElement<AllUserGroups> createAllUserGroups(AllUserGroups value) {
        return new JAXBElement<AllUserGroups>(_AllUserGroups_QNAME, AllUserGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllUserGroupsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllUserGroupsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AllUserGroupsResult")
    public JAXBElement<AllUserGroupsResult> createAllUserGroupsResult(AllUserGroupsResult value) {
        return new JAXBElement<AllUserGroupsResult>(_AllUserGroupsResult_QNAME, AllUserGroupsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDevices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDevices }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListDevices")
    public JAXBElement<ListDevices> createListDevices(ListDevices value) {
        return new JAXBElement<ListDevices>(_ListDevices_QNAME, ListDevices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDevicesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDevicesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListDevicesResult")
    public JAXBElement<ListDevicesResult> createListDevicesResult(ListDevicesResult value) {
        return new JAXBElement<ListDevicesResult>(_ListDevicesResult_QNAME, ListDevicesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDetailStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserDetailStatus")
    public JAXBElement<UserDetailStatus> createUserDetailStatus(UserDetailStatus value) {
        return new JAXBElement<UserDetailStatus>(_UserDetailStatus_QNAME, UserDetailStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailStatusResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDetailStatusResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "UserDetailStatusResult")
    public JAXBElement<UserDetailStatusResult> createUserDetailStatusResult(UserDetailStatusResult value) {
        return new JAXBElement<UserDetailStatusResult>(_UserDetailStatusResult_QNAME, UserDetailStatusResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastActivityDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LastActivityDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "LastActivityDate")
    public JAXBElement<LastActivityDate> createLastActivityDate(LastActivityDate value) {
        return new JAXBElement<LastActivityDate>(_LastActivityDate_QNAME, LastActivityDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastActivityDateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LastActivityDateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "LastActivityDateResult")
    public JAXBElement<LastActivityDateResult> createLastActivityDateResult(LastActivityDateResult value) {
        return new JAXBElement<LastActivityDateResult>(_LastActivityDateResult_QNAME, LastActivityDateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGroupUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListGroupUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListGroupUsers")
    public JAXBElement<ListGroupUsers> createListGroupUsers(ListGroupUsers value) {
        return new JAXBElement<ListGroupUsers>(_ListGroupUsers_QNAME, ListGroupUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGroupUsersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListGroupUsersResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "ListGroupUsersResult")
    public JAXBElement<ListGroupUsersResult> createListGroupUsersResult(ListGroupUsersResult value) {
        return new JAXBElement<ListGroupUsersResult>(_ListGroupUsersResult_QNAME, ListGroupUsersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SearchByName")
    public JAXBElement<SearchByName> createSearchByName(SearchByName value) {
        return new JAXBElement<SearchByName>(_SearchByName_QNAME, SearchByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByNameResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchByNameResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SearchByNameResult")
    public JAXBElement<SearchByNameResult> createSearchByNameResult(SearchByNameResult value) {
        return new JAXBElement<SearchByNameResult>(_SearchByNameResult_QNAME, SearchByNameResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SearchGroups")
    public JAXBElement<SearchGroups> createSearchGroups(SearchGroups value) {
        return new JAXBElement<SearchGroups>(_SearchGroups_QNAME, SearchGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGroupsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGroupsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SearchGroupsResult")
    public JAXBElement<SearchGroupsResult> createSearchGroupsResult(SearchGroupsResult value) {
        return new JAXBElement<SearchGroupsResult>(_SearchGroupsResult_QNAME, SearchGroupsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SearchUsers")
    public JAXBElement<SearchUsers> createSearchUsers(SearchUsers value) {
        return new JAXBElement<SearchUsers>(_SearchUsers_QNAME, SearchUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUsersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchUsersResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "SearchUsersResult")
    public JAXBElement<SearchUsersResult> createSearchUsersResult(SearchUsersResult value) {
        return new JAXBElement<SearchUsersResult>(_SearchUsersResult_QNAME, SearchUsersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorGraceDateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggregatorGraceDateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AggregatorGraceDateTime")
    public JAXBElement<AggregatorGraceDateTime> createAggregatorGraceDateTime(AggregatorGraceDateTime value) {
        return new JAXBElement<AggregatorGraceDateTime>(_AggregatorGraceDateTime_QNAME, AggregatorGraceDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorGraceDateTimeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggregatorGraceDateTimeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "AggregatorGraceDateTimeResult")
    public JAXBElement<AggregatorGraceDateTimeResult> createAggregatorGraceDateTimeResult(AggregatorGraceDateTimeResult value) {
        return new JAXBElement<AggregatorGraceDateTimeResult>(_AggregatorGraceDateTimeResult_QNAME, AggregatorGraceDateTimeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordCall }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordCall }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneResetPasswordCall")
    public JAXBElement<PhoneResetPasswordCall> createPhoneResetPasswordCall(PhoneResetPasswordCall value) {
        return new JAXBElement<PhoneResetPasswordCall>(_PhoneResetPasswordCall_QNAME, PhoneResetPasswordCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordCallResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordCallResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneResetPasswordCallResult")
    public JAXBElement<PhoneResetPasswordCallResult> createPhoneResetPasswordCallResult(PhoneResetPasswordCallResult value) {
        return new JAXBElement<PhoneResetPasswordCallResult>(_PhoneResetPasswordCallResult_QNAME, PhoneResetPasswordCallResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordPoll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordPoll }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneResetPasswordPoll")
    public JAXBElement<PhoneResetPasswordPoll> createPhoneResetPasswordPoll(PhoneResetPasswordPoll value) {
        return new JAXBElement<PhoneResetPasswordPoll>(_PhoneResetPasswordPoll_QNAME, PhoneResetPasswordPoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordPollResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneResetPasswordPollResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneResetPasswordPollResult")
    public JAXBElement<PhoneResetPasswordPollResult> createPhoneResetPasswordPollResult(PhoneResetPasswordPollResult value) {
        return new JAXBElement<PhoneResetPasswordPollResult>(_PhoneResetPasswordPollResult_QNAME, PhoneResetPasswordPollResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyCall }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyCall }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TestPhoneCodeVerifyCall")
    public JAXBElement<TestPhoneCodeVerifyCall> createTestPhoneCodeVerifyCall(TestPhoneCodeVerifyCall value) {
        return new JAXBElement<TestPhoneCodeVerifyCall>(_TestPhoneCodeVerifyCall_QNAME, TestPhoneCodeVerifyCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyCallResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyCallResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TestPhoneCodeVerifyCallResult")
    public JAXBElement<TestPhoneCodeVerifyCallResult> createTestPhoneCodeVerifyCallResult(TestPhoneCodeVerifyCallResult value) {
        return new JAXBElement<TestPhoneCodeVerifyCallResult>(_TestPhoneCodeVerifyCallResult_QNAME, TestPhoneCodeVerifyCallResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyCall }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyCall }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneCodeVerifyCall")
    public JAXBElement<PhoneCodeVerifyCall> createPhoneCodeVerifyCall(PhoneCodeVerifyCall value) {
        return new JAXBElement<PhoneCodeVerifyCall>(_PhoneCodeVerifyCall_QNAME, PhoneCodeVerifyCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyCallResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyCallResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneCodeVerifyCallResult")
    public JAXBElement<PhoneCodeVerifyCallResult> createPhoneCodeVerifyCallResult(PhoneCodeVerifyCallResult value) {
        return new JAXBElement<PhoneCodeVerifyCallResult>(_PhoneCodeVerifyCallResult_QNAME, PhoneCodeVerifyCallResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyPoll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyPoll }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TestPhoneCodeVerifyPoll")
    public JAXBElement<TestPhoneCodeVerifyPoll> createTestPhoneCodeVerifyPoll(TestPhoneCodeVerifyPoll value) {
        return new JAXBElement<TestPhoneCodeVerifyPoll>(_TestPhoneCodeVerifyPoll_QNAME, TestPhoneCodeVerifyPoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyPollResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestPhoneCodeVerifyPollResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "TestPhoneCodeVerifyPollResult")
    public JAXBElement<TestPhoneCodeVerifyPollResult> createTestPhoneCodeVerifyPollResult(TestPhoneCodeVerifyPollResult value) {
        return new JAXBElement<TestPhoneCodeVerifyPollResult>(_TestPhoneCodeVerifyPollResult_QNAME, TestPhoneCodeVerifyPollResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyPoll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyPoll }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneCodeVerifyPoll")
    public JAXBElement<PhoneCodeVerifyPoll> createPhoneCodeVerifyPoll(PhoneCodeVerifyPoll value) {
        return new JAXBElement<PhoneCodeVerifyPoll>(_PhoneCodeVerifyPoll_QNAME, PhoneCodeVerifyPoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyPollResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneCodeVerifyPollResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneCodeVerifyPollResult")
    public JAXBElement<PhoneCodeVerifyPollResult> createPhoneCodeVerifyPollResult(PhoneCodeVerifyPollResult value) {
        return new JAXBElement<PhoneCodeVerifyPollResult>(_PhoneCodeVerifyPollResult_QNAME, PhoneCodeVerifyPollResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyCall }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyCall }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneFundsVerifyCall")
    public JAXBElement<PhoneFundsVerifyCall> createPhoneFundsVerifyCall(PhoneFundsVerifyCall value) {
        return new JAXBElement<PhoneFundsVerifyCall>(_PhoneFundsVerifyCall_QNAME, PhoneFundsVerifyCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyCallResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyCallResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneFundsVerifyCallResult")
    public JAXBElement<PhoneFundsVerifyCallResult> createPhoneFundsVerifyCallResult(PhoneFundsVerifyCallResult value) {
        return new JAXBElement<PhoneFundsVerifyCallResult>(_PhoneFundsVerifyCallResult_QNAME, PhoneFundsVerifyCallResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyPoll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyPoll }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneFundsVerifyPoll")
    public JAXBElement<PhoneFundsVerifyPoll> createPhoneFundsVerifyPoll(PhoneFundsVerifyPoll value) {
        return new JAXBElement<PhoneFundsVerifyPoll>(_PhoneFundsVerifyPoll_QNAME, PhoneFundsVerifyPoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyPollResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneFundsVerifyPollResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tfa.keybank.com/v1_11/service/operations", name = "PhoneFundsVerifyPollResult")
    public JAXBElement<PhoneFundsVerifyPollResult> createPhoneFundsVerifyPollResult(PhoneFundsVerifyPollResult value) {
        return new JAXBElement<PhoneFundsVerifyPollResult>(_PhoneFundsVerifyPollResult_QNAME, PhoneFundsVerifyPollResult.class, null, value);
    }

}
