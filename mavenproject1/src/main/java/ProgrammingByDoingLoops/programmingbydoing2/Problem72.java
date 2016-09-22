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
public class Problem72 {
    public static void main(String[] args) {
     String messageTyped;
    int numberA = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your message?  ");
    messageTyped = sc.nextLine();
    
    System.out.println("Your message is " + messageTyped.length() 
                         + " characters long");
    System.out.println(" Your first character is at position 0 and is"
            + messageTyped.charAt(0));
    System.out.println(" Your last character is at position" + (messageTyped.length() - 1)
            + "and is" + messageTyped.charAt(messageTyped.length()-1));
    System.out.println("Here are all the characters, one at a time:");
    
        for (int j = 0; j < messageTyped.length(); j++) {
            char k = messageTyped.charAt(j); 
            System.out.println( j + "- " +  k );
            if ((k == 'a') || (k == 'A')) numberA++;
        }
        System.out.println("Your message contains " + numberA + " a's.  Please contain your excitement.");      
        
}
}
