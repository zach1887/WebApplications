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

//Given 2 Strings, a and b, return a String of the form 
//short+long+short, with the shorter String on the outside 
//and the longer String on the inside. The Strings will not 
//be the same length, but they may be empty (length 0). 

//longInMiddle("Hello", "hi") -> "hiHellohi"
//longInMiddle("hi", "Hello") -> "hiHellohi"
//longInMiddle("aaa", "b") -> "baaab"

public class LongInMiddle {
  public String longInMiddle(String a, String b) {

      if (a.length() > b.length())
          return b + a + a + b;
      if (a.length() < b.length())
          return a + b + b + a;
      return null;
}
  
}
