
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07 package. 
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

    private final static QName _ArrayOfApproveRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfApproveRequest");
    private final static QName _ArrayOfPaymentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfPaymentRequest");
    private final static QName _ArrayOfCancelRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfCancelRequest");
    private final static QName _ArrayOfQueryBalanceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfQueryBalanceRequest");
    private final static QName _ArrayOfGenericResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfGenericResponse");
    private final static QName _QueryBalanceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "QueryBalanceRequest");
    private final static QName _ManualPaymentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ManualPaymentRequest");
    private final static QName _ReserveFundsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ReserveFundsRequest");
    private final static QName _CancelRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CancelRequest");
    private final static QName _ArrayOfUserInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfUserInfoResponse");
    private final static QName _UserInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "UserInfoResponse");
    private final static QName _GenericResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "GenericResponse");
    private final static QName _ElementStatusCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ElementStatusCode");
    private final static QName _PaymentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PaymentRequest");
    private final static QName _ArrayOfUserInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfUserInfoRequest");
    private final static QName _ApproveRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ApproveRequest");
    private final static QName _PaymentElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PaymentElement");
    private final static QName _ArrayOfManualPaymentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfManualPaymentRequest");
    private final static QName _ArrayOfReserveFundsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfReserveFundsRequest");
    private final static QName _UserInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "UserInfoRequest");
    private final static QName _CancelRequestPaymentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "PaymentId");
    private final static QName _CancelRequestCustomValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CustomValues");
    private final static QName _CancelRequestForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Force");
    private final static QName _CancelRequestTicketInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "TicketInfo");
    private final static QName _UserInfoRequestToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Token");
    private final static QName _UserInfoRequestGameCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "GameCode");
    private final static QName _PaymentRequestUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "UserId");
    private final static QName _PaymentRequestCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CurrencyCode");
    private final static QName _PaymentRequestPayment_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Payment");
    private final static QName _ReserveFundsRequestStake_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Stake");
    private final static QName _ReserveFundsRequestGameCategoryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "GameCategoryCode");
    private final static QName _ReserveFundsRequestGameFormatCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "GameFormatCode");
    private final static QName _UserInfoResponseVipLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "VipLevel");
    private final static QName _UserInfoResponseTimeToLive_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "TimeToLive");
    private final static QName _UserInfoResponseLanguageCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LanguageCode");
    private final static QName _UserInfoResponseUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Username");
    private final static QName _ManualPaymentRequestComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Comment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveFundsRequest }
     * 
     */
    public ReserveFundsRequest createReserveFundsRequest() {
        return new ReserveFundsRequest();
    }

    /**
     * Create an instance of {@link ManualPaymentRequest }
     * 
     */
    public ManualPaymentRequest createManualPaymentRequest() {
        return new ManualPaymentRequest();
    }

    /**
     * Create an instance of {@link CancelRequest }
     * 
     */
    public CancelRequest createCancelRequest() {
        return new CancelRequest();
    }

    /**
     * Create an instance of {@link ArrayOfReserveFundsRequest }
     * 
     */
    public ArrayOfReserveFundsRequest createArrayOfReserveFundsRequest() {
        return new ArrayOfReserveFundsRequest();
    }

    /**
     * Create an instance of {@link UserInfoRequest }
     * 
     */
    public UserInfoRequest createUserInfoRequest() {
        return new UserInfoRequest();
    }

    /**
     * Create an instance of {@link ArrayOfUserInfoResponse }
     * 
     */
    public ArrayOfUserInfoResponse createArrayOfUserInfoResponse() {
        return new ArrayOfUserInfoResponse();
    }

    /**
     * Create an instance of {@link QueryBalanceRequest }
     * 
     */
    public QueryBalanceRequest createQueryBalanceRequest() {
        return new QueryBalanceRequest();
    }

    /**
     * Create an instance of {@link ArrayOfManualPaymentRequest }
     * 
     */
    public ArrayOfManualPaymentRequest createArrayOfManualPaymentRequest() {
        return new ArrayOfManualPaymentRequest();
    }

    /**
     * Create an instance of {@link PaymentElement }
     * 
     */
    public PaymentElement createPaymentElement() {
        return new PaymentElement();
    }

    /**
     * Create an instance of {@link GenericResponse }
     * 
     */
    public GenericResponse createGenericResponse() {
        return new GenericResponse();
    }

    /**
     * Create an instance of {@link UserInfoResponse }
     * 
     */
    public UserInfoResponse createUserInfoResponse() {
        return new UserInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQueryBalanceRequest }
     * 
     */
    public ArrayOfQueryBalanceRequest createArrayOfQueryBalanceRequest() {
        return new ArrayOfQueryBalanceRequest();
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link ApproveRequest }
     * 
     */
    public ApproveRequest createApproveRequest() {
        return new ApproveRequest();
    }

    /**
     * Create an instance of {@link ArrayOfGenericResponse }
     * 
     */
    public ArrayOfGenericResponse createArrayOfGenericResponse() {
        return new ArrayOfGenericResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserInfoRequest }
     * 
     */
    public ArrayOfUserInfoRequest createArrayOfUserInfoRequest() {
        return new ArrayOfUserInfoRequest();
    }

    /**
     * Create an instance of {@link ArrayOfApproveRequest }
     * 
     */
    public ArrayOfApproveRequest createArrayOfApproveRequest() {
        return new ArrayOfApproveRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentRequest }
     * 
     */
    public ArrayOfPaymentRequest createArrayOfPaymentRequest() {
        return new ArrayOfPaymentRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCancelRequest }
     * 
     */
    public ArrayOfCancelRequest createArrayOfCancelRequest() {
        return new ArrayOfCancelRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfApproveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfApproveRequest")
    public JAXBElement<ArrayOfApproveRequest> createArrayOfApproveRequest(ArrayOfApproveRequest value) {
        return new JAXBElement<ArrayOfApproveRequest>(_ArrayOfApproveRequest_QNAME, ArrayOfApproveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfPaymentRequest")
    public JAXBElement<ArrayOfPaymentRequest> createArrayOfPaymentRequest(ArrayOfPaymentRequest value) {
        return new JAXBElement<ArrayOfPaymentRequest>(_ArrayOfPaymentRequest_QNAME, ArrayOfPaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfCancelRequest")
    public JAXBElement<ArrayOfCancelRequest> createArrayOfCancelRequest(ArrayOfCancelRequest value) {
        return new JAXBElement<ArrayOfCancelRequest>(_ArrayOfCancelRequest_QNAME, ArrayOfCancelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryBalanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfQueryBalanceRequest")
    public JAXBElement<ArrayOfQueryBalanceRequest> createArrayOfQueryBalanceRequest(ArrayOfQueryBalanceRequest value) {
        return new JAXBElement<ArrayOfQueryBalanceRequest>(_ArrayOfQueryBalanceRequest_QNAME, ArrayOfQueryBalanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfGenericResponse")
    public JAXBElement<ArrayOfGenericResponse> createArrayOfGenericResponse(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_ArrayOfGenericResponse_QNAME, ArrayOfGenericResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBalanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "QueryBalanceRequest")
    public JAXBElement<QueryBalanceRequest> createQueryBalanceRequest(QueryBalanceRequest value) {
        return new JAXBElement<QueryBalanceRequest>(_QueryBalanceRequest_QNAME, QueryBalanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualPaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ManualPaymentRequest")
    public JAXBElement<ManualPaymentRequest> createManualPaymentRequest(ManualPaymentRequest value) {
        return new JAXBElement<ManualPaymentRequest>(_ManualPaymentRequest_QNAME, ManualPaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveFundsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ReserveFundsRequest")
    public JAXBElement<ReserveFundsRequest> createReserveFundsRequest(ReserveFundsRequest value) {
        return new JAXBElement<ReserveFundsRequest>(_ReserveFundsRequest_QNAME, ReserveFundsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CancelRequest")
    public JAXBElement<CancelRequest> createCancelRequest(CancelRequest value) {
        return new JAXBElement<CancelRequest>(_CancelRequest_QNAME, CancelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfUserInfoResponse")
    public JAXBElement<ArrayOfUserInfoResponse> createArrayOfUserInfoResponse(ArrayOfUserInfoResponse value) {
        return new JAXBElement<ArrayOfUserInfoResponse>(_ArrayOfUserInfoResponse_QNAME, ArrayOfUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserInfoResponse")
    public JAXBElement<UserInfoResponse> createUserInfoResponse(UserInfoResponse value) {
        return new JAXBElement<UserInfoResponse>(_UserInfoResponse_QNAME, UserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GenericResponse")
    public JAXBElement<GenericResponse> createGenericResponse(GenericResponse value) {
        return new JAXBElement<GenericResponse>(_GenericResponse_QNAME, GenericResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementStatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ElementStatusCode")
    public JAXBElement<ElementStatusCode> createElementStatusCode(ElementStatusCode value) {
        return new JAXBElement<ElementStatusCode>(_ElementStatusCode_QNAME, ElementStatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentRequest")
    public JAXBElement<PaymentRequest> createPaymentRequest(PaymentRequest value) {
        return new JAXBElement<PaymentRequest>(_PaymentRequest_QNAME, PaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfUserInfoRequest")
    public JAXBElement<ArrayOfUserInfoRequest> createArrayOfUserInfoRequest(ArrayOfUserInfoRequest value) {
        return new JAXBElement<ArrayOfUserInfoRequest>(_ArrayOfUserInfoRequest_QNAME, ArrayOfUserInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ApproveRequest")
    public JAXBElement<ApproveRequest> createApproveRequest(ApproveRequest value) {
        return new JAXBElement<ApproveRequest>(_ApproveRequest_QNAME, ApproveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentElement")
    public JAXBElement<PaymentElement> createPaymentElement(PaymentElement value) {
        return new JAXBElement<PaymentElement>(_PaymentElement_QNAME, PaymentElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManualPaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfManualPaymentRequest")
    public JAXBElement<ArrayOfManualPaymentRequest> createArrayOfManualPaymentRequest(ArrayOfManualPaymentRequest value) {
        return new JAXBElement<ArrayOfManualPaymentRequest>(_ArrayOfManualPaymentRequest_QNAME, ArrayOfManualPaymentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReserveFundsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfReserveFundsRequest")
    public JAXBElement<ArrayOfReserveFundsRequest> createArrayOfReserveFundsRequest(ArrayOfReserveFundsRequest value) {
        return new JAXBElement<ArrayOfReserveFundsRequest>(_ArrayOfReserveFundsRequest_QNAME, ArrayOfReserveFundsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserInfoRequest")
    public JAXBElement<UserInfoRequest> createUserInfoRequest(UserInfoRequest value) {
        return new JAXBElement<UserInfoRequest>(_UserInfoRequest_QNAME, UserInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentId", scope = CancelRequest.class)
    public JAXBElement<String> createCancelRequestPaymentId(String value) {
        return new JAXBElement<String>(_CancelRequestPaymentId_QNAME, String.class, CancelRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CustomValues", scope = CancelRequest.class)
    public JAXBElement<String> createCancelRequestCustomValues(String value) {
        return new JAXBElement<String>(_CancelRequestCustomValues_QNAME, String.class, CancelRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Force", scope = CancelRequest.class)
    public JAXBElement<Boolean> createCancelRequestForce(Boolean value) {
        return new JAXBElement<Boolean>(_CancelRequestForce_QNAME, Boolean.class, CancelRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "TicketInfo", scope = CancelRequest.class)
    public JAXBElement<String> createCancelRequestTicketInfo(String value) {
        return new JAXBElement<String>(_CancelRequestTicketInfo_QNAME, String.class, CancelRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Token", scope = UserInfoRequest.class)
    public JAXBElement<String> createUserInfoRequestToken(String value) {
        return new JAXBElement<String>(_UserInfoRequestToken_QNAME, String.class, UserInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GameCode", scope = UserInfoRequest.class)
    public JAXBElement<String> createUserInfoRequestGameCode(String value) {
        return new JAXBElement<String>(_UserInfoRequestGameCode_QNAME, String.class, UserInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserId", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestUserId(String value) {
        return new JAXBElement<String>(_PaymentRequestUserId_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CurrencyCode", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_PaymentRequestCurrencyCode_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentId", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestPaymentId(String value) {
        return new JAXBElement<String>(_CancelRequestPaymentId_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CustomValues", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestCustomValues(String value) {
        return new JAXBElement<String>(_CancelRequestCustomValues_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Payment", scope = PaymentRequest.class)
    public JAXBElement<PaymentElement> createPaymentRequestPayment(PaymentElement value) {
        return new JAXBElement<PaymentElement>(_PaymentRequestPayment_QNAME, PaymentElement.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "TicketInfo", scope = PaymentRequest.class)
    public JAXBElement<String> createPaymentRequestTicketInfo(String value) {
        return new JAXBElement<String>(_CancelRequestTicketInfo_QNAME, String.class, PaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CurrencyCode", scope = GenericResponse.class)
    public JAXBElement<String> createGenericResponseCurrencyCode(String value) {
        return new JAXBElement<String>(_PaymentRequestCurrencyCode_QNAME, String.class, GenericResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserId", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestUserId(String value) {
        return new JAXBElement<String>(_PaymentRequestUserId_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Token", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestToken(String value) {
        return new JAXBElement<String>(_UserInfoRequestToken_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CurrencyCode", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_PaymentRequestCurrencyCode_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GameCode", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestGameCode(String value) {
        return new JAXBElement<String>(_UserInfoRequestGameCode_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentId", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestPaymentId(String value) {
        return new JAXBElement<String>(_CancelRequestPaymentId_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CustomValues", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestCustomValues(String value) {
        return new JAXBElement<String>(_CancelRequestCustomValues_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Stake", scope = ReserveFundsRequest.class)
    public JAXBElement<PaymentElement> createReserveFundsRequestStake(PaymentElement value) {
        return new JAXBElement<PaymentElement>(_ReserveFundsRequestStake_QNAME, PaymentElement.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GameCategoryCode", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestGameCategoryCode(String value) {
        return new JAXBElement<String>(_ReserveFundsRequestGameCategoryCode_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "GameFormatCode", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestGameFormatCode(String value) {
        return new JAXBElement<String>(_ReserveFundsRequestGameFormatCode_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "TicketInfo", scope = ReserveFundsRequest.class)
    public JAXBElement<String> createReserveFundsRequestTicketInfo(String value) {
        return new JAXBElement<String>(_CancelRequestTicketInfo_QNAME, String.class, ReserveFundsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserId", scope = QueryBalanceRequest.class)
    public JAXBElement<String> createQueryBalanceRequestUserId(String value) {
        return new JAXBElement<String>(_PaymentRequestUserId_QNAME, String.class, QueryBalanceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Token", scope = QueryBalanceRequest.class)
    public JAXBElement<String> createQueryBalanceRequestToken(String value) {
        return new JAXBElement<String>(_UserInfoRequestToken_QNAME, String.class, QueryBalanceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserId", scope = UserInfoResponse.class)
    public JAXBElement<String> createUserInfoResponseUserId(String value) {
        return new JAXBElement<String>(_PaymentRequestUserId_QNAME, String.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "VipLevel", scope = UserInfoResponse.class)
    public JAXBElement<Integer> createUserInfoResponseVipLevel(Integer value) {
        return new JAXBElement<Integer>(_UserInfoResponseVipLevel_QNAME, Integer.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CurrencyCode", scope = UserInfoResponse.class)
    public JAXBElement<String> createUserInfoResponseCurrencyCode(String value) {
        return new JAXBElement<String>(_PaymentRequestCurrencyCode_QNAME, String.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "TimeToLive", scope = UserInfoResponse.class)
    public JAXBElement<Long> createUserInfoResponseTimeToLive(Long value) {
        return new JAXBElement<Long>(_UserInfoResponseTimeToLive_QNAME, Long.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LanguageCode", scope = UserInfoResponse.class)
    public JAXBElement<String> createUserInfoResponseLanguageCode(String value) {
        return new JAXBElement<String>(_UserInfoResponseLanguageCode_QNAME, String.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Username", scope = UserInfoResponse.class)
    public JAXBElement<String> createUserInfoResponseUsername(String value) {
        return new JAXBElement<String>(_UserInfoResponseUsername_QNAME, String.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentId", scope = ApproveRequest.class)
    public JAXBElement<String> createApproveRequestPaymentId(String value) {
        return new JAXBElement<String>(_CancelRequestPaymentId_QNAME, String.class, ApproveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CustomValues", scope = ApproveRequest.class)
    public JAXBElement<String> createApproveRequestCustomValues(String value) {
        return new JAXBElement<String>(_CancelRequestCustomValues_QNAME, String.class, ApproveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "TicketInfo", scope = ApproveRequest.class)
    public JAXBElement<String> createApproveRequestTicketInfo(String value) {
        return new JAXBElement<String>(_CancelRequestTicketInfo_QNAME, String.class, ApproveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Comment", scope = ManualPaymentRequest.class)
    public JAXBElement<String> createManualPaymentRequestComment(String value) {
        return new JAXBElement<String>(_ManualPaymentRequestComment_QNAME, String.class, ManualPaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "UserId", scope = ManualPaymentRequest.class)
    public JAXBElement<String> createManualPaymentRequestUserId(String value) {
        return new JAXBElement<String>(_PaymentRequestUserId_QNAME, String.class, ManualPaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CurrencyCode", scope = ManualPaymentRequest.class)
    public JAXBElement<String> createManualPaymentRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_PaymentRequestCurrencyCode_QNAME, String.class, ManualPaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "PaymentId", scope = ManualPaymentRequest.class)
    public JAXBElement<String> createManualPaymentRequestPaymentId(String value) {
        return new JAXBElement<String>(_CancelRequestPaymentId_QNAME, String.class, ManualPaymentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Payment", scope = ManualPaymentRequest.class)
    public JAXBElement<PaymentElement> createManualPaymentRequestPayment(PaymentElement value) {
        return new JAXBElement<PaymentElement>(_PaymentRequestPayment_QNAME, PaymentElement.class, ManualPaymentRequest.class, value);
    }

}
