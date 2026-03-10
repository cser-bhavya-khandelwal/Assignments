package Feb_18.Oops;

public class Members {

    public static int sv;

    public static void sm() {
        System.out.println("Static Method sm()");
    }


    static {
        System.out.println("Static Block Executed");
    }


    public String nsv = "Non Static Variable";

    
    public void nsm() {
        System.out.println("Non Static Method nsm()");
    }

    
    {
        System.out.println("Non Static Block Executed");
    }

    Members() {
        System.out.println("Members Constructor Executed");
    }
}