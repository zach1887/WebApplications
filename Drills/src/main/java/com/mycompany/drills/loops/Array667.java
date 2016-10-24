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
//Given an array of ints, return the number of times that 
//two 6's are next to each other in the array. Also count 
//instances where the second "6" is actually a 7. 
//array667({6, 6, 2}) -> 1
//array667({6, 6, 2, 6}) -> 1
//array667({6, 7, 2, 6}) -> 1
public class Array667 {

    public int array667(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == 6 && (numbers[i+1] == 6 || numbers[i+1] == 7))
                    count++;
        }
        return count;
    }

}
