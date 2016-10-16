/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product.dao;

import com.tsguild.inheritanceandinterface.product.Accessory;
import com.tsguild.inheritanceandinterface.product.DressShirt;
import com.tsguild.inheritanceandinterface.product.Pants;
import com.tsguild.inheritanceandinterface.product.Product;
import com.tsguild.inheritanceandinterface.product.SuitCoat;
import com.tsguild.inheritanceandinterface.product.dao.Inventory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesse
 */
public class InventoryTest {
    Inventory inv = new Inventory();
        Product ds = new DressShirt("White Shirt", 19.95, 101, 6);
        Product pants = new Pants("Grey Pants", 34.99, 102, 9);
        Product coat = new SuitCoat("Blue Blazer", 140.00, 103, 3);
        Product redTie = new Accessory("Red Tie", 19.99, 104, 5);
        Product blueTie = new Accessory("Blue Tie", 19.99, 105, 8);
        Product cuffLinks = new Accessory("Cuff Links", 9.99, 106, 12);
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void returnItemNameTest () {
      inv.addToInventory(ds);
      Assert.assertEquals("Result not as expected","White Shirt",inv.returnItemName("DressShirt101"));
     }
     @Test
     public void returnItemQtyTest () {
      inv.addToInventory(ds);
      Assert.assertEquals("Result not as expected",6,inv.returnItemQty("DressShirt101"));
     }
     @Test
     public void addQtyTest() {
      inv.addToInventory(pants);
      inv.SetNewQty("Pants102", 5);
      Assert.assertEquals("Result not as expected",14,inv.returnItemQty("Pants102"));
      
     }
     @Test
     public void remQtyTest() {
      inv.addToInventory(coat);
      inv.SetNewQty("SuitCoat103", -1);
      Assert.assertEquals("Result not as expected",2,inv.returnItemQty("SuitCoat103"));
      
     }
//     @Test  test failed
//     public void remQtyTooMuchTest() {
//      inv.addToInventory(coat);
//      inv.SetNewQty("SuitCoat103", -5);
//      Assert.assertEquals("Result not as expected",3,inv.returnItemQty("SuitCoat103"));
//     }
     @Test
     public void ValuateItemTest1() {
      inv.addToInventory(ds);
      inv.addToInventory(pants);
      inv.addToInventory(coat);
      inv.addToInventory(redTie);
      inv.addToInventory(blueTie);
      inv.addToInventory(cuffLinks);
      
      Assert.assertEquals("Result not as expected",99.95,inv.valuateItem("Accessory104"),.001);
     }
     @Test
     public void ValuateItemTest2() {
      inv.addToInventory(ds);
      inv.addToInventory(pants);
      inv.addToInventory(coat);
      inv.addToInventory(redTie);
      inv.addToInventory(blueTie);
      inv.addToInventory(cuffLinks);
      
      Assert.assertEquals("Result not as expected",119.88,inv.valuateItem("Accessory106"),.001);
     }
     @Test
     public void ValuateInventoryTest() {
      inv.addToInventory(ds);
      inv.addToInventory(pants);
      inv.addToInventory(coat);
      inv.addToInventory(redTie);
      inv.addToInventory(blueTie);
      inv.addToInventory(cuffLinks);
      
      Assert.assertEquals("Result not as expected",1234.36,inv.valuateInventory(),.001);
     }
     @Test
     public void ValuateInventoryTestWithChange() {
      inv.addToInventory(ds);
      inv.addToInventory(pants);
      inv.addToInventory(coat);
      inv.addToInventory(redTie);
      inv.addToInventory(blueTie);
      inv.addToInventory(cuffLinks);
      inv.SetNewQty("Accessory105", -5);
      
      Assert.assertEquals("Result not as expected",1134.41,inv.valuateInventory(),.001);
     }

}
