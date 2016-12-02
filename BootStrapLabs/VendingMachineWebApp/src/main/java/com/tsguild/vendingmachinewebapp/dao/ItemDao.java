/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachinewebapp.dao;

import com.tsguild.vendingmachinewebapp.dto.Item;
import java.util.List;

/**
 *
 * @author Jesse
 */
public interface ItemDao {

    public Item getItemById(int id);
    
    Item addNewItem(Item item);

    void deleteItem(int itemId);

    void editItem(Item item);

    List<Item> getAllItems();

    void vendItem(int itemId);
    
}
