package com.study.factory;

import com.study.Aspect.MyAspect;
import com.study.service.UserService;
import com.study.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:工厂类
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/7/23 16:20
 */
public class UserServiceFactory {
    public static UserService createUserService() {
        // 1、创建目标对象target
        UserService userService = new UserServiceImpl();
        // 2、声明切面类对象
        final MyAspect myAspect = new MyAspect();
        // 3、把切面类的两个方法应用切面类
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                UserServiceFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myAspect.before();
                method.invoke(userService, args);
                myAspect.after();
                return null;
            }
        });
        return userServiceProxy;
    }
}
