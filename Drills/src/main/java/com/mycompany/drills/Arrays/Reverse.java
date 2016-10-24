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

//Given an array of ints length 3, return a new array 
//with the elements in reverse order, so for example 
//{1, 2, 3} becomes {3, 2, 1}. 


public class Reverse {
  public int[] reverse(int[] numbers) {
  int [] newNumbers = new int[3];
  newNumbers[0] = numbers[2];
  newNumbers[1] = numbers[1];
  newNumbers[2] = numbers[0];
  return newNumbers;
}  
}
