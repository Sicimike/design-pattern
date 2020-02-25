package com.sicimike.structural.decorator;

/**
 * 具体装饰者-果粒
 * @author sicimike
 * @create 2020-02-25 21:07
 */
public class FruitDecorator extends AbstractDecorator {

    public FruitDecorator(Tea tea) {
        super(tea);
    }

    @Override
    public String desc() {
        return super.desc() + " 加一份果粒";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
