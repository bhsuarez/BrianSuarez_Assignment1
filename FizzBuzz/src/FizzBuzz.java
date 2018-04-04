import java.util.stream.IntStream;

public class FizzBuzz {

    // Main method //
    public static void main(String [ ] args) {

        // Define array of integers 1 to 100 using IntStream //
        int[] oneToHundredArray = IntStream.rangeClosed(1,101).toArray();

        // For loop to iterate array
        for (int i = 1; i < oneToHundredArray.length; i++){

            // If the number is divisible by 3 and 5, print "FizzBuzz" and increment by 1
            if (i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
                i++;
            }

            // If the number is divisible by 3, print "Fizz"
            if (i % 3 ==0){
                System.out.println("Fizz");
            }

            // If the number is divisible by 5, print "Buzz"
            if (i % 5 ==0){
                System.out.println("Buzz");
            }

            // If the number is not divisible by 3 or 5, print the number
            if (i % 3 !=0 && i % 5 !=0) {
                System.out.println(i);
            }
        }
    }

}
