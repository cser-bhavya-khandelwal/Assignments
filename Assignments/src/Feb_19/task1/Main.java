package Feb_19.task1;

public class Main {

    static boolean isSpy(int num) {
        int sum = 0;
        int prod = 1;

        while (num != 0) {
            int dig = num % 10;
            sum += dig;
            prod *= dig;
            num /= 10;
        }

        return sum == prod;
    }

    static boolean isAutobiographical(int num) {

        String s = Integer.toString(num);
        int n = s.length();

        int[] count = new int[n];

        
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            if (digit < n) {
                count[digit]++;
            }
        }

    
        for (int i = 0; i < n; i++) {
            if ((s.charAt(i) - '0') != count[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean a = Main.isSpy(123);
        System.out.println("Is Spy: " + a);

        boolean b = Main.isAutobiographical(1210);
        System.out.println("Is Autobiographical: " + b);
    }
}