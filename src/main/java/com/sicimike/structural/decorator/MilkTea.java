package com.sicimike.structural.decorator;

/**
 * 被装饰者-奶茶
 * @author sicimike
 * @create 2020-02-25 20:55
 */
public class MilkTea implements Tea {

    @Override
    public String desc() {
        return "奶茶";
    }

    @Override
    public int cost() {
        return 9;
    }
}
