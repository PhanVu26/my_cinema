package com.t2team.mycinema.controller;

import com.t2team.mycinema.entity.Cinema;
import com.t2team.mycinema.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cinemas")
public class CinemaController {

    @Autowired
    ICinemaService cinemaService;

    @GetMapping
    public List<Cinema> getAllCinemas(){
        return cinemaService.findAll();
    }

    @PostMapping
    public Cinema createCinema(@RequestBody Cinema cinema){
        System.out.println(cinema.getName());
        return cinemaService.save(cinema);
    }

}
