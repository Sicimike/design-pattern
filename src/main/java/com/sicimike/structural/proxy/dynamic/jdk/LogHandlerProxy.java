package com.sicimike.structural.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 日志处理器
 * @author sicimike
 * @create 2020-02-26 20:04
 */
public class LogHandlerProxy implements InvocationHandler {

    // 目标对象
    private Object target;

    public LogHandlerProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("日志采集...");
    }

    public void after() {
        System.out.println("执行成功...");
    }
}
