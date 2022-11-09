package com.example.spaghetti.controller;

import com.example.spaghetti.service.Restaurant;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private Restaurant restaurant;

    public RestaurantController(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @GetMapping("spaghetti")
    public int getPortion(){
        return restaurant.getPortion();
    }

    @GetMapping(path="spaghetti/eat")
    public void eat() throws IOException {
        restaurant.soldSpaghetti();
    }
}
