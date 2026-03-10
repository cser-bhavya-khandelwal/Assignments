package exception_handling;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApp {
	public static void execute() {
//		ArrayList<Integer> al = new ArrayList<Integer>();
		
//		try {
//			for(int i = 1; i <=5;i++) {
//				al.add(i);
//			}
//			for(int i=0;i <= al.size();i++) {
//				System.out.println(al.get(i));
//			}
//			
//			int [] arr = new int[5];
//			int data = 1;
//			for(int i = 0; i <arr.length;i++) {
//				arr[i] = data;
//				data++;
//			}
//			for(int i = 0; i <=arr.length; i++) {
//				System.out.println(arr[i]);
//			}
//			
//			String str = "java";
//			for(int i = 0;i <=str.length();i++) {
//				System.out.println(str.charAt(i));
//			}
//		}catch(Throwable throwable) {
////			System.out.println(throwable.toString());
////			System.out.println(throwable.getMessage());
//			throwable.printStackTrace();
//			System.out.println("Exception Handled");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("Enter your id: ");
//			int id = sc.nextInt();
//			System.out.println("Enter your Name: ");
//			String name = sc.nextLine();
//			System.out.println("ID: " + id);
//			System.out.println("Name: " + name);
//		}catch(Throwable throwable) {
//			throwable.printStackTrace();
//			System.out.println("Invalid Input");
//		}finally {
//			sc.close();
//			System.out.println("Resources closed");
//		}
		
		Student student = new Student(1, "raj", "raj@gmail.com", 987456321);
		try {
			DB.verifier(student);
		}catch(Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("Student object not found! please pass proper objectg!");
		}
		
	}
}
