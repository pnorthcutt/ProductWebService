package com.northcutt.product.ws;

import javax.xml.ws.Endpoint;

/**
 * Created by pnorthcutt on 10/3/2017.
 */
public class ProductServiceWebPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/productService", new ProductServiceImp());
    }
}
