
package com.northcutt.product.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductsResponse", namespace = "http://ws.product.northcutt.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductsResponse", namespace = "http://ws.product.northcutt.com/")
public class GetProductsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.northcutt.product.dto.Product> _return;

    /**
     * 
     * @return
     *     returns List<Product>
     */
    public List<com.northcutt.product.dto.Product> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.northcutt.product.dto.Product> _return) {
        this._return = _return;
    }

}
