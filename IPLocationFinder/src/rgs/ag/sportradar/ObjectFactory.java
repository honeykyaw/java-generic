
package rgs.ag.sportradar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ArrayOfApproveRequest;
import org.datacontract.schemas._2004._07.ArrayOfCancelRequest;
import org.datacontract.schemas._2004._07.ArrayOfGenericResponse;
import org.datacontract.schemas._2004._07.ArrayOfManualPaymentRequest;
import org.datacontract.schemas._2004._07.ArrayOfPaymentRequest;
import org.datacontract.schemas._2004._07.ArrayOfQueryBalanceRequest;
import org.datacontract.schemas._2004._07.ArrayOfReserveFundsRequest;
import org.datacontract.schemas._2004._07.ArrayOfUserInfoRequest;
import org.datacontract.schemas._2004._07.ArrayOfUserInfoResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rgs.ag.sportradar package. 
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

    private final static QName _CancelResponseCancelResult_QNAME = new QName("http://sportradar.ag.rgs/", "cancelResult");
    private final static QName _PaymentResponsePaymentResult_QNAME = new QName("http://sportradar.ag.rgs/", "paymentResult");
    private final static QName _UserInfoSecretKey_QNAME = new QName("http://sportradar.ag.rgs/", "secretKey");
    private final static QName _UserInfoRequests_QNAME = new QName("http://sportradar.ag.rgs/", "requests");
    private final static QName _ApproveResponseApproveResult_QNAME = new QName("http://sportradar.ag.rgs/", "approveResult");
    private final static QName _ManualPaymentResponseManualPaymentResult_QNAME = new QName("http://sportradar.ag.rgs/", "manualPaymentResult");
    private final static QName _ReserveFundsResponseReserveFundsResult_QNAME = new QName("http://sportradar.ag.rgs/", "reserveFundsResult");
    private final static QName _UserInfoResponseUserInfoResult_QNAME = new QName("http://sportradar.ag.rgs/", "userInfoResult");
    private final static QName _QueryBalanceResponseQueryBalanceResult_QNAME = new QName("http://sportradar.ag.rgs/", "queryBalanceResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rgs.ag.sportradar
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryBalance }
     * 
     */
    public QueryBalance createQueryBalance() {
        return new QueryBalance();
    }

    /**
     * Create an instance of {@link Approve }
     * 
     */
    public Approve createApprove() {
        return new Approve();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link ManualPaymentResponse }
     * 
     */
    public ManualPaymentResponse createManualPaymentResponse() {
        return new ManualPaymentResponse();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link ApproveResponse }
     * 
     */
    public ApproveResponse createApproveResponse() {
        return new ApproveResponse();
    }

    /**
     * Create an instance of {@link ManualPayment }
     * 
     */
    public ManualPayment createManualPayment() {
        return new ManualPayment();
    }

    /**
     * Create an instance of {@link ReserveFunds }
     * 
     */
    public ReserveFunds createReserveFunds() {
        return new ReserveFunds();
    }

    /**
     * Create an instance of {@link QueryBalanceResponse }
     * 
     */
    public QueryBalanceResponse createQueryBalanceResponse() {
        return new QueryBalanceResponse();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link UserInfoResponse }
     * 
     */
    public UserInfoResponse createUserInfoResponse() {
        return new UserInfoResponse();
    }

    /**
     * Create an instance of {@link ReserveFundsResponse }
     * 
     */
    public ReserveFundsResponse createReserveFundsResponse() {
        return new ReserveFundsResponse();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "cancelResult", scope = CancelResponse.class)
    public JAXBElement<ArrayOfGenericResponse> createCancelResponseCancelResult(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_CancelResponseCancelResult_QNAME, ArrayOfGenericResponse.class, CancelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "paymentResult", scope = PaymentResponse.class)
    public JAXBElement<ArrayOfGenericResponse> createPaymentResponsePaymentResult(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_PaymentResponsePaymentResult_QNAME, ArrayOfGenericResponse.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = UserInfo.class)
    public JAXBElement<ArrayOfUserInfoRequest> createUserInfoRequests(ArrayOfUserInfoRequest value) {
        return new JAXBElement<ArrayOfUserInfoRequest>(_UserInfoRequests_QNAME, ArrayOfUserInfoRequest.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "approveResult", scope = ApproveResponse.class)
    public JAXBElement<ArrayOfGenericResponse> createApproveResponseApproveResult(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_ApproveResponseApproveResult_QNAME, ArrayOfGenericResponse.class, ApproveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "manualPaymentResult", scope = ManualPaymentResponse.class)
    public JAXBElement<ArrayOfGenericResponse> createManualPaymentResponseManualPaymentResult(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_ManualPaymentResponseManualPaymentResult_QNAME, ArrayOfGenericResponse.class, ManualPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = QueryBalance.class)
    public JAXBElement<String> createQueryBalanceSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, QueryBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryBalanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = QueryBalance.class)
    public JAXBElement<ArrayOfQueryBalanceRequest> createQueryBalanceRequests(ArrayOfQueryBalanceRequest value) {
        return new JAXBElement<ArrayOfQueryBalanceRequest>(_UserInfoRequests_QNAME, ArrayOfQueryBalanceRequest.class, QueryBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = ReserveFunds.class)
    public JAXBElement<String> createReserveFundsSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, ReserveFunds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReserveFundsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = ReserveFunds.class)
    public JAXBElement<ArrayOfReserveFundsRequest> createReserveFundsRequests(ArrayOfReserveFundsRequest value) {
        return new JAXBElement<ArrayOfReserveFundsRequest>(_UserInfoRequests_QNAME, ArrayOfReserveFundsRequest.class, ReserveFunds.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "reserveFundsResult", scope = ReserveFundsResponse.class)
    public JAXBElement<ArrayOfGenericResponse> createReserveFundsResponseReserveFundsResult(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_ReserveFundsResponseReserveFundsResult_QNAME, ArrayOfGenericResponse.class, ReserveFundsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = Payment.class)
    public JAXBElement<String> createPaymentSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = Payment.class)
    public JAXBElement<ArrayOfPaymentRequest> createPaymentRequests(ArrayOfPaymentRequest value) {
        return new JAXBElement<ArrayOfPaymentRequest>(_UserInfoRequests_QNAME, ArrayOfPaymentRequest.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = Cancel.class)
    public JAXBElement<String> createCancelSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = Cancel.class)
    public JAXBElement<ArrayOfCancelRequest> createCancelRequests(ArrayOfCancelRequest value) {
        return new JAXBElement<ArrayOfCancelRequest>(_UserInfoRequests_QNAME, ArrayOfCancelRequest.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "userInfoResult", scope = UserInfoResponse.class)
    public JAXBElement<ArrayOfUserInfoResponse> createUserInfoResponseUserInfoResult(ArrayOfUserInfoResponse value) {
        return new JAXBElement<ArrayOfUserInfoResponse>(_UserInfoResponseUserInfoResult_QNAME, ArrayOfUserInfoResponse.class, UserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "queryBalanceResult", scope = QueryBalanceResponse.class)
    public JAXBElement<ArrayOfGenericResponse> createQueryBalanceResponseQueryBalanceResult(ArrayOfGenericResponse value) {
        return new JAXBElement<ArrayOfGenericResponse>(_QueryBalanceResponseQueryBalanceResult_QNAME, ArrayOfGenericResponse.class, QueryBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = ManualPayment.class)
    public JAXBElement<String> createManualPaymentSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, ManualPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManualPaymentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = ManualPayment.class)
    public JAXBElement<ArrayOfManualPaymentRequest> createManualPaymentRequests(ArrayOfManualPaymentRequest value) {
        return new JAXBElement<ArrayOfManualPaymentRequest>(_UserInfoRequests_QNAME, ArrayOfManualPaymentRequest.class, ManualPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "secretKey", scope = Approve.class)
    public JAXBElement<String> createApproveSecretKey(String value) {
        return new JAXBElement<String>(_UserInfoSecretKey_QNAME, String.class, Approve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfApproveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sportradar.ag.rgs/", name = "requests", scope = Approve.class)
    public JAXBElement<ArrayOfApproveRequest> createApproveRequests(ArrayOfApproveRequest value) {
        return new JAXBElement<ArrayOfApproveRequest>(_UserInfoRequests_QNAME, ArrayOfApproveRequest.class, Approve.class, value);
    }

}
