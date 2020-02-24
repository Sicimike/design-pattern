package com.sicimike.creation.singleton;

import java.io.Serializable;

/**
 * 单例模式与序列化
 * @author sicimike
 * @create 2020-02-23 22:26
 */
public class SingletonWithSerialize implements Serializable {

    private static final long serialVersionUID = 6133201454552796162L;

    private static final SingletonWithSerialize INSTANCE = new SingletonWithSerialize();

    private SingletonWithSerialize() {}

    public static SingletonWithSerialize getInstance() {
        return INSTANCE;
    }

    // 解决序列化与反序列化破坏单例模式的问题
    private Object readResolve() {
        return this.INSTANCE;
    }

}
