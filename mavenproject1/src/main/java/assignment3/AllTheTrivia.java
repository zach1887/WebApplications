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
public class AllTheTrivia {
    public static void main(String[] args) {
        String ansIceCream, ansSuperBowl, ansCapital, ansChemical;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("What kind of ice cream comes with Vanilla, Chocolate, and Strawberry?");
        ansIceCream = sc.nextLine();
        System.out.print("Who won last year's Super Bowl (2016?)");
        ansSuperBowl = sc.nextLine();
        System.out.print("What is the capital of Montana?");
        ansCapital = sc.nextLine();
        System.out.print("What element has a chemical symbol of K?");
        ansChemical = sc.nextLine();
        
        System.out.println("That's surprising, " + ansIceCream + " won last year's Super Bowl.");
        System.out.println("I didn't know " + ansSuperBowl + " was the capital of Montana.");
        System.out.println("Really? " + ansCapital + " has a chemical symbol of K?");
        System.out.println("Bit of a shock that " + ansChemical + " is the name of"
                   + "the ice cream with Vanilla, Chocolate and Strawberry.");
        
    }
}
