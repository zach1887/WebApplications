/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

/**
 *
 * @author Jesse
 */

//Given 2 Strings, a and b, return the number of the positions where 
//they contain the same length 2 subString. So "xxcaazz" and "xxbaaz" 
//yields 3, since the "xx", "aa", and "az" subStrings appear in the 
//same place in both Strings. 
//
//subStringMatch("xxcaazz", "xxbaaz") -> 3
//subStringMatch("abc", "abc") -> 2
//subStringMatch("abc", "axc") -> 0

public class SubStringMatch {
  public int subStringMatch(String a, String b) {
  int min = a.length();
  if (b.length() < a.length())
      min = b.length();
  int count = 0;
  if (min < 2) return 0;
  
      for (int i = 0; i < min - 1; i++) {
          if (a.substring(i,i+2).equals(b.substring(i,i+2)))
          count++;
      }
      return count;
}  
}
