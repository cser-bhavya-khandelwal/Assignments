package Feb_26.string;


public class JavaApp {

    public static void execution() {

       
        String s1 = "Java";
        System.out.println("s1: " + s1);

        // new keyword → object created in heap memory
        String s2 = new String("java");
        System.out.println("s2: " + s2);

        // String overrides equals() → compares content (case-sensitive)
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // String overrides hashCode() → based on character content
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());

        System.out.println("--------------------------------");


       
        StringBuffer f1 = new StringBuffer("java");
        System.out.println("f1: " + f1);

        StringBuffer f2 = new StringBuffer("java");
        System.out.println("f2: " + f2);

        // StringBuffer DOES NOT override equals()
        // So it compares memory reference
        System.out.println("f1.equals(f2): " + f1.equals(f2));

        // Default hashCode() from Object class (based on reference)
        System.out.println("f1.hashCode(): " + f1.hashCode());
        System.out.println("f2.hashCode(): " + f2.hashCode());

        System.out.println("--------------------------------");


        
        StringBuilder b1 = new StringBuilder("java");
        System.out.println("b1: " + b1);

        StringBuilder b2 = new StringBuilder("java");
        System.out.println("b2: " + b2);

        // Does NOT override equals() → compares reference
        System.out.println("b1.equals(b2): " + b1.equals(b2));

        // Default Object hashCode()
        System.out.println("b1.hashCode(): " + b1.hashCode());
        System.out.println("b2.hashCode(): " + b2.hashCode());

        System.out.println("--------------------------------");


        
        String c1 = "Ja";
        System.out.println("c1: " + c1);

        String c2 = "va";
        System.out.println("c2: " + c2);

        
        String c3 = s1.concat(c2);
        System.out.println("c3: " + c3);

       
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c2 == c3: " + (c2 == c3));
        System.out.println("c3 == c1: " + (c3 == c1));

        
        System.out.println("c1.equals(c2): " + c1.equals(c2));

        System.out.println("--------------------------------");


        
        StringBuffer g1 = new StringBuffer("ja");
        System.out.println("g1: " + g1);

        // append() modifies the SAME object (mutable behavior)
        // It returns the same reference
        StringBuffer g2 = g1.append("va");

        // Now both g1 and g2 refer to "java"
        System.out.println("g2: " + g2);

        // Reference comparison → true
        System.out.println("g1 == g2: " + (g1 == g2));
        System.out.println("--------------------------------");

        
        String str = "java";
        System.out.println("str: " + str);

       
        String str2 = str.toUpperCase();
        System.out.println("str2 (toUpperCase): " + str2);

        // Original string remains unchanged
        System.out.println("str after toUpperCase(): " + str);

        System.out.println("--------------------------------");

        // Another String literal
        String str3 = "Core";
        System.out.println("str3: " + str3);

        // toLowerCase() also creates a NEW String object
        // It does NOT modify str3
        String str4 = str3.toLowerCase();
        System.out.println("str4 (toLowerCase): " + str4);

        // Original string remains unchanged
        System.out.println("str3 after toLowerCase(): " + str3);
        
        
        System.out.println("--------------------------------");
        
        String loop = "09AZaz";
        System.out.println(loop);
        for(int i = 0 ; i<loop.length() ; i++) {
        	System.out.println(loop.charAt(i) + " - " + loop.codePointAt(i));
        }
        
        System.out.println("--------------------------------");
        
        char[] arr = new char[4];
        arr[0] = 'j';
        arr[1] = 'a';
        arr[2] = 'v';
        arr[3] = 'a';
        
        for(char a : arr) {
        	System.out.println(a);
        }
        String string = new String(arr);
        System.out.println(string);
        
        char[] arr2 = string.toCharArray();
        for(char a : arr2) {
        	System.out.println(a);
        }
    }
}