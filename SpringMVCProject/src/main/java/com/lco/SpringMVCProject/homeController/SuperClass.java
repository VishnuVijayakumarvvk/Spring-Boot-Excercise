package com.lco.SpringMVCProject.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin")
public class SuperClass {
    @RequestMapping("/about")
    public String about(){
        return "value";
    }
    @RequestMapping("/adminpage")
    public String admin(){
        return "template";
    }
}
