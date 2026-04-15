package com.grading;

import java.util.Scanner;

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

    /**
     * Display the menu of options available to the teacher after login
     */
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Current Grade Average: %f (%s)\n\n", 0.0, "F");

        System.out.println("1. View Grades by Student");
        System.out.println("2. View Grades by Assignment Type");
        System.out.println("3. Logout");

        int option = 0;

        do {
            System.out.print("Enter an Option: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Grades Breakdown by Student (not implemented yet)");
                    option = 0;
                    break;
                case 2:
                    System.out.println("Grades Breakdown by Assignment Type (not implemented yet)");
                    option = 0;
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("[ERROR] Invalid Option. Try Again.");
                    option = 0;
                    break;
            }
        } while (option == 0);
    }
}
