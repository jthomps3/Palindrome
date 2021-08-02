import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        /**
         * Check if a given string is a palindrome or not.
         * Palindrome: a word that reads the same backward
         * as forward.  eg madam or nurses run.
         */

         System.out.println("Enter a word or sentence: ");

         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
         
         String nospace = input.replaceAll("\\s", "");

         char[] array = nospace.toCharArray();
         StringBuilder sb = new StringBuilder(nospace.length());
         for (int i = nospace.length() - 1; i >= 0; i--)
            sb.append(array[i]);

        String reverse = sb.toString();

        if (nospace.equals(reverse))
            System.out.println(input + " is a palindrome\n");
        else
            System.out.println(input + " is not a palindrome\n");
         

        scanner.close();

    }
}
