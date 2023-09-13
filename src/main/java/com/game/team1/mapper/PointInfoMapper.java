package com.game.team1.mapper;

import java.util.List;

import com.game.team1.vo.PointInfoVO;

public interface PointInfoMapper {
    public List<PointInfoVO> selectPointInfo();
    public int insertPointInfo(PointInfoVO pointInfo);
}
