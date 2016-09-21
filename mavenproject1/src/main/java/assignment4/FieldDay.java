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
public class FieldDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your last name?  ");  
        String lastName = sc.nextLine();
        
        if (lastName.compareTo("Baggins") <= 0)
            System.out.println("Aha! You're on the team \"Red Dragons\"" );
        else if (lastName.compareTo("Dresden") <= 0)
            System.out.println("Aha! You're on the team \"Dark Wizards\"" );  
        else if (lastName.compareTo("Howl") <= 0)
            System.out.println("Aha! You're on the team \"Moving Castles\"" );  
        else if (lastName.compareTo("Potter") <= 0)
            System.out.println("Aha! You're on the team \"Golden Snitches\"" );  
        else if (lastName.compareTo("Vimes") <= 0)
            System.out.println("Aha! You're on the team \"Night Guards\"" );  
        else 
            System.out.println("Aha! You're on the team \"Black Holes\"" ); 
        System.out.println("Good luck in the games!");
    }
}
