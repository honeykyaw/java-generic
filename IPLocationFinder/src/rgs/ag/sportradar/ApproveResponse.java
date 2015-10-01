
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
 *         &lt;element name="approveResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfGenericResponse" minOccurs="0"/>
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
    "approveResult"
})
@XmlRootElement(name = "approveResponse")
public class ApproveResponse {

    @XmlElementRef(name = "approveResult", namespace = "http://sportradar.ag.rgs/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGenericResponse> approveResult;

    /**
     * Gets the value of the approveResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGenericResponse> getApproveResult() {
        return approveResult;
    }

    /**
     * Sets the value of the approveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGenericResponse }{@code >}
     *     
     */
    public void setApproveResult(JAXBElement<ArrayOfGenericResponse> value) {
        this.approveResult = value;
    }

}
