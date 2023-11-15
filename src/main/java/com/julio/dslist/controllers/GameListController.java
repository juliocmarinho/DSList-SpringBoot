package com.julio.dslist.controllers;


import com.julio.dslist.dto.GameDTO;
import com.julio.dslist.dto.GameListDTO;
import com.julio.dslist.dto.GameMinDTO;
import com.julio.dslist.services.GameListService;
import com.julio.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping()
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
