package com.tsguild.sitemapmvc.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InterestCalcController {
        
    public InterestCalcController() {
    }
    
    @RequestMapping(value="/interestCalc", method=RequestMethod.GET)
    public String displayInterestCalc() {
        return "interestCalc";
    }
}
