/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Arrays;

/**
 *
 * @author Jesse //
 */
//
//Given 2 arrays of ints, a and b, return true if 
//they have the same first element or they have the 
//same last element. Both arrays will be length 1 or more. 
//
//commonEnd({1, 2, 3}, {7, 3}) -> true
//commonEnd({1, 2, 3}, {7, 3, 2}) -> false
//commonEnd({1, 2, 3}, {1, 3}) -> true
public class CommonEnd {

    public boolean commonEnd(int[] a, int[] b) {
      if (a.length == 0 || b.length == 0)
          return false;
      return (a[0] == b[0] || a[a.length-1] == b[b.length -1]);
    }
}
