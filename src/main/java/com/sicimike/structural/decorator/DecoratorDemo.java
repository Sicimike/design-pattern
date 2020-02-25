package com.sicimike.structural.decorator;

/**
 * @author sicimike
 * @create 2020-02-25 21:08
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Tea tea = new MilkTea();
        tea = new IceDecorator(tea);
        tea = new FruitDecorator(tea);
        tea = new FruitDecorator(tea);
        System.out.println(tea.desc() + " 花费" + tea.cost() + "元");
    }
}
