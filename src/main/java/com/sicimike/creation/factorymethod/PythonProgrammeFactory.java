package com.sicimike.creation.factorymethod;

/**
 * @author sicimike
 * @create 2020-02-19 22:09
 */
public class PythonProgrammeFactory implements ProgrammeFactory {

    public Video getVideo() {
        System.out.println("获取Python视频教程");
        return new PythonVideo();
    }

}
