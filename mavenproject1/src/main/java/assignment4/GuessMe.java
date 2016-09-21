/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class GuessMe {
    public static void main(String[] args) {
     final int MY_NUMBER = 64;
     int userGuess;
     
     System.out.println("I have selected a number from 1- 100.  Try to guess it.");
     System.out.print("Your guess:  ");
     Scanner sc = new Scanner(System.in);
     userGuess = sc.nextInt();
     
     if (userGuess == MY_NUMBER)
            System.out.println("Nice guess - nailed it!");
     else if (userGuess < MY_NUMBER)
            System.out.println("Too low, I chose " + MY_NUMBER);
     else if (userGuess > MY_NUMBER)
            System.out.println("Too high, I chose " + MY_NUMBER);
     else System.out.println("Something went wrong.");     
     
     
     
    }
}
