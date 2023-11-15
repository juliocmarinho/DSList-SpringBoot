package com.julio.dslist.services;

import com.julio.dslist.dto.GameDTO;
import com.julio.dslist.dto.GameListDTO;
import com.julio.dslist.dto.GameMinDTO;
import com.julio.dslist.entities.GameList;
import com.julio.dslist.repositories.GameListRepository;
import com.julio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }


}
