/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject3;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class QuestForTheUserInput {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName, yourQuest;
        double velocityOfSwallow;
        
        System.out.print("What is your name??");
        yourName = inputReader.nextLine();
        
        System.out.print("What is your quest?!");
        yourQuest = inputReader.nextLine();
        
        System.out.print("What is the airspeed velocity of the unladen swallow?");
        velocityOfSwallow = inputReader.nextDouble();
        
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + ".");
        System.out.println("when you don't even know if the swallow is African or European!");
        System.out.println("Maybe skip this question and go back to " + yourQuest + ".");
        
        
        
        
    }
 
}
