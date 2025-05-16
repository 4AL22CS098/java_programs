//3b. String Exercise progams
/* Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
import java.util.Scanner;

public class NullOrEmptyCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str == null || str.trim().isEmpty()) {
            System.out.println("The string is null or empty (only whitespace).");
        } else {
            System.out.println("The string is not null and not empty.");
        }

        sc.close();
    }
}


/* Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
import java.util.Scanner;

public class SubstringCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = sc.nextLine();

        int c = 0;
        int i = 0;

        if (str != null && sub != null && !sub.isEmpty()) {
            while ((i = str.indexOf(sub, i)) != -1) {
                c++;
                i += sub.length();
            }
        }

        System.out.println("The substring appears " + c + " times.");

        sc.close();
    }
}


/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = reverseString(str);
        System.out.println("Reversed string: " + rev);

        sc.close();
    }

    static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}

/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        boolean isPal = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }

        if (isPal) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
import java.util.Scanner;

public class RemoveWhitespace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String res = str.replaceAll("\\s", "");
        System.out.println("String after removing whitespace: " + res);

        sc.close();
    }
}




