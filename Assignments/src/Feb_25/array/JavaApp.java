package Feb_25.array;


import java.util.Arrays;

/**
 * Demonstrates Array behavior
 *
 * Focus:
 * - Array creation
 * - == vs equals()
 * - Arrays.equals()
 * - Arrays.hashCode()
 * - Array traversal
 * - Array conversion
 */

public class JavaApp {

    public static void execution() {

        // =====================================================
        //                 ARRAY CREATION
        // =====================================================

        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};

        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));

        // == compares reference
        System.out.println("a1 == a2: " + (a1 == a2));

        // equals() from Object class → also compares reference
        System.out.println("a1.equals(a2): " + a1.equals(a2));

        System.out.println("--------------------------------");


        // =====================================================
        //           ARRAYS.equals() CONTENT COMPARISON
        // =====================================================

        System.out.println("Arrays.equals(a1,a2): " + Arrays.equals(a1, a2));

        System.out.println("--------------------------------");


        // =====================================================
        //               HASHCODE EXAMPLE
        // =====================================================

        System.out.println("a1.hashCode(): " + a1.hashCode());
        System.out.println("a2.hashCode(): " + a2.hashCode());

        System.out.println("Arrays.hashCode(a1): " + Arrays.hashCode(a1));
        System.out.println("Arrays.hashCode(a2): " + Arrays.hashCode(a2));

        System.out.println("--------------------------------");


        // =====================================================
        //                  ARRAY TRAVERSAL
        // =====================================================

        int[] arr = {10, 20, 30, 40};

        System.out.println("Using for loop:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Using enhanced for loop:");

        for (int value : arr) {
            System.out.println(value);
        }

        System.out.println("--------------------------------");


        // =====================================================
        //               DEFAULT VALUES
        // =====================================================

        int[] nums = new int[4];

        System.out.println("Default values:");

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("--------------------------------");


        // =====================================================
        //                ARRAY COPY
        // =====================================================

        int[] copy = Arrays.copyOf(arr, arr.length);

        System.out.println("Copied Array: " + Arrays.toString(copy));

        System.out.println("arr == copy: " + (arr == copy));
        System.out.println("Arrays.equals(arr,copy): " + Arrays.equals(arr, copy));

        System.out.println("--------------------------------");


        // =====================================================
        //               SORTING ARRAY
        // =====================================================

        int[] sortArr = {5, 1, 4, 2, 3};

        System.out.println("Before sort: " + Arrays.toString(sortArr));

        Arrays.sort(sortArr);

        System.out.println("After sort: " + Arrays.toString(sortArr));

        System.out.println("--------------------------------");


        // =====================================================
        //              STRING ARRAY EXAMPLE
        // =====================================================

        String[] names = {"Java", "Python", "C++"};

        for (String name : names) {
            System.out.println(name);
        }

    }
}