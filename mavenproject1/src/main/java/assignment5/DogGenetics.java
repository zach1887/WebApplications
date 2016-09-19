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
public class DogGenetics {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner (System.in);
        int pctBreed1, pctBreed2, pctBreed3, pctBreed4, pctBreed5;
        int sumBreed = 0;
        String dogName;
        
        System.out.print("What is your dog's name?  ");
        dogName = sc.nextLine();
        
        
        pctBreed1 = rand.nextInt(95) + 1;
        sumBreed += pctBreed1;
        pctBreed2 = rand.nextInt(96 - sumBreed) + 1;
        sumBreed += pctBreed2;
        pctBreed3 = rand.nextInt(97 - sumBreed) + 1;
        sumBreed += pctBreed3;
        pctBreed4 = rand.nextInt(98 - sumBreed) + 1;
        sumBreed += pctBreed4;
        pctBreed5 = 100 - sumBreed;
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
