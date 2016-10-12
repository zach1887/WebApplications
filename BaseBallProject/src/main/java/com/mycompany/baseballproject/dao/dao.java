/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baseballproject.dao;

import com.mycompany.baseballproject.dto.Team;
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
import java.util.Iterator;

/**
 *
 * @author Jesse
 */
public class dao {

    private String FILE_NAME;
    private String DELIMITER = "::";
    private HashMap<String, Team> playerMap;

    public dao() {
        playerMap = new HashMap<>();
        FILE_NAME = "players.txt";
    }

    public void loadFile() throws IOException {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
            while (sc.hasNextLine()) {
                Team ball = new Team();
                String nextTeam = sc.nextLine();

                String[] TeamPlayers = nextTeam.split(DELIMITER);

                String teamName = TeamPlayers[0];
                ball.setTeamName(teamName);

                ArrayList arr = new ArrayList<>();
                for (int j = 1; j < TeamPlayers.length; j++) {
                    arr.add(TeamPlayers[j]);
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
        Team ball = new Team();

        for (Team b : playerMap.values()) { // 
            if (b.getTeamName().equals(teamName)) {
                return true;
            }
        }
        return false;

    }

    public boolean playerIsInLeague(String teamPlayer) {
        Team ball = new Team();

        for (Team b : playerMap.values()) {

            for(String player : b.getTeamPlayers()){
                if (player.equals(teamPlayer))
                    return true;
                
            }
        }

        return false;

    }

    public String playerIsOnWhichTeam(String teamPlayer) {
        Team ball = new Team();

        for (Team b : playerMap.values()) {
            for (String player : b.getTeamPlayers()){
                if (player.equals(teamPlayer))
                    return b.getTeamName();
                }
            }

        return "Player Not Found";  // this shouldn't happen due to an earlier check
    }
    

    public void addNewTeam(String newTeam) {
        Team ball = new Team();
        ball.setTeamName(newTeam);
        ball.setTeamPlayers(new ArrayList<String>());
        playerMap.put(newTeam, ball);
    }

    public void addNewPlayer(String newPlayerTeam, String newPlayer) {
        ArrayList oldRoster = playerMap.get(newPlayerTeam).getTeamPlayers();
        Team newRoster = new Team();
        newRoster.setTeamName(newPlayerTeam);
        oldRoster.add(newPlayer);
        newRoster.setTeamPlayers(oldRoster);
        playerMap.remove(newPlayerTeam, oldRoster);
        playerMap.put(newPlayerTeam, newRoster);
    }

    public void removePlayer(String droppedPlayer) {
        String oldTeam = playerIsOnWhichTeam(droppedPlayer);
        ArrayList oldRoster = playerMap.get(oldTeam).getTeamPlayers();
        Team newRoster = new Team();
        newRoster.setTeamName(oldTeam);
        oldRoster.remove(droppedPlayer);
        newRoster.setTeamPlayers(oldRoster);
        playerMap.remove(oldTeam, oldRoster);
        playerMap.put(oldTeam, newRoster);
    }

    public void tradePlayer(String tradedPlayer,String oldPlayerTeam,String newPlayerTeam) {
        removePlayer(tradedPlayer);
        addNewPlayer(newPlayerTeam, tradedPlayer);
    }

    public ArrayList<String> listAllPlayers(String teamName) {

        return playerMap.get(teamName).getTeamPlayers();

    }

    public Collection<Team> listAllTeams() {

        return playerMap.values();

    }

    public void saveToFile() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
        for (Team b : playerMap.values()) {
            ArrayList roster = b.getTeamPlayers();
            writer.print(b.getTeamName());
            Iterator iter = roster.iterator();
            while (iter.hasNext()) {
                writer.print(DELIMITER + iter.next());
            }
            writer.println();
        }

        writer.flush();
        writer.close();

    }


}
