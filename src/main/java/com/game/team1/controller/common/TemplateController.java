package com.game.team1.controller.common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
    @GetMapping("/tmpl/**")
    public void goPage(){
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/index2")
    public String index(){
        return "index2";
    }

    @GetMapping("/logout")
    public void logout(HttpSession session, HttpServletResponse response){
        session.setAttribute("user", null);
        try {
            response.sendRedirect("/");
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
