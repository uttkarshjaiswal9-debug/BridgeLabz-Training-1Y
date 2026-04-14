package com.gla.GenericsCollection.QueueInterface;

import java.util.*;

public class ReverseQueue {

    public static <T> Queue<T> reverse(Queue<T> q) {

        Stack<T> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        return q;
    }
}
