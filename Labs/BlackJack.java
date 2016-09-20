/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareGuildLabs;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class BlackJack {
    public static void main(String[] args) {
        int playerCard1Value, playerCard2Value, dealerCard1Value, dealerCard2Value;
        int drawCardValue, sumDealer, sumPlayer;
        int playerSoftTotal, playerHardTotal;
        int dealerSoftTotal, dealerHardTotal;
        boolean playerBlackJack, dealerBlackJack;
        String playerCard1, playerCard2, dealerCard1, dealerCard2, drawCard;
        String playerChoice;
        
        Scanner sc = new Scanner(System.in);
       
        playerCard1 = drawingCards.drawCards();
        playerCard1Value = AssigningValues.assigningValue(playerCard1);
        playerCard2 = drawingCards.drawCards();
        playerCard2Value = AssigningValues.assigningValue(playerCard2);
        dealerCard1 = drawingCards.drawCards();
        dealerCard1Value = AssigningValues.assigningValue(dealerCard1);
        dealerCard2 = drawingCards.drawCards();
        dealerCard2Value = AssigningValues.assigningValue(dealerCard2);
                
        if ((playerCard1.equals("Ace") && (playerCard2Value == 10))
                || (playerCard1Value == 10) && (playerCard2.equals("Ace")))
            playerBlackJack = true;
        else playerBlackJack = false;
        
       if ((dealerCard1.equals("Ace") && (dealerCard2Value == 10))
                || (dealerCard1Value == 10) && (dealerCard2.equals("Ace")))
            dealerBlackJack = true;
       else dealerBlackJack = false;
       
        if (playerCard1Value == 1 || playerCard2Value == 1) {
            playerSoftTotal = playerCard1Value + playerCard2Value + 10;
            playerHardTotal = playerCard1Value + playerCard2Value;
        }
        else {     
            playerSoftTotal = playerCard1Value + playerCard2Value;
            playerHardTotal = playerCard1Value + playerCard2Value;
        }
        
        if (dealerCard1Value == 1 || dealerCard2Value == 1) {
            dealerSoftTotal = dealerCard1Value + dealerCard2Value + 10;
            dealerHardTotal = dealerCard1Value + dealerCard2Value;
        }
        else {     
            dealerSoftTotal = dealerCard1Value + dealerCard2Value;
            dealerHardTotal = dealerCard1Value + dealerCard2Value;
        }      
        
        System.out.println("First Card is a  " + playerCard1 + ".");
        System.out.println("Second Card is a  " + playerCard2 + ".");
        System.out.println("You have a total of " + playerHardTotal + ".");
        if (playerSoftTotal > playerHardTotal)
        {System.out.println("You have a soft total of " + playerSoftTotal + ".");}
        
        System.out.println("Dealer shows " + dealerCard1 + ".");
        
        if (playerBlackJack) {
            System.out.println("You have blackjack.  Let's check the dealer's hand.");
            if (dealerBlackJack)
                  {System.out.println("The dealer also has blackjack.  It's a push");}
            else { System.out.println("Dealer does not have blackjack.  You win!");}
                             }
        else if (dealerBlackJack)
        { System.out.println("Dealer has blackjack.  You lose.");}
    
        if ((!playerBlackJack) && (!dealerBlackJack)) {
            System.out.println("Let's play! You go first!");
            System.out.println("Do you want to hit(h) or stay(s)?");
            playerChoice = sc.next();
            while (playerChoice.equals("h")&& playerHardTotal <=21)
            {
            drawCard = drawingCards.drawCards();
            drawCardValue = AssigningValues.assigningValue(drawCard);
            System.out.println("You drew a " + drawCard);
            playerHardTotal += drawCardValue;
            if (drawCardValue == 1) playerSoftTotal += 11;
            System.out.println("Your new total is " + playerHardTotal + ".");
            if (playerHardTotal >= 21) break;
            if ((playerSoftTotal > playerHardTotal) && (playerSoftTotal <= 21))
            { System.out.println("Your new soft total is " + playerSoftTotal + ".");}
            if (playerSoftTotal == 21) break;
            System.out.println("Do you want to hit(h) or stay(s)?");
            playerChoice = sc.next();            
            }
            if (playerHardTotal > 21)
                System.out.println("You busted.  Game over."); 
            else { 
                if (playerHardTotal == 21 || playerSoftTotal == 21) {
                    playerHardTotal = 21;    
                    System.out.println("You have 21.  You need to stay.");}
                    
                else if ((playerSoftTotal > playerHardTotal) && (playerSoftTotal <= 21))
                {playerHardTotal = playerSoftTotal;
                System.out.println("You stay with a " + playerHardTotal + ".");}
                else {
                    System.out.println("You stay with a " + playerHardTotal + ".");
                }
                
                System.out.println("");
                System.out.println("Now the dealer will play.");
                System.out.println("The dealer's down card was a " + dealerCard2 + ".");
                System.out.println("The dealer's sum is " + dealerHardTotal);
                if ((dealerCard1Value == 1) || (dealerCard2Value == 1)) 
                        {System.out.println("The dealer's soft total is " + dealerSoftTotal);}
                
                while (dealerHardTotal <= 16 && dealerSoftTotal <=17) {
                    System.out.println("Dealer takes a card.");
                drawCard = drawingCards.drawCards();
                drawCardValue = AssigningValues.assigningValue(drawCard);
                System.out.println("Dealer draws a " + drawCard + ".");
                dealerHardTotal += drawCardValue;
                    System.out.println("Dealer has a total of " + dealerHardTotal + ".");
                if (drawCardValue == 1)
                dealerSoftTotal += 11;
                if ((dealerSoftTotal > dealerHardTotal) && dealerSoftTotal <=21) {
                    System.out.println("Dealer has a soft total of " + dealerSoftTotal + "."); 
                }
                }
                if (dealerHardTotal > 21)
                    System.out.println("Dealer busts.  You win!");
                    else {
                         if (dealerSoftTotal <=21) {
                         dealerHardTotal = dealerSoftTotal;
                         System.out.println("Dealer stays on " + dealerHardTotal + ".");
                         } 
                         if (playerHardTotal == dealerHardTotal)
                             System.out.println("Both of you have " + playerHardTotal + ".  It's a push.");
                         else if (playerHardTotal > dealerHardTotal)
                             System.out.println("You win!");
                         else if (playerHardTotal < dealerHardTotal)
                             System.out.println("You lose!");
                         }
                    }
                
   
       
             }
        }   
}    