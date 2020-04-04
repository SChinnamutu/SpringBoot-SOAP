
package com.keybank.tfa.v1_11.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.keybank.tfa.v1_11.service.objects.BaseResult;
import com.keybank.tfa.v1_11.service.objects.LDAPAttrBooleanResult;
import com.keybank.tfa.v1_11.service.objects.LDAPAttrDateTimeResult;
import com.keybank.tfa.v1_11.service.objects.LDAPAttrStringResult;
import com.keybank.tfa.v1_11.service.operations.AdminGroups;
import com.keybank.tfa.v1_11.service.operations.AdminGroupsResult;
import com.keybank.tfa.v1_11.service.operations.AdminRegistration;
import com.keybank.tfa.v1_11.service.operations.AdminRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.AggregatorGraceDateTime;
import com.keybank.tfa.v1_11.service.operations.AggregatorGraceDateTimeResult;
import com.keybank.tfa.v1_11.service.operations.AllUserGroups;
import com.keybank.tfa.v1_11.service.operations.AllUserGroupsResult;
import com.keybank.tfa.v1_11.service.operations.AssociateGSOResource;
import com.keybank.tfa.v1_11.service.operations.AssociateGSOResourceResult;
import com.keybank.tfa.v1_11.service.operations.AssociateGroups;
import com.keybank.tfa.v1_11.service.operations.AssociateGroupsResult;
import com.keybank.tfa.v1_11.service.operations.AuthorizeAggregator;
import com.keybank.tfa.v1_11.service.operations.AuthorizeAggregatorResult;
import com.keybank.tfa.v1_11.service.operations.ChallengeUser;
import com.keybank.tfa.v1_11.service.operations.ChallengeUserResult;
import com.keybank.tfa.v1_11.service.operations.ChangeUsername;
import com.keybank.tfa.v1_11.service.operations.ChangeUsernameResult;
import com.keybank.tfa.v1_11.service.operations.CompleteRegistration;
import com.keybank.tfa.v1_11.service.operations.CompleteRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.DeleteUser;
import com.keybank.tfa.v1_11.service.operations.DeleteUserResult;
import com.keybank.tfa.v1_11.service.operations.DeviceRegistration;
import com.keybank.tfa.v1_11.service.operations.DeviceRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.DeviceUnregistration;
import com.keybank.tfa.v1_11.service.operations.DeviceUnregistrationResult;
import com.keybank.tfa.v1_11.service.operations.DisableUser;
import com.keybank.tfa.v1_11.service.operations.DisableUserResult;
import com.keybank.tfa.v1_11.service.operations.DisassociateGroups;
import com.keybank.tfa.v1_11.service.operations.DisassociateGroupsResult;
import com.keybank.tfa.v1_11.service.operations.EnableUser;
import com.keybank.tfa.v1_11.service.operations.EnableUserResult;
import com.keybank.tfa.v1_11.service.operations.FraudAlert;
import com.keybank.tfa.v1_11.service.operations.FraudAlertResult;
import com.keybank.tfa.v1_11.service.operations.GOUID;
import com.keybank.tfa.v1_11.service.operations.GOUIDUpdate;
import com.keybank.tfa.v1_11.service.operations.GemaltoFlag;
import com.keybank.tfa.v1_11.service.operations.GemaltoFlagUpdate;
import com.keybank.tfa.v1_11.service.operations.GemaltoInformation;
import com.keybank.tfa.v1_11.service.operations.GemaltoInformationResult;
import com.keybank.tfa.v1_11.service.operations.GemaltoInformationUpdate;
import com.keybank.tfa.v1_11.service.operations.GemaltoReport;
import com.keybank.tfa.v1_11.service.operations.GracePeriod;
import com.keybank.tfa.v1_11.service.operations.GracePeriodResult;
import com.keybank.tfa.v1_11.service.operations.LastActivityDate;
import com.keybank.tfa.v1_11.service.operations.LastActivityDateResult;
import com.keybank.tfa.v1_11.service.operations.ListApplicationUsers;
import com.keybank.tfa.v1_11.service.operations.ListApplicationUsersResult;
import com.keybank.tfa.v1_11.service.operations.ListDevices;
import com.keybank.tfa.v1_11.service.operations.ListDevicesResult;
import com.keybank.tfa.v1_11.service.operations.ListGroupUsers;
import com.keybank.tfa.v1_11.service.operations.ListGroupUsersResult;
import com.keybank.tfa.v1_11.service.operations.ListUser;
import com.keybank.tfa.v1_11.service.operations.ListUserResult;
import com.keybank.tfa.v1_11.service.operations.LoginMulti;
import com.keybank.tfa.v1_11.service.operations.LoginMultiResult;
import com.keybank.tfa.v1_11.service.operations.LoginSingle;
import com.keybank.tfa.v1_11.service.operations.LoginSingleResult;
import com.keybank.tfa.v1_11.service.operations.MaintainAppIdCIX;
import com.keybank.tfa.v1_11.service.operations.MaintainAppIdCIXResult;
import com.keybank.tfa.v1_11.service.operations.MaintainFIKey;
import com.keybank.tfa.v1_11.service.operations.MaintainFIKeyResult;
import com.keybank.tfa.v1_11.service.operations.MaintainPIN;
import com.keybank.tfa.v1_11.service.operations.MaintainPINResult;
import com.keybank.tfa.v1_11.service.operations.MaintainUserPartyId;
import com.keybank.tfa.v1_11.service.operations.MaintainUserPartyIdResult;
import com.keybank.tfa.v1_11.service.operations.MobileDeviceRegistration;
import com.keybank.tfa.v1_11.service.operations.MobileDeviceRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.MobileEnrollment;
import com.keybank.tfa.v1_11.service.operations.MobileEnrollmentResult;
import com.keybank.tfa.v1_11.service.operations.MobileLoginMulti;
import com.keybank.tfa.v1_11.service.operations.MobileLoginMultiResult;
import com.keybank.tfa.v1_11.service.operations.MobileMultiLogin;
import com.keybank.tfa.v1_11.service.operations.MobileMultiLoginResult;
import com.keybank.tfa.v1_11.service.operations.MobileRegistration;
import com.keybank.tfa.v1_11.service.operations.MobileRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.MobileUnregistration;
import com.keybank.tfa.v1_11.service.operations.MobileUnregistrationResult;
import com.keybank.tfa.v1_11.service.operations.PasswordExpiration;
import com.keybank.tfa.v1_11.service.operations.PasswordExpirationResult;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyCall;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyCallResult;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyPoll;
import com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyPollResult;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyCall;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyCallResult;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyPoll;
import com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyPollResult;
import com.keybank.tfa.v1_11.service.operations.PhoneNumber;
import com.keybank.tfa.v1_11.service.operations.PhoneNumberResult;
import com.keybank.tfa.v1_11.service.operations.PhoneNumberUpdate;
import com.keybank.tfa.v1_11.service.operations.PhoneNumberUpdateResult;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordCall;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordCallResult;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordPoll;
import com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordPollResult;
import com.keybank.tfa.v1_11.service.operations.ResetPassword;
import com.keybank.tfa.v1_11.service.operations.ResetPasswordResult;
import com.keybank.tfa.v1_11.service.operations.ResetServiceCounter;
import com.keybank.tfa.v1_11.service.operations.ResetServiceCounterResult;
import com.keybank.tfa.v1_11.service.operations.SearchByName;
import com.keybank.tfa.v1_11.service.operations.SearchByNameResult;
import com.keybank.tfa.v1_11.service.operations.SearchGroups;
import com.keybank.tfa.v1_11.service.operations.SearchGroupsResult;
import com.keybank.tfa.v1_11.service.operations.SearchUsers;
import com.keybank.tfa.v1_11.service.operations.SearchUsersResult;
import com.keybank.tfa.v1_11.service.operations.SecurityQuestions;
import com.keybank.tfa.v1_11.service.operations.SecurityQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.SelfRegistration;
import com.keybank.tfa.v1_11.service.operations.SelfRegistrationResult;
import com.keybank.tfa.v1_11.service.operations.SendTempPINByEmail;
import com.keybank.tfa.v1_11.service.operations.SendTempPINByEmailResult;
import com.keybank.tfa.v1_11.service.operations.StepUp;
import com.keybank.tfa.v1_11.service.operations.StepUpUpdate;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyCall;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyCallResult;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyPoll;
import com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyPollResult;
import com.keybank.tfa.v1_11.service.operations.TokenShipDate;
import com.keybank.tfa.v1_11.service.operations.TokenShipDateUpdate;
import com.keybank.tfa.v1_11.service.operations.UserAnswers;
import com.keybank.tfa.v1_11.service.operations.UserAnswersResult;
import com.keybank.tfa.v1_11.service.operations.UserDetailStatus;
import com.keybank.tfa.v1_11.service.operations.UserDetailStatusResult;
import com.keybank.tfa.v1_11.service.operations.UserGroups;
import com.keybank.tfa.v1_11.service.operations.UserGroupsResult;
import com.keybank.tfa.v1_11.service.operations.UserMaintenance;
import com.keybank.tfa.v1_11.service.operations.UserMaintenanceResult;
import com.keybank.tfa.v1_11.service.operations.UserPIN;
import com.keybank.tfa.v1_11.service.operations.UserPINResult;
import com.keybank.tfa.v1_11.service.operations.UserPartyId;
import com.keybank.tfa.v1_11.service.operations.UserPartyIdResult;
import com.keybank.tfa.v1_11.service.operations.UserQuestions;
import com.keybank.tfa.v1_11.service.operations.UserQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestions;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResetUser;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResetUserResult;
import com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.VerIDChallengeUser;
import com.keybank.tfa.v1_11.service.operations.VerIDChallengeUserResult;
import com.keybank.tfa.v1_11.service.operations.VerifyChallenge;
import com.keybank.tfa.v1_11.service.operations.VerifyChallengeResult;
import com.keybank.tfa.v1_11.service.operations.VerifyPIN;
import com.keybank.tfa.v1_11.service.operations.VerifyPINChallenge;
import com.keybank.tfa.v1_11.service.operations.VerifyPINChallengeResult;
import com.keybank.tfa.v1_11.service.operations.VerifyPINResult;
import com.keybank.tfa.v1_11.service.operations.VerifyQuestions;
import com.keybank.tfa.v1_11.service.operations.VerifyQuestionsResult;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPIN;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPINResetUser;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPINResetUserResult;
import com.keybank.tfa.v1_11.service.operations.VerifyTempPINResult;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TFAService", targetNamespace = "http://tfa.keybank.com/v1_11/service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.keybank.tfa.v1_11.service.objects.ObjectFactory.class,
    com.keybank.tfa.v1_11.service.objects.verid.ObjectFactory.class,
    com.keybank.tfa.v1_11.service.operations.ObjectFactory.class
})
public interface TFAService {


