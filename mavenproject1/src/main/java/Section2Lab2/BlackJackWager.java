/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;

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
        int totalMatrix[], newtotals[];
        double startingAmt, targetAmt, currentAmt, currentWager;
        double inputValue[];
        boolean playerBlackJack, dealerBlackJack, playerHasAce, dealerHasAce;
        boolean aceMatrix[];
        String playerCard1, playerCard2, dealerCard1, dealerCard2, drawCard;
        String playerChoice;
        BlackJackMethods bjm = new BlackJackMethods();

        Scanner sc = new Scanner(System.in);

        inputValue = bjm.validate_starting_amt();
        startingAmt = inputValue[0];
        targetAmt = inputValue[1];

        currentAmt = startingAmt;

        do {
            currentWager = bjm.validate_wager(currentAmt);

            playerCard1 = DrawingCards.drawCards();
            playerCard1Value = AssigningValues.assigningValue(playerCard1);
            playerCard2 = DrawingCards.drawCards();
            playerCard2Value = AssigningValues.assigningValue(playerCard2);
            dealerCard1 = DrawingCards.drawCards();
            dealerCard1Value = AssigningValues.assigningValue(dealerCard1);
            dealerCard2 = DrawingCards.drawCards();
            dealerCard2Value = AssigningValues.assigningValue(dealerCard2);

            aceMatrix = bjm.check_aces_blackjack(playerCard1Value, playerCard2Value,
                    dealerCard1Value, dealerCard2Value);

            playerBlackJack = aceMatrix[0];
            dealerBlackJack = aceMatrix[1];
            playerHasAce = aceMatrix[2];
            dealerHasAce = aceMatrix[3];

            totalMatrix = bjm.evaluate_totals(playerCard1Value + playerCard2Value, playerHasAce,
                    dealerCard1Value + dealerCard2Value, dealerHasAce);

            playerSoftTotal = totalMatrix[0];
            playerHardTotal = totalMatrix[1];
            dealerSoftTotal = totalMatrix[2];
            dealerHardTotal = totalMatrix[3];

            bjm.display_user_hand(playerCard1, playerCard2, playerHardTotal, playerSoftTotal, dealerCard1);

            if (playerBlackJack || dealerBlackJack) {
                bjm.display_if_blackjack(playerBlackJack, dealerBlackJack, currentAmt, currentWager);
                if (playerBlackJack && !dealerBlackJack) {
                    currentAmt += 1.5 * currentWager;
                } else if (!playerBlackJack && dealerBlackJack) {
                    currentAmt -= currentWager;
                }
            } else if ((!playerBlackJack) && (!dealerBlackJack)) {
                System.out.println("Let's play! You go first!");
                System.out.print("Do you want to hit(h) or stay(s)?");
                playerChoice = sc.next();
                while (playerChoice.equals("h") && playerHardTotal <= 21) {
                    drawCard = DrawingCards.drawCards();
                    drawCardValue = AssigningValues.assigningValue(drawCard);
                    System.out.println("You drew a " + drawCard);
                    newtotals = bjm.take_a_card(playerSoftTotal, playerHardTotal, drawCardValue, playerHasAce);
                    playerSoftTotal = newtotals[0];
                    playerHardTotal = newtotals[1];
                    if (drawCardValue == 1 && playerHasAce == false) {
                        playerHasAce = true;
                    }
                    System.out.println("Your new total is " + playerHardTotal + ".");
                    if (playerHardTotal >= 21) {
                        break;
                    }
                    if ((playerSoftTotal > playerHardTotal) && (playerSoftTotal <= 21)) {
                        System.out.println("Your new soft total is " + playerSoftTotal + ".");
                    }
                    if (playerSoftTotal == 21) {
                        break;
                    }
                    System.out.print("Do you want to hit(h) or stay(s)?");
                    playerChoice = sc.next();
                }
                if (playerHardTotal > 21) {
                    bjm.display_player_bust(playerHardTotal, currentWager, currentAmt);
                    currentAmt -= currentWager;
                } else {
                    if (playerHardTotal == 21 || playerSoftTotal == 21) {
                        playerHardTotal = 21;
                        System.out.println("You have 21.  You need to stay.");
                    } else if ((playerSoftTotal > playerHardTotal) && (playerSoftTotal <= 21)) {
                        playerHardTotal = playerSoftTotal;
                        System.out.println("You stay with a " + playerHardTotal + ".");
                    } else {
                        System.out.println("You stay with a " + playerHardTotal + ".");
                    }

                    System.out.println("");
                    System.out.println("Now the dealer will play.");
                    System.out.println("The dealer's down card was a " + dealerCard2 + ".");
                    System.out.println("The dealer's sum is " + dealerHardTotal);
                    if ((dealerCard1Value == 1) || (dealerCard2Value == 1)) {
                        System.out.println("The dealer's soft total is " + dealerSoftTotal);
                    }

                    while (dealerHardTotal <= 16 && dealerSoftTotal <= 17) {
                        System.out.println("Dealer takes a card.");
                        drawCard = DrawingCards.drawCards();
                        drawCardValue = AssigningValues.assigningValue(drawCard);
                        System.out.println("Dealer draws a " + drawCard + ".");
                        newtotals = bjm.take_a_card(dealerSoftTotal, dealerHardTotal, drawCardValue, dealerHasAce);
                        dealerSoftTotal = newtotals[0];
                        dealerHardTotal = newtotals[1];
                        if (drawCardValue == 1 && dealerHasAce == false) {
                            dealerHasAce = true;
                        }
                        System.out.println("Dealer has a total of " + dealerHardTotal + ".");
                        if (drawCardValue == 1 && dealerHasAce == false) {
                            dealerSoftTotal += 10;
                            dealerHasAce = true;
                        }

                        if ((dealerSoftTotal > dealerHardTotal) && dealerSoftTotal <= 21) {
                            System.out.println("Dealer has a soft total of " + dealerSoftTotal + ".");
                        }
                    }
                    if (dealerHardTotal > 21) {
                        bjm.display_dealer_bust(dealerHardTotal, currentWager, currentAmt);
                        currentAmt += currentWager;
                    } else {
                        if (dealerSoftTotal <= 21) {
                            dealerHardTotal = dealerSoftTotal;
                            System.out.println("Dealer stays on " + dealerHardTotal + ".");
                        }
                        bjm.display_no_bust(playerHardTotal, dealerHardTotal, currentWager, currentAmt);
                        currentAmt = bjm.update_amts(playerHardTotal, dealerHardTotal, currentWager, currentAmt);
                    }
                }

            }

        } while (currentAmt > 0 && currentAmt <= targetAmt);

        if (currentAmt == 0) {
            System.out.println("You're broke.");
        } else if (currentAmt >= targetAmt) {
            System.out.println("You reached your goal!");
        } else {
            System.out.println("Why did this message print?");
        }
    }
}
