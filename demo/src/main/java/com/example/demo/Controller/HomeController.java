package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    //@Value("${com.example.name}")
    @Autowired
    public Cproperties prop;

    @Autowired
    public Games games;

    @RequestMapping("/people")
    //http://localhost:3200/peoples
    public List<String> apicontroller(){
        List<String> people = Arrays.asList("Vishnu", "Ram", "Govind", "sachin","raju","ramij","hari","navneet");
        return people;
    }
    @RequestMapping("/properties")
    public Cproperties prop(){
        return this.prop;
    }
    @RequestMapping("/games")
    public List<Games> game(){
        List<Games> gam = Arrays.asList(new Games(1,"Vollyball"), new Games(2,"baseball"));
        return gam;
    }


}
