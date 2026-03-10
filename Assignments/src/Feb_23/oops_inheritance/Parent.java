package Feb_23.oops_inheritance;

public class Parent {

    // Static Variable
    public static char sv = 'P';

    // Static Method
    public static void sm() {
        System.out.println("Static sm() of Parent Class");
    }

    // Non-Static Variable
    public String nsv = "Parent";

    // Non-Static Method
    public void nsm() {
        System.out.println("Non-Static nsm() of Parent Class");
    }
}