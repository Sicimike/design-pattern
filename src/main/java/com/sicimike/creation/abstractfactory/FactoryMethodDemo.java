package com.sicimike.creation.abstractfactory;

/**
 * @author sicimike
 * @create 2020-02-20 21:54
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        ProgrammaFactory factory = new JavaProgrammaFactory();
        factory.getVideo();
        factory.getArticle();

        factory = new PythonProgrammaFactory();
        factory.getVideo();
        factory.getArticle();
    }

}
