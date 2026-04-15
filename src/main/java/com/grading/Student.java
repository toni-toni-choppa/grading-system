package com.grading;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Student class represents a student in the grading system. It contains the student's username and full name, along with getter methods for these attributes.
 */
public class Student {
    private String username;
    private String name;

    private ArrayList<Double> testScores;
    private ArrayList<Double> quizScores;
    private ArrayList<Double> homeworkScores;


    /**
     * Constructor for Student class
     * @param username username for new student
     * @param name full name of the student
     */
    public Student(String username, String name) {
        this.username = username;
        this.name = name;

        this.testScores = new ArrayList<>();
        this.quizScores = new ArrayList<>();
        this.homeworkScores = new ArrayList<>();
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

    /**
     * 
     */
    public void addTestScore(double score) {
        this.testScores.add(score);
    }

    public void addQuizScore(double score) {
        this.quizScores.add(score);
    }

    public void addHomeworkScore(double score) {
        this.homeworkScores.add(score);
    }

    /**
     * 
     */
    public double getTestAverage() {
        if (this.testScores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double score : this.testScores) {
            sum += score;
        }

        return sum / this.testScores.size();
    }

    public double getQuizAverage() {
        if (this.quizScores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double score : this.quizScores) {
            sum += score;
        }

        return sum / this.quizScores.size();
    }

    public double getHomeworkAverage() {
        if (this.homeworkScores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double score : this.homeworkScores) {
            sum += score;
        }

        return sum / this.homeworkScores.size();
    }
    /**
     * Calculate the overall grade for the student based on the averages of the tests, quizzes, and homework
     * @return overall grade as a double
     */
    public double getCurrentGrade() {
        double testAvg = this.getTestAverage();
        double quizAvg = this.getQuizAverage();
        double hwAvg = this.getHomeworkAverage();

        // simple weighting: tests 50%, quizzes 30%, homework 20%
        return (testAvg * 0.5) + (quizAvg * 0.3) + (hwAvg * 0.2);
    }

    public char getCurrentGradeLetter() {
        double grade = this.getCurrentGrade();

        if (grade >= 90.0) {
            return 'A';
        } else if (grade >= 80.0) {
            return 'B';
        } else if (grade >= 70.0) {
            return 'C';
        } else if (grade >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * Display the menu of options available to the student after login
     */
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Current Grade: %f (%s)\n\n", this.getCurrentGrade(), this.getCurrentGradeLetter());

        System.out.println("1. View Grades Breakdown");
        System.out.println("2. Logout");

        int option = 0;

        do {
            System.out.print("Enter an Option: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Grades Breakdown (not implemented yet)");
                    System.out.printf("Test: %f\n"
                    + "Quizes: %f\n"
                    + "Homework: %f\n"
                    , this.getTestAverage(), this.getQuizAverage(), this.getHomeworkAverage());

                    option = 0;
                    break;
                case 2:
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
