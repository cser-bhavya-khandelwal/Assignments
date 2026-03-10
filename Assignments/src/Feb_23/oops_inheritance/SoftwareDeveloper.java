package Feb_23.oops_inheritance;

public final class SoftwareDeveloper extends Employee {

    String designation;
    double salary;
    String role;
    double incentive;

    static String department;
    static String branch;
    static String company;

    // Static setter for company details
    public static void setCompanyDetails(String comp, String dept, String br) {
        company = comp;
        department = dept;
        branch = br;
    }

    // Constructor for instance variables
    public SoftwareDeveloper(String designation, String role,
                             double salary, double incentive) {
        this.designation = designation;
        this.role = role;
        this.salary = salary;
        this.incentive = incentive;
    }

    public void task() {
        System.out.println("Software Development");
    }

    public void reverseKT() {
        System.out.println("Explanation about latest software development tools");
    }

    public void displaySoftwareDeveloperDetails() {

        System.out.println("----- Software Developer Details -----");
        System.out.println("Company      : " + company);
        System.out.println("Department   : " + department);
        System.out.println("Branch       : " + branch);
        System.out.println("Designation  : " + designation);
        System.out.println("Role         : " + role);
        System.out.println("Salary       : " + salary);
        System.out.println("Incentive    : " + incentive);
        System.out.println("City         : " + city);
        System.out.println("State        : " + state);
        System.out.println("Country      : " + country);
        System.out.println("---------------------------------------");
    }
}