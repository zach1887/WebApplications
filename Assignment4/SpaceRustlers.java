/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject4;

/**
 *
 * @author Jesse
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if (aliens > spaceships) {
            System.out.println("Vrroom, vrroom!  Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships.");
        }
        
        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead. Enough room for all the cows!");
        }  else if (cows > spaceships) {
            System.out.println("How are we going to fit all of these cows?");
        }  else {
            System.out.println("Too many ships.  Not enough cows.");
        }
    
        if (aliens > cows) {
            System.out.println("Should be plenty of food for everyone!");
        } else 
            System.out.println("The cows are getting pretty restless.  This is not looking good.");
      }
}

