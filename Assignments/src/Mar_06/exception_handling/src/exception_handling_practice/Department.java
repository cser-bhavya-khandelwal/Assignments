package exception_handling_practice;

import java.util.*;

class Department {

    private int deptId;
    private String deptName;
    private List<Student> students = new ArrayList<>();

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayDepartment() {

        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);

        for(Student s : students) {
            s.displayStudent();
        }
    }
}