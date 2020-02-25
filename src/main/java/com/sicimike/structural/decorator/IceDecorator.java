package com.sicimike.structural.decorator;

/**
 * 具体装饰者-冰
 * @author sicimike
 * @create 2020-02-25 21:04
 */
public class IceDecorator extends AbstractDecorator {

    public IceDecorator(Tea tea) {
        super(tea);
    }

    @Override
    public String desc() {
        return super.desc() + " 加一份冰";
    }

    @Override
    public int cost() {
        return super.cost() + 0;
    }
}
