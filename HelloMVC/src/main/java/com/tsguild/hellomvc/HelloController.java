package com.tsguild.hellomvc;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/hello"})
public class HelloController {
        
    public HelloController() {
    }
    
    @RequestMapping(value="/sayhi", method=RequestMethod.GET)
    public String sayHi(Map<String, Object> model, HttpServletRequest req) {
        model.put("SomethingHere", req.getParameter("llamaName"));
        model.put("message", "Hello from the controller" );
        return "hello";
    }
}
