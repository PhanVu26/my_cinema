package com.t2team.mycinema.service;

import com.t2team.mycinema.entity.Cinema;

import java.util.List;
import java.util.Optional;

public interface ICinemaService {
    List<Cinema> findAll();
    Optional<Cinema> findById(long id);
    Cinema save(Cinema cinema);
    void delete(Cinema cinema);
}
