package com.northcutt.product.dao;

import com.northcutt.product.dto.Product;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pnorthcutt on 9/29/2017.
 */
public class ProductDAOTest {
    ProductDAO classUnderTest;
    @Before
    public void setup(){
        classUnderTest=new ProductDAO();

    }
    @Test
    public void testGetByName(){
        Product result = classUnderTest.getProductByName("widget2");
        assertEquals("2",result.getProductCode());
    }
}
