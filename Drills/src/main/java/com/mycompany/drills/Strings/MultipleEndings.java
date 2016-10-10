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
//Given a String, return a new String made of 3 copies of the last 
//2 chars of the original String. The String length will be at least 2. 
//
//multipleEndings("Hello") -> "lololo"
//multipleEndings("ab") -> "ababab"
//multipleEndings("Hi") -> "HiHiHi"

public class MultipleEndings {
    

public String multipleEndings(String str) {

    if (str.length() < 2){
        System.out.println("String length must be at least two.");
        return "";
    }
    int x = str.length();
    String temp = str.substring(x-2);
    String output = temp + temp + temp;
    return output;
    
}
    
}
