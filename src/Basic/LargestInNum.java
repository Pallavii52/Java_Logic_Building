package Basic;

import java.util.Scanner;

public class LargestInNum {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int Max=0;
        while(num!=0)
        {
            int digit=num%10;
            if(digit>Max)
            {
                Max=digit;
            }
            num=num/10;
        }
        System.out.println("The Largest Number is :"+Max);
    }
}
