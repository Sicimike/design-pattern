package com.sicimike.creation.builder;

/**
 * @author sicimike
 * @create 2020-02-21 20:07
 */
public class Course {

    private String courseName;
    private String courseUrl;
    private String courseTitle;
    private String courseSummary;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseUrl = courseBuilder.courseUrl;
        this.courseTitle = courseBuilder.courseTitle;
        this.courseSummary = courseBuilder.courseSummary;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseUrl='" + courseUrl + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseSummary='" + courseSummary + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String courseName;
        private String courseUrl;
        private String courseTitle;
        private String courseSummary;
        
        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseUrl(String courseUrl){
            this.courseUrl = courseUrl;
            return this;
        }

        public CourseBuilder buildCourseTitle(String courseTitle) {
            this.courseTitle = courseTitle;
            return this;
        }

        public CourseBuilder buildCourseSummary(String courseSummary) {
            this.courseSummary = courseSummary;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
