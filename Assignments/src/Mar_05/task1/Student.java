package Mar_05.task1;
public class Student {

    private int id;
    private String name;
    private String mailId;
    private String contactNumber;

    // 0 parameter constructor
    public Student() {
    }

    // parameterized constructor
    public Student(int id, String name, String mailId, String contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}