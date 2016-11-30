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
    
        @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.PUT)
    public void restockItem(Item item, int qty) {
        dao.restockItem(item, qty);
    }
     
}
