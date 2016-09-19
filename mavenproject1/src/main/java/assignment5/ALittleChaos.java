/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import java.util.Random;
/**
 *
 * @author Jesse
 */
public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers:  " + randomizer.nextInt());
        System.out.println("Or a double:  " +  randomizer.nextDouble());
        System.out.println("Or even a Boolean:  "  + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized result:  " + num);
        System.out.println("And use it as often as needed:  " + num + ", " + num);
        
        System.out.println("Or just keep generatinf new values (with replacement.)");
        System.out.println("Here are a bunch of numbers from 0 - 100:  ");
        
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101) + ".");
    }
}
