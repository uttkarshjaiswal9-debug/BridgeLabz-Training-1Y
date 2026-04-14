package com.gla.GenericsCollection.ExamSystem;

public class Main {

    public static void main(String[] args) {

        ExamManager manager = new ExamManager();

        manager.addQuestion(new Question("Q1"));
        manager.addQuestion(new Question("Q2"));
        manager.addQuestion(new Question("Q3"));

        manager.shuffleQuestions();

        manager.enrollStudent(new Student("S1", "Aman"));
        manager.enrollStudent(new Student("S2", "Rahul"));
        manager.enrollStudent(new Student("S1", "Duplicate"));

        manager.serveStudents();

        manager.navigateQuestions();
    }
}
