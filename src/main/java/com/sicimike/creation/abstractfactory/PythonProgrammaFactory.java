package com.sicimike.creation.abstractfactory;

/**
 * @author sicimike
 * @create 2020-02-20 21:49
 */
public class PythonProgrammaFactory implements ProgrammaFactory {

    @Override
    public Video getVideo() {
        System.out.println("获取Python视频教程");
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        System.out.println("获取Python文章教程");
        return new PythonArticle();
    }
}
