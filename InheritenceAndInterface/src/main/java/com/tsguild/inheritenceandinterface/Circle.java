/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritenceandinterface;

/**
 *
 * @author apprentice
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
    }
    
    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double Area() {
      return Math.PI*Math.pow(radius,2);  
    }
    
    @Override
    public double Perimeter() {
      return 2*Math.PI*radius; 
    }
}
