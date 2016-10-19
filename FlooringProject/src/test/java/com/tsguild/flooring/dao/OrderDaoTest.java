package com.tsguild.flooring.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tsguild.flooring.dto.Order;
import java.io.IOException;
import java.util.Collection;
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
    Order[] testOrdersAllArgs = {
        new Order(16, "Jim Beam", "TN", 0.0, "Laminate", 100.0, 1.75, 2.1, 0.0, 0.0, 0.0, 385.0),
        new Order(18, "Joe Schmoe", "IN", 0.0, "", 100.0, 1.75, 2.1, 0.0, 0.0, 0.0, 400.0),
        new Order(34, "Barry Bingham", "KY", 0.0, "Laminate", 100.0, 1.75, 2.1, 0.0, 0.0, 0.0, 450.0),
        new Order(126, "Jerry Justice", "TN", 0.0, "Carpet", 100.0, 2.25, 2.1, 0.0, 0.0, 0.0, 485.0),
        new Order(277, "Bill", "MC", 0.0, "Laminate", 100.0, 1.75, 2.1, 0.0, 0.0, 0.0, 1078.0)
    };

    Order[] testOrdersPartialArgs = {
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
    public void addOrderTest() throws IOException {
        dao.addOrders("01202016", testOrdersAllArgs[0]);
        Order output = dao.getOrder("01202016", 16);
        Assert.assertEquals(output, testOrdersAllArgs[0]);
    }

    @Test
    public void getOrderTest() throws IOException {
        for (Order o : testOrdersAllArgs) {
            dao.addOrders("06302016", o);
        }
        Assert.assertEquals(5, dao.displayOrders("06302016").size());
        Order output = dao.getOrder("06302016", 16);
        Assert.assertEquals(output, testOrdersAllArgs[0]);
        Order output1 = dao.getOrder("06302016", 18);
        Assert.assertEquals(output1, testOrdersAllArgs[1]);
        Order output2 = dao.getOrder("06302016", 34);
        Assert.assertEquals(output2, testOrdersAllArgs[2]);
        Order output3 = dao.getOrder("06302016", 126);
        Assert.assertEquals(output3, testOrdersAllArgs[3]);
        Order output4 = dao.getOrder("06302016", 277);
        Assert.assertEquals(output4, testOrdersAllArgs[4]);
    }

    @Test
    public void removeOrderTest() throws IOException {
        for (Order o : testOrdersAllArgs) {
            dao.addOrders("07302016", o);
        }
        Order drop16 = dao.getOrder("07302016", 16);
        dao.removeOrder("07302016", 16);
        Assert.assertNull(dao.getOrder("07302016", 16));
        Assert.assertEquals(4, dao.displayOrders("07302016").size());
    }

    @Test
    public void displayOrdersTest() throws IOException {
        for (Order o : testOrdersAllArgs) {
            dao.addOrders("08302016", o);
        }
        Collection<Order> coll = dao.displayOrders("08302016");
        
        Assert.assertEquals("Result not as expected",5,coll.size());
        Assert.assertEquals("Result not as expected",3, coll.stream().filter(f -> f.getProductType().contains("Lam")).count());
        Assert.assertEquals("Result not as expected",2, coll.stream().filter(f -> f.getStateAbbrev().contains("TN")).count());
    }

}
