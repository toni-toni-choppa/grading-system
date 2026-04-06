package com.grading;

/**
 * Teacher class represents a teacher in the grading system. It contains the teacher's username and full name, along with getter methods for these attributes.
 */
public class Teacher {
    private String username;
    private String name;

    /**
     * Constructor for Teacher class
     * @param username username for new teacher
     * @param name full name of the teacher
     */
    public Teacher(String username, String name) {
        this.username = username;
        this.name = name;
    }

    /**
     * Get the name of the teacher
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the username of the teacher
     * @return username of the teacher
     */
    public String getUsername() {
        return this.username;
    }
}
