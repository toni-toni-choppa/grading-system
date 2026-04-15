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
    public void showMenu(Course course) {
        Scanner in = new Scanner(System.in);

        int option = 0;

        do {
            System.out.printf("Current Grade Average: %f (%s)\n\n", 0.0, "F");

            System.out.println("1. View Grades by Student");
            System.out.println("2. View Grades by Assignment Type");
            System.out.println("3. Add Grade");
            System.out.println("4. Logout");
            System.out.println();

            System.out.print("Enter an Option: ");
            option = in.nextInt();
            in.nextLine(); // consume the leftover newline
            switch (option) {
                case 1:
                    System.out.println("Grades Breakdown by Student:");

                    for (Student s : course.getStudents()) {
                        System.out.printf("Student: %s - Current Grade: %f (%s)\n", s.getName(), s.getCurrentGrade(), s.getCurrentGradeLetter());
                    }

                    option = 0;
                    break;
                case 2:
                    System.out.println("Grades Breakdown by Assignment Type:");
                    double tests = 0.00;
                    double quizzes = 0.00;
                    double homework = 0.00;

                    for (Student s : course.getStudents()) {
                        tests = tests + s.getTestAverage();
                        quizzes = quizzes + s.getQuizAverage();
                        homework = homework + s.getHomeworkAverage();
                    }

                    System.out.printf("Test Avg: %f\nQuiz Avg: %f\nHomework Avg: %f\n", tests, quizzes, homework);

                    option = 0;
                    break;
                case 3:
                    System.out.println("Add Grade:");
                    System.out.println();

                    System.out.print("Enter the student's username to add a grade for: ");
                    String studentUsername = in.nextLine();

                    System.out.print("Enter the assignment type (test/quiz/homework): ");
                    String assignmentType = in.nextLine();

                    System.out.print("Enter the grade to add: ");
                    double grade = in.nextDouble();
                    in.nextLine(); // consume the leftover newline

                    for (Student s : course.getStudents()) {
                        if (s.getUsername().equals(studentUsername)) {
                            switch (assignmentType.toLowerCase()) {
                                case "test":
                                    s.addTestScore(grade);
                                    System.out.printf("Added grade %f to test grades for student %s\n", grade, s.getName());
                                    break;
                                case "quiz":
                                    s.addQuizScore(grade);
                                    System.out.printf("Added grade %f to quiz grades for student %s\n", grade, s.getName());
                                    break;
                                case "homework":
                                    s.addHomeworkScore(grade);
                                    System.out.printf("Added grade %f to homework grades for student %s\n", grade, s.getName());
                                    break;
                                default:
                                    System.out.println("[ERROR] Invalid assignment type entered.");
                                    break;
                            }
                        }
                    }


                    option = 0;
                    break;
                case 4:
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
