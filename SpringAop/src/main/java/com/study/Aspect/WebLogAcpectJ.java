package com.study.Aspect;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.AssertTrue;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author:
 * @date:2019/8/16 15:56
 */
@Aspect
@Component
public class WebLogAcpectJ {
    private Logger logger = LoggerFactory.getLogger(WebLogAcpectJ.class);

    @Pointcut("execution(* com.study..*.*(..))")
    public void webLog() {

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        System.out.println("URL: " + request.getRequestURL().toString());
        System.out.println("httpMethod: " + request.getMethod());
        System.out.println("IP: " + request.getRemoteAddr());
        System.out.println(joinPoint);
        logger.info("CLass_method: " + joinPoint.getSignature().getDeclaringTypeName() + ".。。。" + joinPoint.getSignature().getName());
        logger.info("args: " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("RESPONSE : " + ret);
    }

}
