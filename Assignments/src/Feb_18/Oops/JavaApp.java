package Feb_18.Oops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JavaApp {

    public static void execution() throws IOException {

        System.out.println("\nJavaApp Execution Called");

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.println("Enter Student Id:");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter Student Name:");
        String name = br.readLine();

        System.out.println("Enter Student Mail Id:");
        String mailId = br.readLine();

        System.out.println("Enter Contact Number:");
        long contact = Long.parseLong(br.readLine());

        Student s = new Student(id, name, mailId, contact);

        s.displayStudentDetails();
    }
}