/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Problem47 {
    public static void main(String[] args) {
        
        int actualCard, playerCard;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("You slide up to Fast Eddie's card table and put down your cash"); 
        System.out.println("  He glances at you out of the corner of his eyes and starts shuffling.");       
        System.out.println("  He lays down three cards."); 
        System.out.println("Which one is the ace?");
        System.out.println("\t \t ## \t ## \t ##");
        System.out.println("\t \t ## \t ## \t ##");
        System.out.println("\t \t 1 \t 2 \t 3");
        
        playerCard = sc.nextInt();
        actualCard = rand.nextInt(3) + 1;
        
        if (playerCard < 1 && playerCard < 3)
            System.out.println("You lose because you were not paying attention!");
        else if (playerCard == actualCard)
            System.out.println("You won!  Eddie scowls as he hands over the money.");
        else if (playerCard != actualCard)
            System.out.println("You lose!  The ace was card number " + actualCard + ".");
        else System.out.println("What's going on here?");
        
        if (playerCard == 1)
        {System.out.println("\t \t AA \t ## \t ##");
        System.out.println("\t \t AA \t ## \t ##");
        System.out.println("\t \t 1 \t 2 \t 3");}
        
        else if (playerCard == 2)
        {System.out.println("\t \t ## \t AA \t ##");
        System.out.println("\t \t ## \t AA \t ##");
        System.out.println("\t \t 1 \t 2 \t 3"); }
        
        else if (playerCard == 3)
        { System.out.println("\t \t ## \t ## \t AA");
        System.out.println("\t \t ## \t ## \t AA");
        System.out.println("\t \t 1 \t 2 \t 3");}
        
        else System.out.println("Something is wrong here");
            
}
}  
