import java.util.Arrays;

public class Unique {

    /*
      Boolean method to determine if array elements are unique
     */
    private static boolean isUnique(String[] s){

        // String variables
        String currentString;
        String nextString;
        int j = 0;

        // Loop to iterate array to print array elements
        for(int i = 0; i < s.length; i++){

            // Print the current array element
            currentString = Arrays.asList(s).get(i);
            System.out.println(i + " " + currentString);
        }
        return false;
    }

    // Returns sample unique array
    private static String[] sampleArray(){
        return new String[] {"hello", "world", "my", "name", "is", "jonas"};
    }

    // Returns sample same array
    private static String[] sampleSameArray(){
        return new String[] {"hello", "hello", "hello", "hello", "hello", "hello"};
    }

    /* Main method

     */
    public static void main(String[] args){

        // Prints true or false
        System.out.println(isUnique(sampleArray())+"\n");
        System.out.println(isUnique(sampleSameArray()));

    }

}