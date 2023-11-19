package com.julio.dslist.controllers;


import com.julio.dslist.dto.GameListDTO;
import com.julio.dslist.dto.GameMinDTO;
import com.julio.dslist.dto.ReplacementDTO;
import com.julio.dslist.services.GameListService;
import com.julio.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping("{listid}/games")
    public List<GameMinDTO> findAll(@PathVariable Long listid){
        List<GameMinDTO> result = gameService.findByList(listid);
        return result;
    }

    @PostMapping("{listid}/replacement")
    public void move(@PathVariable Long listid, @RequestBody ReplacementDTO body){
        gameListService.move(listid, body.getSourceIndex(), body.getDestinationIndex());
    }
}
