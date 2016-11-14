/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.dao;

import com.tsguild.dvdwebapplicationspringmvc.dto.DVD;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.function.Predicate;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

/**
 *
 * @author Jesse
 */
public class DVDLibraryJdbcImpl implements DVDLibraryDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_ADD_DVD
            = "INSERT INTO Dvds (title, rating, year, director, studio, comments) "
            + "	VALUES(?, ?, ?, ?, ?,  ?)";

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public DVD addDVD(DVD dvd) {
        jdbcTemplate.update(SQL_ADD_DVD,
                dvd.getTitle(), dvd.getmPAArating(), dvd.getReleaseYear(),
                dvd.getDirector(), dvd.getStudio(), dvd.getComments());

        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        dvd.setIdDVD(id);
        return dvd;
    }

    private static final String SQL_REMOVE_DVD_BY_ID
            = "DELETE FROM Dvds WHERE id = ?";

    @Override
    public void removeDVD(int idDVD) {
        jdbcTemplate.update(SQL_REMOVE_DVD_BY_ID, // provide the SQL
                idDVD);

    }

//    (`id`, `title`,`rating`, `year`, `director`,`studio`,`comments`)
    private static final String SQL_UPDATE_DVD_BY_ID
            = "UPDATE Dvds SET title = ?, "
            + " rating = ?, year = ?, "
            + " director= ?, studio = ?, "
            + " comments= ? WHERE Dvds.id = ?";

    @Override
    public void updateDVD(DVD changeDVD) {

        jdbcTemplate.update(SQL_UPDATE_DVD_BY_ID,
                changeDVD.getTitle(),
                changeDVD.getmPAArating(),
                changeDVD.getReleaseYear(),
                changeDVD.getDirector(),
                changeDVD.getStudio(),
                changeDVD.getComments(),
                changeDVD.getIdDVD());

    }

    private static final String SQL_SELECT_ALL_DVD
            = "SELECT * from Dvds";

    @Override
    public List<DVD> getallDVDs() {
        List<DVD> allDVDs;
        allDVDs = jdbcTemplate.query(SQL_SELECT_ALL_DVD, new DVDMapper());
        return allDVDs;
    }

    private static final String SQL_SELECT_DVD_BY_ID
            = "SELECT * FROM Dvds WHERE Dvds.id = ?";

    @Override
    public DVD getDVDbyID(int idDVD) {
           try{
        return jdbcTemplate.queryForObject(SQL_SELECT_DVD_BY_ID, // select stmt
                new DVDMapper(), // what we're turning the RS into!
                idDVD); // and then subsitituting in any placeholders
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }
    @Override
    public List<DVD> searchDVD(Map<SearchTerm, String> criteria) {
           throw new UnsupportedOperationException("Not supported yet.");
           // this method is no longer needed
    }

    private static final class DVDMapper implements RowMapper<DVD> {

        @Override
        public DVD mapRow(ResultSet rs, int rowNum) throws SQLException {
            DVD mappedDVD = new DVD();
//            (`id`, `title`,`rating`, `year`, `director`,`studio`,`comments`)
            // id, name, disposition, breedId, vaccinated, breed
            String title = rs.getString("title");
            String rating = rs.getString("rating");
            Integer year = rs.getInt("year");
            String director = rs.getString("director");
            String studio = rs.getString("studio");
            String comments = rs.getString("comments");
            Integer dvdId = rs.getInt("id");

            mappedDVD.setIdDVD(dvdId);
            mappedDVD.setTitle(title);
            mappedDVD.setmPAArating(rating);
            mappedDVD.setReleaseYear(year);
            mappedDVD.setDirector(director);
            mappedDVD.setStudio(studio);
            mappedDVD.setComments(comments);

            return mappedDVD;
        }

    }

}
