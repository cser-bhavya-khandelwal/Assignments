package Feb_24.abstraction;

public class JavaApp {

    public static void execution() {

        System.out.println("---- State Example ----");
        
        
        Rajasthan r = new Rajasthan();
        Karnataka k = new Karnataka();

        r.regionalLanguage();
        k.regionalLanguage();

        
        System.out.println("\n---- Programming Language Example ----");

        JavaScript js = new JavaScript();
        js.feature();
        js.frontEndLayer();
        js.backEndLayer();

       
        System.out.println("\n---- Multiple Inheritance Example ----");

        C obj = new C();
        obj.a();
        obj.i1();
        obj.i2();
    }
}