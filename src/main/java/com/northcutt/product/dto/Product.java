package com.northcutt.product.dto;

/**
 * Created by pnorthcutt on 9/29/2017.
 */
public class Product {
    private String productName;
    private String productDescription;
    private String productCode;

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Product setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public Product setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Name: ")
                .append(productName)
                .append(" Description: ")
                .append(productDescription)
                .append("  ProductCode: ")
                .append(productCode);
        return sb.toString();

    }
}
