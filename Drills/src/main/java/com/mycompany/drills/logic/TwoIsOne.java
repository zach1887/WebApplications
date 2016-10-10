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
//Given three ints, a b c, return true if it is possible to add two of the ints to get the third. 
//
//twoIsOne(1, 2, 3) â†’ true
//twoIsOne(3, 1, 2) â†’ true
//twoIsOne(3, 2, 2) â†’ false



public class TwoIsOne {
public boolean twoIsOne(int a, int b, int c) {
    
    if(a + b == c)
        return true;
    if (a + c == b)
        return true;
    if (b + c == a)
        return true;
    return false;
  
}    
}
