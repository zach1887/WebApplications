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
abstract public class Shape {
    protected String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public double Area ();
    
    abstract public double Perimeter ();
    
}
