/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

/**
 *
 * @author Jesse
 */
//
//Given a number n, return true if n is in the range 1..10, inclusive. 
//Unless "outsideMode" is true, in which case return true if the 
//number is less or equal to 1, or greater or equal to 10. 
//
//inRange(5, false) â†’ true
//inRange(11, false) â†’ false
//inRange(11, true) â†’ true


public class InRange {
 
    public boolean inRange(int n, boolean outsideMode) {
  boolean inside = (n >= 1 && n <=10);
  
  if (n == 1 || n == 10) return true;
  return ((inside && !outsideMode) || (!inside && outsideMode));
}
}
