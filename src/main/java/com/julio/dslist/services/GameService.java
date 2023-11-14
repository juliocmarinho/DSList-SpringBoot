package com.julio.dslist.services;

import com.julio.dslist.dto.GameMinDTO;
import com.julio.dslist.entities.Game;
import com.julio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList(); // Função importante que pega os dados de result e cria uma lista de objetos GameMinDTO de acordo com as infos de X.
    }


}
