package com.sicimike.creation.factorymethod;

/**
 * @author sicimike
 * @create 2020-02-19 22:10
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        ProgrammeFactory factory = new JavaProgrammeFactory();
        factory.getVideo();
        factory = new PythonProgrammeFactory();
        factory.getVideo();
    }
}
