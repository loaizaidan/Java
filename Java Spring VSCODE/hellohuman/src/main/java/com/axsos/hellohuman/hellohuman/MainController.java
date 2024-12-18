package com.axsos.hellohuman.hellohuman;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String index(
        @RequestParam(value = "name", defaultValue = "Human", required = false) String name,
        @RequestParam(value = "lastName", defaultValue = "", required = false) String lastName,
        @RequestParam(value = "times", defaultValue = "1", required = false) int times
    ) {
        return String.format("Hello %s %s.  ", name, lastName).repeat(times);
    }
    
    
}
