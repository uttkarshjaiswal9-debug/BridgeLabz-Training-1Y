package com.gla.GenericsCollection.QueueInterface;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Reverse Queue
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println(ReverseQueue.reverse(q));

        // Binary
        System.out.println(BinaryGenerator.generate(5));

        // Hospital
        HospitalTriage.process();

        // Stack using Queue
        StackUsingQueue s = new StackUsingQueue();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());

        // Circular Buffer
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1); cb.add(2); cb.add(3); cb.add(4);
        cb.display();
    }
}
