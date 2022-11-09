package com.example.spaghetti.repo;

import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
@Repository
public class SpaghettiRepo {

    public int getPortion(){


        int portion;
        try {
        portion = Integer.parseInt(Files.readAllLines(Paths.get("spaghettiStock.txt").toAbsolutePath()).get(0))-1;

    } catch (IOException issue) {
        portion = 0;
    }
    return portion;
}

public void reducePortion() throws IOException {

        String content = "" + getPortion();
        Files.writeString(Paths.get("spaghettiStock.txt"), content);

}



}
