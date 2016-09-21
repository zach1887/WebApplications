/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Jesse
 */
public class LlamasWhalesAndDodosOhMy {
    public static void main(String[] args) {
        int llamas = 20;
        int whales = 15;
        int dodos = 0;
        
        if (dodos > 0){
            System.out.println("I thought dodos were extinct.");
        }
        if (dodos < 0){
            System.out.println("Can't have negative dodos.");
        }
        
        if (llamas > whales) {
            System.out.println("There are more llamas.");
        }
        if (llamas < whales) {
            System.out.println("There are more whales.");
        }
        System.out.println("Dodos have returned!");
        dodos +=100;
        
        if ((whales + llamas) < dodos) {
            System.out.println("There are many, many dodos now.");
        }
        if (llamas > whales &&  llamas > dodos) {
            System.out.println("Llamas win!");
        }
    }
}
