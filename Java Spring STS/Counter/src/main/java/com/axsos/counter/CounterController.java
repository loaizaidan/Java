package com.axsos.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
    
    @GetMapping("/")
    public String index(HttpSession session) {
        
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        } else {
            Integer currentCount = (Integer) session.getAttribute("count");
            session.setAttribute("count", currentCount + 1);
        }
        return "main.jsp";
    }
    
    @GetMapping("/counter")
    public String counter(HttpSession session, Model model) {
        
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        
        model.addAttribute("count", session.getAttribute("count"));
        return "counter.jsp";
    }
    
}