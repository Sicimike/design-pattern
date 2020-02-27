package com.sicimike.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 用户（观察者）
 * 实现java.util.Observer接口
 * @author sicimike
 * @create 2020-02-27 22:13
 */
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 被观察者发生变化时，回调该方法
        SubscriptionAccount subscriptionAccount = (SubscriptionAccount) o;
        String messageTitle = (String) arg;
        System.out.println("用户【" + this.name + "】收到了订阅号【" + subscriptionAccount.getName() + "】的一条推送，标题为：" + messageTitle);
    }
}
