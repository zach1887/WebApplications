/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.dto;

import java.util.ArrayList;
import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Jesse
 */
public class DVD {

    private int idDVD;

    @NotEmpty(message = "A DVD has to have a name.")
    @Length(max = 80, message = "No DVD title is that long!")
    private String title;

    private int releaseYear;
    
    @NotEmpty(message = "Whatever.")
    @Length(max = 80, message = "Whatever.")
    private String mPAArating;

    @NotEmpty(message = "A DVD needs a director.  Enter 'unknown' if not known")
    @Length(max = 80, message = "No director name is that long")
    private String director;

    @NotEmpty(message = "A DVD needs a studio.  Enter 'unknown' if not known")
    @Length(max = 80, message = "No studio name is that long")
    private String Studio;

//    private ArrayList<String> comments;
    private String comments;

    public DVD() {
    }

    public DVD(int ID, String title, int releaseYear, String MPAArating, String director, String Studio, String comments) {
        this.idDVD = ID;
        this.title = title;
        this.releaseYear = releaseYear;
        this.mPAArating = MPAArating;
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

    public String getmPAArating() {
        return mPAArating;
    }

    public void setmPAArating(String mPAArating) {
        this.mPAArating = mPAArating;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idDVD;
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + this.releaseYear;
        hash = 79 * hash + Objects.hashCode(this.mPAArating);
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
        if (!Objects.equals(this.mPAArating, other.mPAArating)) {
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
