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
public class BaseballObject {
    
    private String teamName;
    private ArrayList <String> teamPlayers;
    
    public BaseballObject(){
        
    }
    
    public BaseballObject (String teamName, ArrayList teamPlayers) {
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(ArrayList teamPlayers) {
        this.teamPlayers = teamPlayers;
    }
    
}
