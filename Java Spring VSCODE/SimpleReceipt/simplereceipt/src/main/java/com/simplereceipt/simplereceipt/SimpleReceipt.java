package com.simplereceipt.simplereceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SimpleReceipt {
    @RequestMapping("/")
    public String receipt(Model model) {
        String name = "Loai Zaidan";
        String itemName = "Stainless Steel Pipe";
        double price = 10.50;
        String description = "Strong metal, also doesn't rust";
        String vendor = "Big things main store";
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "receipt.jsp";
    }
    
}
