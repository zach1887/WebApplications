/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import java.io.IOException;

/**
 *
 * @author apprentice
 */
public interface TaxesDao {

    void LoadFromFile() throws IOException;

    boolean doesStateExist(String stateAbbrev);

    double getTaxRate(String stateAbbrev);

    boolean isStateListed(String stateAbbrev);
    
}
