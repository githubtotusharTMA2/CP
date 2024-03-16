import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    
    public static void main(String[] args) {
        println("Hello World");
        int[] staticArray = new int[]{1,2,3,4,5};
        List<Integer> dynamicArray = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        println("staticArray =");
        printArray(staticArray);
        println("dynamicArray =");
        printArray(dynamicArray);
        println("maxInArray(staticArray) = " + maxInArray(staticArray));
        println("maxInArray(dynamicArray) = " + maxInArray(dynamicArray));
        println("minInArray(staticArray) = " + minInArray(staticArray));
        println("minInArray(dynamicArray) = " + minInArray(dynamicArray));
    }

    /* HELPER FUNCTIONS: */
    // find max in static array int:
    static int maxInArray(int[] arr) {
        int max = arr[0];
        for(int element : arr) max = Math.max(max, element);
        return max;
    }

    // find max in dynamic array int:
    static int maxInArray(List<Integer> arr) {
        return Collections.max(arr);
    }

    // find min in array int:
    static int minInArray(int[] arr) {
        int min = arr[0];
        for(int element : arr) min = Math.min(min, element);
        return min;
    }

    // find min in dynamic array int:
    static int minInArray(List<Integer> arr) {
        return Collections.min(arr);
    }

    // print:
    static void print(String str) {
        System.out.print(str);
    }

    // print with a space in the end:
    static void printWithSpace(int element) {
        System.out.print(element + " ");
    }

    // print and go to next line:
    static void println(String str) {
        System.out.println(str);
    }

    // print with an underscore "_":
    static void printWith_(String str) {
        System.out.println(str + "_");
    }

    // print static array:
    static void printArray(int[] arr) {
        for(int element : arr) printWithSpace(element);
        System.out.println();
    }

    // print dynamic array:
    static void printArray(List<Integer> arr) {
        for(int element : arr) printWithSpace(element);
        System.out.println();
    }

    // sum of array, return int type:
    static int sumArray(int[] arr) {
        int sum = 0;
        for(int element : arr) sum += element;
        return sum;
    }

    // sum of dynamic array, return type int:
    static int sumArray(List<Integer> arr) {
        int sum = 0;
        for(int element : arr) sum += element;
        return sum;
    }

    // sum of array, return long type:
    static long sumArrayLong(int[] arr) {
        long sum = 0;
        for(int element : arr) sum += element;
        return sum;
    }

    // sum of dynamic array, return type long:
    static long sumArrayLong(List<Integer> arr) {
        long sum = 0;
        for(int element : arr) sum += element;
        return sum;
    }
}
