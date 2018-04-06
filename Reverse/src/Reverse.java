import java.util.Scanner;

public class Reverse {

    /* Main method

     */
    public static void main(String[] args){

        // Capture input from user
        System.out.print("Please enter some of text: ");

        // Create new Scanner
        Scanner scan = new Scanner(System.in);

        // Read first line and assign to String
        String string = scan.nextLine();

        // Instantiate StringBuilder for appending characters
        StringBuilder sb = new StringBuilder();

        /* For loop to iterate for string length
            iterator is the length of the string minus 1 (for index)
            decrement iterator until the length is 0
         */
        for (int i = string.length() - 1; i >= 0; i--){

            // Append char of string to 'reverse' at each iteration using .append
            sb.append(string.charAt(i));
        }

        // Print reverse string
        System.out.print("String in reverse: ");
        System.out.print(sb.toString());
    }
}