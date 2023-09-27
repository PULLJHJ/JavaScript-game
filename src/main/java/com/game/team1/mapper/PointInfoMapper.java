package com.game.team1.mapper;

import java.util.List;

import com.game.team1.vo.PointInfoVO;

public interface PointInfoMapper {
    List<PointInfoVO> selectPointInfo();
    int insertPointInfo(PointInfoVO pointInfo);
    
    PointInfoVO selectMaxPoint(PointInfoVO point);

    PointInfoVO selectMaxPoint2(PointInfoVO point);

    List<PointInfoVO> selectRank(PointInfoVO point);

    List<PointInfoVO> selectRank2(PointInfoVO point);
}
