package com.northcutt.product.ws;

import com.northcutt.product.dto.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by pnorthcutt on 10/3/2017.
 */
//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL)
public interface ProductService {
    @WebMethod
    public Product getProductByName(String name);
    @WebMethod
    public List<Product> getProducts();
}
