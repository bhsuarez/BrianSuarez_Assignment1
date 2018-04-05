import java.util.Scanner;

public class Primes {

    /*
        Static method to determine if a number is prime
     */
    private static boolean isReallyPrime(int x){

        // Boolean variable to mark number as prime
        boolean prime = true;

        // For loop to iterate the number of times in arg x
        for (int i = 2; i < x; i++){

            /* If the remainder of arg x divided by iterator equals zero,
                then the number is not prime. Sets boolean variable to false.
             */
            if(x % i == 0){
                prime = false;
            }
        }

        // The number is prime if you got here. Returns true.
        return prime;
    }

    /*
         Static driver method to test all numbers until it reaches nth prime number
     */
    private static int nthPrime(int n){

        // Define variables
        int primeNumber;
        int count = 0;

        /* For loop to iterate the number of times of user input
            if the primeNumber is less than argument n, then increment primeNumber
            if the number
         */
        for(primeNumber = 2; count < n; ++primeNumber){

            // If the current primeNumber returns true, then increment the counter
            if (isReallyPrime(primeNumber)){
                ++count;
            }
        }

        // The prime number is returned minus one due to for loop counter
        return primeNumber-1;
    }


    /*
        Main method to capture nth integer and print it using nthPrime() method
     */
    public static void main(String [ ] args) {

        // Define variables
        int x;

        // Scanner for nth prime number
        Scanner scan = new Scanner(System.in);
        System.out.println("This program displays the nth prime number.");
        System.out.print("Please enter n: ");
        x = scan.nextInt();

        // Print the nth prime number
        System.out.println("The "+x+"th prime number is: "+nthPrime(x));

    }

}
