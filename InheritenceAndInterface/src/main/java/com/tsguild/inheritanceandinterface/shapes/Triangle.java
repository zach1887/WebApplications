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
public class Triangle extends Shape {

    private double side1Length, side2Length, side3Length;
    double semi;

    public Triangle() {
        super();
    }

    public Triangle(String color, double side1Length, double side2Length, double side3Length) {
        super(color);
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
    }

    @Override
    public double Area() {
        if (side1Length >= (side2Length + side3Length)
                || side2Length >= (side1Length + side3Length)
                || side3Length >= (side1Length + side2Length)) {
            System.out.println("These sides do not represent a triangle.");
            return 0;
        } else {
            semi = (side1Length + side2Length + side3Length) / 2;
            return Math.sqrt(semi * (semi - side1Length) * (semi - side2Length) * (semi - side3Length));
        }
    }

    @Override
    public double Perimeter() {
        if (side1Length >= (side2Length + side3Length)
                || side2Length >= (side1Length + side3Length)
                || side3Length >= (side1Length + side2Length)) {
            System.out.println("These sides do not represent a triangle.");
            return 0;
        }
            return side1Length + side2Length + side3Length;
        }
    }
