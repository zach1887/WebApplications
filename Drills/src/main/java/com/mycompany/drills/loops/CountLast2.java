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
//Given a String, return the count of the number of times that a 
//subString length 2 appears in the String and also as the last
//2 chars of the String, so "hixxxhi" yields 1 (we won't 
//count the end subString). 
//
//countLast2("hixxhi") -> 1
//countLast2("xaxxaxaxx") -> 1
//countLast2("axxxaaxx") -> 2
public class CountLast2 {

    public int countLast2(String str) {
        if (str.length() <= 2) {
            System.out.println("String must be at least length 3 for this test.");
            return 0;
        }
        int count = 0;
        int length = str.length();
        String lastTwo = str.substring(length-2,length);
        for (int i = 0; i <= length - 3; i++) {
            if (str.substring(i,i+2).equals(lastTwo)) count++; 
        }
        return count;

    }
}
