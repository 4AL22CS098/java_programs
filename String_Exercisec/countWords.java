
/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
public class countWords {
    public static int countWords1(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Count the number of words in this sentence";
        System.out.println("Count the number of words in this sentence"+countWords1(input)); // Output: 8
    }
}
