package com.sicimike.behavioral.templatemethod;

/**
 * 自驾出行
 * @author sicimike
 * @create 2020-02-27 21:40
 */
public class CarTravel extends Travel {

    @Override
    protected boolean needBuyTicket() {
        // 自驾不需要买票
        return false;
    }
}
