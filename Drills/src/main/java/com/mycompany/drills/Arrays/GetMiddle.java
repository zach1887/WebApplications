/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Arrays;

/**
 *
 * @author Jesse
 */
//
//Given 2 int arrays, a and b, each length 3, 
//return a new array length 2 containing their middle elements. 
//
//getMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5}
//getMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8}
//getMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4}


public class GetMiddle {
  public int[] getMiddle(int[] a, int[] b) {
  int [] newNumbers = new int[2];
  newNumbers[0] = a[1];
  newNumbers[1] = b[1];
  return newNumbers;
}  
}
