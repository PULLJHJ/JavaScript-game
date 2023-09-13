package com.game.team1.mapper;

import java.util.List;

import com.game.team1.vo.GameInfoVO;

public interface GameInfoMapper {
    List<GameInfoVO> selectGameInfos(GameInfoVO game);
}
