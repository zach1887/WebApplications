/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baseballproject.dto;

import java.util.ArrayList;

/**
 *
 * @author Jesse
 */
public class Team {
    
    private String teamName;
    private ArrayList <String> teamPlayers;
    
    public Team(){
        
    }
    
    public Team (String teamName, ArrayList teamPlayers) {
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<String> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(ArrayList<String> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }
    
}
