package com.sicimike.structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 日志处理器
 * @author sicimike
 * @create 2020-02-26 21:14
 */
public class LogHandlerProxy implements MethodInterceptor {

    // 目标对象
    private Object target;

    public LogHandlerProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * @param object 表示要进行增强的对象
     * @param method 表示拦截的方法
     * @param args 数组表示参数列表，基本数据类型需要传入其包装类型
     * @param methodProxy 表示对方法的代理
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
