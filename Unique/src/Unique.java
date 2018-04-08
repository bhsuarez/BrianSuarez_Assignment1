import java.util.Arrays;

public class Unique {

    /*
      Boolean method to determine if array elements are unique
     */
    private static boolean isUnique(String[] s){

        // String variables
        String currentString;
        String nextString;
        boolean isUnique = false;
        int j = 0;

        // Loop to iterate array to print array elements
        for(int i = 1; i < s.length; i++){

            // Sets currentString String variable
            currentString = Arrays.asList(s).get(i);

            // Sets nextString String variable
            nextString = Arrays.asList(s).get(i-1);

            System.out.println(i + " " + currentString+" "+nextString+" "+isUnique);

            // If statement to determine if currentString equals nextString
            if(currentString.equals(nextString)){
                isUnique = true;
            }


        }
        return isUnique;
    }

    // Returns sample unique array
    private static String[] sampleArray(){
        return new String[] {"hello", "world", "my", "name", "is", "jonas"};
    }

    // Returns sample same array
    private static String[] sampleSameArray(){
        return new String[] {"hello", "hell", "hello", "hello", "hello", "hello"};
    }

    /* Main method

     */
    public static void main(String[] args){

        // Prints true or false
        System.out.println(isUnique(sampleArray())+"\n");
        System.out.println(isUnique(sampleSameArray()));

    }

}