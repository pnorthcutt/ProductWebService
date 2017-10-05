package com.northcutt.product.dao;

import com.northcutt.product.dto.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by pnorthcutt on 9/29/2017.
 */

public class ProductDAO {
    List<Product> productList;

    public ProductDAO() {
        this.productList = new ArrayList<Product>();
        Product p1 = new Product().setProductCode("1").setProductName("widget1").setProductDescription("Does A");
        Product p2 = new Product().setProductCode("2").setProductName("widget2").setProductDescription("Does B");
        Product p3 = new Product().setProductCode("3").setProductName("widget3").setProductDescription("Does C");
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
    }

    public List<Product> getProducts(){
        return Collections.unmodifiableList(productList);
    }

    public Product getProductByName(String name){
        Product prod =  productList.stream()
                .filter(p-> p.getProductName().equals(name))
                .findAny()
                .orElse(null);
        return prod;
    };

    public Product getProductByCode(String code){
        Product prod = (Product) productList.stream().filter(p-> p.getProductCode().equals(code));
        return prod;
    };


}
