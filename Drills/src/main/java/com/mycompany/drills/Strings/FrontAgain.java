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

//Given a String, return true if the first 2 chars in the 
//\String also appear at the end of the String, such as with "edited". 
//
//frontAgain("edited") -> true
//frontAgain("edit") -> false
//frontAgain("ed") -> true

public class FrontAgain {
    public boolean frontAgain(String str) {
    if (str.length() < 2) return false;
    
    return(str.substring(0,2).equals(str.substring(str.length()-2)));
}

}
