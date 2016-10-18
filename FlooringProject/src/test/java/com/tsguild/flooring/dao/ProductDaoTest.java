package com.tsguild.flooring.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void getMaterialNameTest() {
        Assert.assertEquals("Material name doesn't match", "Carpet", pdao.getMaterialName("Carpet"));
        Assert.assertEquals("Material name doesn't match", "Laminate", pdao.getMaterialName("Laminate"));
        Assert.assertEquals("Material name doesn't match", "Tile", pdao.getMaterialName("Tile"));
        Assert.assertEquals("Material name doesn't match", "Wood", pdao.getMaterialName("Wood"));
    }

    @Test
    public void getMaterialNameNullTest() {
        Assert.assertEquals("No name should return", null, pdao.getMaterialName("carpet"));
        Assert.assertEquals("No name should return", null, pdao.getMaterialName("Laminant"));
        Assert.assertEquals("No name should return", null, pdao.getMaterialName("Tile "));
        Assert.assertEquals("No name should return", null, pdao.getMaterialName("wod"));
        Assert.assertEquals("No name should return", null, pdao.getMaterialName(""));
    }
    @Test
    public void getMaterialCostTest() {
        Assert.assertEquals("Material cost doesn't match", 2.25, pdao.getMaterialCost("Carpet"),.001);
        Assert.assertEquals("Material cost doesn't match", 1.75, pdao.getMaterialCost("Laminate"),.001);
        Assert.assertEquals("Material cost doesn't match", 3.50, pdao.getMaterialCost("Tile"),.001);
        Assert.assertEquals("Material cost doesn't match", 5.15, pdao.getMaterialCost("Wood"),.001);
    }
        @Test
    public void getLaborCostTest() {
        Assert.assertEquals("Material cost doesn't match", 2.10, pdao.getLaborCost("Carpet"),.001);
        Assert.assertEquals("Material cost doesn't match", 2.10, pdao.getLaborCost("Laminate"),.001);
        Assert.assertEquals("Material cost doesn't match", 4.15, pdao.getLaborCost("Tile"),.001);
        Assert.assertEquals("Material cost doesn't match", 4.75, pdao.getLaborCost("Wood"),.001);
    }
}
