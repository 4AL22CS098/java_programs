/*2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> y = new ArrayList<>();
        y.add("Red");
        y.add("Blue");
        y.add("Green");
        y.add("Yellow");

        System.out.println("Original Colors: " + y);

        // Remove 2nd element (index 1)
        if (y.size() > 1) {
            y.remove(1);
        }

        // Remove color "Blue" (if present)
        y.remove("Blue");

        System.out.println("Colors after removal: " + y);
    }
}
