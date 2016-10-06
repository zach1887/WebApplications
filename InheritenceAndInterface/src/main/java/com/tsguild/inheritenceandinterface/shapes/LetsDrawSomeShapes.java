/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritenceandinterface.shapes;

import java.text.DecimalFormat;

/**
 *
 * @author apprentice
 */
public class LetsDrawSomeShapes {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.000");
        
   
    Circle circ = new Circle("blue", 8);
    
    Double x = circ.Area();
    Double y = circ.Perimeter();
    
    System.out.println("The area of my " + circ.color + " circle is " 
                        + df.format(circ.Area())+ ".") ;
    System.out.println("The perimeter of my " + circ.color
                        + " circle is " + df.format(circ.Perimeter()) + ".");
    
    Triangle tri = new Triangle("red", 3, 4, 5);
     
    System.out.println("The area of my " + tri.color + " triangle is "
                        + df.format(tri.Area()) + ".");
    System.out.println("The perimeter of my " + tri.color + " triangle is "
                        + df.format(tri.Perimeter()) + ".");
    
    Triangle tri3 = new Triangle("green", 3, 4, 10);
     
    System.out.println("The area of my " + tri3.color + " triangle is "
                        + df.format(tri3.Area()) + ".");
    System.out.println("The perimeter of my " + tri3.color + " triangle is "
                        + df.format(tri3.Perimeter()) + ".");
    
    
    
    
    
   
    }
    
}
