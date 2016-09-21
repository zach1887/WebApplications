/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class DogGeneticsv2 {
     public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner (System.in);
        int numBreed1, numBreed2, numBreed3, numBreed4, numBreed5;
        int pctBreed1, pctBreed2, pctBreed3, pctBreed4, pctBreed5;
        int sumBreed = 0;
        String dogName;
        
        System.out.print("What is your dog's name?  ");
        dogName = sc.nextLine();
        
        
        numBreed1 = rand.nextInt(99) + 1;
        sumBreed += numBreed1;
        numBreed2 = rand.nextInt(99) + 1;
        sumBreed += numBreed2;
        numBreed3 = rand.nextInt(99) + 1;
        sumBreed += numBreed3;
        numBreed4 = rand.nextInt(99) + 1;
        sumBreed += numBreed4;
        numBreed5 = rand.nextInt(99) + 1;
        sumBreed += numBreed5;
        
        pctBreed1 = (int) Math.round(95*numBreed1/sumBreed)+ 1;
        pctBreed2 = (int) Math.round(95*numBreed2/sumBreed)+ 1;
        pctBreed3 = (int) Math.round(95*numBreed3/sumBreed)+ 1;
        pctBreed4 = (int) Math.round(95*numBreed4/sumBreed) + 1;
        pctBreed5 = 96 - pctBreed1 - pctBreed2 - pctBreed3 - pctBreed4;
        
        
        System.out.println("Well, I have a breakdown of" + dogName + "'s background here.");
        System.out.println("");
        System.out.println(dogName + " is:");
        System.out.println("");
        System.out.println(pctBreed1 + "% St. Bernard");
        System.out.println(pctBreed2 + "% Chihuahua");
        System.out.println(pctBreed3 + "% Terrier");
        System.out.println(pctBreed4 + "% Doberman");
        System.out.println(pctBreed5 + "% Retreiver");
        System.out.println("");
        System.out.println("That's QUITE the dog!");
                
        
    }
}
