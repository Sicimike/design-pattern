package com.sicimike.structural.adaptor.clazz;

/**
 * 适配器类
 * 类适配器模式：适配器类继承要适配的类，并且实现目标接口
 * @author sicimike
 * @create 2020-02-25 21:54
 */
public class TargetAdaptor extends Adaptee implements Target {

    @Override
    public void especialDisplay() {
        this.display();
    }

}
