package com.lco.SpringMVCProject.homeController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class jsonController {
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
}
