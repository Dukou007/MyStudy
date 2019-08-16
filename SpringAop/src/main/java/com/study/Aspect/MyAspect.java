package com.study.Aspect;

import org.aopalliance.aop.Advice;

/**
 * @description:切面 类=切入点+通知 （advice+pointcut）
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/7/23 16:16
 */
public class MyAspect implements Advice {
    public void  before(){
        System.out.println("开启事务……");
    }
    public void after(){
        System.out.println("结束事物……");
    }
}
