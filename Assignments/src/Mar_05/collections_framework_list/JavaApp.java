package Mar_05.collections_framework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaApp {

    public static void execution() {

        System.out.println("========== INTEGER ARRAYLIST EXAMPLE ==========\n");

        ArrayList<Integer> al1 = new ArrayList<>();

        al1.add(1);
        al1.add(-2);
        al1.add(3);
        al1.add(-4);
        al1.add(5);
        al1.add(-6);
        al1.add(2, 34);
        al1.addFirst(111);
        al1.addLast(999);
        al1.set(1, 000);
        al1.remove(3);

        System.out.println("List al1 : " + al1);

        // -------- Forward Traversal (Enhanced For Loop) --------
        System.out.println("\n----- Forward Traversal (For-each) -----");
        for (int a : al1) {
            System.out.println("Value : " + a);
        }

        // -------- Forward Traversal (Iterator) --------
        System.out.println("\n----- Forward Traversal (Iterator) -----");
        Iterator<Integer> iterator = al1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Value : " + iterator.next());
        }

        // -------- Backward Traversal (ListIterator) --------
        System.out.println("\n----- Backward Traversal (ListIterator) -----");

        ListIterator<Integer> listIterator = al1.listIterator(al1.size());

        while (listIterator.hasPrevious()) {
            System.out.println("Value : " + listIterator.previous());
        }


        System.out.println("\n========== HETEROGENEOUS ARRAYLIST EXAMPLE ==========\n");

        ArrayList al = new ArrayList();

        al.add(null);
        al.add(null);
        al.add(null);

        al.add(10);
        al.add(10);
        al.add(10);

        al.add(true);
        al.add('j');
        al.add(12.34);
        al.add("java");

        al.add(new Product(1, "Apsara", "Pencil", 29.99));

        int index = 0;
        for (Object obj : al) {
            System.out.println("Index " + index + " -> " + obj);
            index++;
        }
    }
}