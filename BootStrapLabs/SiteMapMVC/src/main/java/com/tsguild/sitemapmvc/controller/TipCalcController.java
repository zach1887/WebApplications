package com.tsguild.sitemapmvc.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TipCalcController {
        
    public TipCalcController() {
    }
    
    @RequestMapping(value="/tipCalc", method=RequestMethod.GET)
    public String displayTipCalculator() {
        return "tipCalc";
    }
}
