package part2_recursionandarrays;

import java.util.Scanner;

public class Part2RecursionArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get array length
        System.out.print("Enter the size of the array: ");
        int length = in.nextInt();
        in.nextLine();
        if (length <= 0) {
            System.out.println("Invalid array size.");
            return;
        }
        int[] array = inputArray(length, in);
        // For array output
        int i = 0;
        printArray(array, i);
        // Sum finding
        int sum = arraySum(array, i);
        System.out.println();
        System.out.println(sum);
        // Searching for how many elements
        System.out.println("Enter the element to be searched: ");
        int what = in.nextInt();
        in.nextLine();
        int a = findCountInArray(array, what, i);
        System.out.print("How many elements are matching the search: " + a);
    }
    // Get array elements
    public static int[] inputArray(int length, Scanner in) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + i + ":");
            array[i] = in.nextInt();
        }
        return array;
    }
    // Part 2.1 Print array recursion
    public static void printArray(int[] array, int i) {
        if (i == array.length)
            return;
        System.out.print(array[i] + " ");
        printArray(array, i + 1);
    }
    // Part 2.2 Find sum of elements
    public static int arraySum(int[] array, int i) {
        if (i == array.length) return 0;
        int sum = array[i] + arraySum(array, i + 1);
        return sum;
    }
    // Part 2.3 How many elements in array
    public static int findCountInArray(int[] array, int what, int i) {
        if (i == array.length) return 0;
        int a = 0;
        if (array[i] == what) {
            a = a + 1;
        }
        return a + findCountInArray(array, what, i + 1);
    }
}