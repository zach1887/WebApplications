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
public class LoveSix {
//    
//    The number 6 is a truly great number. Given two int values, a and b, 
//    return true if either one is 6. Or if their sum or difference is 6.
//
//loveSix(6, 4) â†’ true
//loveSix(4, 5) â†’ false
//loveSix(1, 5) â†’ true

public boolean loveSix(int a, int b) {
   
    if (a == 6 || b ==6)
        return true;
    else if ((a+b) == 6 || Math.abs(a-b) ==6 )
        return true;
    else return false;
  
}

}
