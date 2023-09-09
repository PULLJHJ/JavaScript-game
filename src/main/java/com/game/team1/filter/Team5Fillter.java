package com.game.team1.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.game.team1.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Component
// @WebFilter(urlPatterns = "/tmpl/user-info/list")
@Slf4j
public class Team5Fillter extends GenericFilterBean {

    private List<String> execludeUrls = new ArrayList<>();
    {
        execludeUrls.add("/tmpl/user-info/join");
        execludeUrls.add("/tmpl/user-info/login");
        execludeUrls.add("/");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        if (request instanceof HttpServletRequest req && response instanceof HttpServletResponse res) {
        	HttpSession session = req.getSession();
            UserInfoVO user = (UserInfoVO) session.getAttribute("user");
            log.info("user=>{}", user);
            String uri = req.getRequestURI();  //사용자가 입력한 uri 에서
            log.info("uri=>{}",uri);
            if (!execludeUrls.contains(uri)) { // 내가 설정한 Url가 없으면! 있으면 그냥 필터실행
                if (user == null) {
                    res.sendRedirect("/");
                    return;
                }
            }

        }
        chain.doFilter(request, response);

    }
}
