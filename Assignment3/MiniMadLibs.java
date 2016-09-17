/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject3;
import java.util.Scanner;

/**
 * 
 *
 * @author Jesse
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        int numberFour;
        String nounOne, adjTwo, nounThree, adjFive, nounSix, nounSeven, nounEight;
        String verbNine, verbTen;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.print("I need a noun (captialized, please):  ");
        nounOne = sc.next();
        System.out.print("Now an adj:  ");
        adjTwo = sc.next();
        System.out.print("Another noun:  ");
        nounThree = sc.next();
        System.out.print("And a number (integer, please):  ");
        numberFour = sc.nextInt();
        System.out.print("Another adj:  ");
        adjFive = sc.next();
        System.out.print("A plural noun:  ");
        nounSix = sc.next();
        System.out.print("Another noun:  ");
        nounSeven = sc.next();
        System.out.print("One more:  ");
        nounEight = sc.next();
        System.out.print("A verb (present tense):  ");
        verbNine = sc.next();
        System.out.print("Same verb (past tense):  ");
        verbTen= sc.next();
        
        System.out.println(nounOne + ": the " + adjTwo + " frontier.  These are the "
                            + "voyages of the starship " + nounThree + ".");
        System.out.println("Its " + numberFour + "-year mission: to explore strange "
                             + adjFive + " " + nounSix + ", to seek out " + adjFive);
        System.out.println(nounSeven + " and " + adjFive + " " + nounEight 
                              + " to boldly " + verbNine + " where no one has never " 
                              + verbTen + " before.");
        
        
        
    }
}
