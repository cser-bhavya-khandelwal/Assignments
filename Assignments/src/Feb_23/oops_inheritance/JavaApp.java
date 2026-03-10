package Feb_23.oops_inheritance;
public class JavaApp {

    public static void execution() {

        // Parent & Child demonstration
        System.out.println("Static Variable: " + Child.sv);
        Child.sm();

        Child obj = new Child();
        System.out.println("Non-Static Variable: " + obj.nsv);
        obj.nsm();

        // Soft coding static values
        Employee.setLocation("Jaipur", "Rajasthan", "India");
        SoftwareDeveloper.setCompanyDetails("Capgemini", 
                                             "Software Development", 
                                             "Jaipur");

        // Soft coding object values
        SoftwareDeveloper dev = new SoftwareDeveloper(
                "Senior Software Developer",
                "Backend Developer",
                850000,
                50000
        );

        dev.displaySoftwareDeveloperDetails();
    }
}