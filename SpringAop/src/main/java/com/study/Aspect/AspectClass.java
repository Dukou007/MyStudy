package com.study.Aspect;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:环绕通知
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/7 11:01
 */
public class AspectClass implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation m) throws Throwable {
        System.out.println("前置……………………………………………………………………………………");
        Object obj = m.proceed();
        System.out.println("后置……………………………………………………………………………………");
        return obj;
    }
}