    /**
     * The Admin Registration operation allows an application administrator to create
     * a user ID and set a temporary password for it. After the ID is created, the
     * temporary password should be provided to the user and the Complete Registration
     * operation must be run by the user to finish the ID set up process.
     * 
     * @param adminRegistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AdminRegistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/adminRegistrationv1_11")
    @WebResult(name = "AdminRegistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AdminRegistrationResult")
    public AdminRegistrationResult adminRegistration(
        @WebParam(name = "AdminRegistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AdminRegistration")
        AdminRegistration adminRegistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Associate Groups operation allows an administrator to add their
     * applications groups to a user ID. Under some circumstances, users may be able
     * to add the Delegated Administrator or Super Delegated Administrator groups to
     * their own ID via this operation.
     * 
     * @param associateGroups
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AssociateGroupsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/associateGroupsv1_11")
    @WebResult(name = "AssociateGroupsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AssociateGroupsResult")
    public AssociateGroupsResult associateGroups(
        @WebParam(name = "AssociateGroups", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AssociateGroups")
        AssociateGroups associateGroups)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Associate GSO Resource operation allows an administrator to add a GSO
     * resource to a users ID. This is typically used to activate SSO via Citrix. This
     * operation should not be used by normal TFA consuming applications.
     * 
     * @param associateGSOResource
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AssociateGSOResourceResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/associateGSOResourcev1_11")
    @WebResult(name = "AssociateGSOResourceResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AssociateGSOResourceResult")
    public AssociateGSOResourceResult associateGSOResource(
        @WebParam(name = "AssociateGSOResource", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AssociateGSOResource")
        AssociateGSOResource associateGSOResource)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Authorize Aggregator operation allows a user to specify that they wish
     * to allow aggregation services (Mint.com, Yodlee, etc.) to be able to log in via
     * their user ID. When an aggregator first logs in with a users ID, a grace
     * date/time stamp is placed on the ID and set to 14 days in the future. If the
     * user does not perform the Authorize Aggregator operation before the timestamp
     * expires, the aggregator will be blocked from logging in via the users ID.
     * 
     * @param authorizeAggregator
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AuthorizeAggregatorResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/authorizeAggregatorv1_11")
    @WebResult(name = "AuthorizeAggregatorResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AuthorizeAggregatorResult")
    public AuthorizeAggregatorResult authorizeAggregator(
        @WebParam(name = "AuthorizeAggregator", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AuthorizeAggregator")
        AuthorizeAggregator authorizeAggregator)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Challenge User operation will fetch random challenge questions associated
     * with the users ID. The user selects these questions during the Self
     * Registration and Complete Registration operations.
     * 
     * @param challengeUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ChallengeUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/challengeUserv1_11")
    @WebResult(name = "ChallengeUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ChallengeUserResult")
    public ChallengeUserResult challengeUser(
        @WebParam(name = "ChallengeUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ChallengeUser")
        ChallengeUser challengeUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Change Username operation allows a user to change their user ID. Both IDs
     * must already be created. The old user ID will be deleted via this operation.
     * 
     * @param changeUsername
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ChangeUsernameResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/changeUsernamev1_11")
    @WebResult(name = "ChangeUsernameResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ChangeUsernameResult")
    public ChangeUsernameResult changeUsername(
        @WebParam(name = "ChangeUsername", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ChangeUsername")
        ChangeUsername changeUsername)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Complete Registration operation allows a user to finish setting up their
     * user ID after it has been created via the Admin Registration operation.
     * 
     * @param completeRegistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.CompleteRegistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/completeRegistrationv1_11")
    @WebResult(name = "CompleteRegistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "CompleteRegistrationResult")
    public CompleteRegistrationResult completeRegistration(
        @WebParam(name = "CompleteRegistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "CompleteRegistration")
        CompleteRegistration completeRegistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Delete User operation allows an administrator to delete a users ID. If the
     * users ID has access to multiple applications, this operation will instead
     * remove access to the application specified by the administrator and not delete
     * the users ID.
     * 
     * @param deleteUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.DeleteUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/deleteUserv1_11")
    @WebResult(name = "DeleteUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DeleteUserResult")
    public DeleteUserResult deleteUser(
        @WebParam(name = "DeleteUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DeleteUser")
        DeleteUser deleteUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Device Registration operation allows a user to register their device
     * forensics so that the device can be recognizes in the future for Login Multi
     * operation calls.
     * 
     * @param deviceRegistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.DeviceRegistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/deviceRegistrationv1_11")
    @WebResult(name = "DeviceRegistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DeviceRegistrationResult")
    public DeviceRegistrationResult deviceRegistration(
        @WebParam(name = "DeviceRegistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DeviceRegistration")
        DeviceRegistration deviceRegistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Device Unregistration operation allows a user or administrator to
     * unregister a users device via it's serial number. Applications should consider
     * not using this operation as device management is largely unnecessary, and only
     * complicates application workflows.
     * 
     * @param deviceUnregistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.DeviceUnregistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/deviceUnregistrationv1_11")
    @WebResult(name = "DeviceUnregistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DeviceUnregistrationResult")
    public DeviceUnregistrationResult deviceUnregistration(
        @WebParam(name = "DeviceUnregistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DeviceUnregistration")
        DeviceUnregistration deviceUnregistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Disable User operation allows an administrator to disable a users ID so
     * that the user cannot log in. If the user ID has access to multiple
     * applications, this operation will instead remove access to the application
     * specified by the administrator in the request and leave the user ID enabled.
     * 
     * @param disableUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.DisableUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/disableUserv1_11")
    @WebResult(name = "DisableUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DisableUserResult")
    public DisableUserResult disableUser(
        @WebParam(name = "DisableUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DisableUser")
        DisableUser disableUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Disassociate Groups operation allows a user or administrator to remove
     * groups from a users ID. Users may remove any groups they want from their ID.
     * Administrators may only remove groups for their own application. If all groups
     * are removed from the user ID, the ID will be disabled.
     * 
     * @param disassociateGroups
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.DisassociateGroupsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/disassociateGroupsv1_11")
    @WebResult(name = "DisassociateGroupsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DisassociateGroupsResult")
    public DisassociateGroupsResult disassociateGroups(
        @WebParam(name = "DisassociateGroups", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "DisassociateGroups")
        DisassociateGroups disassociateGroups)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Enable User operation allows an administrator to enable a users ID.
     * 
     * @param enableUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.EnableUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/enableUserv1_11")
    @WebResult(name = "EnableUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "EnableUserResult")
    public EnableUserResult enableUser(
        @WebParam(name = "EnableUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "EnableUser")
        EnableUser enableUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Fraud Alert operation allows a special administrator (tfaFraudInvestigator)
     * to place a lock on a users ID so that the ID can have no changes made to it and
     * the user cannot log in using the ID. This allows a fraud investigator to
     * investigate logs and transient forensics data while ensuring that no one can
     * use or make changes to the ID until investigation is complete.
     * 
     * @param fraudAlert
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.FraudAlertResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/fraudAlertv1_11")
    @WebResult(name = "FraudAlertResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "FraudAlertResult")
    public FraudAlertResult fraudAlert(
        @WebParam(name = "FraudAlert", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "FraudAlert")
        FraudAlert fraudAlert)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Get Admin Groups operation will fetch a list of application TLAs +
     * descriptions that a specific administrator has access to.
     * 
     * @param adminGroups
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AdminGroupsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getAdminGroupsv1_11")
    @WebResult(name = "AdminGroupsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AdminGroupsResult")
    public AdminGroupsResult getAdminGroups(
        @WebParam(name = "AdminGroups", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AdminGroups")
        AdminGroups adminGroups)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Get Aggregator Grace Date Time operation returns a user IDs current
     * aggregator grace timestamp.
     * 
     * @param aggregatorGraceDateTime
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AggregatorGraceDateTimeResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getAggregatorGraceDateTimev1_11")
    @WebResult(name = "AggregatorGraceDateTimeResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AggregatorGraceDateTimeResult")
    public AggregatorGraceDateTimeResult getAggregatorGraceDateTime(
        @WebParam(name = "AggregatorGraceDateTime", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AggregatorGraceDateTime")
        AggregatorGraceDateTime aggregatorGraceDateTime)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Get All User Groups operation returns various information concerning a
     * users ID. Data returned includes first name, last name, account state, password
     * state, GSOUser, group list, and fraud alert flag.
     * 
     * @param allUserGroups
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.AllUserGroupsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getAllUserGroupsv1_11")
    @WebResult(name = "AllUserGroupsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AllUserGroupsResult")
    public AllUserGroupsResult getAllUserGroups(
        @WebParam(name = "AllUserGroups", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "AllUserGroups")
        AllUserGroups allUserGroups)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Get Application Users operation allows a delegated administrator to get a
     * list of users that they have authority over given their CIX and delagated
     * administrator groups.
     * 
     * @param listApplicationUsers
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ListApplicationUsersResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getApplicationUsersv1_11")
    @WebResult(name = "ListApplicationUsersResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListApplicationUsersResult")
    public ListApplicationUsersResult getApplicationUsers(
        @WebParam(name = "ListApplicationUsers", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListApplicationUsers")
        ListApplicationUsers listApplicationUsers)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Get Devices operation allows a user or administrator to get a list of the
     * current devices registered for the users ID. Applications should consider not
     * using this operation as device management is largely unnecessary, and only
     * complicates application workflows.
     * 
     * @param listDevices
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ListDevicesResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getDevicesv1_11")
    @WebResult(name = "ListDevicesResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListDevicesResult")
    public ListDevicesResult getDevices(
        @WebParam(name = "ListDevices", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListDevices")
        ListDevices listDevices)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow an administrator to get a list of users contained in a TAM group. The
     * list size may be limited by TAM. This operation causes heavy load on TAM, use
     * it sparingly.
     * 
     * @param listGroupUsers
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ListGroupUsersResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getGroupUsersv1_11")
    @WebResult(name = "ListGroupUsersResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListGroupUsersResult")
    public ListGroupUsersResult getGroupUsers(
        @WebParam(name = "ListGroupUsers", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListGroupUsers")
        ListGroupUsers listGroupUsers)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get the most recent date and time that a user, or list of users, has activity
     * logged in the TFA database.
     * 
     * @param lastActivityDate
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.LastActivityDateResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getLastActivityDatev1_11")
    @WebResult(name = "LastActivityDateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "LastActivityDateResult")
    public LastActivityDateResult getLastActivityDate(
        @WebParam(name = "LastActivityDate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "LastActivityDate")
        LastActivityDate lastActivityDate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get a users password expiration date.
     * 
     * @param passwordExpiration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PasswordExpirationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getPasswordExpirationv1_11")
    @WebResult(name = "PasswordExpirationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PasswordExpirationResult")
    public PasswordExpirationResult getPasswordExpiration(
        @WebParam(name = "PasswordExpiration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PasswordExpiration")
        PasswordExpiration passwordExpiration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get a list of the currently active security questions. This operation is meant
     * to be used when prompting the user to select which security questions they want.
     * 
     * @param securityQuestions
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.SecurityQuestionsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getSecurityQuestionsv1_11")
    @WebResult(name = "SecurityQuestionsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SecurityQuestionsResult")
    public SecurityQuestionsResult getSecurityQuestions(
        @WebParam(name = "SecurityQuestions", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SecurityQuestions")
        SecurityQuestions securityQuestions)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get general information concerning a users account. Applications should
     * consider using GetAllUserGroups instead, as this operation is largely
     * deprecated.
     * 
     * @param listUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ListUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserv1_11")
    @WebResult(name = "ListUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListUserResult")
    public ListUserResult getUser(
        @WebParam(name = "ListUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ListUser")
        ListUser listUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allows an administrator to retrieve the answers to the users challenge
     * questions. Use this operation with caution as having the users answers will
     * allow the administrator to reset the users password via most "forgot password"
     * workflows.
     * 
     * @param userAnswers
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserAnswersResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserAnswersv1_11")
    @WebResult(name = "UserAnswersResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserAnswersResult")
    public UserAnswersResult getUserAnswers(
        @WebParam(name = "UserAnswers", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserAnswers")
        UserAnswers userAnswers)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get detailed information concerning a users account. This operation is
     * similar to GetAllUserGroups, but does not return the users groups as fetching
     * groups is a time intensive operation. In place of groups, more detailed account
     * information is returned. Data returned includes first name, last name, account
     * state, password state, fraud alert flag, registration complete flag, password
     * expiration date, password last changed date, last login date, aggregator grace
     * period date (if set), login grace period date (if set), user questions list,
     * user devices list, and service counters list.
     * 
     * @param userDetailStatus
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserDetailStatusResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserDetailStatusv1_11")
    @WebResult(name = "UserDetailStatusResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserDetailStatusResult")
    public UserDetailStatusResult getUserDetailStatus(
        @WebParam(name = "UserDetailStatus", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserDetailStatus")
        UserDetailStatus userDetailStatus)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get a list of TLAs the users account has access to, plus general account
     * information. Applications should consider using GetAllUserGroups instead, as
     * this operation is largely deprecated.
     * 
     * @param userGroups
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserGroupsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserGroupsv1_11")
    @WebResult(name = "UserGroupsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserGroupsResult")
    public UserGroupsResult getUserGroups(
        @WebParam(name = "UserGroups", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserGroups")
        UserGroups userGroups)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get a users PIN if it is set on their account. PIN is essentially equivalent
     * to challenge questions for the user. This operation was meant for use by KTT,
     * other applications should not use this operation. This operation is deprecated
     * and should not be used going forward.
     * 
     * @param userPIN
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserPINResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserPINv1_11")
    @WebResult(name = "UserPINResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserPINResult")
    public UserPINResult getUserPIN(
        @WebParam(name = "UserPIN", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserPIN")
        UserPIN userPIN)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get a list of all security questions in the system. All security questions
     * will be returned with flags to indicate if the question is active in the
     * system, and if the user has selected that questions as one of their security
     * questions. Questions can be inactive in the system but still be selected and
     * usable by a user, this allows questions to be retired without the need to go
     * back and remove them from users ID's. This operation can be used to determine
     * if any questions on the users ID are retired and as such the user should select
     * new questions.
     * 
     * @param userQuestions
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserQuestionsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserQuestionsv1_11")
    @WebResult(name = "UserQuestionsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserQuestionsResult")
    public UserQuestionsResult getUserQuestions(
        @WebParam(name = "UserQuestions", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserQuestions")
        UserQuestions userQuestions)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Verify a user's ID, password, and forensics data. Forensics data is registered
     * using the Device Registration operation. Invalid logins are tracked by a
     * counter, and if 5 invalid logins are performed in a row the users ID will be
     * locked.
     * 
     * @param loginMulti
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.LoginMultiResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/loginMultiv1_11")
    @WebResult(name = "LoginMultiResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "LoginMultiResult")
    public LoginMultiResult loginMulti(
        @WebParam(name = "LoginMulti", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "LoginMulti")
        LoginMulti loginMulti)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Verify a user's ID and password. Invalid logins are tracked by a counter, and if
     *  5 invalid logins are performed in a row the users ID will be locked.
     * 
     * @param loginSingle
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.LoginSingleResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/loginSinglev1_11")
    @WebResult(name = "LoginSingleResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "LoginSingleResult")
    public LoginSingleResult loginSingle(
        @WebParam(name = "LoginSingle", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "LoginSingle")
        LoginSingle loginSingle)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allows an internal administrator to update or remove a user's App ID and/or CIX
     * values. The App ID and CIX values are used to give delegated administrators
     * authority over a user's ID. Both the delegated administrator and the user the
     * operation is being run against must have the same App ID and/or CIX values on
     * their IDs.
     * 
     * @param maintainAppIdCIX
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MaintainAppIdCIXResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/maintainAppIdCIXv1_11")
    @WebResult(name = "MaintainAppIdCIXResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainAppIdCIXResult")
    public MaintainAppIdCIXResult maintainAppIdCIX(
        @WebParam(name = "MaintainAppIdCIX", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainAppIdCIX")
        MaintainAppIdCIX maintainAppIdCIX)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Update or remove a users federated identity key. This key is used for
     * integration with IB2 and KBO's bill pay vendor service. Applications other than
     * IB2 and KBO should NOT use this service.
     * 
     * @param maintainFIKey
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MaintainFIKeyResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/maintainFIKeyv1_11")
    @WebResult(name = "MaintainFIKeyResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainFIKeyResult")
    public MaintainFIKeyResult maintainFIKey(
        @WebParam(name = "MaintainFIKey", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainFIKey")
        MaintainFIKey maintainFIKey)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Update a users PIN value. PIN is equivalent to users challenge questions
     * and if used only by KTT. This operation is deprecated and should not be used
     * going forward.
     * 
     * @param maintainPIN
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MaintainPINResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/maintainPINv1_11")
    @WebResult(name = "MaintainPINResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainPINResult")
    public MaintainPINResult maintainPIN(
        @WebParam(name = "MaintainPIN", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainPIN")
        MaintainPIN maintainPIN)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Register a mobile device for the user. This is a special device registration
     * 								operation meant to satisfy the limited forensics data available to the MBL
     * 								application. Devices registered with this operation are only usable with the
     * 								Mobile Login Multi operation. Applications other than MBL should not use this
     * 								operation.
     * 			
     * 
     * @param mobileDeviceRegistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MobileDeviceRegistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/mobileDeviceRegistrationv1_11")
    @WebResult(name = "MobileDeviceRegistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileDeviceRegistrationResult")
    public MobileDeviceRegistrationResult mobileDeviceRegistration(
        @WebParam(name = "MobileDeviceRegistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileDeviceRegistration")
        MobileDeviceRegistration mobileDeviceRegistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Verify a users ID, password, and mobile device forensics data. This operation
     * is meant to satisfy the limited forensics data available to the MBL
     * application.
     * 
     * @param mobileLoginMulti
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MobileLoginMultiResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/mobileLoginMultiv1_11")
    @WebResult(name = "MobileLoginMultiResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileLoginMultiResult")
    public MobileLoginMultiResult mobileLoginMulti(
        @WebParam(name = "MobileLoginMulti", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileLoginMulti")
        MobileLoginMulti mobileLoginMulti)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Phone Reset Password Call operation contacts the user via their phone
     * (either a call or an SMS) and delivers a PIN or requests a PIN you will
     * deliver to the user. After calling this operation the Phone Reset Password Poll
     * operation should be used to check the status of the users phone call and
     * optionally verify the PIN that the user enters in to your application (if you
     * choose to deliver the PIN via phone as opposed to entering the PIN in to the
     * phone). The actual reset of the users password is performed by the Phone Reset
     * Password Poll operation when the PIN is successfully verified.
     * 
     * @param phoneResetPasswordCall
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordCallResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/phoneResetPasswordCallv1_11")
    @WebResult(name = "PhoneResetPasswordCallResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneResetPasswordCallResult")
    public PhoneResetPasswordCallResult phoneResetPasswordCall(
        @WebParam(name = "PhoneResetPasswordCall", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneResetPasswordCall")
        PhoneResetPasswordCall phoneResetPasswordCall)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Phone Reset Password Poll operation checks the status of the users phone
     * call or SMS and resets the user password once the PIN is successfully verified.
     * The PIN can either be delivered via the users phone or entered in to the phone,
     * both are done via the Phone Reset Password Call operation. If the PIN is
     * delivered via the phone, you must pass both the PIN and new password in to this
     * operation. If the PIN is entered in to the phone, you must pass the new
     * password in to this operation and call this operation repeatedly until the user
     * enters the PIN in to their phone (a specific flag will be returned when this
     * occurs). For performance/load reasons, do not call this operation more than
     * once every 5 seconds, calls more often than this will be denied outright.
     * 
     * @param phoneResetPasswordPoll
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneResetPasswordPollResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/phoneResetPasswordPollv1_11")
    @WebResult(name = "PhoneResetPasswordPollResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneResetPasswordPollResult")
    public PhoneResetPasswordPollResult phoneResetPasswordPoll(
        @WebParam(name = "PhoneResetPasswordPoll", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneResetPasswordPoll")
        PhoneResetPasswordPoll phoneResetPasswordPoll)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Test Phone Code Verify Call operation contacts the user via their phone
     * (either a call or an SMS) and delivers a PIN or requests a PIN you will
     * deliver to the user for testing. After calling this operation the Phone Code Verify Poll
     * operation should be used to check the status of the users phone call and
     * optionally verify the PIN that the user enters in to your application (if you
     * choose to deliver the PIN via phone as opposed to entering the PIN in to the
     * phone).
     * 
     * @param testPhoneCodeVerifyCall
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyCallResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/testPhoneCodeVerifyCallv1_11")
    @WebResult(name = "TestPhoneCodeVerifyCallResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TestPhoneCodeVerifyCallResult")
    public TestPhoneCodeVerifyCallResult testPhoneCodeVerifyCall(
        @WebParam(name = "TestPhoneCodeVerifyCall", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TestPhoneCodeVerifyCall")
        TestPhoneCodeVerifyCall testPhoneCodeVerifyCall)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Phone Code Verify Call operation contacts the user via their phone
     * (either a call or an SMS) and delivers a PIN or requests a PIN you will
     * deliver to the user. After calling this operation the Phone Code Verify Poll
     * operation should be used to check the status of the users phone call and
     * optionally verify the PIN that the user enters in to your application (if you
     * choose to deliver the PIN via phone as opposed to entering the PIN in to the
     * phone).
     * 
     * @param phoneCodeVerifyCall
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyCallResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/phoneCodeVerifyCallv1_11")
    @WebResult(name = "PhoneCodeVerifyCallResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneCodeVerifyCallResult")
    public PhoneCodeVerifyCallResult phoneCodeVerifyCall(
        @WebParam(name = "PhoneCodeVerifyCall", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneCodeVerifyCall")
        PhoneCodeVerifyCall phoneCodeVerifyCall)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Test Phone Code Verify Poll operation checks the status of the users phone call
     * or SMS and returns a confirmation if the PIN is successfully verified for testing. The PIN
     * can either be delivered via the users phone or entered in to the phone, both
     * via the Phone Code Verify Call operation. If the PIN is delivered via the
     * phone, you must pass the PIN in to this operation. If the PIN is entered in to
     * the phone, you must pass the call this operation repeatedly until the user
     * enters the PIN in to their phone (a specific flag will be returned when this
     * occurs). For performance/load reasons, do not call this operation more than
     * once every 5 seconds, calls more often than this will be denied outright. This
     * operation will only verify the PIN, it does not perform any function on the
     * users ID.
     * 
     * @param testPhoneCodeVerifyPoll
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.TestPhoneCodeVerifyPollResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/testPhoneCodeVerifyPollv1_11")
    @WebResult(name = "TestPhoneCodeVerifyPollResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TestPhoneCodeVerifyPollResult")
    public TestPhoneCodeVerifyPollResult testPhoneCodeVerifyPoll(
        @WebParam(name = "TestPhoneCodeVerifyPoll", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TestPhoneCodeVerifyPoll")
        TestPhoneCodeVerifyPoll testPhoneCodeVerifyPoll)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Phone Code Verify Poll operation checks the status of the users phone call
     * or SMS and returns a confirmation if the PIN is successfully verified. The PIN
     * can either be delivered via the users phone or entered in to the phone, both
     * via the Phone Code Verify Call operation. If the PIN is delivered via the
     * phone, you must pass the PIN in to this operation. If the PIN is entered in to
     * the phone, you must pass the call this operation repeatedly until the user
     * enters the PIN in to their phone (a specific flag will be returned when this
     * occurs). For performance/load reasons, do not call this operation more than
     * once every 5 seconds, calls more often than this will be denied outright. This
     * operation will only verify the PIN, it does not perform any function on the
     * users ID.
     * 
     * @param phoneCodeVerifyPoll
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneCodeVerifyPollResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/phoneCodeVerifyPollv1_11")
    @WebResult(name = "PhoneCodeVerifyPollResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneCodeVerifyPollResult")
    public PhoneCodeVerifyPollResult phoneCodeVerifyPoll(
        @WebParam(name = "PhoneCodeVerifyPoll", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneCodeVerifyPoll")
        PhoneCodeVerifyPoll phoneCodeVerifyPoll)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Phone Funds Verify Call operation contacts the user via their phone, speaks
     * information about a pending funds transfer (for the user to verify), and
     * requests that the user enter a PIN to confirm the transaction. After calling
     * this operation the Phone Funds Verify Poll operation should be used to check
     * the status of the users phone call and verify the PIN that the user enters in
     * to the phone. The PIN is returned by this operation for you to display to the
     * user.
     * 
     * @param phoneFundsVerifyCall
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyCallResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/phoneFundsVerifyCallv1_11")
    @WebResult(name = "PhoneFundsVerifyCallResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneFundsVerifyCallResult")
    public PhoneFundsVerifyCallResult phoneFundsVerifyCall(
        @WebParam(name = "PhoneFundsVerifyCall", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneFundsVerifyCall")
        PhoneFundsVerifyCall phoneFundsVerifyCall)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Phone Funds Verify Poll operation checks the status of the users phone call
     * and returns a confirmation if the PIN is successfully verified. The PIN is
     * displayed to the user by your application. For performance/load reasons, do not
     * call this operation more than once every 5 seconds, calls more often than this
     * will be denied outright.
     * 
     * @param phoneFundsVerifyPoll
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneFundsVerifyPollResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/phoneFundsVerifyPollv1_11")
    @WebResult(name = "PhoneFundsVerifyPollResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneFundsVerifyPollResult")
    public PhoneFundsVerifyPollResult phoneFundsVerifyPoll(
        @WebParam(name = "PhoneFundsVerifyPoll", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneFundsVerifyPoll")
        PhoneFundsVerifyPoll phoneFundsVerifyPoll)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gemaltoReport
     * @return
     *     returns java.lang.String
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getGemaltoReportv1_11")
    @WebResult(name = "GemaltoReportResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "getGemaltoReportResult")
    public String getGemaltoReport(
        @WebParam(name = "GemaltoReport", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoReport")
        GemaltoReport gemaltoReport)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param tokenShipDate
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.LDAPAttrDateTimeResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getTokenShipDatev1_11")
    @WebResult(name = "TokenShipDateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TokenShipDateResult")
    public LDAPAttrDateTimeResult getTokenShipDate(
        @WebParam(name = "TokenShipDate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TokenShipDate")
        TokenShipDate tokenShipDate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param tokenShipDateUpdate
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.BaseResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setTokenShipDatev1_11")
    @WebResult(name = "TokenShipDateUpdateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TokenShipDateUpdateResult")
    public BaseResult setTokenShipDate(
        @WebParam(name = "TokenShipDateUpdate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "TokenShipDateUpdate")
        TokenShipDateUpdate tokenShipDateUpdate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gemaltoInformation
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.GemaltoInformationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getGemaltoInformationv1_11")
    @WebResult(name = "GemaltoInformationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoInformationResult")
    public GemaltoInformationResult getGemaltoInformation(
        @WebParam(name = "GemaltoInformation", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoInformation")
        GemaltoInformation gemaltoInformation)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gemaltoInformationUpdate
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.BaseResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setGemaltoInformationv1_11")
    @WebResult(name = "GemaltoInformationUpdateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoInformationUpdateResult")
    public BaseResult setGemaltoInformation(
        @WebParam(name = "GemaltoInformationUpdate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoInformationUpdate")
        GemaltoInformationUpdate gemaltoInformationUpdate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param stepUp
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.LDAPAttrStringResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getStepUpv1_11")
    @WebResult(name = "StepUpResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "StepUpResult")
    public LDAPAttrStringResult getStepUp(
        @WebParam(name = "StepUp", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "StepUp")
        StepUp stepUp)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param stepUpUpdate
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.BaseResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setStepUpv1_11")
    @WebResult(name = "StepUpUpdateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "StepUpUpdateResult")
    public BaseResult setStepUp(
        @WebParam(name = "StepUpUpdate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "StepUpUpdate")
        StepUpUpdate stepUpUpdate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gouid
     * @return
     *     returns java.lang.String
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getGOUIDv1_11")
    @WebResult(name = "GOUIDResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GOUIDResult")
    public String getGOUID(
        @WebParam(name = "GOUID", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GOUID")
        GOUID gouid)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gouidUpdate
     * @return
     *     returns boolean
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setGOUIDv1_11")
    @WebResult(name = "GOUIDUpdateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GOUIDUpdateResult")
    public boolean setGOUID(
        @WebParam(name = "GOUIDUpdate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GOUIDUpdate")
        GOUIDUpdate gouidUpdate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gemaltoFlag
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.LDAPAttrBooleanResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getGemaltoFlagv1_11")
    @WebResult(name = "GemaltoFlagResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoFlagResult")
    public LDAPAttrBooleanResult getGemaltoFlag(
        @WebParam(name = "GemaltoFlag", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoFlag")
        GemaltoFlag gemaltoFlag)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     * @param gemaltoFlagUpdate
     * @return
     *     returns com.keybank.tfa.v1_11.service.objects.BaseResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setGemaltoFlagv1_11")
    @WebResult(name = "GemaltoFlagUpdateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoFlagUpdateResult")
    public BaseResult setGemaltoFlag(
        @WebParam(name = "GemaltoFlagUpdate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GemaltoFlagUpdate")
        GemaltoFlagUpdate gemaltoFlagUpdate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Get Phone Numbers operation retrieves all the phone numbers and their
     * aliases associated with the users ID. These phone numbers are meant to be used
     * for authentication purposes ONLY and are not to be used for CSR's or other
     * personnel to contact and speak with the user.
     * 
     * @param phoneNumber
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneNumberResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getPhoneNumbersv1_11")
    @WebResult(name = "PhoneNumberResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneNumberResult")
    public PhoneNumberResult getPhoneNumbers(
        @WebParam(name = "PhoneNumber", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneNumber")
        PhoneNumber phoneNumber)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Set Phone Numbers operation allows a user or admin to update the phone
     * numbers and their aliases associated with a users ID. All existing phone
     * numbers on the users ID are removed and the numbers passed in to this operation
     * are used to replace them.
     * 
     * @param phoneNumberUpdate
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.PhoneNumberUpdateResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setPhoneNumbersv1_11")
    @WebResult(name = "PhoneNumberUpdateResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneNumberUpdateResult")
    public PhoneNumberUpdateResult setPhoneNumbers(
        @WebParam(name = "PhoneNumberUpdate", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "PhoneNumberUpdate")
        PhoneNumberUpdate phoneNumberUpdate)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow an administrator (or dual administrators) to reset a users password and
     * set the users account and password state.
     * 
     * @param resetPassword
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ResetPasswordResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/resetPasswordv1_11")
    @WebResult(name = "ResetPasswordResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ResetPasswordResult")
    public ResetPasswordResult resetPassword(
        @WebParam(name = "ResetPassword", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ResetPassword")
        ResetPassword resetPassword)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow an administrator (or dual administrators) to reset one or all of a users
     * counters.
     * 
     * @param resetServiceCounter
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.ResetServiceCounterResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/resetServiceCounterv1_11")
    @WebResult(name = "ResetServiceCounterResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ResetServiceCounterResult")
    public ResetServiceCounterResult resetServiceCounter(
        @WebParam(name = "ResetServiceCounter", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "ResetServiceCounter")
        ResetServiceCounter resetServiceCounter)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow an administrator to search for a user ID based on the users first and/or
     * last name. This operation causes heavy load on TAM, use it sparingly.
     * 
     * @param searchByName
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.SearchByNameResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/searchByNamev1_11")
    @WebResult(name = "SearchByNameResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SearchByNameResult")
    public SearchByNameResult searchByName(
        @WebParam(name = "SearchByName", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SearchByName")
        SearchByName searchByName)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow an administrator to search for the name of a TAM group (based on a portion
     * of the name.) For example, "tfa" would return "tfa, tfaAdministrator, tfaUser,
     * ...". This operation causes heavy load on TAM, use it sparingly.
     * 
     * @param searchGroups
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.SearchGroupsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/searchGroupsv1_11")
    @WebResult(name = "SearchGroupsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SearchGroupsResult")
    public SearchGroupsResult searchGroups(
        @WebParam(name = "SearchGroups", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SearchGroups")
        SearchGroups searchGroups)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow an administrator to search for a user ID (based on a portion of the ID) For
     * example, "smi" would return "smithers1234, smith919, smite949, ...". This
     * operation causes heavy load on TAM, use it sparingly.
     * 
     * @param searchUsers
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.SearchUsersResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/searchUsersv1_11")
    @WebResult(name = "SearchUsersResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SearchUsersResult")
    public SearchUsersResult searchUsers(
        @WebParam(name = "SearchUsers", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SearchUsers")
        SearchUsers searchUsers)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Create a new user ID. This operation is meant for situations where the user
     * is creating their own ID (as opposed to an administrator creating the ID.)
     * 
     * @param selfRegistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.SelfRegistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/selfRegistrationv1_11")
    @WebResult(name = "SelfRegistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SelfRegistrationResult")
    public SelfRegistrationResult selfRegistration(
        @WebParam(name = "SelfRegistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SelfRegistration")
        SelfRegistration selfRegistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Send the user a temporary PIN via email which can then be verified by calling
     * the Verify Temp PIN operation.
     * 
     * @param sendTempPINByEmail
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.SendTempPINByEmailResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/sendTempPINByEmailv1_11")
    @WebResult(name = "SendTempPINByEmailResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SendTempPINByEmailResult")
    public SendTempPINByEmailResult sendTempPINByEmail(
        @WebParam(name = "SendTempPINByEmail", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "SendTempPINByEmail")
        SendTempPINByEmail sendTempPINByEmail)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Set the login grace period for a user. This grace period allows the user to
     * bypass the forensics check for the Login Multi operation a single time.
     * 
     * @param gracePeriod
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.GracePeriodResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/setGracePeriodv1_11")
    @WebResult(name = "GracePeriodResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GracePeriodResult")
    public GracePeriodResult setGracePeriod(
        @WebParam(name = "GracePeriod", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "GracePeriod")
        GracePeriod gracePeriod)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Allow the user to update their password and/or challenge questions.
     * 
     * @param userMaintenance
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserMaintenanceResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/userMaintenancev1_11")
    @WebResult(name = "UserMaintenanceResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserMaintenanceResult")
    public UserMaintenanceResult userMaintenance(
        @WebParam(name = "UserMaintenance", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserMaintenance")
        UserMaintenance userMaintenance)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Authenticate a user by answering a set of questions returned by the VerID
     * Challenge User operation.
     * 
     * @param verIDAnswerQuestions
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verIDAnswerQuestionsv1_11")
    @WebResult(name = "VerIDAnswerQuestionsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerIDAnswerQuestionsResult")
    public VerIDAnswerQuestionsResult verIDAnswerQuestions(
        @WebParam(name = "VerIDAnswerQuestions", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerIDAnswerQuestions")
        VerIDAnswerQuestions verIDAnswerQuestions)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Enable the users account and (optionally) reset their password by answering
     * a set of questions returned by the VerID Challenge User operation.
     * 
     * @param verIDAnswerQuestionsResetUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerIDAnswerQuestionsResetUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verIDAnswerQuestionsResetUserv1_11")
    @WebResult(name = "VerIDAnswerQuestionsResetUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerIDAnswerQuestionsResetUserResult")
    public VerIDAnswerQuestionsResetUserResult verIDAnswerQuestionsResetUser(
        @WebParam(name = "VerIDAnswerQuestionsResetUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerIDAnswerQuestionsResetUser")
        VerIDAnswerQuestionsResetUser verIDAnswerQuestionsResetUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Get a set of public records challenge questions for a user to answer.
     * 
     * @param verIDChallengeUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerIDChallengeUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verIDChallengeUserv1_11")
    @WebResult(name = "VerIDChallengeUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerIDChallengeUserResult")
    public VerIDChallengeUserResult verIDChallengeUser(
        @WebParam(name = "VerIDChallengeUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerIDChallengeUser")
        VerIDChallengeUser verIDChallengeUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Reset a users password by answering one (or more) of their challenge questions.
     * Challenge questions for this operation are returned by the Challenge User
     * operation.
     * 
     * @param verifyChallenge
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerifyChallengeResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verifyChallengev1_11")
    @WebResult(name = "VerifyChallengeResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyChallengeResult")
    public VerifyChallengeResult verifyChallenge(
        @WebParam(name = "VerifyChallenge", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyChallenge")
        VerifyChallenge verifyChallenge)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Authenticate a user by verifying their PIN (this is not their ATM PIN.) The KTT
     * application uses PIN instead of challenge question, other applications should
     * not use this operation. This operation is deprecated and should not be used
     * going forward.
     * 
     * @param verifyPIN
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerifyPINResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verifyPINv1_11")
    @WebResult(name = "VerifyPINResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyPINResult")
    public VerifyPINResult verifyPIN(
        @WebParam(name = "VerifyPIN", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyPIN")
        VerifyPIN verifyPIN)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Reset a users password by validating their PIN (this is not their ATM PIN.) The
     * KTT application uses PIN instead of challenge question, other applications
     * should not use this operation. This operation is deprecated and should not be
     * used going forward.
     * 
     * @param verifyPINChallenge
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerifyPINChallengeResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verifyPINChallengev1_11")
    @WebResult(name = "VerifyPINChallengeResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyPINChallengeResult")
    public VerifyPINChallengeResult verifyPINChallenge(
        @WebParam(name = "VerifyPINChallenge", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyPINChallenge")
        VerifyPINChallenge verifyPINChallenge)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Authenticate a user by verifying the answer to (one or more) of their challenge
     * questions.
     * 
     * @param verifyQuestions
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerifyQuestionsResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verifyQuestionsv1_11")
    @WebResult(name = "VerifyQuestionsResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyQuestionsResult")
    public VerifyQuestionsResult verifyQuestions(
        @WebParam(name = "VerifyQuestions", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyQuestions")
        VerifyQuestions verifyQuestions)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Authenticate a user by verifying a temporary PIN sent to them via the Send Temp
     * PIN By Email operation.
     * 
     * @param verifyTempPIN
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerifyTempPINResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verifyTempPINv1_11")
    @WebResult(name = "VerifyTempPINResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyTempPINResult")
    public VerifyTempPINResult verifyTempPIN(
        @WebParam(name = "VerifyTempPIN", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyTempPIN")
        VerifyTempPIN verifyTempPIN)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Reset a users password by validating a temporary PIN send to them via the Send
     * Temp PIN By Email operation.
     * 
     * @param verifyTempPINResetUser
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.VerifyTempPINResetUserResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/verifyTempPINResetUserv1_11")
    @WebResult(name = "VerifyTempPINResetUserResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyTempPINResetUserResult")
    public VerifyTempPINResetUserResult verifyTempPINResetUser(
        @WebParam(name = "VerifyTempPINResetUser", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "VerifyTempPINResetUser")
        VerifyTempPINResetUser verifyTempPINResetUser)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Returns users party Id from ldap
     * 
     * @param userPartyId
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.UserPartyIdResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/getUserPartyIdv1_11")
    @WebResult(name = "UserPartyIdResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserPartyIdResult")
    public UserPartyIdResult getUserPartyId(
        @WebParam(name = "UserPartyId", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "UserPartyId")
        UserPartyId userPartyId)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * Update a users PartyId value.
     * 
     * @param maintainUserPartyId
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MaintainUserPartyIdResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/maintainUserPartyIdv1_11")
    @WebResult(name = "MaintainUserPartyIdResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainUserPartyIdResult")
    public MaintainUserPartyIdResult maintainUserPartyId(
        @WebParam(name = "MaintainUserPartyId", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MaintainUserPartyId")
        MaintainUserPartyId maintainUserPartyId)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     *             	Register a mobile device for the user. This is a special device registration
     * 				operation meant to satisfy the new mobile application. Devices registered with this operation are only usable with the
     * 				NEW Mobile Login Multi operation. MBL should not use this operation.
     * 			
     * 
     * @param mobileRegistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MobileRegistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/mobileRegistrationv1_11")
    @WebResult(name = "MobileRegistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileRegistrationResult")
    public MobileRegistrationResult mobileRegistration(
        @WebParam(name = "MobileRegistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileRegistration")
        MobileRegistration mobileRegistration)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     *             	Enroll a mobile user for specific functionality
     * 			
     * 
     * @param mobileEnrollment
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MobileEnrollmentResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/mobileEnrollmentv1_11")
    @WebResult(name = "MobileEnrollmentResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileEnrollmentResult")
    public MobileEnrollmentResult mobileEnrollment(
        @WebParam(name = "MobileEnrollment", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileEnrollment")
        MobileEnrollment mobileEnrollment)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * 
     *             	New Mobile Multi Login
     * 			
     * 
     * @param mobileMultiLogin
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MobileMultiLoginResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/mobileMultiLoginv1_11")
    @WebResult(name = "MobileMultiLoginResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileMultiLoginResult")
    public MobileMultiLoginResult mobileMultiLogin(
        @WebParam(name = "MobileMultiLogin", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileMultiLogin")
        MobileMultiLogin mobileMultiLogin)
        throws OperationFaultException, SystemFaultException
    ;

    /**
     * The Mobile Unregistration operation allows a user or administrator to
     * 				unregister a users device via it's Mobile Token. Applications should consider
     * 				not using this operation as device management is largely unnecessary, and only
     * 				complicates application workflows.
     * 			
     * 
     * @param mobileUnregistration
     * @return
     *     returns com.keybank.tfa.v1_11.service.operations.MobileUnregistrationResult
     * @throws SystemFaultException
     * @throws OperationFaultException
     */
    @WebMethod(action = "http://tfa.keybank.com/v1_11/service/operations/mobileUnregistrationv1_11")
    @WebResult(name = "MobileUnregistrationResult", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileUnregistrationResult")
    public MobileUnregistrationResult mobileUnregistration(
        @WebParam(name = "MobileUnregistration", targetNamespace = "http://tfa.keybank.com/v1_11/service/operations", partName = "MobileUnregistration")
        MobileUnregistration mobileUnregistration)
        throws OperationFaultException, SystemFaultException
    ;

}
