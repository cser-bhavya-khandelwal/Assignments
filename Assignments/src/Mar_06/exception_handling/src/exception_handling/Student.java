package exception_handling;

public class Student {
	int id;
	String name;
	String mailId;
	long contactNumber;
	/**
	 * @param id
	 * @param name
	 * @param mailId
	 * @param contactNumber
	 */
	public Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber + "]";
	}
	
	
}
