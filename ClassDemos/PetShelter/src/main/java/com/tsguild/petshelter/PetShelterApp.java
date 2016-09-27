/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter;

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 12
 *
 *
 * @author apprentice1
 */
public class PetShelterApp {

    static Scanner sc = new Scanner(System.in);
//    final static String FILE_NAME = "AllDaShelterPets.txt";
    final static String DELIMITER = "::";
    static String FILE_NAME = "ShelterInfo/AllDaShelterPets.txt";  // this may not create a directory if it isn't there

    public static void main(String[] args) throws IOException {

        HashMap<Integer, Pet> petShelter = loadPetsFromFile();

        boolean keepRunning = true;

        while (keepRunning) {
            printMenu();  // since the method is inside the class, invoking the class name is not needed
            int userChoice = getNum("Please make a selection:");
            switch (userChoice) {
                case 1:
                    Pet newPet = addNewPet();
                    petShelter.put(newPet.getID(), newPet);
                    break;  //new pet
                case 2:
                    System.out.println("Curent Pets in the Shelter.");
                    for (Pet p : petShelter.values()) {
                        System.out.print(p.getID());
                        System.out.print(" : ");
                        System.out.println(p.getPetName());
                    }
                    break; // list pets
                case 3:
                    int PetID = getNum("Please enter the ID of the pet:");
                    Pet foundPet = petShelter.get(PetID);
                    if(foundPet ==null){
                        System.out.println("No idea where that ID number came from.");
                    }
                    else{
                        System.out.println("PET ID# +" + foundPet.getID());
                        System.out.println("PET name# +" + foundPet.getPetName());
                        System.out.println("Species  " + foundPet.getSpecies());
                        System.out.println("Condition +" + foundPet.getCondition());
                    }
                    break; // find pet
                case 4: //output file AllDaPets.txt
                    PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
                    for (Pet p : petShelter.values()) {
                        writer.print(p.getID());
                        writer.print(DELIMITER);
                        writer.print(p.getPetName());
                        writer.print(DELIMITER);
                        writer.print(p.getCondition());
                        writer.print(DELIMITER);
                        writer.println(p.getSpecies());               ///  + option will concatenate here...      
                    }
                    writer.flush();
                    writer.close();
                    keepRunning = false;
                    break; // save and quit
                default:
                    System.out.println("Pick one of the choices, you moron!");
                    break;

            }
        }

    }

    public static void printMenu() {
        System.out.println("1: Enter a pet.");
        System.out.println("2: Print all pets in the shelter.");
        System.out.println("3: Find Pet Info by ID.");
        System.out.println("4: Save and Quit Program.");
    }

    public static Pet addNewPet() {
        System.out.println("What is your pet's name?");
        String petName = sc.nextLine();
        System.out.println("What is your pet's condition?");
        String petCondition = sc.nextLine();
        System.out.println("What is your pet's species?");
        String petSpecies = sc.nextLine();
        int petID = getNum("What is your pet's ID?");

        Pet temp = new Pet(petID, petName, petCondition, petSpecies);
        return temp;
    }

    public static int getNum(String prompt) {

        boolean invalidInput = true;
        int num = -1;
        do {

            System.out.println(prompt);
            String userInput = sc.nextLine();
            try {
                num = Integer.parseInt(userInput);
                invalidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input.  Please try again:");
            }

        } while (invalidInput);

        return num;

    }

    public static HashMap<Integer, Pet> loadPetsFromFile() throws IOException {
        
        HashMap<Integer, Pet> tempShelter = new HashMap<>();
        
        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
            
            while (reader.hasNextLine()){
                String petLine = reader.nextLine();
                String [] splitUpData = petLine.split(DELIMITER);
                
                if(splitUpData.length != 4)
                    continue;
                
                String petID = splitUpData[0];
                String petName = splitUpData[1];
                String petCondition = splitUpData[2];
                String petSpecies = splitUpData[3];
                
                int petIDReally = Integer.parseInt(petID);
                Pet tempPet = new Pet(petIDReally, petName, petCondition, petSpecies);
//                
//                Pet newPet = new Pet();
//                newPet.setID(Integer.parseInt(splitUpData[0]));

                tempShelter.put(petIDReally, tempPet);
            }
        } catch (FileNotFoundException fnf) {
             FileWriter fw = new FileWriter(FILE_NAME);
             fw.close();
        }
        
        return tempShelter;

    }
}
