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

//Given a String, return a String length 2 made of 
//its first 2 chars. If the String length is less than 
//2, use '@' for the missing chars. 
//
//atFirst("hello") -> "he"
//atFirst("hi") -> "hi"
//atFirst("h") -> "h@"



public class AtFirst {
    public String atFirst(String str) {
        if (str.length() == 0) return "@@";
        if (str.length() == 1) return str + "@";
        return str.substring(0,2);

}
}
