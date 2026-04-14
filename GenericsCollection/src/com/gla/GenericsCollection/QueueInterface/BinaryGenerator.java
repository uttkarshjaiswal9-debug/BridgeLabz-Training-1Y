package com.gla.GenericsCollection.QueueInterface;

import java.util.*;

public class BinaryGenerator {

    public static List<String> generate(int n) {

        Queue<String> q = new LinkedList<>();
        List<String> result = new ArrayList<>();

        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            result.add(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }

        return result;
    }
}
