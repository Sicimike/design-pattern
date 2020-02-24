package com.sicimike.creation.singleton;

/**
 * 恶汉式单例，线程安全
 * @author sicimike
 * @create 2020-02-23 20:15
 */
public class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
