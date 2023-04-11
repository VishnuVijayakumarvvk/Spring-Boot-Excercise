package com.lco.SpringMVCProject.homeController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String cart() {
        return "Cart is ready to be charted";
    }
    @PostMapping("/wishlist")
    public String wishList() {
        return "Wishg list prodects are having discount";
    }
    @RequestMapping(value = "/loved", method = RequestMethod.GET)
    public String loved() {
        return "All the loved prodects are out of stock and you will get notified when it is back";
    }
}
