package com.sicimike.creation.singleton;

/**
 * 懒汉式单例，线程安全
 * 双重校验锁
 * @author sicimike
 * @create 2020-02-23 20:34
 */
public class Singleton6 {

    private static volatile Singleton6 INSTANCE = null;

    private Singleton6() {}

    public static Singleton6 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton6.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }
}
