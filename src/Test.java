import java.util.Arrays;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail



class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();                 // Reading input from STDIN
        int N = s.nextInt();                 // Reading input from STDIN
        int K = s.nextInt();                 // Reading input from STDIN
        Integer[] a = new Integer[N];
        if(K<N && T<=10 && T>=1 ){
            
            for(int i=0;i<N;i++){
                a[i] = s.nextInt();
            }
        }
        Arrays.sort(a);
        for(int j=0;j<K;j++) {
        	if(a[N-1] %2==0) {
        		//countone(a[N-1]);
        	}
        }
        // Write your code here

    }
}
