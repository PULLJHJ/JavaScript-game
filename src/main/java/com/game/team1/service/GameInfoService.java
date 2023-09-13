package com.game.team1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.team1.mapper.GameInfoMapper;
import com.game.team1.vo.GameInfoVO;

@Service
public class GameInfoService {
    
    @Autowired
    private GameInfoMapper giMapper;

    public List<GameInfoVO> getGameInfos(GameInfoVO game){
        return giMapper.selectGameInfos(game);
    };
}
