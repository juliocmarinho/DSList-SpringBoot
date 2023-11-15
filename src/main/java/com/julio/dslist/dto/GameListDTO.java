package com.julio.dslist.dto;

import com.julio.dslist.entities.GameList;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameListDTO {

    Long id;
    String name;

    public GameListDTO(){
    }

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
