package Array;

import java.util.Scanner;

public class SecondLastElement {
    public static void main(String[] args) {



        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s1.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s1.nextInt();
        }

        System.out.println("Array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


        int MAX= Integer.MIN_VALUE;
        int Second_Max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > MAX)
            {
                Second_Max=MAX;
                MAX=arr[i];

            }
            else if (arr[i]<MAX && arr[i]>Second_Max){
                Second_Max =arr[i];
            }
        }


        System.out.println();
        System.out.println("The Second Last element is: "+Second_Max);
    }
}
