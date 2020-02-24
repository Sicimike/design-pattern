package com.sicimike.creation.prototype;

import java.util.Date;

/**
 * @author sicimike
 * @create 2020-02-24 20:35
 */
public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
//        ComplexObject complexObject = new ComplexObject();
//        for (int i = 0; i < 10; i++) {
//            ComplexObject tempObject = (ComplexObject) complexObject.clone();
//            tempObject.setName("Sicimike-" + i);
//            tempObject.setBirthday(new Date(i * 10000));
//            System.out.println(tempObject);
//        }

        ComplexObject complexObject1 = new ComplexObject();
        complexObject1.setName("Sicimike-1");
        complexObject1.setBirthday(new Date(0));

        ComplexObject complexObject2 = (ComplexObject) complexObject1.clone();
        System.out.println(complexObject1);
        System.out.println(complexObject2);

        complexObject2.setName("Sicimike-2");
        complexObject2.getBirthday().setTime(9999);
        System.out.println(complexObject1);
        System.out.println(complexObject2);
    }
}
