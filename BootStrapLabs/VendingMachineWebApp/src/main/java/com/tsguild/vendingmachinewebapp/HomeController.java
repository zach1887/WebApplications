package com.tsguild.vendingmachinewebapp;

import com.tsguild.vendingmachinewebapp.dao.ItemDao;
import com.tsguild.vendingmachinewebapp.dto.Item;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private ItemDao dao;

    @Inject
    public HomeController(ItemDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/home", "/"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @ResponseBody
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Item> displayAllItems() {
        return dao.getAllItems();
    }
    
    @ResponseBody
    @RequestMapping(value = "/vend/{item}", method = RequestMethod.PUT)
    public void vendItem(Item item) {
        dao.vendItem(item);
    }
    
    @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.PUT)
    public void restockItem(Item item, int qty) {
        dao.restockItem(item, qty);
    }
    
}
