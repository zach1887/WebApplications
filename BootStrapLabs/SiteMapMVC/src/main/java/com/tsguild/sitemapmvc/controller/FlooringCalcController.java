package com.tsguild.sitemapmvc.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlooringCalcController {
        
    public FlooringCalcController() {
    }
    
    @RequestMapping(value="/flooringCalc", method=RequestMethod.GET)
    public String displayFlooringCalc() {
        return "flooringCalc";
    }
}
