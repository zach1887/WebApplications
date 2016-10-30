/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.dao;

import com.tsguild.dvdwebapplicationspringmvc.dto.DVD;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryDao {

    DVD addDVD(DVD dvd);

    DVD getDVDbyID(int ID);

    List<DVD> getallDVDs();

    void removeDVD(int idDVD);

    List<DVD> searchDVD(Map<SearchTerm, String> criteria);

    void updateDVD(DVD changeDVD);
    
}
