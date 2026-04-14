package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class Course<T extends CourseType> {

    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}
