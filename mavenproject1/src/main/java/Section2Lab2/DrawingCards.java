/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;
import java.util.Random;

/**
 *
 * @author Jesse
 */
        public class DrawingCards {
  
            public static String drawCards() { 
            int x;  String y;
            Random rand = new Random();
            x = rand.nextInt(13) + 1;
            
            switch (x) {
                    case 1: y = "Ace"; break;
                    case 2: y = "Two"; break;
                    case 3: y = "Three"; break;
                    case 4: y = "Four"; break;
                    case 5: y = "Five"; break;
                    case 6: y = "Six"; break;
                    case 7: y = "Seven"; break;
                    case 8: y = "Eight"; break;
                    case 9: y = "Nine"; break;
                    case 10: y = "Ten"; break;
                    case 11: y = "Jack"; break;
                    case 12: y = "Queen"; break;
                    case 13: y = "King"; break;
                    default: y = "error"; break;
            }
            return y;
            }
        }
