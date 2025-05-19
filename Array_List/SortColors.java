/*3. Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj) */
import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> z = new ArrayList<>();
        z.add("Red");
        z.add("Blue");
        z.add("Green");
        z.add("Yellow");

        System.out.println("Before Sorting: " + z);
        Collections.sort(z);
        System.out.println("After Sorting: " + z);
    }
}
