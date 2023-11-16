package com.springpractice.DSList.repositories;

import com.springpractice.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
