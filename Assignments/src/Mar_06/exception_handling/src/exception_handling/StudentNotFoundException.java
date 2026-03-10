package exception_handling;

public class StudentNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Student Object Does'nt Exist";
	}
}
