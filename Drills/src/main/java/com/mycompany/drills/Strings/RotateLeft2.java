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
//
//Given a String, return a "rotated left 2" version where the 
//first 2 chars are moved to the end. The String length will
//be at least 2. 
//
//rotateLeft2("Hello") -> "lloHe"
//rotateLeft2("java") -> "vaja"
//rotateLeft2("Hi") -> "Hi"

public class RotateLeft2 {
 public String rotateLeft2(String str) {
     if (str.length()<2) return null;
     return (str.substring(2,str.length()) + str.substring(0, 2));
 }   
}
