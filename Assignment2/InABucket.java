/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject2;

/**
 */
public class InABucket {
    public static void main(String[] args) {
        
        //Declare several variable types
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        // Declaring a variable only creates space.
        // To use the variable, it needs a value.
        walrus = "Mr Coconuts, IV";
        piesEaten = 19.5;
        weightOfTeacupPig = 180;
        grainsOfSand =  (int) 3e7;
     
        System.out.println("Meet my pet Walrus, " + walrus + ".");
        System.out.print("He was a bit hungry today and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("His teacup Pig friend weighs " + weightOfTeacupPig + " grams.");
        System.out.println("Which may be the equivalent of " + grainsOfSand + " grains of sand (but probably not.)");
    }
}
