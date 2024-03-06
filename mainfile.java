import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int testcases = sc.nextInt();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    while(testcases-- > 0) {
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        
	        sb.append(max + "\n");
	    }
	    
	    System.out.println(sb);
	}

	// find max in array int:
	static int maxInArray(int[] arr) {
	    int max = arr[0];
	    for(int element : arr) max = Math.max(max, element);
	    return max;
	}
}
