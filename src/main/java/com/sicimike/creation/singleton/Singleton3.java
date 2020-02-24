package com.sicimike.creation.singleton;

/**
 * 懒汉式单例，线程不安全
 * @author sicimike
 * @create 2020-02-23 20:21
 */
public class Singleton3 {

    private static Singleton3 INSTANCE = null;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
