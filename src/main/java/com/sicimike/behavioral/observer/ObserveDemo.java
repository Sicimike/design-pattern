package com.sicimike.behavioral.observer;

/**
 * @author sicimike
 * @create 2020-02-27 22:22
 */
public class ObserveDemo {

    public static void main(String[] args) {
        SubscriptionAccount subscription = new SubscriptionAccount("随便写的");
        // 添加观察者
        subscription.addObserver(new User("Sicimike-1"));
        subscription.addObserver(new User("Sicimike-2"));
        // 推送消息
        subscription.pushMessage("观察者模式，你学会了吗？");
    }
}
