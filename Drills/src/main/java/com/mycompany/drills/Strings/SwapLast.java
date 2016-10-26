/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

/**
 *
 * @author Jesse
// */
//Given a String of any length, return a new String where the 
//last 2 chars, if present, are swapped, so "coding" yields "codign". 
//
//swapLast("coding") -> "codign"
//swapLast("cat") -> "cta"
//swapLast("ab") -> "ba"


public class SwapLast {
    public String swapLast(String str) {
    if (str.length()<2) return str;
    
    return str.substring(0, str.length()-2) + str.substring(str.length() -1) 
            + str.substring(str.length() -2,str.length() -1);
}

}
