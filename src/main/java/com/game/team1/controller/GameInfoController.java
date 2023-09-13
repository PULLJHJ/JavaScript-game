package com.game.team1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.team1.service.GameInfoService;
import com.game.team1.vo.GameInfoVO;

@RestController
public class GameInfoController {
    
    @Autowired
    private GameInfoService giService;


    @GetMapping("/game-info")
    public List<GameInfoVO> selectGameInfos(GameInfoVO game){
        return giService.getGameInfos(game);
    }

}
