package com.sicimike.creation.factorymethod;

/**
 * @author sicimike
 * @create 2020-02-19 22:08
 */
public class JavaProgrammeFactory implements ProgrammeFactory {

    @Override
    public Video getVideo() {
        System.out.println("获取Java视频教程");
        return new JavaVideo();
    }

}
