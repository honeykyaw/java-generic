
package org.datacontract.schemas._2004._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGenericResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGenericResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenericResponse" type="{http://schemas.datacontract.org/2004/07/}GenericResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGenericResponse", propOrder = {
    "genericResponse"
})
public class ArrayOfGenericResponse {

    @XmlElement(name = "GenericResponse", nillable = true)
    protected List<GenericResponse> genericResponse;

    /**
     * Gets the value of the genericResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericResponse }
     * 
     * 
     */
    public List<GenericResponse> getGenericResponse() {
        if (genericResponse == null) {
            genericResponse = new ArrayList<GenericResponse>();
        }
        return this.genericResponse;
    }

}
