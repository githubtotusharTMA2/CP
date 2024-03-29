import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {

    public static void main(String[] args) throws IOException {
        BufferedReader br = brObject();
        int testcases = inputInt(br);
        StringBuilder sb = new StringBuilder();

        while(testcases-- > 0) {
            int n = inputInt(br);
            int[] arr = inputArr(br);
            int ans = 0;
            // do some good thing here
            sb.append(ans + "\n");
        }

        print(sb);
    }

    // Input with Scanner
    public static void main (String[] args) throws Exception {
        StrinBuilder sb = new StringBuilder();
	    Scanner sc = new Scanner(System.in);
	    int testcases = sc.nextInt();
	    while(testcases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.next();
            int ans = 0;
            sb.append(ans + "\n");
        }

        print(sb);
	}

    /** 
     * HELPER VARIABLES
     */

    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    long maxL = Long.MAX_VALUE;
    long minL = Long.MIN_VALUE;
    int mod = 1e9 + 7;

    /**
     * HELPER FUNCTIONS
     */

    // Fast IO:
    BufferedReader brObject() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br;
    }

    // inputInt:
    int inputInt(BufferedReader br) {
        return Integer.parseInt(br.readLine());
    }

    // inputArr:
    int[] inputArr(BufferedReader br) {
        String[] arrString = br.readLine().split(" ");
        int len = arrString.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }

        return arr;
    }

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

    // print StringBuilder:
    static void print(StringBuilder sb) {
	    System.out.print(sb.toString());
	}

    // print StringBuffer:
    static void print(StringBuffer sb) {
	    System.out.print(sb.toString());
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

