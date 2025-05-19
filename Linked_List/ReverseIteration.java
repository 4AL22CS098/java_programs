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

