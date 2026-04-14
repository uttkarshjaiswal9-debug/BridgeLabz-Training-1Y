package com.gla.GenericsCollection.CollegeSystem;

public class Student implements Comparable<Student> {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return name + " : " + marks;
    }

    @Override
    public int compareTo(Student s) {
        return s.marks - this.marks;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        return name.equals(((Student) o).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
