package com.game.team1.vo;

import lombok.Data;

@Data
public class UserInfoVO {
    private int uiNum; //유저번호
    private String uiId; //유저 아이디
    private String uiPwd; // 유저 비밀번호
    private String uiName; // 유저 이름
    private String uiMobile; // 유저 핸드폰번호
    private String uiEmail; // 유저 이메일
    private String uiBirth; // 유저 생일
    private String credat; // 유저 생성일
    private String lmodat; // 유저 수정일
    private String active; // 회원탈퇴 유무 우리는 0,1 로 구분
}
