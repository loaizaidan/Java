package com.routes.routes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DaikichiController {
    @RequestMapping("/")
    public String info() {
        return "Type daikichi in the URL above!";
    }

    @RequestMapping("/daikichi")
    public String hello() {
        return "Welcome!";
    }

    @RequestMapping("daikichi/today")
    public String helloToday() {
        return "Today you will find luck in all your endeavors!";
    }
    
    @RequestMapping("daikichi/tomorrow")
    public String helloTomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
    
}
