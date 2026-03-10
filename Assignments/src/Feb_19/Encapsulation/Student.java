package Feb_19.Encapsulation;

public class Student {

    
    private int id;
    private String name;
    private String mailId;
    private long contactNumber;


    private static String city;
    private static String state;
    private static String country;

    
    static {
        city = "Jaipur";
        state = "Rajasthan";
        country = "India";
    }

    
    public Student() {
    }


    public Student(int id, String name, String mailId, long contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Static Getters & Setters

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Student.city = city;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Student.state = state;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Student.country = country;
    }


    public void displayStudentDetails() {

        System.out.println("\n--- Student Details ---");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Mail ID: " + getMailId());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }
}