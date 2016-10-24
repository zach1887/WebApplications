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
//Given an int array length 3, if there is a 2 in the 
//array immediately followed by a 3, set the 3 element 
//to 0. Return the changed array. 
//
//fix23({1, 2, 3}) ->{1, 2, 0}
//fix23({2, 3, 5}) -> {2, 0, 5}
//fix23({1, 2, 1}) -> {1, 2, 1}


public class Fix23 {
public int[] fix23(int[] numbers) {
 if (numbers.length == 3) {
     if (numbers[0] == 2 && numbers[1] == 3)
             numbers[1]=0;
     if (numbers[1] == 2 && numbers[2] == 3)
             numbers[2]=0;   
 }
  
     return numbers;
}    
}
