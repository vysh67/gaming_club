package com.dscasc.Gaming.Club.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscasc.Gaming.Club.entities.Game;
@Repository

public interface GameRepository extends JpaRepository<Game, Integer>{

}
