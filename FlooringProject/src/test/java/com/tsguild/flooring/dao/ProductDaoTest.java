package com.tsguild.flooring.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tsguild.flooring.dto.Product;
import java.util.Set;
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
public class ProductDaoTest {

    ProductDaoImpl pdao;

    public ProductDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pdao = new ProductDaoImpl();
        pdao.loadFromFile();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getProductTest1() {
        Product hopeItsCarpet = new Product("Carpet", 2.25, 2.10);
        Product hopeItsLaminate = new Product("Laminate", 1.75, 2.10);
        Product hopeItsTile = new Product("Tile", 3.50, 4.15);
        Product hopeItsWood = new Product("Wood", 5.15, 4.75);
        Product carpetProd = pdao.getProduct("Carpet");
        Product laminateProd = pdao.getProduct("Laminate");
        Product tileProd = pdao.getProduct("Tile");
        Product woodProd = pdao.getProduct("Wood");

        Assert.assertEquals("Carpet does not match", hopeItsCarpet.getMaterialName(), carpetProd.getMaterialName());
        Assert.assertEquals("Carpet does not match", hopeItsCarpet.getMaterialCostPerSqFt(), carpetProd.getMaterialCostPerSqFt(), .001);
        Assert.assertEquals("Carpet does not match", hopeItsCarpet.getLaborCostPerSqFt(), carpetProd.getLaborCostPerSqFt(), .001);

        Assert.assertEquals("Laminate does not match", hopeItsLaminate.getMaterialName(), laminateProd.getMaterialName());
        Assert.assertEquals("Laminate does not match", hopeItsLaminate.getMaterialCostPerSqFt(), laminateProd.getMaterialCostPerSqFt(), .001);
        Assert.assertEquals("Laminate does not match", hopeItsLaminate.getLaborCostPerSqFt(), laminateProd.getLaborCostPerSqFt(), .001);

        Assert.assertEquals("Tile does not match", hopeItsTile.getMaterialName(), tileProd.getMaterialName());
        Assert.assertEquals("Tile does not match", hopeItsTile.getMaterialCostPerSqFt(), tileProd.getMaterialCostPerSqFt(), .001);
        Assert.assertEquals("Tile does not match", hopeItsTile.getLaborCostPerSqFt(), tileProd.getLaborCostPerSqFt(), .001);

        Assert.assertEquals("Wood does not match", hopeItsWood.getMaterialName(), woodProd.getMaterialName());
        Assert.assertEquals("Wood does not match", hopeItsWood.getMaterialCostPerSqFt(), woodProd.getMaterialCostPerSqFt(), .001);
        Assert.assertEquals("Wood does not match", hopeItsWood.getLaborCostPerSqFt(), woodProd.getLaborCostPerSqFt(), .001);

    }

    @Test
    public void listAllValuesTest() {
        Set<String> allProducts = pdao.listAllValues();

        Assert.assertEquals("Result not as expected", 4, allProducts.size());
        Assert.assertTrue("Result not as expected", allProducts.contains("Carpet"));
        Assert.assertTrue("Result not as expected", allProducts.contains("Laminate"));
        Assert.assertTrue("Result not as expected", allProducts.contains("Wood"));
        Assert.assertTrue("Result not as expected", allProducts.contains("Tile"));
        Assert.assertFalse("Result not as expected", allProducts.contains("carpet"));
        Assert.assertFalse("Result not as expected", allProducts.contains(""));
        Assert.assertFalse("Result not as expected", allProducts.contains(" "));
        Assert.assertFalse("Result not as expected", allProducts.contains(" Wood "));
    }
//  
//

}
