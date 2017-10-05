package com.northcutt.product.dto;

import java.util.Collections;
import java.util.List;

/**
 * Created by pnorthcutt on 9/29/2017.
 */
public class Response {
    private List<Product> productList;

    public List<Product> getProductList() {
        return Collections.unmodifiableList(productList);
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public void deleteProduct(Product product){
        productList.remove(product);
    }
}
