/**
 * 
 */
package Feb_19.task2;

/**
 * 
 */
public class Main {
	/**
	 * @param args
	 */
	public static void checkXylemPhloem(int num) {
		int extremeSum = 0;
		int meanSum = 0;
		int temp = num;
		int lastDigit = temp % 10;
		temp /= 10;
		int firstDigit = 0;
		while (temp > 9) {
			int digit = temp % 10;
			meanSum += digit;
			temp /= 10;
		}
		extremeSum = temp + lastDigit;
		if (extremeSum == meanSum) {
			System.out.println(num + " is a Xylem Number.");
		} else {
			System.out.println(num + " is a Phloem Number.");
		}
	}
	public static void main(String[] args) {
		checkXylemPhloem(12321);
		checkXylemPhloem(1111);
		checkXylemPhloem(1210);
	}

}
