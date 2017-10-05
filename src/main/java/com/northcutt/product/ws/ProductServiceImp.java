package com.northcutt.product.ws;

import com.northcutt.product.dao.ProductDAO;
import com.northcutt.product.dto.Product;


import javax.jws.WebService;
import java.util.List;

/**
 * Created by pnorthcutt on 9/29/2017.
 */
@WebService(endpointInterface = "com.northcutt.product.ws.ProductService")
public class ProductServiceImp implements ProductService {
    public ProductServiceImp() {
    }

    @Override
    public Product getProductByName(String name){
        ProductDAO dao = new ProductDAO();
        return dao.getProductByName(name);

    }
    @Override
     public List<Product> getProducts(){
        ProductDAO dao = new ProductDAO();
        return dao.getProducts();

    }

}
