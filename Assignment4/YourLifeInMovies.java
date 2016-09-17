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
public class YourLifeInMovies {
    public static void main(String[] args) {
        String userName; 
        String userFirstName = "";
        int year;  int i = 0; 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Let's play a game.  What's your name?  ");
        userName = sc.nextLine();
        
       while (userName.charAt(i) != ' ')
       {     
        userFirstName += userName.charAt(i);
        i++;        
                }  
        System.out.print("Ok, " + userName + "what year were you born?  ");
        year = sc.nextInt();
        
        System.out.println("Well " + userFirstName );
        if (year > 2005) System.out.println("Can't think of any movies.");
        else System.out.println("Pixar's 'Up' came out five years ago.");
          if (year <1995)
              System.out.println("Harry Potter's first movie is now 15 years old.");
          if (year <1985)
              System.out.println("Space Jam is over two decades old.");
          if (year <1975)
              System.out.println("The original Jurassic Park is closer to the lunar landing than to today.");
          if (year <1965)
              System.out.println("MASH is nearly half a century old.");
        
    }
}
