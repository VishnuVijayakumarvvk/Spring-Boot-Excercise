package com.lco.SpringMVCProject.homeController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class jsonController {
    Logger logger = LoggerFactory.getLogger(jsonController.class);
    @PostMapping("/createstudent")
    public String createStudent(@RequestBody List<Map<String,Object>> data ){
        return "created";
    }
    @PostMapping("/createProduct")
    public ResponseEntity<List<Product>> creteProduct(@RequestBody List<Product> product){
        System.out.println(product);
        ResponseEntity<List<Product>> respose= new ResponseEntity<>(product, HttpStatus.BAD_GATEWAY);
        return respose;
    }
    @PostMapping("/createMember")
    public String createMember(@RequestParam("MemberNAme") String MemberName,
                               @RequestParam(value="Rollnumber",defaultValue = "1", required = false) int Rollnumber,
                               @RequestParam("Classname") String Classname){
        return MemberName+" "+Rollnumber+" "+Classname;
    }
    @GetMapping("/createPerson")
    public String createPerson(@RequestParam("id")int id,
                               @RequestParam("Name")String Name,
                               @RequestParam("age")int age){
        logger.error("id = {}",id);
        logger.error("Name = {}",Name);
        logger.error("age = {}",age);
        return "The person is found in the index no 2";
    }
@GetMapping("/createAccount/{Name}/{age}/{Gender}")
    public String createAccount(@PathVariable("Name") String name,
                                @PathVariable("age") int age,
                                @PathVariable("Gender") String gender){
        return "The Account is created successfully";
}
// Layers in the spring boot -
// Controller layer - Service/Business layer - Repository Layer - Database
}
