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

            sb.append("\n");
	    }
	    
	    System.out.println(sb);
	}

	static int[] arrayInput(int n, Scanner sc) {
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;
	}
}
