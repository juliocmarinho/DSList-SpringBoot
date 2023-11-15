package com.julio.dslist.dto;

import com.julio.dslist.entities.Game;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){}

    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }

}
