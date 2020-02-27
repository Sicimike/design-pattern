package com.sicimike.structural.proxy.statics;

/**
 * 房东代理（中介、二房东）
 * 代理类
 * @author sicimike
 * @create 2020-02-26 19:37
 */
public class LandlordProxy {

    private Landlord landlord = new Landlord();

    public void rentHouse() {
        System.out.println("草拟合同...");
        landlord.signContract();
        System.out.println("查水表...");
    }
}
