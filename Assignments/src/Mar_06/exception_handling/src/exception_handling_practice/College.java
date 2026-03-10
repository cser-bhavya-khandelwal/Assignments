package exception_handling_practice;

import java.util.*;

class College {

    private int collegeId;
    private String collegeName;
    private List<Department> departments = new ArrayList<>();

    public College(int collegeId, String collegeName) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void displayCollege() {

        System.out.println("College ID: " + collegeId);
        System.out.println("College Name: " + collegeName);

        for(Department d : departments) {
            d.displayDepartment();
        }
    }
}