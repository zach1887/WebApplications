/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dao;

import com.tsguild.petshelterwebapp.dto.Pet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class PetShelterDaoJdbcImpl implements PetShelterDao{
    
    private JdbcTemplate jdbcTemplate;

    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
   private static final String SQL_ADD_PET = 
        "INSERT INTO Pets (name, disposition, breedKEY, vaccinated) " +
         " VALUES(?,?,?,?)";

    @Override
    @Transactional (propagation = Propagation.REQUIRED, readOnly=false)
    public Pet addPet(Pet pet) {
        jdbcTemplate.update(SQL_ADD_PET,
                pet.getPetName(),
                pet.getDisposition(),
                2,
                pet.isVaccinated()
        );
        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        pet.setPetId(id);
        return pet;
                
 }
    private static final String SQL_SELECT_PET_BY_ID =
         "SELECT Pets.*, Breeds.breed FROM Pets " +
         " LEFT JOIN Breeds ON Pets.breedId = Breeds.id" +
         " WHERE Pets.id = ?";
            
    @Override
    public Pet getPetByID(int petID) {
        
        try {
        return jdbcTemplate.queryForObject(SQL_SELECT_PET_BY_ID, 
                new PetMapper(), 
                petID);
        }  catch (EmptyResultDataAccessException e) {
            return null;
        }
   }

    private static final String SQL_SELECT_ALL_PETS =
            "SELECT * FROM Pets LEFT JOIN Breeds ON Pets.breedKEY = Breeds.Bkey";
    
    @Override
    public List<Pet> getAllPets() {
        List<Pet> allPets = new ArrayList<>();
        allPets = jdbcTemplate.query(SQL_SELECT_ALL_PETS, new PetMapper());
        return allPets;
    }

    private static final String SQL_UPDATE_PET_BY_ID = 
            "UPDATE Pets SET name = ?, breedKEY = ?, disposition =?," +
            " vaccinated = ? WHERE Pets.id = ?";
    
    @Override
    public void updatePet(Pet pet) {
        jdbcTemplate.update(SQL_UPDATE_PET_BY_ID, 
                     pet.getPetName(),
                     2,
                     pet.getDisposition(),
                     pet.isVaccinated(),
                     pet.getPetId());
                      
   }

    private static final String SQL_REMOVE_PET_BY_ID
            = "DELETE FROM Pets WHERE id = ?";
    @Override
    public void removePet(int ID) {
        jdbcTemplate.update(SQL_REMOVE_PET_BY_ID, ID);
 
    }

    @Override
    public List<Pet> searchPet(Map<SearchTerm, String> criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pet> searchPets(Predicate<Pet> filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final class PetMapper implements RowMapper<Pet> {

        @Override
        public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
           Pet mappedPet = new Pet();
           String name = rs.getString("name");
           String disposition = rs.getString("disposition");
           Boolean vacc = rs.getBoolean("vaccinated");
           String breed = rs.getString("breed");
           Integer petId = rs.getInt("id");
           Integer breedId = rs.getInt("breedKey");
           
           mappedPet.setPetId(petId);
           mappedPet.setPetName(name);
           mappedPet.setPetBreed(breed);
           mappedPet.setVaccinated(vacc);
           mappedPet.setDisposition(disposition);
           
           return mappedPet;
           
        }
    
    
//    # id, name, disposition, breedKEY, vaccinated, Bkey, breed


}
    
}
