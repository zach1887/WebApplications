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

//Given a String, return a "rotated right 2" version 
//where the last 2 chars are moved to the start. The 
//String length will be at least 2. 
//
//rotateRight2("Hello") -> "loHel"
//rotateRight2("java") -> "vaja"
//rotateRight2("Hi") -> "Hi"

public class RotateRight2 {
 
    public String rotateRight2(String str) {
 if (str.length() < 2) return null;
 return (str.substring(str.length()-2) + str.substring(0,str.length()-2));
}

}
