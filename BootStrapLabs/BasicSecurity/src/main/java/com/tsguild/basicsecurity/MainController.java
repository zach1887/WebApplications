package com.tsguild.basicsecurity;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
        
    public MainController() {
    }
    
    @RequestMapping(value={"/","/home"})
     public String displayMain() {
         return "main";
     }
}
