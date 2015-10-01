
package rgs.ag.sportradar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ArrayOfUserInfoResponse;


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
 *         &lt;element name="userInfoResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfUserInfoResponse" minOccurs="0"/>
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
    "userInfoResult"
})
@XmlRootElement(name = "userInfoResponse")
public class UserInfoResponse {

    @XmlElementRef(name = "userInfoResult", namespace = "http://sportradar.ag.rgs/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserInfoResponse> userInfoResult;

    /**
     * Gets the value of the userInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserInfoResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserInfoResponse> getUserInfoResult() {
        return userInfoResult;
    }

    /**
     * Sets the value of the userInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserInfoResponse }{@code >}
     *     
     */
    public void setUserInfoResult(JAXBElement<ArrayOfUserInfoResponse> value) {
        this.userInfoResult = value;
    }

}
