package com.t2team.mycinema.repository;

import com.t2team.mycinema.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICinemaRepository extends JpaRepository<Cinema, Long> {
}
