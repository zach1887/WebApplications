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
//Given a non-empty String and an int n, return a new String 
//where the char at index n has been removed. The value of n 
//will be a valid index of a char in the original String 
//(Don't check for bad index). 
//
//missingChar("kitten", 1) -> "ktten"
//missingChar("kitten", 0) -> "itten"
//missingChar("kitten", 4) -> "kittn"

public class MissingChar {
   public String missingChar(String str, int n) {
    if (n >= str.length())
            return str;
    if (n ==0)
        return str.substring(1);
    return str.substring(0,n) + str.substring(n+1);
} 
}
