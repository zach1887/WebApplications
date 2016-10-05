/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baseballproject.dao;

import com.mycompany.baseballproject.dto.BaseballObject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author Jesse
 */
public class dao {

    private String FILE_NAME;
    private String DELIMITER = "::";
    private HashMap<String, BaseballObject> playerMap;

    public dao() {
        playerMap = new HashMap<>();
        FILE_NAME = "players.txt";
    }

    public void loadFile() throws IOException {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
            while (sc.hasNextLine()) {
                BaseballObject ball = new BaseballObject();
                String nextTeam = sc.nextLine();

                String[] TeamPlayers = nextTeam.split(DELIMITER);

                String teamName = TeamPlayers[0];
                ball.setTeamName(teamName);

                ArrayList arr = new ArrayList<>();
                int i = 1;
                while (!TeamPlayers[i].isEmpty()) {
                    arr.add(TeamPlayers[i]);
                    i++;
                }
                ball.setTeamPlayers(arr);
                playerMap.put(ball.getTeamName(), ball);
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            new FileWriter(FILE_NAME);

        }

    }

    public boolean teamExists(String teamName) {
        BaseballObject ball = new BaseballObject();
        boolean alreadyThere = false;

        for (BaseballObject b : playerMap.values()) {
            if (b.getTeamName().equalsIgnoreCase(teamName)) {
                alreadyThere = true;
            }
            break;
        }
        return alreadyThere;

    }

    public boolean playerIsInLeague(String teamPlayer) {
        BaseballObject ball = new BaseballObject();
        boolean playerInLeague = false;

        for (BaseballObject b : playerMap.values()) {
            for (int j = 1; j <= b.getTeamPlayers().size(); j++) {
                if (b.getTeamPlayers().get(j).equals(teamPlayer)) {
                    playerInLeague = true;
                }
            }

        }

        return playerInLeague;

    }

    public String playerIsOnWhichTeam(String teamPlayer) {
        BaseballObject ball = new BaseballObject();
        String whichTeam = null;

        for (BaseballObject b : playerMap.values()) {
            for (int j = 1; j <= b.getTeamPlayers().size(); j++) {
                if (b.getTeamPlayers().get(j).equals(teamPlayer)) {
                    whichTeam = b.getTeamName();
                }
            }

        }

        return whichTeam;

    }

    public void addNewTeam(String newTeam) {
        if (playerMap.containsKey(newTeam)) {
        } else {
            playerMap.put(newTeam, null);
        }
    }

    public void addNewPlayer(String newPlayerTeam, String newPlayer) {
        ArrayList oldRoster = playerMap.get(newPlayerTeam).getTeamPlayers();
        BaseballObject newRoster = new BaseballObject();
        newRoster.setTeamName(newPlayerTeam);
        oldRoster.add(newPlayer);
        newRoster.setTeamPlayers(oldRoster);
        playerMap.remove(newPlayerTeam, oldRoster);
        playerMap.put(newPlayerTeam, newRoster);
    }

    public void removePlayer(String droppedPlayer) {
        String oldTeam = playerIsOnWhichTeam(droppedPlayer);
        ArrayList oldRoster = playerMap.get(oldTeam).getTeamPlayers();
        BaseballObject newRoster = new BaseballObject();
        newRoster.setTeamName(oldTeam);
        oldRoster.remove(droppedPlayer);
        newRoster.setTeamPlayers(oldRoster);
        playerMap.remove(oldTeam, oldRoster);
        playerMap.put(oldTeam, newRoster);
    }

    public void tradePlayer(String tradedPlayer, String oldPlayerTeam, String newPlayerTeam) {
        removePlayer(tradedPlayer);
        addNewPlayer(tradedPlayer, newPlayerTeam);
    }

    public ArrayList<String> listAllPlayers(String teamName) {

        return playerMap.get(teamName).getTeamPlayers();

    }

    public void listAllTeams() {
     

    }

    public void saveToFile() throws IOException {
        
        PrintWriter writer = new PrintWriter (new FileWriter(FILE_NAME));
        
        for (BaseballObject b : playerMap.values())
            writer.println(b.getTeamName() + DELIMITER + 
                    b.getTeamPlayers()); 
                
    }




//          public void saveToFile() throws IOException {
    //        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
    //
    //        for (DVDObject d : dvdMap.values()) {
    //            writer.println(d.getTitle() + DELIMITER + d.getReleaseYear()
    //                    + DELIMITER + d.getMPAArating() + DELIMITER
    //                    + d.getDirector() + DELIMITER + d.getStudio()
    //                    + DELIMITER + d.getComments());
    //        }
    //            writer.flush();
    //            writer.close();
    //
    //        }

}
