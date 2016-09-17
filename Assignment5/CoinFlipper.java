/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject4;
import java.util.Random;
/**
 *
 * @author Jesse
 */
public class CoinFlipper {
    public static void main(String[] args) {
        
        boolean isHeads;
        String coinResult;
        
        Random rand = new Random();
        isHeads = rand.nextBoolean();
        
        if (isHeads) coinResult = "HEADS";
                else coinResult = "TAILS";
        
        System.out.println("Ready, Set, Flip...!");
        System.out.println("You got " + coinResult + "!");
    }
}
