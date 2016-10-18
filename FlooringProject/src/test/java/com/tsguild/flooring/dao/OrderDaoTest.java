package com.tsguild.flooring.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tsguild.flooring.dto.Order;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class OrderDaoTest {
    OrderDaoImpl dao;
            Order [] testOrdersAllArgs = {
        new Order(16,"Jim Beam","TN",0.0,"Laminate",100.0,1.75,2.1,0.0,0.0,0.0,385.0),
        new Order(18,"Joe Schmoe","IN",0.0,"",100.0,1.75,2.1,0.0,0.0,0.0,400.0),
        new Order(34,"Barry Bingham","KY",0.0,"Laminate",100.0,1.75,2.1,0.0,0.0,0.0,450.0),
        new Order(126,"Jerry Justice","TN",0.0,"Carpet",100.0,2.25,2.1,0.0,0.0,0.0,485.0),
        new Order(277,"Bill","MC",0.0,"Laminate",100.0,1.75,2.1,0.0,0.0,0.0,1078.0)
        };
                
        Order [] testOrdersPartialArgs = {
         new Order("Jim Jones", "OH", "Wood", 235),
         new Order("Katy Kapstone", "HI", "Wood", 1.5),
         new Order("Lucious Lemmons", "OH", "Carpet", 100),
         new Order("Mr Monster", "PA", "Tile", 899)
        };
    public OrderDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dao = new OrderDaoImpl();
  
            
        }        
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void addOrderTestAll() throws IOException {
     dao.addOrders("01202016", testOrdersAllArgs[0]);
     dao.saveAllChanges();
     Order output = dao.getOrder("01202016", 16);
     Assert.assertEquals(output,testOrdersAllArgs[0]);
     }
     
     @Test
     public void addOrderTestPartial() throws IOException {
     dao.addOrders("01202016", testOrdersPartialArgs[0]);
//     dao.saveAllChanges();
     Order output = new Order();
     output = dao.getOrder("01202016", output.getOrderNumber());
     Assert.assertEquals("Jim Jones",output.getCustomerName());
     Assert.assertEquals("OH",output.getStateAbbrev());
     Assert.assertEquals("Wood",output.getProductType());
     Assert.assertEquals(235,output.getSquareFT(),.5);
     Assert.assertEquals(1210.25,output.getMaterialCost(),.005);
     Assert.assertEquals(1116.25,output.getLaborCost(),.005);
     Assert.assertEquals(145.41,output.getCompTax(),.005);
     Assert.assertEquals(2471.91,output.getTotalAmt(),.005);
     }
     
     
}
