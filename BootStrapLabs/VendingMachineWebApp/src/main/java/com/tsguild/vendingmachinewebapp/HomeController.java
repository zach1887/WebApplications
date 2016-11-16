package com.tsguild.vendingmachinewebapp;

import java.util.Map;
import com.tsguild.vendingmachinewebapp.dao.ItemDao;
import com.tsguild.vendingmachinewebapp.dto.Item;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
        private ItemDao dao;
    
    @Inject
    public HomeController(ItemDao dao) {
        this.dao = dao;
        
    }    
    
    @RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
    public String displayHomePage(Map<String, Object> model) {
        return "home";
    }
}
