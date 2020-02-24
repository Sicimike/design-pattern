package com.sicimike.creation.singleton;

/**
 * 懒汉式单例，线程安全
 * 静态内部类
 * @author sicimike
 * @create 2020-02-23 20:36
 */
public class Singleton7 {

    private Singleton7() {}

    public static Singleton7 getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static Singleton7 INSTANCE = new Singleton7();
    }

}
