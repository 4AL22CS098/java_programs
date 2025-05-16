/* 2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith() */
 // Answer
public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String y = "Pallavi";
        String y2 = new String("Coder");
        System.out.println("String y: " + y);
        System.out.println("String y2: " + y2);

        // 2. Length and Character Access
        System.out.println("Length of y: " + y.length());
        System.out.println("Character at index 1 in y: " + y.charAt(1));

        // 3. String Comparison
        String y3 = "Pallavi";
        System.out.println("y equals y3? " + y.equals(y3));
        System.out.println("y equalsIgnoreCase 'pallavi'? " + y.equalsIgnoreCase("pallavi"));
        System.out.println("y compareTo y2: " + y.compareTo(y2));

        // 4. String Searching
        String y4 = "Pallavi is learning Java!";
        System.out.println("Index of 'learning' in y4: " + y4.indexOf("learning"));
        System.out.println("Does y4 contain 'Pallavi'? " + y4.contains("Pallavi"));

        // 5. Substring Operations
        System.out.println("Substring from index 9 in y4: " + y4.substring(9));
        System.out.println("Substring from index 0 to 7 in y4: " + y4.substring(0, 7));

        // 6. String Modification
        String yModified = y4.replace("Java", "Python");
        System.out.println("After replace: " + yModified);
        System.out.println("Uppercase: " + y4.toUpperCase());
        System.out.println("Lowercase: " + y4.toLowerCase());

        // 7. Whitespace Handling
        String yWithSpaces = "   Pallavi Rocks   ";
        System.out.println("Original: '" + yWithSpaces + "'");
        System.out.println("Trimmed: '" + yWithSpaces.trim() + "'");

        // 8. String Concatenation
        String yConcat = y + " " + y2;
        System.out.println("Concatenated String: " + yConcat);
        System.out.println("Using concat(): " + y.concat(" ").concat(y2));

        // 9. String Splitting
        String ySentence = "Pallavi is a great programmer";
        String[] yWords = ySentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : yWords) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder yBuilder = new StringBuilder("Pallavi");
        yBuilder.append(" Rocks");
        yBuilder.insert(7, " Really");
        yBuilder.replace(0, 7, "She");
        yBuilder.delete(3, 4);
        System.out.println("StringBuilder result: " + yBuilder.toString());

        // 11. String Formatting
        String yName = "Pallavi";
        int yAge = 22;
        String yFormatted = String.format("Name: %s, Age: %d", yName, yAge);
        System.out.println("Formatted String: " + yFormatted);

        // 12. Validate Email
        String yEmail = "pallavi@example.com";
        boolean yValid = yEmail.contains("@") && yEmail.startsWith("pallavi") && yEmail.endsWith(".com");
        System.out.println("Email: " + yEmail);
        System.out.println("Is valid email? " + yValid);
    }
}
