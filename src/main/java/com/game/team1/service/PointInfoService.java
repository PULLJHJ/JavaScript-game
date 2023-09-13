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
}
