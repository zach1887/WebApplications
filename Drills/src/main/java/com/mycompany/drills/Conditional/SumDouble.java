/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

/**
 *
 * @author Jesse
 */

//Given two int values, return their sum. However, if the two values 
// are the same, then return double their sum. 
//
//sumDouble(1, 2) -> 3
//sumDouble(3, 2) -> 5
//sumDouble(2, 2) -> 8



public class SumDouble {
  
    public int sumDouble(int a, int b) {
        
        if (a != b)
            return a+b;
        else 
            return 4*a;
  
}
}
