package Feb_23.oops_inheritance;

public sealed class Employee permits SoftwareDeveloper, SoftwareTester {

    int id;
    String name;
    String mailId;
    long contactNumber;

    static String city;
    static String state;
    static String country;

    // Static setter for location details
    public static void setLocation(String cityName, String stateName, String countryName) {
        city = cityName;
        state = stateName;
        country = countryName;
    }

    public void entry() {
        System.out.println("Employee has entered the application.");
    }

    public void login() {
        System.out.println("Employee has logged in successfully.");
    }

    public void meeting() {
        System.out.println("Employee has joined the meeting.");
    }

    public void logout() {
        System.out.println("Employee has logged out successfully.");
    }

    public void exit() {
        System.out.println("Employee has exited the application.");
    }
}