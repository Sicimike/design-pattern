package com.sicimike.creation.singleton;

import java.io.Serializable;

/**
 * 枚举实现单例，线程安全
 * @author sicimike
 * @create 2020-02-23 20:46
 */
public enum Singleton8 {
    INSTANCE;

    public static Singleton8 getInstance() {
        return INSTANCE;
    }

}
