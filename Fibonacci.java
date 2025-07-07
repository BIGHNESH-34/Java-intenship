import java.util.Scanner;

public class Fibonacci {

    // Iterative method
    public static void printFibonacciIterative(int count) {
        int a = 0, b = 1;
        System.out.print("Iterative Fibonacci: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Recursive method
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void printFibonacciRecursive(int count) {
        System.out.print("Recursive Fibonacci: ");
        // using the for loop statements
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println(); // for nextline
    }

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to generate: ");
        int count = scanner.nextInt();

        printFibonacciIterative(count);
        printFibonacciRecursive(count);

        scanner.close();
    }
}