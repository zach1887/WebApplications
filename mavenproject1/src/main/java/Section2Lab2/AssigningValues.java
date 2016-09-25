/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

/**
 *
 * @author Jesse
 */
public class AssigningValues {
    public static int assigningValue (String card) {
        int value;
        
        switch (card) {
            case "Ace": value = 1; break;
            case "Two": value = 2; break;
            case "Three": value = 3; break;
            case "Four": value = 4; break;
            case "Five": value = 5; break;
            case "Six": value = 6; break;
            case "Seven": value = 7; break;
            case "Eight": value = 8; break;
            case "Nine": value = 9; break;
            case "Ten": value = 10; break;
            case "Jack": value = 10; break;
            case "Queen": value = 10; break;
            case "King": value = 10; break;
            default: value = 99; break;  //automatic bust if something goes wrong
        }
        return value;
    }
}
