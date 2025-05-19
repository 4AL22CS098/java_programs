/*4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("Red");
        x.add("Blue");
        x.add("Green");
        x.add("Yellow");

        System.out.println("All Colors: " + x);

        List<String> subList = x.subList(0, 2);  // index 0 and 1
        System.out.println("Extracted Colors (1st and 2nd): " + subList);
    }
}

