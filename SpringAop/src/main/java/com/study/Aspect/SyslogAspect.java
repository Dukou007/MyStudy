package com.study.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @description:log切面
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/19 17:19
 */
@Aspect
@Component
public class SyslogAspect {
    @Pointcut("@annotation(com.study.annotation.SysLogIntecept)")
    public void sysLogIntercept() {

    }


    @Before("sysLogIntercept()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        System.out.println("URL: " + request.getRequestURL().toString());
        System.out.println("httpMethod: " + request.getMethod());
        System.out.println("IP: " + request.getRemoteAddr());
        System.out.println(joinPoint);

    }

    @After("sysLogIntercept()")
    public void doafter() {
        System.out.println("搞完了");
    }
}
