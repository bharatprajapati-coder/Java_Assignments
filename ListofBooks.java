/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ListofBooks
{	public static void main (String[] args) throws java.lang.Exception
	{
		// Scanner sc  = new Scanner(System.in);
		// int n = sc.nextInt();
		// int[] arr = new int[n];
		// for(int i =0;i<arr.length;i++)
		// {
        //         arr[i] = sc.nextInt();
		// }
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     arrayList.add(arr[i]);
        // }
		//     int totalentry = sc.nextInt();
		//     int borrowed = sc.nextInt();
		//     int borrowedtwo = sc.nextInt();
        //     if(borrowed == 0)
        //     {
        //         arrayList.remove(borrowed);
        //     }
        //     else{
		//         System.out.println(arr[borrowed-1]);            
        //         arrayList.remove(borrowed-1);
        //         System.out.println(arr[borrowedtwo]);
        //     }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }

        int k = sc.nextInt();
        System.out.println(k);

        for (int i = 0; i < k; i++) {
            int h = sc.nextInt();
            System.out.println(l.get(h - 1));
            l.remove(h - 1);
        }
	}
}
