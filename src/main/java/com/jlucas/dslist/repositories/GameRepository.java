package com.jlucas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlucas.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
