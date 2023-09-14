package com.game.team1.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.mariadb.jdbc.type.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.team1.service.PointInfoService;
import com.game.team1.vo.PointInfoVO;
import com.game.team1.vo.UserInfoVO;

@RestController
public class PointInfoController {
    @Autowired
    private PointInfoService piServce;

    @GetMapping("/point-infos")
    public List<PointInfoVO> getPointInfos() {
        return piServce.getPointInfos();
    }

    @PostMapping("/point-infos")
    public int insertPointInfo(@RequestBody PointInfoVO pointInfo) {
        return piServce.insertPointInfo(pointInfo);
    }

    @GetMapping("/point-infos/max")
    public PointInfoVO getMaxPointInfo(PointInfoVO point, HttpSession session){
        UserInfoVO user = (UserInfoVO) session.getAttribute("user");
        point.setUiNum(user.getUiNum());
        return piServce.selectMaxPoint(point);
    }

    @GetMapping("/point-infos/rank")
    public List<PointInfoVO> rankPointInfo(PointInfoVO point){
        return piServce.selectRank(point);
    }
}
