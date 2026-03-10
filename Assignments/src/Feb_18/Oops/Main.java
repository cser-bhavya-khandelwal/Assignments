package Feb_18.Oops;

public class Main {

    public static void main(String[] args) throws Exception {

        
        Student.setCity("Mumbai");
        Student.setState("Maharashtra");
        Student.setCountry("India");

        
        Student s1 = new Student(
                1,
                "Rohit",
                "rohit@gmail.com",
                9876543210L
        );


        Student s2 = new Student();

        s2.setId(2);
        s2.setName("Rani Sharma");
        s2.setMailId("rani@gmail.com");
        s2.setContactNumber(9876543211L);

        
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        System.out.println();

        
        JavaApp.execution();

        System.out.println();

        
        System.out.println("Static Variable: " + Members.sv);
        Members.sm();

        Members members = new Members();
        System.out.println("Non Static Variable: " + members.nsv);
        members.nsm();
    }
}