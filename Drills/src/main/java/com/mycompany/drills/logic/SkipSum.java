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
//
//Given 2 ints, a and b, return their sum. However, sums in the range 
//10..19 inclusive are forbidden, so in that case just return 20. 
//
//skipSum(3, 4) â†’ 7
//skipSum(9, 4) â†’ 20
//skipSum(10, 11) â†’ 21



public class SkipSum {
 
    public int skipSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <=19)
            return 20;
        return a + b;
  
}
}
