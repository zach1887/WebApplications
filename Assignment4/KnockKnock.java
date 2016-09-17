/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject4;

import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class KnockKnock {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Knock Knock!  Guess who! ");
        String nameGuess = sc.nextLine();
        
        if (nameGuess.equals("Marty McFly")){
            System.out.println("That's me... back from the Future.");
        } else {
            System.out.println("Dude, do I -- look -- like " + nameGuess + "?");
        }
//        if (nameGuess=="Marty McFly"){
//            System.out.println("That's me... back from the Future.");
//        } else {
//            System.out.println("Dude, do I -- look -- like " + nameGuess + "?");
//        }

        
    
    
    
    }
}
