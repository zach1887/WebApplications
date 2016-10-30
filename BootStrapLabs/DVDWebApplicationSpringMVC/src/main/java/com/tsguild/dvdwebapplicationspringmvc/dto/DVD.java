/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.dto;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jesse
 */
public class DVD {

    private int idDVD;
    private String title;
    private int releaseYear;
    private String MPAArating;
    private String director;
    private String Studio;
    private ArrayList<String> comments;

    public DVD() {
    }

    public DVD(int ID, String title, int releaseYear, String MPAArating, String director, String Studio, ArrayList comments) {
        this.idDVD = ID;
        this.title = title;
        this.releaseYear = releaseYear;
        this.MPAArating = MPAArating;
        this.director = director;
        this.Studio = Studio;
        this.comments = comments;
    }

    public int getIdDVD() {
        return idDVD;
    }

    public void setIdDVD(int idDVD) {
        this.idDVD = idDVD;
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

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idDVD;
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + this.releaseYear;
        hash = 79 * hash + Objects.hashCode(this.MPAArating);
        hash = 79 * hash + Objects.hashCode(this.director);
        hash = 79 * hash + Objects.hashCode(this.Studio);
        hash = 79 * hash + Objects.hashCode(this.comments);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVD other = (DVD) obj;
        if (this.idDVD != other.idDVD) {
            return false;
        }
        if (this.releaseYear != other.releaseYear) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.MPAArating, other.MPAArating)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.Studio, other.Studio)) {
            return false;
        }
        if (!Objects.equals(this.comments, other.comments)) {
            return false;
        }
        return true;
    }





}
