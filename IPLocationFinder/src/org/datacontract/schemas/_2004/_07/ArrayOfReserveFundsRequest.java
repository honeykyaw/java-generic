
package org.datacontract.schemas._2004._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReserveFundsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReserveFundsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveFundsRequest" type="{http://schemas.datacontract.org/2004/07/}ReserveFundsRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReserveFundsRequest", propOrder = {
    "reserveFundsRequest"
})
public class ArrayOfReserveFundsRequest {

    @XmlElement(name = "ReserveFundsRequest", nillable = true)
    protected List<ReserveFundsRequest> reserveFundsRequest;

    /**
     * Gets the value of the reserveFundsRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reserveFundsRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReserveFundsRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReserveFundsRequest }
     * 
     * 
     */
    public List<ReserveFundsRequest> getReserveFundsRequest() {
        if (reserveFundsRequest == null) {
            reserveFundsRequest = new ArrayList<ReserveFundsRequest>();
        }
        return this.reserveFundsRequest;
    }

}
