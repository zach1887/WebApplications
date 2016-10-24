/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

/**
 *
 * @author Jesse
 */

//Given two Strings, append them together (known as "concatenation") and return the result. 
//However, if the Strings are different lengths, omit chars from the longer String so it
//is the same length as the shorter String. So "Hello" and "Hi" yield "loHi". The Strings may be any length. 
//
//minCat("Hello", "Hi") -> "loHi"
//minCat("Hello", "java") -> "ellojava"
//minCat("java", "Hello") -> "javaello"


public class MinCat {
    public String minCat(String a, String b) {
    int min = a.length();
    if (b.length() < a.length()) min = b.length();
    
    return a.substring(a.length()-min) + b.substring(0,min);
}

}
