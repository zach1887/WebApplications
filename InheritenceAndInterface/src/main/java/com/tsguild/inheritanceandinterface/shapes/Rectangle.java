/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.shapes;

/**
 *
 * @author apprentice
 */
public class Rectangle extends Shape {

    private double side1Length, side2Length;

    public Rectangle() {
        super();
    }

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1Length = side1;
        this.side2Length = side2;

    }

    @Override
    public double Area() {
        if (side1Length <= 0 || side2Length <= 0) {
            System.out.println("This figure is not a rectangle");
            return 0;
        }
        return side1Length * side2Length;
    }

    @Override
    public double Perimeter() {
        if (side1Length <= 0 || side2Length <= 0) {
            System.out.println("This figure is not a rectangle");
            return 0;
        }
            return 2 * side1Length + 2 * side2Length;
        }
    }
