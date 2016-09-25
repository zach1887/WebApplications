/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class BlackJackMethods {
   public double[] validate_starting_amt(){ 
       
        Scanner sc = new Scanner(System.in);
        double [] starting_input = new double[2];
        System.out.println("Let's play some blackjack.");
        System.out.print("How much do you want to start with? (Max 100):  ");
        double startingAmt = sc.nextDouble();
        while (startingAmt < 1 || startingAmt > 100){
            System.out.print("Invalid amount.  Please select again:  ");
            startingAmt = sc.nextDouble();
        }
        System.out.print("How much are you trying to win? (Max 1000):  ");
        double targetAmt = sc.nextInt();
        while (targetAmt < 1 || targetAmt > 1000 || targetAmt <= startingAmt){
            System.out.println("Invalid amount.  Please select again:  ");
            targetAmt = sc.nextDouble();
        }
        starting_input[0]=startingAmt;
        starting_input[1]=targetAmt;
        return starting_input;
   }
   
   public double validate_wager(double currentAmt) {
       
        Scanner sc = new Scanner(System.in);
        double currentWager;
            
        System.out.print("How much do you want to wager on this hand?");
        currentWager = sc.nextDouble();
        while (currentWager < 0 || currentWager > currentAmt) {
            System.out.println("Invalid wager.  Please select again:  ");
            currentWager = sc.nextDouble();
        }
        return currentWager;
   }
   
   public boolean[] check_aces_blackjack(int pCardVal1, int pCardVal2, 
                            int dCardVal1, int dCardVal2) {
            boolean output[] = new boolean[4];
            boolean playerBlackjack;
            boolean dealerBlackjack;
            boolean playerhasAce;
            boolean dealerhasAce; 
            
            if ((pCardVal1 == 1 && pCardVal2== 10)
            || (pCardVal1 == 10 && pCardVal2 == 1))
             playerBlackjack = true;
        else playerBlackjack = false;
            
            if ((dCardVal1 == 1 && dCardVal2== 10)
            || (dCardVal1 == 10 && pCardVal2 == 1))
             dealerBlackjack = true;
        else dealerBlackjack = false;
            
            if (playerBlackjack)
                playerhasAce = true;
            else if (pCardVal1 == 1 || pCardVal2 == 1)
                playerhasAce = true;
            else
                playerhasAce = false;
            
            if (dealerBlackjack)
                dealerhasAce = true;
            else if (pCardVal1 == 1 || pCardVal2 == 1)
                dealerhasAce = true;
            else
                dealerhasAce = false; 
            
            output[0] = playerBlackjack;
            output[1] = playerBlackjack;
            output[2] = playerhasAce;
            output[3] = dealerhasAce;
            
        return output;     
       
   }
   
   public int[] evaluate_totals (int playerTotal, boolean playerAce, 
                                        int dealerTotal, boolean dealerAce) {
            int output[] = new int[4];
            int playerHardTotal, playerSoftTotal;
            int dealerHardTotal, dealerSoftTotal;
            
       if (playerAce) {
            playerSoftTotal = playerTotal + 10;
            playerHardTotal = playerTotal;
        }
        else {     
            playerSoftTotal = playerTotal;
            playerHardTotal = playerTotal;
        }
       if (dealerAce) {
            dealerSoftTotal = dealerTotal + 10;
            dealerHardTotal = dealerTotal;
        }
        else {     
            dealerSoftTotal = dealerTotal;
            dealerHardTotal = dealerTotal;
        }
       output[0] = playerSoftTotal;
       output[1] = playerHardTotal;
       output[2] = dealerSoftTotal;
       output[3] = dealerHardTotal;
       
       return output;
       
   }
   public void display_user_hand (String playerCard1, String playerCard2, int playerHardTotal, 
                                  int playerSoftTotal, String dealerCard1) {
       
        System.out.println("First Card is a  " + playerCard1 + ".");
        System.out.println("Second Card is a  " + playerCard2 + ".");
        System.out.println("You have a total of " + playerHardTotal + ".");
        if (playerSoftTotal > playerHardTotal)
        {System.out.println("You have a soft total of " + playerSoftTotal + ".");}
        
        System.out.println("Dealer shows " + dealerCard1 + ".");
   }
   
   public void display_if_blackjack (boolean playerBlackJack, boolean dealerBlackJack, 
                                   double currentWager, double currentAmt ) {
            if (playerBlackJack) {
            System.out.println("You have blackjack.  Let's check the dealer's hand.");
            if (dealerBlackJack)
                  {System.out.println("The dealer also has blackjack.  It's a push");
                   System.out.println("You now have " + currentAmt + ".");
                          }
            else { System.out.println("Dealer does not have blackjack.  You win!");
                      currentAmt += 1.5*currentWager;
           System.out.println("You now have " + currentAmt + "."); 
            }
                             }
        else if (dealerBlackJack) { System.out.println("Dealer has blackjack.  You lose.");
           currentAmt -= currentWager;
           System.out.println("You now have " + currentAmt + ".");
           }
       
   }
  public int[] take_a_card (int softTotal, int hardTotal, int drawCardValue, boolean hasAce)  {
    
    int[] output = new int[2];
    int soft, hard;
    String drawCard;
    soft = softTotal; hard = hardTotal;

            hard += drawCardValue;
            soft += drawCardValue;
            if (drawCardValue == 1 && hasAce == false){
                soft +=10;
            }  
            output[0] = soft;
            output[1] = hard;
            return output;
}
  
  public void display_player_bust(int pHardTotal, double cWager, double cAmt){
    
            System.out.println("You have a total of " + pHardTotal + ". You busted.");
            System.out.println("Your new total is " + (cAmt - cWager));
 
}
  public void display_dealer_bust(int dHardTotal, double cWager, double cAmt){
    
            System.out.println("The dealer has a total of " + dHardTotal + ". Dealer busts. You win!");
            System.out.println("Your new total is " + (cAmt + cWager));
 
}
  
  public void display_no_bust(int pHardTotal, int dHardTotal, double cWager, double cAmt){
                             if (pHardTotal == dHardTotal){
                             System.out.println("Both of you have " + pHardTotal + ".  It's a push."); 
                             System.out.println("You now have " + cAmt + ".");
                                     }
                         else if (pHardTotal > dHardTotal) {
                             System.out.println("You win!");
                             System.out.println("You now have " + (cAmt + cWager) + ".");     
                         
                         }
                         else if (pHardTotal < dHardTotal) {
                             System.out.println("You lose!");
                             System.out.println("You now have " + (cAmt - cWager) + ".");    
}
  }
public double update_amts(int pHardTotal, int dHardTotal, double cWager, double cAmt) {                  
                   if (pHardTotal > dHardTotal) 
                    cAmt += cWager;     
                         
                    else if (pHardTotal < dHardTotal) 
                    cAmt -= cWager;
                    
                    return cAmt;

  }
}

