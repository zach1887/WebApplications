/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

/**
 *
 * @author Jesse
 */
//
//We'll say that a number is "teen" if it is in the range 13..19 
//inclusive. Given 2 int values, return true if one or the other is teen, but not both. 
//
//soAlone(13, 99) -> true
//soAlone(21, 19) -> true
//soAlone(13, 13) -> false



public class SoAlone {
 public boolean soAlone(int a, int b) {
  boolean aIsTeen = (a >=13 && a <=19);
  boolean bIsTeen = (b >=13 && b <=19);
  
  return ((aIsTeen && !bIsTeen) || (!aIsTeen && bIsTeen));
}   
}
