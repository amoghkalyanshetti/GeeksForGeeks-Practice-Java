/*
Question:
https://practice.geeksforgeeks.org/problems/count-the-elements/0
 */
package easy;
import java.util.Scanner;
public class CountTheElements
{
    public static void main (String[] args)
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
            int arr1[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr1[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                if(j<n-1)
                    System.out.print(findLessThanEqualCount(arr[j],arr1)+",");
                else
                    System.out.println(findLessThanEqualCount(arr[j],arr1));
            }

        }
    }
    private static int findLessThanEqualCount(int element,int arr1[])
    {
        int count=0;
        for (int anArr1 : arr1)
        {
            if (anArr1 <= element)
            {
                count++;
            }

        }
        return count;
    }
}
