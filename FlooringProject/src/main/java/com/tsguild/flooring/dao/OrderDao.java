/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import com.tsguild.flooring.dto.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author apprentice
 */
public interface OrderDao {

    void addOrders(String dateTag, Order order) throws IOException;

    Collection<Order> displayOrders(String dateTag) throws IOException;

    void loadFromFile(String FILE_NAME) throws IOException;

    void removeOrder(String dateTag, int orderNum) throws IOException;

    Order getOrder(String dateTag, int orderNum) throws IOException;

    void saveAllChanges() throws FileNotFoundException;
  
}
