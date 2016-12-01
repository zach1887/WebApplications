/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachinewebapp.dao;

import com.tsguild.vendingmachinewebapp.dto.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
public class DaoJdbcImpl implements ItemDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
 
    private static final String SQL_GET_ITEM_BY_ID = "SELECT * FROM ItemsDetail WHERE id = ?";
    
    @Override  
    public Item getItemById(int id) {
        try {
            return jdbcTemplate.queryForObject(SQL_GET_ITEM_BY_ID, new ItemMapper(), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    private static final String SQL_GET_ALL_ITEMS = "SELECT * FROM ItemsDetail";

    @Override
    public List<Item> getAllItems() {
        List<Item> allItems;
        allItems = jdbcTemplate.query(SQL_GET_ALL_ITEMS, new ItemMapper());
        return allItems;
    }

    private static final String SQL_VEND_ITEM = "UPDATE ItemsDetail SET Qty = ? WHERE id = ?";
    private static final String SQL_ADD_TRANS = "INSERT INTO TransactionalData(`itemID`,`price`)"
            + " VALUES (?,?)";

    @Override
    public void vendItem(int itemId) {
        Item returnItem = getItemById(itemId);
        jdbcTemplate.update(SQL_VEND_ITEM, returnItem.getItemQty() - 1, returnItem.getItemID());
        jdbcTemplate.update(SQL_ADD_TRANS, returnItem.getItemID(), returnItem.getItemPrice());
    }

    private static final String SQL_RESTOCK_ITEM = "UPDATE ItemsDetail SET Qty = ? WHERE id = ?";

    @Override
    public void restockItem(int itemId, int newQty) {
        Item returnItem = getItemById(itemId);
        jdbcTemplate.update(SQL_RESTOCK_ITEM, returnItem.getItemQty() + newQty, returnItem.getItemID());
    }

    private static final String SQL_ADD_NEW_ITEM = "INSERT INTO ItemsDetail(`name`,`price`,`qty`)"
            + " VALUES(?,?,?)";

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Item addNewItem(Item item) {
        jdbcTemplate.update(SQL_ADD_NEW_ITEM, item.getItemName(), item.getItemPrice(), item.getItemQty());
        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        item.setItemID(id);
        return item;
    }

    private static final String SQL_EDIT_ITEM = "UPDATE ItemsDetail SET name = ?,  price = ?, "
            + " qty = ?,WHERE id = ?";

    @Override
    public void editItem(Item changeItem) {
        jdbcTemplate.update(SQL_EDIT_ITEM, changeItem.getItemName(), changeItem.getItemPrice(),
                changeItem.getItemQty(), changeItem.getItemID());
    }

    private static final String SQL_DELETE_ITEM = "DELETE FROM ItemsDetails WHERE id = ?";

    @Override
    public void deleteItem(int itemId) {
        jdbcTemplate.update(SQL_DELETE_ITEM, itemId);
    }

    private static final class ItemMapper implements RowMapper<Item> {

        @Override
        public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
            Item mappedItem = new Item();
            String name = rs.getString("name");
            Double price = rs.getDouble("price");
            Integer qty = rs.getInt("qty");

            Integer itemId = rs.getInt("id");

            mappedItem.setItemName(name);
            mappedItem.setItemPrice(price);
            mappedItem.setItemQty(qty);
            mappedItem.setItemID(itemId);

            return mappedItem;
        }

    }
}
