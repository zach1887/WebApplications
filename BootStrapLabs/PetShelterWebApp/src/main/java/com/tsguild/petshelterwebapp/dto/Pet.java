/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dto;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author apprentice
 */
public class Pet {

    private int petId;

    @NotEmpty(message = "Your pet must have a name")
    @Length(min=2, max = 50, message = "Name cannot exceed 50 characters, Mr. James Joyce.")
    private String petName;

    @NotEmpty(message = "Your pet must have a breed")
    @Length(min=2, max = 50, message = "Breed cannot exceed 50 characters, Mr. James Joyce.")
    private String petBreed;

    @NotEmpty(message = "Your pet must have a disposition")
    @Length(min=1, max = 250, message = "Disposition has to be less than 250 characters.  Your pet isn't that interesting!")
    private String disposition;

    private boolean vaccinated;

    public Pet() {

    }

    public Pet(int petID, String petName, String petBreed, String disposition, boolean vaccinated) {
        this.petId = petID;
        this.petName = petName;
        this.petBreed = petBreed;
        this.disposition = disposition;
        this.vaccinated = vaccinated;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.petId;
        hash = 37 * hash + Objects.hashCode(this.petName);
        hash = 37 * hash + Objects.hashCode(this.petBreed);
        hash = 37 * hash + Objects.hashCode(this.disposition);
        hash = 37 * hash + (this.vaccinated ? 1 : 0);
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
        final Pet other = (Pet) obj;
        if (this.petId != other.petId) {
            return false;
        }
        if (this.vaccinated != other.vaccinated) {
            return false;
        }
        if (!Objects.equals(this.petName, other.petName)) {
            return false;
        }
        if (!Objects.equals(this.petBreed, other.petBreed)) {
            return false;
        }
        return Objects.equals(this.disposition, other.disposition);
    }

}
