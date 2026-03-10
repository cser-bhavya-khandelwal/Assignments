package exception_handling_practice;

import java.util.*;

class University {

    private int universityId;
    private String universityName;
    private List<College> colleges = new ArrayList<>();

    public University(int universityId, String universityName) {
        this.universityId = universityId;
        this.universityName = universityName;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void addCollege(College c) {
        colleges.add(c);
    }

    public void displayUniversity() {

        System.out.println("University ID: " + universityId);
        System.out.println("University Name: " + universityName);

        for(College c : colleges) {
            c.displayCollege();
        }
    }
}
