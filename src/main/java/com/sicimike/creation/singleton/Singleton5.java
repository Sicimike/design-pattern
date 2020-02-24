package com.sicimike.creation.singleton;

/**
 * 懒汉式单例，线程不安全
 * @author sicimike
 * @create 2020-02-23 20:29
 */
public class Singleton5 {

    private static Singleton5 INSTANCE = null;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }
}
