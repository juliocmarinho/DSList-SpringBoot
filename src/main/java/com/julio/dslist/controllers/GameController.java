package com.julio.dslist.controllers;


import com.julio.dslist.dto.GameDTO;
import com.julio.dslist.dto.GameMinDTO;
import com.julio.dslist.entities.Game;
import com.julio.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id){
        var result = gameService.findById(id);
        return result;
    }

    @GetMapping("")
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
