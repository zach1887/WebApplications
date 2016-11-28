package com.tsguild.sitemapmvc.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LuckySevensController {
        
    public LuckySevensController() {
    }
    
    @RequestMapping(value="/luckySevens", method=RequestMethod.GET)
    public String displayLuckySevens() {
        return "luckySevens";
    }
}
