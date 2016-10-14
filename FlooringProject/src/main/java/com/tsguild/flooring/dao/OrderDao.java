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

    void addOrders(String fileIntro, Order order) throws IOException;

    Collection<Order> displayOrders(String fileIntro) throws IOException;

    void loadFromFile(String FILE_NAME) throws IOException;

    void loadFromFileAdd(String FILE_NAME) throws IOException;

    void removeOrder(String fileIntro, int orderNum) throws IOException;

    Order retreiveEditOrder(String editDate, String fileIntro, String orderNum) throws IOException;

    void saveAllChanges() throws FileNotFoundException;

    void switchOrder(Order editOrder, Order correctedOrder, String fileIntro, String newFileIntro) throws IOException;
    
}
