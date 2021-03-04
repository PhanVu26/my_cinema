package com.t2team.mycinema.service.impl;

import com.t2team.mycinema.entity.Cinema;
import com.t2team.mycinema.repository.ICinemaRepository;
import com.t2team.mycinema.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaServiceImpl implements ICinemaService {

    @Autowired
    ICinemaRepository cinemaRepository;

    @Override
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    @Override
    public Optional<Cinema> findById(long id) {
        return cinemaRepository.findById(id);
    }

    @Override
    public Cinema save(Cinema cinema) {

        return cinemaRepository.save(cinema);
    }

    @Override
    public void delete(Cinema cinema) {

    }
}
