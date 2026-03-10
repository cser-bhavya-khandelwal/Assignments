package exception_handling_practice;

import java.util.*;

class JavaApp {

    Scanner sc = new Scanner(System.in);

    public void execute() {

        try {

            System.out.println("Enter University ID:");
            int uid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter University Name:");
            String uname = sc.nextLine();

            University u = new University(uid, uname);

            System.out.println("How many Colleges?");
            int c = sc.nextInt();
            sc.nextLine();

            for(int i=0;i<c;i++) {

                System.out.println("Enter College ID:");
                int cid = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter College Name:");
                String cname = sc.nextLine();

                College college = new College(cid,cname);
                u.addCollege(college);
            }

            u.displayUniversity();

        }
        catch(Throwable e) {

            System.out.println("Invalid Input Entered!");
            e.printStackTrace();
        }
    }
}
