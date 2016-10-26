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
//Given a String and an int n, return a String made of 
//the first and last n chars from the String. The String 
//length will be at least n. 
//
//frontAndBack("Hello", 2) -> "Helo"
//frontAndBack("Chocolate", 3) -> "Choate"
//frontAndBack("Chocolate", 1) -> "Ce"
//


public class FrontAndBack {
 public String frontAndBack(String str, int n) {
  if (n == 0 || str.length() == 0) return "";
  return (str.substring(0,n) + str.substring(str.length()-n));
}   
}
