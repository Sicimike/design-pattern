package com.sicimike.behavioral.observer;

import java.util.Observable;

/**
 * 订阅号（被观察者）
 * 继承java.util.Observable类
 * @author sicimike
 * @create 2020-02-27 22:11
 */
public class SubscriptionAccount extends Observable {

    private String name;

    public SubscriptionAccount(String name) {
        this.name = name;
    }

    public void pushMessage(String messageTitle) {
        System.out.println("订阅号【" + this.name + "】推送了一条消息，标题是：" + messageTitle);
        setChanged();
        notifyObservers(messageTitle);
    }

    public String getName() {
        return name;
    }
}
