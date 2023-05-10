package com.jlucas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlucas.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
