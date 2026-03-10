/**
 * 
 */
package Feb_23.task2;

/**
 * 
 */
public class NumberVerifierSystem {
	public static void verifyNum(int num) {
		if(num==0) {
			System.out.println("Number is 0");
			return;
		}else if(num<0) {
			if(num%2==0) {
				System.out.println("Number is Negative Even");
			}else {
				System.out.println("Number is Negative Odd");
			}
		}else {
			if(num%2==0) {
				System.out.println("Number is Positive Even");
			}else {
				System.out.println("Number is Positive Odd");
			}
		}
	}
}
