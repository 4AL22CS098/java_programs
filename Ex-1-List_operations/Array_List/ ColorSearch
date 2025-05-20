/*1b.Array List programs*/

/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("Red");
        x.add("Blue");
        x.add("Green");
        x.add("Yellow");

        System.out.println("Colors: " + x);
        if (x.contains("Red")) {
            System.out.println("Color 'Red' is available.");
        } else {
            System.out.println("Color 'Red' is not available.");
        }
    }
}

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


/*5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthElement {
    public static void main(String[] args) {
      // TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
//		int n=3;
		String Str="green";
		System.out.println(ls);
		System.out.println("Removing the nth Element:"+ls.remove(Str));
		System.out.println(ls);
	}
}
