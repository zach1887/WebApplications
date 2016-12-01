package com.tsguild.vendingmachinewebapp;

import com.tsguild.vendingmachinewebapp.dao.ItemDao;
import com.tsguild.vendingmachinewebapp.dto.Item;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MgmtController {

    private ItemDao dao;

    @Inject
    public MgmtController(ItemDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/manage", method = RequestMethod.GET)
    public String displayMgmtPage() {
        return "manage";
    }
    
    
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public Item addItem(@RequestBody Item newItem) {
        dao.addNewItem(newItem);
        return newItem;
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/item/{itemId}", method = RequestMethod.PUT)
    public void editItem(@PathVariable int itemId, @RequestBody Item updatedItem ) {
        updatedItem.setItemID(itemId);
        dao.editItem(updatedItem);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/item/{itemId}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable int itemId) {
        dao.deleteItem(itemId);
    }

}
