package com.sicimike.structural.decorator;

/**
 * 抽象装饰类
 * @author sicimike
 * @create 2020-02-25 20:53
 */
public abstract class AbstractDecorator implements Tea {

    private Tea tea;

    public AbstractDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String desc() {
        return this.tea.desc();
    }

    @Override
    public int cost() {
        return this.tea.cost();
    }
}
