package com.gla.GenericsCollection.ExamSystem;

import java.util.*;

public class ExamManager {

    List<Question> questions = new ArrayList<>();
    Set<String> studentIds = new HashSet<>();
    Queue<Student> queue = new LinkedList<>();
    Stack<Question> history = new Stack<>();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public void enrollStudent(Student s) {
        if (studentIds.add(s.getId())) {
            queue.add(s);
        }
    }

    public void serveStudents() {
        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.remove());
        }
    }

    public void navigateQuestions() {
        for (Question q : questions) {
            System.out.println("Next: " + q);
            history.push(q);
        }

        while (!history.isEmpty()) {
            System.out.println("Back: " + history.pop());
        }
    }
}
