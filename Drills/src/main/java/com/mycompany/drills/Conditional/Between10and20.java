/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

/**
 *
 * @author Jesse
// */
//Given 2 int values, return true if either 
//of them is in the range 10..20 inclusive. 
//
//between10and20(12, 99) -> true
//between10and20(21, 12) -> true
//between10and20(8, 99) -> false
public class Between10and20 {

    public boolean between10and20(int a, int b) {
       return ((a >=10 && a <=20) || (b>=10 && b<=20));
    }

}
