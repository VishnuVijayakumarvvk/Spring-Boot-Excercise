package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/people")
    //http://localhost:3200/peoples
    public List<String> apicontroller(){
        List<String> people = Arrays.asList("Vishnu", "Ram", "Govind", "sachin");
        return people;
    }

}
