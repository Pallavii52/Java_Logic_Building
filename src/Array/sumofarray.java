package Array;

import java.util.Scanner;

public class sumofarray {

    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter how many element you want to add in array:");
        int n=s1.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }

        System.out.println("Array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array elements is:"+sum);

    }
}
