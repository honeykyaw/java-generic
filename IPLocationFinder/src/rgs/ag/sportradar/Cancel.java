
package rgs.ag.sportradar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ArrayOfCancelRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="secretKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requests" type="{http://schemas.datacontract.org/2004/07/}ArrayOfCancelRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secretKey",
    "requests"
})
@XmlRootElement(name = "cancel")
public class Cancel {

    @XmlElementRef(name = "secretKey", namespace = "http://sportradar.ag.rgs/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secretKey;
    @XmlElementRef(name = "requests", namespace = "http://sportradar.ag.rgs/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCancelRequest> requests;

    /**
     * Gets the value of the secretKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecretKey() {
        return secretKey;
    }

    /**
     * Sets the value of the secretKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecretKey(JAXBElement<String> value) {
        this.secretKey = value;
    }

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCancelRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCancelRequest> getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCancelRequest }{@code >}
     *     
     */
    public void setRequests(JAXBElement<ArrayOfCancelRequest> value) {
        this.requests = value;
    }

}
