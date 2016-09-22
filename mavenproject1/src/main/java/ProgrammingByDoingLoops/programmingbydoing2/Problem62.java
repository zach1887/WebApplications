/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing2;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Problem62 {
    public static void main(String[] args) {
        
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer greater than 1:  ");
        userNumber = sc.nextInt();
        
        while (userNumber < 1) {
            System.out.println("Not a valid integer.");
            System.out.print("Enter an integer greater than 1:  ");
            userNumber = sc.nextInt();            
        }

        do {
            if (userNumber % 2 ==0)
                userNumber = userNumber/2;
            else if (userNumber % 2 ==1)
                userNumber = 3*userNumber + 1;
            System.out.print(userNumber + " ");
        }
        while(userNumber >1);
    if (userNumber != 1)
            System.out.println("There must be an error.");
    }
    
}
