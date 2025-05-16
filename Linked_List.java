/*1c. Linked List Programs*/

/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
import java.util.LinkedList;
import java.util.Iterator;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Iterating from 2nd element (index 1):");
        Iterator<String> iterator = list.listIterator(1); // Start at index 1
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

/*2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Iterating in reverse order:");
        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


/*3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Before inserting at end: " + list);
        list.offerLast("Pink");
        System.out.println("After inserting 'Pink' at end: " + list);
    }
}

/*4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
import java.util.LinkedList;

public class DisplayWithPositions {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}

/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Before swap: " + list);
        Collections.swap(list, 0, 2); // Swap first (0) and third (2)
        System.out.println("After swapping first and third: " + list);
    }
}
