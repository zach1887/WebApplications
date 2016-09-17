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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
    
    String inputName, inputColor, inputFruit;
    int favNumber;
    Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Stranger!");
        System.out.print("What is your name?");
        inputName = sc.nextLine();
        
        System.out.print("Hi. " + inputName + "!");
        System.out.print(" What is your favorite color?");
        inputColor = sc.nextLine();
        
        System.out.print("Huh, " + inputColor + "?");
        System.out.println("Mine's Electric Lime.");
        
        System.out.println("I really like limes.  They're my favorite fruit, too");
        System.out.print("What is YOUR favorite fruit, " + inputName + "?");
        inputFruit = sc.nextLine();
        
        System.out.println("Really? " + inputFruit + "? That's wild!");
        System.out.print("Speaking of favorites, what is your favorite number?");
        favNumber = sc.nextInt();
        
        System.out.println(favNumber + " is a cool number.  Mine is -11.");
        System.out.print("Did you know " + favNumber + " * -11 is " + (favNumber *-11) + "?");
        System.out.println("That is a cool number too!");
        
        System.out.println("Well, catch ya later, " + inputName + "!");
    }
}
