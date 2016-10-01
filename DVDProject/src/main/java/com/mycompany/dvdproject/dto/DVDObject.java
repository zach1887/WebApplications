/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject.dto;

/**
 *
 * @author Jesse
 */
public class DVDObject {
    private String title;
    private  int releaseYear;
    private String MPAArating;
    private String director;
    private String Studio;
    private String comments;
    
    public DVDObject() {
}

    public DVDObject(int releaseYear, String MPAArating, String director, String Studio, String comments) {
        this.releaseYear = releaseYear;
        this.MPAArating = MPAArating;
        this.director = director;
        this.Studio = Studio;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMPAArating() {
        return MPAArating;
    }

    public void setMPAArating(String MPAArating) {
        this.MPAArating = MPAArating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    

}