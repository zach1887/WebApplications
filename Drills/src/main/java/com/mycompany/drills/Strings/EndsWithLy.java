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
//Given a String, return true if it ends in "ly". 
//
//endsWithLy("oddly") -> true
//endsWithLy("y") -> false
//endsWithLy("oddy") -> false


public class EndsWithLy {
  public boolean endsWithLy(String str) { 

      if (str.length() < 2) return false;
      return str.substring(str.length()-2).equals("ly");
}  
}
