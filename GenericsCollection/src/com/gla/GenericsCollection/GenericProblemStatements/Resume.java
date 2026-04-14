package com.gla.GenericsCollection.GenericProblemStatements;

import java.util.*;

public class Resume<T extends JobRole> {

    private List<T> resumes = new ArrayList<>();

    public void addResume(T role) {
        resumes.add(role);
    }

    public List<T> getResumes() {
        return resumes;
    }
}
