/*
Question:
https://practice.geeksforgeeks.org/problems/maximum-number-of-zeroes/0
 */
package easy;
import java.util.Scanner;

public class MaximumZeroes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n =sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int maxZeros=0;
            int maxZeroNo=0;
            int currentZeroes;
            for(int j=0;j<n;j++)
            {
                currentZeroes=findZeroFrequency(arr[j]);
                if(j==0)
                {
                    maxZeros=currentZeroes;
                    maxZeroNo=arr[j];
                }
                else
                {
                    if(currentZeroes>maxZeros || (currentZeroes==maxZeros && arr[j]>maxZeroNo))
                    {
                        maxZeros=currentZeroes;
                        maxZeroNo=arr[j];
                    }


                }
            }
            if(maxZeros==0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(maxZeroNo);
            }

        }
    }

    private static int findZeroFrequency(int element)
    {
        String s=Integer.toString(element);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count++;

            }
        }
        return count;
    }
}
