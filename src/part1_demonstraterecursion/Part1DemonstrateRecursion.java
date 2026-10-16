package part1_demonstraterecursion;

import java.util.Scanner;

public class Part1DemonstrateRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 9 in this line:");
        int n = in.nextInt();
        in.nextLine();
        // Checking if n=9
        if  (n == 9) {
            // for 1.1
            printNumberBackward(n);
            System.out.println();
            // for 1.2
            n = 1;
            printNumber(n);
            System.out.println();
            // for 1.3
            stackOverflow();
        }
        else {
            System.out.println("Next time you have to enter 9.");
        }

    }
    // Part 1.1 Output backwards recursion
    public static void printNumberBackward(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNumberBackward(n - 1);
    }
    // Part 1.2 Output recursion
    public static void printNumber(int n) {
        if (n == 10)
            return;
        System.out.print(n + " ");
        printNumber(n + 1);
    }
    // Part 1.3 Stack Overflow Error
    public static void stackOverflow() {
        stackOverflow();
    }
}