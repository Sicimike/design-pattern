package com.sicimike.creation.prototype;

import java.util.Date;

/**
 * @author sicimike
 * @create 2020-02-24 20:30
 */
public class ComplexObject implements Cloneable {

    private String name;
    private Date birthday;

    public ComplexObject(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        ComplexObject complexObject = (ComplexObject) super.clone();
        // 设置深拷贝
        complexObject.birthday = (Date) complexObject.birthday.clone();
        return complexObject;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
