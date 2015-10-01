
package rgs.ag.sportradar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ArrayOfGenericResponse;


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
 *         &lt;element name="manualPaymentResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfGenericResponse" minOccurs="0"/>
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
    "manualPaymentResult"
})
@XmlRootElement(name = "manualPaymentResponse")
public class ManualPaymentResponse {

    @XmlElementRef(name = "manualPaymentResult", namespace = "http://sportradar.ag.rgs/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGenericResponse> manualPaymentResult;

    /**
     * Gets the value of the manualPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGenericResponse> getManualPaymentResult() {
        return manualPaymentResult;
    }

    /**
     * Sets the value of the manualPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}
     *     
     */
    public void setManualPaymentResult(JAXBElement<ArrayOfGenericResponse> value) {
        this.manualPaymentResult = value;
    }

}
