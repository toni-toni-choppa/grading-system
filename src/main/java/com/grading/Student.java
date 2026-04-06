package com.grading;

/**
 * Student class represents a student in the grading system. It contains the student's username and full name, along with getter methods for these attributes.
 */
public class Student {
    private String username;
    private String name;

    /**
     * Constructor for Student class
     * @param username username for new student
     * @param name full name of the student
     */
    public Student(String username, String name) {
        this.username = username;
        this.name = name;
    }

    /**
     * Get the name of the student
     * @return name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the username of the student
     * @return username of the student
     */
    public String getUsername() {
        return this.username;
    }
}
