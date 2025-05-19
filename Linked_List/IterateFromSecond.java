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


