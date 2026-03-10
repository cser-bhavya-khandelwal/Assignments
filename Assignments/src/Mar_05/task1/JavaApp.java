package Mar_05.task1;

import java.util.ArrayList;
import java.util.Scanner;

class JavaApp {

    public static void execution() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mail ID: ");
            String mail = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = sc.nextLine();

            Student s = new Student(id, name, mail, contact);
            students.add(s);
        }

        boolean programRunning = true;

        while (programRunning) {
        	
        	if (students.size() == 0) {
                System.out.println("No students available. Program exiting.");
                break;
            }

            System.out.print("\nEnter Student ID: ");
            int searchId = sc.nextInt();

            Student foundStudent = null;

            for (Student s : students) {
                if (s.getId() == searchId) {
                    foundStudent = s;
                    break;
                }
            }

            if (foundStudent == null) {
                System.out.println("Student not found.");
                continue;
            }

            boolean sameStudent = true;

            while (sameStudent) {

                System.out.println("\nChoose Operation");
                System.out.println("1. View Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("\nStudent Details:");
                        System.out.println("ID: " + foundStudent.getId());
                        System.out.println("Name: " + foundStudent.getName());
                        System.out.println("Mail ID: " + foundStudent.getMailId());
                        System.out.println("Contact: " + foundStudent.getContactNumber());
                        break;

                    case 2:
                        System.out.print("Enter new Mail ID: ");
                        String newMail = sc.nextLine();

                        System.out.print("Enter new Contact Number: ");
                        String newContact = sc.nextLine();

                        foundStudent.setMailId(newMail);
                        foundStudent.setContactNumber(newContact);

                        System.out.println("Student updated successfully.");
                        break;

                    case 3:
                        students.remove(foundStudent);
                        System.out.println("Student deleted successfully.");
                        sameStudent = false;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

                if (sameStudent) {
                    System.out.println("\nNext Option");
                    System.out.println("1. Continue with same student");
                    System.out.println("2. Enter another student ID");
                    System.out.println("3. Exit");

                    int next = sc.nextInt();

                    if (next == 1) {
                        continue;
                    } else if (next == 2) {
                        sameStudent = false;
                    } else if (next == 3) {
                        sameStudent = false;
                        programRunning = false;
                    }
                }
            }
        }

        System.out.println("Program Ended.");
    }
}