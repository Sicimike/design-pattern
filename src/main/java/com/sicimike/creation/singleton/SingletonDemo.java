package com.sicimike.creation.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author sicimike
 * @create 2020-02-23 20:48
 */
public class SingletonDemo {

    private static final String FILE_PATH = "singleton.data";

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        SingletonWithSerialize instance = SingletonWithSerialize.getInstance();
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(FILE_PATH)));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(FILE_PATH)));
//        SingletonWithSerialize readInstance = (SingletonWithSerialize) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(readInstance);

        // 关闭IO流


//        Class<Singleton1> classObject = Singleton1.class;
//        Constructor<Singleton1> constructor = classObject.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        // 单例模式获取
//        Singleton1 instance = Singleton1.getInstance();
//        // 反射获取
//        Singleton1 reflectInstance = constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(reflectInstance);

//        Class<Singleton8> classObject = Singleton8.class;
//        Constructor<Singleton8> constructor = classObject.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        // 单例模式获取
//        Singleton8 instance = Singleton8.getInstance();
//        // 反射获取
//        Singleton8 reflectInstance = constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(reflectInstance);

        Class<Singleton8> classObject = Singleton8.class;
        Constructor<Singleton8> constructor = classObject.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);

        // 单例模式获取
        Singleton8 instance = Singleton8.getInstance();
        // 反射获取
        Singleton8 reflectInstance = constructor.newInstance("Sicimike", 18);
        System.out.println(instance);
        System.out.println(reflectInstance);
    }

}
