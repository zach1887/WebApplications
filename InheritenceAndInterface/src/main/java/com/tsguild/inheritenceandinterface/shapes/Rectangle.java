/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritenceandinterface.shapes;

/**
 *
 * @author apprentice
 */
public class Rectangle extends Shape {
    
    private double side1Length, side2Length;
    
    public Rectangle() {
        super();
    }
    
    @Override
    public double Area() {
        return side1Length*side2Length;  
    }
    
    @Override
    public double Perimeter () {
       return 2*side1Length + 2*side2Length;
    }
}
