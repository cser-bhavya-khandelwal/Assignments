package exception_handling_practice;

import java.util.*;

class Student {

    private int studentId;
    private String studentName;
    private List<Project> projects = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    public void displayStudent() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);

        for(Project p : projects) {
            p.displayProject();
        }
    }
}