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
public class LetsDrawSomeShapes {
    
    public static void main(String[] args) {
        
   
    Circle circ = new Circle("blue", 8);
    
    Double x = circ.Area();
    Double y = circ.Perimeter();
    
    System.out.println("The area of my " + circ.color + " circle is " + x + ".") ;
    System.out.println("The perimeter of my " + circ.color + " circle is " + y + ".");
    
    
   
    }
    
}
