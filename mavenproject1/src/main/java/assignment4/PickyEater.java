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
public class PickyEater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many times has it been fried? (#) ");
        int timesFried = sc.nextInt();
        
        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = sc.next();
        
        System.out.print("Is it covered in cheese? (y/n) ");
        String cheeseCovered = sc.next();
        
        System.out.print("How many pats of butter are on top? (#) ");
        int butterPats = sc.nextInt();
        
        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolateCovered = sc.next();
        
        System.out.print("Does it have a funny name? (y/n) ");
        String funnyName = sc.next();
        
        System.out.print("Is it broccoli? (y/n) ");
        String isBroccoli = sc.next();
        
        // Conditionals go here.  I'm assuming there is only one output allowed.
        if ((hasSpinach.equals("y")) || funnyName.equals("y")) {
            System.out.println("There's no way that will get eaten.");
        }
        else if (!isBroccoli.equals("y") && (timesFried ==3) && (chocolateCovered.equals("y")))
            System.out.println("Oh, it's like a deep-fried Snickers.  That'll be a hit.");
        else if(!isBroccoli.equals("y") && (timesFried ==2) && cheeseCovered.equals("y"))
            System.out.println("Yeah, fried cheest doodles are fine.");
        else if (isBroccoli.equals("y") && (butterPats > 6) && cheeseCovered.equals("y"))
            System.out.println("As long as the green stuff is smothered in cheddar, the kid will eat it.");
        else if (isBroccoli.equals("y"))
            System.out.println("Oh, green stuff like that might as well go into the bin.");
        else System.out.println("Hell if I know.  Just ask the kid already.");
        
    }
}
