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
public class Square extends Shape {
    private double sideLength;
    
    public Square() {
        super();
    }
    
    @Override
    public double Area() {
        return Math.pow(sideLength, 2);
    }
    
    @Override
    public double Perimeter() {
        return 4*sideLength;
    }
    
}
