
package org.datacontract.schemas._2004._07;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ElementStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="REQUEST_FORMAT"/>
 *     &lt;enumeration value="INVALID_TOKEN"/>
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/>
 *     &lt;enumeration value="USER_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_CREDENTIALS"/>
 *     &lt;enumeration value="USER_FROZEN"/>
 *     &lt;enumeration value="DUPLICATE_PAYMENT_ID"/>
 *     &lt;enumeration value="PAYMENT_ID_NOT_FOUND"/>
 *     &lt;enumeration value="RISK_VALIDATION"/>
 *     &lt;enumeration value="CANCEL_NOT_POSSIBLE"/>
 *     &lt;enumeration value="USER_EXISTS"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElementStatusCode")
@XmlEnum
public enum ElementStatusCode {

    OK,
    REQUEST_FORMAT,
    INVALID_TOKEN,
    INSUFFICIENT_FUNDS,
    USER_NOT_FOUND,
    INVALID_CREDENTIALS,
    USER_FROZEN,
    DUPLICATE_PAYMENT_ID,
    PAYMENT_ID_NOT_FOUND,
    RISK_VALIDATION,
    CANCEL_NOT_POSSIBLE,
    USER_EXISTS,
    ERROR;

    public String value() {
        return name();
    }

    public static ElementStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
