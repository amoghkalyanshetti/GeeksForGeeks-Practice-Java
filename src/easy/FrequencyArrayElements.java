package easy;/*
*Question :
* https://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0
 */
import java.util.Scanner;

public class FrequencyArrayElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }

            for(int k=1;k<=n;k++)
            {
                System.out.print(findFrequency(k,arr)+" ");
            }
            System.out.println();
        }
    }

    private static int findFrequency(int k,int[] arr)
    {
        int count=0;
        for (int anArr : arr)
        {
            if (anArr == k)
            {
                count++;
            }
        }
        return count;
    }
}