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
//Given an int n, return true if it is within 10 of 100 or 200.
//Hint: Check out the Math class for absolute value
//
//nearHundred(103) -> true
//nearHundred(90) -> true
//nearHundred(89) -> false


public class NearHundred {
   public boolean nearHundred(int n) {
    return (Math.abs(n-200) <=10 || Math.abs(n-100) <= 10);
} 
}
