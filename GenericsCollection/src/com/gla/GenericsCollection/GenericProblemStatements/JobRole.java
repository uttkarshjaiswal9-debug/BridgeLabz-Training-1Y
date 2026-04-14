package com.gla.GenericsCollection.GenericProblemStatements;

public abstract class JobRole {

    String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String toString() {
        return roleName;
    }
}
