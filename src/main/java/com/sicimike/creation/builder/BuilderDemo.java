package com.sicimike.creation.builder;

/**
 * @author sicimike
 * @create 2020-02-21 20:16
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式")
                .buildCourseUrl("https://www.sicimike.com/video/1234")
                .buildCourseTitle("建造者模式")
                .buildCourseSummary("用来创建复杂的对象")
                .build();

        System.out.println(course);
    }
}
