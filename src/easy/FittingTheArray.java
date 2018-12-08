/*
Question:
https://practice.geeksforgeeks.org/problems/fitting-the-array/0
 */
package easy;

import java.util.*;
import java.lang.*;

class FittingTheArray
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }

            int[] b=new int[n];

            for(int j=0;j<n;j++)
            {
                b[j]=sc.nextInt();
            }
            a=sort(a);
            b=sort(b);
            String res="YES";
            for(int j=0;j<n;j++)
            {
                if(a[j]>b[j])
                {
                    res="NO";
                    break;
                }
            }
            System.out.println(res);

        }
    }

    private static int[] sort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
