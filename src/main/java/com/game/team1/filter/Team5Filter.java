package com.game.team1.filter;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.GenericFilterBean;

import com.game.team1.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;



@WebFilter(value = "/")
@Slf4j
public class Team5Filter extends GenericFilterBean{
    
    @Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(request instanceof HttpServletRequest req && response instanceof HttpServletResponse res) {
			HttpSession session = req.getSession();
			UserInfoVO user = (UserInfoVO) session.getAttribute("user");
			log.info("user=>{}", user);
			String uri = req.getRequestURI();
			
            if(user == null) {
                res.sendRedirect("/views/login");
                return;
            }
        
			
		}
		chain.doFilter(request, response);
    }
}
