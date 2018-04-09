import java.util.Arrays;

public class Unique {

    /*
      Boolean method to determine if array elements are unique
     */
    private static boolean isUnique(String[] s){

        // String variables
        String initialString = s[0];
        String currentString;
        boolean isUnique = true;

        // Loop to iterate array to print array elements
        for(int i = 0; i < s.length -1; i++){

            // Sets currentString String variable
            currentString = s[i];

            // Sets nextString String variable
            //nextString = Arrays.asList(s).get(i+1);

            System.out.println(i + " " + currentString+" "+initialString+" "+isUnique);

            // If statement to determine if currentString equals nextString
            if(!initialString.equals(currentString)){
                isUnique = false;
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