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
public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double Area() {
        if (radius <= 0) {
            System.out.println("That is not a circle.");
            return 0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double Perimeter() {
        if (radius <= 0) {
            System.out.println("That is not a circle.");
            return 0;
        }
        return 2 * Math.PI * radius;
    }
}
