package com.sicimike.structural.adaptor.object;

/**
 * 适配器
 * 对象适配器模式：实现目标接口，通过组合的方式获取Adaptee类对象
 * @author sicimike
 * @create 2020-02-25 22:00
 */
public class TargetAdaptor implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void especialDisplay() {
        adaptee.display();
    }
}
