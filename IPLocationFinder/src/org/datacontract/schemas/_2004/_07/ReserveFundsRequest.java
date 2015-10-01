
package org.datacontract.schemas._2004._07;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReserveFundsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReserveFundsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GameCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GameCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GameFormatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxPayout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stake" type="{http://schemas.datacontract.org/2004/07/}PaymentElement" minOccurs="0"/>
 *         &lt;element name="TicketInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ReserveFundsRequest", propOrder = {
    "correlationNumber",
    "currencyCode",
    "customValues",
    "gameCategoryCode",
    "gameCode",
    "gameFormatCode",
    "maxPayout",
    "paymentId",
    "stake",
    "ticketInfo",
    "token",
    "userId"
})
public class ReserveFundsRequest {

    @XmlElement(name = "CorrelationNumber")
    protected Integer correlationNumber;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CustomValues", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customValues;
    @XmlElementRef(name = "GameCategoryCode", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gameCategoryCode;
    @XmlElementRef(name = "GameCode", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gameCode;
    @XmlElementRef(name = "GameFormatCode", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gameFormatCode;
    @XmlElement(name = "MaxPayout")
    protected BigDecimal maxPayout;
    @XmlElementRef(name = "PaymentId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentId;
    @XmlElementRef(name = "Stake", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentElement> stake;
    @XmlElementRef(name = "TicketInfo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketInfo;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;

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
     * Gets the value of the gameCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGameCategoryCode() {
        return gameCategoryCode;
    }

    /**
     * Sets the value of the gameCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGameCategoryCode(JAXBElement<String> value) {
        this.gameCategoryCode = value;
    }

    /**
     * Gets the value of the gameCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGameCode() {
        return gameCode;
    }

    /**
     * Sets the value of the gameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGameCode(JAXBElement<String> value) {
        this.gameCode = value;
    }

    /**
     * Gets the value of the gameFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGameFormatCode() {
        return gameFormatCode;
    }

    /**
     * Sets the value of the gameFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGameFormatCode(JAXBElement<String> value) {
        this.gameFormatCode = value;
    }

    /**
     * Gets the value of the maxPayout property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPayout() {
        return maxPayout;
    }

    /**
     * Sets the value of the maxPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPayout(BigDecimal value) {
        this.maxPayout = value;
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
     * Gets the value of the stake property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}
     *     
     */
    public JAXBElement<PaymentElement> getStake() {
        return stake;
    }

    /**
     * Sets the value of the stake property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentElement }{@code >}
     *     
     */
    public void setStake(JAXBElement<PaymentElement> value) {
        this.stake = value;
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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
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
