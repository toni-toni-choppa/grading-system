package com.grading;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> students;
    
    public Course(String courseName, Teacher teacher, ArrayList<Student> students) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = students;
    }
    
    public String getCourseName() {
        return this.courseName;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public double getCourseAverage() {
        if (this.students.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Student s : this.students) {
            total += s.getCurrentGrade();
        }

        return total / this.students.size();
    }

    public String getCourseLetterGrade() {
        double avg = this.getCourseAverage();
        if (avg >= 90.0) {
            return "A";
        } else if (avg >= 80.0) {
            return "B";
        } else if (avg >= 70.0) {
            return "C";
        } else if (avg >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }

}
