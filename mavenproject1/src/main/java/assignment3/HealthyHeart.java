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
public class HealthyHeart {
    public static void main(String[] args) {
        int userAge;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("What is your age?  ");
        userAge = sc.nextInt();
        
        
        System.out.println("Your maximum heart rate should be " +  (220 - userAge) + " beats per minute");
        System.out.println("Your target HR Zone is " + (int)(.50*(220 - userAge))
                             + " - " + (int)(.85*(220 - userAge)) + " beats per minute");
    }
    
}
