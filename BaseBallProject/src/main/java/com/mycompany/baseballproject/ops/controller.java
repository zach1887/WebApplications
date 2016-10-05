/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baseballproject.ops;

import com.mycompany.baseballproject.ui.ConsoleIO;
import com.mycompany.baseballproject.dao.dao;
import java.io.IOException;
import java.util.Set;

/**
 *
 * @author Jesse
 */
public class controller {

    ConsoleIO console = new ConsoleIO();
    dao dao = new dao();

    public void run() throws IOException {
        boolean keepRunning = true;
        dao.loadFile();
        int userChoice;
        
        while (keepRunning) {
            userChoice = displayMenu();
            switch (userChoice) {
                case 1:
                    addTeam();
                    break;
                case 2:
                    addPlayer();
                    break;
                case 3:
                    removePlayer();
                    break;
                case 4:
                    tradePlayer();
                    break;
                case 5:
                    listPlayers();
                    break;
                case 6:
                    listAllTeams();
                    break;
                case 7:
                dao.saveToFile();
                keepRunning = false;
                break;

                default:
                    break;
            }
        }
        console.print("Your changes have been successfully saved.");

    }

    private int displayMenu() {
        console.print("League Commissioner Menu.");
        console.print("Select from the options below.");
        console.print("Add a team to the league (1).");
        console.print("Add a player to an existing team (2).");
        console.print("Remove a player from a team (3).");
        console.print("Trade a player from one team to another (4).");
        console.print("List all players on one team (5).");
        console.print("List all teams in the league (6).");
        console.print("Save all changes and exit the menu(7).");
        int choice = console.readInt("Your selection:  ", 1, 7);
        return choice;

    }

    private void addTeam() {
        String newTeam = console.readString("Enter the name of the new team in the league:  ");
        if (dao.teamExists(newTeam) == true) {
            console.print("A team with that name is already in the league:  ");
        } else {
            dao.addNewTeam(newTeam);
        }
    }

    private void addPlayer() {
        String newPlayerTeam = console.readString("Enter the name of the team that will get the new player:  ");
        if (dao.teamExists(newPlayerTeam) == false) {
            console.print("There is no team in the league with that name.  ");
        } else {
            String newPlayer = console.readString("Enter the name of the new player:  ");
            dao.addNewPlayer(newPlayerTeam, newPlayer);
        }
    }

    private void removePlayer() {
        String droppedPlayer = console.readString("Enter the name of the player you would like to remove:  ");
        if (dao.playerIsInLeague(droppedPlayer) == false) {
            console.print("There is no player in the league with that name.");
        } else {
            dao.removePlayer(droppedPlayer);
        }

    }



private void tradePlayer() {
       String tradedPlayer = console.readString("Enter the name of the player you would like to trade:  ");
       if (dao.playerIsInLeague(tradedPlayer) == false) {
           console.print("There is no player in the league with that name.");
                   }
       else {
           console.print("Player " + tradedPlayer + " is currently with the team of " + dao.playerIsOnWhichTeam(tradedPlayer) + ".");
           String newPlayerTeam = console.readString("Enter the name of the team to which you would like to trade the player:  ");
                 if (dao.teamExists(newPlayerTeam) == false) {
            console.print("There is no team in the league with that name.  ");
                 }
                 else
                     dao.tradePlayer(tradedPlayer, dao.playerIsOnWhichTeam(tradedPlayer), newPlayerTeam);
            
       }
    }

    private void listPlayers() {
        String teamName = console.readString("Enter the name of the team whose roster you wish to see:  ");
        if (dao.teamExists(teamName) == false) 
            console.print("There is no team with that name in the league.");
        else for (int i = 0; i < dao.listAllPlayers(teamName).size(); i++) {
               console.print(dao.listAllPlayers(teamName).get(i));
            }
    }

    private void listAllTeams() {
   
        }
    }

