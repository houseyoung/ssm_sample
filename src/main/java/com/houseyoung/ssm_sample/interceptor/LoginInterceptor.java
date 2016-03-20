package com.houseyoung.ssm_sample.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by houseyoung on 15/8/29.
 * 登录拦截器，Modify from http://jinnianshilongnian.iteye.com/blog/1670856 & http://www.cnblogs.com/AloneSword/p/3420286.html
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    private String loginUrl;
    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //放行登录页
        if(request.getServletPath().startsWith(loginUrl)) {
            return true;
        }

        //登录后放行其他页
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            return true;
        }

        //非法访问时跳转回登录页
        response.sendRedirect(request.getContextPath() + loginUrl);
        return false;
    }
}