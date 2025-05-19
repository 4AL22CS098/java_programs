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

