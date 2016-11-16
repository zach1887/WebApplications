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

    public DaoJdbcImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_GET_ALL_ITEMS = "SELECT * FROM ItemsDetail";

    @Override
    public List<Item> getAllItems() {
        List<Item> allItems;
        allItems = jdbcTemplate.query(SQL_GET_ALL_ITEMS, new ItemMapper());
        return allItems;
    }

    private static final String SQL_VEND_ITEM = "UPDATE ItemsDetail SET Qty = ? WHERE id = ?";

    @Override
    public void vendItem(Item item) {

        jdbcTemplate.update(SQL_VEND_ITEM, item.getItemQty() - 1, item.getItemID());
    }

    private static final String SQL_RESTOCK_ITEM = "UPDATE ItemsDetail SET Qty = ? WHERE id = ?";

    @Override
    public void restockItem(Item item, int newQty) {
        jdbcTemplate.update(SQL_RESTOCK_ITEM, item.getItemQty() + newQty, item.getItemID());
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
