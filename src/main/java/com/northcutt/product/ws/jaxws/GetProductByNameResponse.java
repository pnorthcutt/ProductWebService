
package com.northcutt.product.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductByNameResponse", namespace = "http://ws.product.northcutt.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductByNameResponse", namespace = "http://ws.product.northcutt.com/")
public class GetProductByNameResponse {

    @XmlElement(name = "return", namespace = "")
    private com.northcutt.product.dto.Product _return;

    /**
     * 
     * @return
     *     returns Product
     */
    public com.northcutt.product.dto.Product getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.northcutt.product.dto.Product _return) {
        this._return = _return;
    }

}
