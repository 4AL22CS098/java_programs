/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
public class truncate {
    public static String truncate1(String input, int length) {
        if (input.length() <= length) {
            return input;
        }
        return input.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a very long string";
        int length = 10;
        System.out.println(truncate1(input, length));
    }
}
