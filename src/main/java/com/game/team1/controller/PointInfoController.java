package com.game.team1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.team1.service.PointInfoService;
import com.game.team1.vo.PointInfoVO;

@RestController
public class PointInfoController {
    @Autowired
    private PointInfoService piServce;

    @GetMapping("/point-infos")
    public List<PointInfoVO> getPointInfos() {
        return piServce.getPointInfos();
    }

    @PostMapping("/point-infos")
    public int insertPointInfo(PointInfoVO pointInfo) {
        return piServce.insertPointInfo(pointInfo);
    }
}
