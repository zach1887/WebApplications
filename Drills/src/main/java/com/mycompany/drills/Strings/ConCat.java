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

//Given two Strings, append them together (known as "concatenation") 
//and return the result. However, if the concatenation creates a 
//double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". 
//
//conCat("abc", "cat") -> "abcat"
//conCat("dog", "cat") -> "dogcat"
//conCat("abc", "") -> "abc"


public class ConCat {
  public String conCat(String a, String b) {
      if (a.length() == 0 || b.length() == 0 )
          return a + b;
      if (a.charAt(a.length()-1) == b.charAt(0))
          return a + b.substring(1);
      return a + b;
      

}  
}
