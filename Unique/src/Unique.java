public class Unique {

    /*
       Private boolean method with String[] argument to determine if array elements are unique
     */
    private static boolean isUnique(String[] s){

            // Define initialString to set initial array element
            String initialString = s[0];

            // Define currentString for comparing elements to initialString
            String currentString;

            // Boolean variable to set if array has unique values
            boolean isUnique = true;

            // Loop to iterate array to print array elements
        for (String value : s) {

            // Sets currentString String variable as the first element of array
            currentString = value;

            // If statement to determine if currentString does not equal nextString
            if (!initialString.equals(currentString)) {

                // Set isUnique to false
                isUnique = false;
            }

            // Debugging
            // System.out.println(i+" "+initialString+" "+currentString+" "+isUnique);
        }

            // Return isUnique boolean
            return isUnique;
    }

    // Private static String[] which returns sample array with unique values
    private static String[] sampleArray() {
        return new String[] {"hello", "world", "my", "name", "is", "jonas"};
    }

    // Private static String[] which returns sample same with same values
    private static String[] sampleSameArray(){
        return new String[] {"hello", "hello", "hello", "hello", "hello"};
    }


    /* Main method for output

     */
    public static void main(String[] args){

        //
        System.out.println("The 'sampleArray' array has all unique values: "+isUnique(sampleArray()));
        System.out.println("The 'sampleSameArray' has all unique values: "+isUnique(sampleSameArray()));

    }
}