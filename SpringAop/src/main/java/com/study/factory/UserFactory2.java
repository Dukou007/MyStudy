package com.study.factory;

import com.study.Aspect.MyAspect;
import com.study.service.UserService;
import com.study.service.impl.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:cglib
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/7 10:51
 */
public class UserFactory2 {
    public static UserService createUserservice(){
        UserServiceImpl userService = new UserServiceImpl();
        MyAspect myAspect = new MyAspect();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object obj = methodProxy.invokeSuper(o, objects);
                myAspect.after();
                return obj;
            }
        });
        UserServiceImpl proxy = (UserServiceImpl) enhancer.create();
        return proxy;
    }
}
