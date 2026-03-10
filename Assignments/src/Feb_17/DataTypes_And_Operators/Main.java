package Feb_17.DataTypes_And_Operators;

public class Main {

    public static void main(String[] args) {

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40000L;

        float f = 5.5f;
        double d = 10.25;

        char c = 'A';
        boolean flag = true;

        int sum = i + b;
        int diff = i - b;
        int prod = i * b;
        int div = i / b;
        int mod = i % b;

        boolean greater = i > b;
        boolean less = i < b;
        boolean equal = i == b;

        boolean andOp = flag && true;
        boolean orOp = flag || false;
        boolean notOp = !flag;

        int a = 10;
        a += 5;
        a -= 3;
        a *= 2;
        a /= 4;
        a %= 3;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + flag);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        System.out.println("Greater: " + greater);
        System.out.println("Less: " + less);
        System.out.println("Equal: " + equal);

        System.out.println("AND: " + andOp);
        System.out.println("OR: " + orOp);
        System.out.println("NOT: " + notOp);

        System.out.println("Final a: " + a);
    }
}