package com.game.team1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.team1.mapper.PointInfoMapper;
import com.game.team1.vo.PointInfoVO;

@Service
public class PointInfoService {
    @Autowired
    private PointInfoMapper piMapper;
    
    public List<PointInfoVO> getPointInfos() {
        return piMapper.selectPointInfo();
    }

    public int insertPointInfo(PointInfoVO pointInfo) {
        return piMapper.insertPointInfo(pointInfo);
    }

    public PointInfoVO selectMaxPoint(PointInfoVO point){
        return piMapper.selectMaxPoint(point);
    }
    public PointInfoVO selectMaxPoint2(PointInfoVO point){
        return piMapper.selectMaxPoint2(point);
    }

    public List<PointInfoVO> selectRank(PointInfoVO point){
        return piMapper.selectRank(point);
    }

    public List<PointInfoVO> selectRank2(PointInfoVO point){
        return piMapper.selectRank2(point);
    }
}
