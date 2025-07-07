import java.util.*;

public class CalFactorials {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        // ask user for input

        System.out.println("Enter a non negative number: ");
        int number = sc.nextInt();
        // chech for valid input

        if (number < 0) {
            System.out.println("The Number is valid number not a input negative number :");
        } else {
            long factorial = 1;
            // Factorial Calculate

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            // Output a result

            System.out.println("Factorial of " + number + " is " + factorial);
        }
        sc.close();
    }
}