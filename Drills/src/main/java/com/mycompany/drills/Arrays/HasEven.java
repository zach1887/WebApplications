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

//Given an int array , return true if it 
//contains an even number (HINT: Use Mod (%)). 
//
//hasEven({2, 5}) -> true
//hasEven({4, 3}) -> true
//hasEven({7, 5}) -> false


public class HasEven {
  public boolean hasEven(int[] numbers) {
   if (numbers.length == 0)
       return false;
      for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] % 2 == 0)
              return true;
      }
      return false;
}  
}
