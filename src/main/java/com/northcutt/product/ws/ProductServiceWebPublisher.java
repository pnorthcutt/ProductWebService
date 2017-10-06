package com.northcutt.product.ws;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

/**
 * Created by pnorthcutt on 10/3/2017.
 */
@WebListener
public class ProductServiceWebPublisher implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        Endpoint.publish("http://localhost:9999/ws/productService", new ProductServiceImp());
    }
}
