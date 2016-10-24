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
//Given three ints, a b c, return true if two or more 
//of them have the same rightmost digit. The ints are non-negative. 
//
//lastDigit(23, 19, 13) â†’ true
//lastDigit(23, 19, 12) â†’ false
//lastDigit(23, 19, 3) â†’ true

public class LastDigit {

    public boolean lastDigit(int a, int b, int c) {
     int rem10a = a % 10;
     int rem10b = b % 10;
     int rem10c = c % 10;
     
     return ((rem10a == rem10b) || (rem10a == rem10c) || (rem10b == rem10c));
    }
}
