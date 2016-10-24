/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

/**
 *
 * @author Jesse
 */
//Return true if the given non-negative number 
//is a multiple of 3 or 5, but not both. Use the % "mod" operator
//
//mod35(3) â†’ true
//mod35(10) â†’ true
//mod35(15) â†’ false


public class Mod35 {
   
    public boolean mod35(int n) {
     if (n % 15 == 0) return false;
     return (n % 3 == 0 || n % 5 == 0);
}

}
