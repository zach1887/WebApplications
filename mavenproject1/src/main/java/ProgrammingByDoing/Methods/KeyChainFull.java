/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Methods;
import java.util.Scanner;


/**
 *
 * @author Jesse
 */
public class KeyChainFull {
    public static void main(String[] args) {
        int userChoice, moreKeyChains, fewerKeyChains;
        String buyerName;
        Scanner sc = new Scanner(System.in);
        int keyChainsOrdered = 0;
        
        System.out.println("Ye Olde KeyChain Shoppe:");
        System.out.println("1.  Add KeyChains to Order");
        System.out.println("2.  Remove KeyChains from Order");
        System.out.println("3.  View Current Order.");
        System.out.println("4.  Checkout.");
        System.out.print("Please enter your selection:  ");
        userChoice = sc.nextInt();
        
        while (userChoice < 1 || userChoice > 4) {
            System.out.println("Not a valid choice.  Please select again:");
            System.out.println("Please enter your selection:  ");
            userChoice = sc.nextInt();
        }
        
        while (userChoice == 1 || userChoice == 2 || userChoice == 3) {
            switch (userChoice) {
                case 1: {
                    System.out.println("You have " + keyChainsOrdered + " keychains");
                    System.out.print("How many keychains would you like to add?");
                    moreKeyChains = sc.nextInt();
                    while (moreKeyChains < 0) {
                     System.out.println("Invalid amount.  Enter a positive number or 0 to go back to the main menu.");
                     System.out.print("How many keychains would you like to add?");
                     moreKeyChains = sc.nextInt();
                    }
                     keyChainsOrdered +=moreKeyChains;
                     System.out.println("");
                     System.out.println("You now have " + keyChainsOrdered + " keychains.");
                     System.out.println("Ye Olde KeyChain Shoppe:");
                     System.out.println("1.  Add KeyChains to Order");
                     System.out.println("2.  Remove KeyChains from Order");
                     System.out.println("3.  View Current Order.");
                     System.out.println("4.  Checkout.");
                     System.out.print("Please enter your selection:  ");
                     userChoice = sc.nextInt();
                     
                     break;} 
               
                case 2: {
                    if (keyChainsOrdered == 0) {
                        System.out.println("You have no keychains. "); 
                        System.out.println("Ye Olde KeyChain Shoppe:");
                        System.out.println("1.  Add KeyChains to Order");
                        System.out.println("2.  Remove KeyChains from Order");
                        System.out.println("3.  View Current Order.");
                        System.out.println("4.  Checkout.");
                        System.out.print("Please enter your selection:  ");
                       userChoice = sc.nextInt();          
                        break;
                    }
                        else {
                        System.out.println("You have " + keyChainsOrdered + " keychains");
                        System.out.print("How many keychains would you like to remove?");
                        fewerKeyChains = sc.nextInt();
                        while (fewerKeyChains > keyChainsOrdered || fewerKeyChains < 0) {
                        System.out.println("You only have " + keyChainsOrdered + " keychains and the number cannot be negative.");
                        System.out.print("How many keychains would you like to remove?");
                        fewerKeyChains = sc.nextInt();   
                        }
                        
                        keyChainsOrdered -= fewerKeyChains;
                        System.out.println("You now have " + keyChainsOrdered + " keychains.");
                        System.out.println("");
                        System.out.println("You have no keychains. "); 
                        System.out.println("Ye Olde KeyChain Shoppe:");
                        System.out.println("1.  Add KeyChains to Order");
                        System.out.println("2.  Remove KeyChains from Order");
                        System.out.println("3.  View Current Order.");
                        System.out.println("4.  Checkout.");
                        System.out.print("Please enter your selection:  ");
                        userChoice = sc.nextInt();  
                        break; 
                    }
                }
                             
                case 3: {
                    if (keyChainsOrdered == 0) 
                        System.out.println("You have no keychains in your order.");
                    else {
                        System.out.println("You have " + keyChainsOrdered + " total.");
                        System.out.println("Keychains cost $10 each.");
                        System.out.println("Total cost is $" + 10*keyChainsOrdered + ".");
                         }
                        System.out.println("");
                        System.out.println("Ye Olde KeyChain Shoppe:");
                        System.out.println("1.  Add KeyChains to Order");
                        System.out.println("2.  Remove KeyChains from Order");
                        System.out.println("3.  View Current Order.");
                        System.out.println("4.  Checkout.");
                        System.out.print("Please enter your selection:  ");
                        userChoice = sc.nextInt(); 
                }
                    break;
                    default: break;   
            }
        }
        
        if (userChoice == 4) {
            if (keyChainsOrdered == 0)
                System.out.println("Thanks for stopping by!");
            else {
                System.out.print("What is your name?  ");
                buyerName = sc.next();
                System.out.println("You have " + keyChainsOrdered + " total.");
                System.out.println("Keychains cost $10 each.");
                System.out.println("Total cost is $" + 10*keyChainsOrdered + ".");
                System.out.println("Thanks for your order, " + buyerName + "!");
            }
        
    
        
        }
        
    }
}
    
  
