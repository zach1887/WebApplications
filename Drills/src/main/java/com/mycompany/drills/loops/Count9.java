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
//
//Given an array of ints, return the number of 9's in the array. 
//
//count9({1, 2, 9}) -> 1
//count9({1, 9, 9}) -> 2
//count9({1, 9, 9, 3, 9}) -> 3


public class Count9 {
  public int count9 (int[] numbers) {
      
     if (numbers.length == 0) return 0;
      int count = 0; 
      for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 9) count++;         
      }
      return count;
  }  
}
