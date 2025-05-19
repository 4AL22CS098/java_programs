
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
