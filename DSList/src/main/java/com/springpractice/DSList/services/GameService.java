package com.springpractice.DSList.services;

import com.springpractice.DSList.dto.GameMinDTO;
import com.springpractice.DSList.entities.Game;
import com.springpractice.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
