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
public class SpecialEleven {
  
//We'll say a number is special if it is a multiple of 11 or if it is one more 
//        than a multiple of 11. Return true if the given non-negative number is 
//                special. Use the % "mod" operator
//
//specialEleven(22) â†’ true
//specialEleven(23) â†’ true
//specialEleven(24) â†’ false
    public boolean specialEleven(int n) {

        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        } else {
            return false;
        }
    
}

    
}
