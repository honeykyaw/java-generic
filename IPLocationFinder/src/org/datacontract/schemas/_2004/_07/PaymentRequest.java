
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrelationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://schemas.datacontract.org/2004/07/}PaymentElement" minOccurs="0"/>
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRequest", propOrder = {
    "approvePayment",
    "correlationNumber",
    "currencyCode",
    "customValues",
    "payment",
    "paymentId",
    "ticketInfo",
    "userId"
})
public class PaymentRequest {

    @XmlElement(name = "ApprovePayment")
    protected Boolean approvePayment;
    @XmlElement(name = "CorrelationNumber")
    protected Integer correlationNumber;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CustomValues", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customValues;
    @XmlElementRef(name = "Payment", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentElement> payment;
    @XmlElementRef(name = "PaymentId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentId;
    @XmlElementRef(name = "TicketInfo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketInfo;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;

    /**
     * Gets the value of the approvePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprovePayment() {
        return approvePayment;
    }

    /**
     * Sets the value of the approvePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApprovePayment(Boolean value) {
        this.approvePayment = value;
    }

    /**
     * Gets the value of the correlationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelationNumber() {
        return correlationNumber;
    }

    /**
     * Sets the value of the correlationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelationNumber(Integer value) {
        this.correlationNumber = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomValues() {
        return customValues;
    }

    /**
     * Sets the value of the customValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomValues(JAXBElement<String> value) {
        this.customValues = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}
     *     
     */
    public JAXBElement<PaymentElement> getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}
     *     
     */
    public void setPayment(JAXBElement<PaymentElement> value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentId(JAXBElement<String> value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the ticketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketInfo() {
        return ticketInfo;
    }

    /**
     * Sets the value of the ticketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketInfo(JAXBElement<String> value) {
        this.ticketInfo = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = value;
    }

}
