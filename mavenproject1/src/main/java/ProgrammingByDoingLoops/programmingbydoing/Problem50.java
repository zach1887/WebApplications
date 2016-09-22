/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Problem50 {
    public static void main(String[] args) {
        int firstDie, secondDie;
        Random rand = new Random();
        do {
            firstDie = rand.nextInt(6) + 1;
            secondDie = rand.nextInt(6) + 1;
            System.out.println("The first die is " + firstDie); ;
            System.out.println("The second die is " + secondDie); 
        }
        while (firstDie != secondDie);
                System.out.println("We finally got doubles!");
    }
}
