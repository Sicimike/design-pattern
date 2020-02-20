package com.sicimike.creation.abstractfactory;

/**
 * @author sicimike
 * @create 2020-02-20 21:47
 */
public class JavaProgrammaFactory implements ProgrammaFactory {

    @Override
    public Video getVideo() {
        System.out.println("获取Java视频教程");
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        System.out.println("获取Java文章教程");
        return new JavaArticle();
    }
}
