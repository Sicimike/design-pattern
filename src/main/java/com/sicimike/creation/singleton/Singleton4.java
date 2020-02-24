package com.sicimike.creation.singleton;

/**
 * 懒汉式单例，线程安全
 * synchronized关键字实现
 * @author sicimike
 * @create 2020-02-23 20:26
 */
public class Singleton4 {

    private static Singleton4 INSTANCE = null;

    private Singleton4() {}

    public static synchronized Singleton4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}
