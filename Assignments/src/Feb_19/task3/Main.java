package Feb_19.task3;

public class Main {
	/**
	 * @param args
	 */
	public static void isDisariumNumber(int num) {
		int sum = 0;
		int count = 0;
		int temp = num;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		temp = num;
		while(temp!=0) {
			int dig = temp%10;
			sum+= (int) Math.pow(dig, count);
			temp/=10;
			count--;
		}
		if(sum == num) {
			System.out.println(num + " is Disarium Number.");
		}else {
			System.out.println(num + " is not a Disarium Number.");
		}
	}
	public static void main(String[] args) {
		Main.isDisariumNumber(135);
	}
}
