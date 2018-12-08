/*
Question :
https://practice.geeksforgeeks.org/problems/key-pair/0
 */
package easy;
import java.util.Scanner;

public class KeyPair
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            boolean flag=false;
            for(int j=0;j<n-1;j++)
            {
                for(int m=j+1;m<n;m++)
                {
                    if(arr[j]+arr[m]==sum)
                    {
                        flag=true;
                        break;
                    }
                }
                if(flag)
                {
                    break;
                }
            }
            if(flag)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }

}
