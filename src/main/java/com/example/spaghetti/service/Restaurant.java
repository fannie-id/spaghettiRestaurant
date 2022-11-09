package com.example.spaghetti.service;

import com.example.spaghetti.repo.SpaghettiRepo;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Restaurant {
    private SpaghettiRepo spaghettiRepo;

    public Restaurant(SpaghettiRepo spaghettiRepo) {
        this.spaghettiRepo = spaghettiRepo;
    }
    public int getPortion(){
        return spaghettiRepo.getPortion();
    }

    public void soldSpaghetti() throws IOException {
        spaghettiRepo.reducePortion();

    }

}
