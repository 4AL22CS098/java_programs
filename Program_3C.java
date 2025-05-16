//3c. String Exercise progams
/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords() */
public class StringExercises {
    public static String capitalizeWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String input = "java programming language";
       System.out.println("before captalization " +input);
        System.out.println(capitalizeWords(input));
    }
}


/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
public class StringExercises {
    public static String truncate(String input, int length) {
        if (input.length() <= length) {
            return input;
        }
        return input.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a very long string";
        int length = 10;
        System.out.println(truncate(input, length));
    }
}


/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
public class StringExercises {
    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }

    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "12a34";
        System.out.println("is input1 numeric "+isNumeric(input1)); // true
        System.out.println("is input2 numeric "+isNumeric(input2)); // false
    }
}


/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
import java.util.Random;

public class StringExercises {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int length = 8;
        System.out.println("random generated string of lenth 8 "+generateRandomString(length));
    }
}


/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
public class StringExercises {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Count the number of words in this sentence";
        System.out.println("Count the number of words in this sentence"+countWords(input)); // Output: 8
    }
}
