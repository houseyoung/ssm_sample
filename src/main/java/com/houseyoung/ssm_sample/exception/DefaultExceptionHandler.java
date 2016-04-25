package com.houseyoung.ssm_sample.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * DefaultExceptionHandler
 * 进行异常的同意处理
 * @author dujuan
 * @date: 2016/4/24
 */
public class DefaultExceptionHandler implements HandlerExceptionResolver{


    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("myExceptionResolve");
        //
        return null;
    }

}
