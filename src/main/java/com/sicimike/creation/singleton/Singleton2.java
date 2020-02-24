package com.sicimike.creation.singleton;

/**
 * 饿汉式单例，线程安全
 * @author sicimike
 * @create 2020-02-23 20:19
 */
public class Singleton2 {

    private static Singleton2 INSTANCE = null;

    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
