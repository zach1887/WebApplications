/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BlackJackWager {
     public static void main(String[] args) {
        int playerCard1Value, playerCard2Value, dealerCard1Value, dealerCard2Value;
        int drawCardValue, sumDealer, sumPlayer;
        int playerSoftTotal, playerHardTotal;
        int dealerSoftTotal, dealerHardTotal;
        double startingAmt, targetAmt, currentAmt, currentWager;
        boolean playerBlackJack, dealerBlackJack, playerHasAce, dealerHasAce;
        String playerCard1, playerCard2, dealerCard1, dealerCard2, drawCard;
        String playerChoice;
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Let's play some blackjack.");
        System.out.print("How much do you want to start with? (Max 100):  ");
        startingAmt = sc.nextInt();
        while (startingAmt < 1 || startingAmt > 100){
            System.out.print("Invalid amount.  Please select again:  ");
            startingAmt = sc.nextDouble();
        }
        System.out.print("How much are you trying to win? (Max 1000):  ");
        targetAmt = sc.nextInt();
        while (targetAmt < 1 || targetAmt > 1000 || targetAmt <= startingAmt){
            System.out.println("Invalid amount.  Please select again:  ");
            targetAmt = sc.nextDouble();
        }
        
        currentAmt = startingAmt;
        
        while (currentAmt >0 && currentAmt < targetAmt) {
        System.out.print("How much do you want to wager on this hand?");
        currentWager = sc.nextDouble();
        while (currentWager < 0 || currentWager > currentAmt) {
            System.out.println("Invalid wager.  Please select again:  ");
            currentWager = sc.nextDouble();
        }
        
        playerCard1 = DrawingCards.drawCards();
        playerCard1Value = AssigningValues.assigningValue(playerCard1);
        playerCard2 = DrawingCards.drawCards();
        playerCard2Value = AssigningValues.assigningValue(playerCard2);
        dealerCard1 = DrawingCards.drawCards();
        dealerCard1Value = AssigningValues.assigningValue(dealerCard1);
        dealerCard2 = DrawingCards.drawCards();
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
            playerHasAce = true;
        }
        else {     
            playerSoftTotal = playerCard1Value + playerCard2Value;
            playerHardTotal = playerCard1Value + playerCard2Value;
            playerHasAce = false;
        }
        
        if (dealerCard1Value == 1 || dealerCard2Value == 1) {
            dealerSoftTotal = dealerCard1Value + dealerCard2Value + 10;
            dealerHardTotal = dealerCard1Value + dealerCard2Value;
            dealerHasAce = true;
        }
        else {     
            dealerSoftTotal = dealerCard1Value + dealerCard2Value;
            dealerHardTotal = dealerCard1Value + dealerCard2Value;
            dealerHasAce = false;
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
                  {System.out.println("The dealer also has blackjack.  It's a push");
                   System.out.println("You now have " + currentAmt + ".");
                          }
            else { System.out.println("Dealer does not have blackjack.  You win!");
                      currentAmt += 1.5*currentWager;
           System.out.println("You now have " + currentAmt + "."); 
            }
                             }
        else if (dealerBlackJack)
        { System.out.println("Dealer has blackjack.  You lose.");
           currentAmt -= currentWager;
           System.out.println("You now have " + currentAmt + ".");
           }
    
        if ((!playerBlackJack) && (!dealerBlackJack)) {
            System.out.println("Let's play! You go first!");
            System.out.print("Do you want to hit(h) or stay(s)?");
            playerChoice = sc.next();
            while (playerChoice.equals("h")&& playerHardTotal <=21)
            {
            drawCard = DrawingCards.drawCards();
            drawCardValue = AssigningValues.assigningValue(drawCard);
            System.out.println("You drew a " + drawCard);
            playerHardTotal += drawCardValue;
            playerSoftTotal += drawCardValue;
            if (drawCardValue == 1 && playerHasAce == false){
                playerSoftTotal +=10;
                playerHasAce = true;
            } 
            System.out.println("Your new total is " + playerHardTotal + ".");
            if (playerHardTotal >= 21) break;
            if ((playerSoftTotal > playerHardTotal) && (playerSoftTotal <= 21))
            { System.out.println("Your new soft total is " + playerSoftTotal + ".");}
            if (playerSoftTotal == 21) break;
            System.out.print("Do you want to hit(h) or stay(s)?");
            playerChoice = sc.next();            
            }
            if (playerHardTotal > 21){
                System.out.println("You busted.  Game over.");
                currentAmt -= currentWager;
                 System.out.println("You now have " + currentAmt + ".");
            } 
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
                drawCard = DrawingCards.drawCards();
                drawCardValue = AssigningValues.assigningValue(drawCard);
                System.out.println("Dealer draws a " + drawCard + ".");
                dealerHardTotal += drawCardValue;
                dealerSoftTotal += drawCardValue;
                    System.out.println("Dealer has a total of " + dealerHardTotal + ".");
                if (drawCardValue == 1  && dealerHasAce == false) {
                    dealerSoftTotal += 10;
                    dealerHasAce = true;
                }
                
                if ((dealerSoftTotal > dealerHardTotal) && dealerSoftTotal <=21) {
                    System.out.println("Dealer has a soft total of " + dealerSoftTotal + "."); 
                }
                }
                if (dealerHardTotal > 21) {
                    System.out.println("Dealer busts.  You win!");
                    currentAmt += currentWager;
                    System.out.println("You now have " + currentAmt + ".");
                }
                    else {
                         if (dealerSoftTotal <=21) {
                         dealerHardTotal = dealerSoftTotal;
                         System.out.println("Dealer stays on " + dealerHardTotal + ".");
                         } 
                         if (playerHardTotal == dealerHardTotal){
                             System.out.println("Both of you have " + playerHardTotal + ".  It's a push."); 
                             System.out.println("You now have " + currentAmt + ".");
                                     }
                         else if (playerHardTotal > dealerHardTotal) {
                             System.out.println("You win!");
                             currentAmt += currentWager;
                             System.out.println("You now have " + currentAmt + ".");     
                         
                         }
                         else if (playerHardTotal < dealerHardTotal) {
                             System.out.println("You lose!");
                             currentAmt -= currentWager;
                             System.out.println("You now have " + currentAmt + ".");    
                         }
                    }
                
   
       
             }
        }
        } 
      if (currentAmt == 0) System.out.println("You're broke.");
      else if (currentAmt >= targetAmt) System.out.println("You reached your goal!");
      else System.out.println("Why did this message print?");
     }
}
