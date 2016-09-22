/*
 * To change this license header, choose License Headers in ProjectProperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoingLoops;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class ShortAdventure {

    public static void main(String[] args) {

        int redRoomChoice, blueRoomChoice, greenRoomChoice, yellowRoomChoice;
        int roomLocation = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("You are trying to escape from a house.");
        System.out.println("Your adventure starts in a Red Room.");
        System.out.println("There are two available exits, south and east");
        System.out.print("Would you like to go South(1) or East(2)?");
        redRoomChoice = sc.nextInt();
        while (redRoomChoice != 1 && redRoomChoice != 2) {
            System.out.println("Get with the program!");
            System.out.println("Would you like to go South(1) or East(2)?");
            redRoomChoice = sc.nextInt();
        }
        if (redRoomChoice == 1) {
            roomLocation = 2;
        } else if (redRoomChoice == 2) {
            roomLocation = 3;
        }

        while (roomLocation == 1 || roomLocation == 2 ||roomLocation == 3 || roomLocation == 4 ) {
            switch (roomLocation) {
                case 1: {
                    System.out.println("You are now if the Red Room  Would you like to go South(1) or East(1)?");
                    System.out.print("Would you like to go South(1) or East(2)?");
                    redRoomChoice = sc.nextInt();
                    while (redRoomChoice != 1 && redRoomChoice != 2) {
                        System.out.println("Get with the program!");
                        System.out.print("Would you like to go South(1) or East(2)?");
                        redRoomChoice = sc.nextInt();
                    }
                    if (redRoomChoice == 1) {
                        roomLocation = 2;
                    } else if (redRoomChoice == 2) {
                        roomLocation = 3;
                    }
                    break;

                }
                case 2:{
                    System.out.println("You are now in the Blue Room. There are north and east exits, as well as a not-so-well hidden secret passageway.");
                    System.out.println("In addition, there is a button on the wall.");
                    System.out.print("Would you like to go North(1), East(2), take the secret passageway(3) or... push the button (4)?");
                    blueRoomChoice = sc.nextInt();
                    while (blueRoomChoice != 1 && blueRoomChoice != 2 && blueRoomChoice != 3 && blueRoomChoice != 4) {
                        System.out.println("Get with the program!");
                        System.out.print("Would you like to go North(1), East(2), take the secret passageway(3) or... push the button (4)?");
                        blueRoomChoice = sc.nextInt();
                    }   switch (blueRoomChoice) {
                        case 1:
                            roomLocation = 1;
                            break;
                        case 2:
                            roomLocation = 4;
                            break;
                        case 3:
                            roomLocation = 3;
                            break;
                        case 4:
                            System.out.println("The button blows up the house.  Too bad you didn't read the sign first.");
                            System.out.print("Thanks for playing!");
                            roomLocation =5;
                            break;
                        default:  break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("You are now in the Green Room. There are south and west exits, as well as a not-so-well hidden secret passageway.");
                    System.out.println("In addition, there is a button on the wall.");
                    System.out.print("Would you like to go South(1), West (2), take the secret passageway(3) or... push the button (4)?");
                    greenRoomChoice = sc.nextInt();
                    while (greenRoomChoice != 1 && greenRoomChoice != 2 && greenRoomChoice != 3 && greenRoomChoice != 4) {
                        System.out.println("Get with the program!");
                        System.out.print("Would you like to go South(1), West (2), take the secret passageway(3) or... push the button (4)?");
                        greenRoomChoice = sc.nextInt();
                    }
                    switch (greenRoomChoice) {
                        case 1:
                            roomLocation = 4;
                            break;
                        case 2:
                            roomLocation = 1;
                            break;
                        case 3:
                            roomLocation = 2;
                            break;
                        default:
                            System.out.println("The button doesn't do anything.");
                            roomLocation = 3;
                            break;
                    }
                    break;
                    
                }
                case 4:
                    {
                        System.out.println("You are now in the Yellow Room. There are north and west exits.");
                        System.out.println("In addition, there is a button on the wall.");
                        System.out.print("Would you like to go North(1), West (2), or... push the button (3)?");
                        yellowRoomChoice = sc.nextInt();
                        while (yellowRoomChoice != 1 && yellowRoomChoice != 2 && yellowRoomChoice != 3) {
                            System.out.println("Get with the program!");
                            System.out.print("Would you like to go North(1), West (2), or... push the button (3)?");
                            yellowRoomChoice = sc.nextInt();
                        }   switch (yellowRoomChoice) {
                            case 1:
                                roomLocation = 3;
                                break;
                            case 2:
                                roomLocation = 2;
                                break;
                            case 3:
                             System.out.println("The button opens up a secret exit and you win the game!");
                             System.out.println("Thanks for playing!");
                             roomLocation = 5;
                             break;
                            default:
                             break;
                        }
                        break;
                    }
            }  
        } 
       
        System.out.println("Wasn't that a lot of fun?!?!?");  
    }
    
}

