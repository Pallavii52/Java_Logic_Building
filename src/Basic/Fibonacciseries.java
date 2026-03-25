package Basic;

import java.util.Scanner;

public class Fibonacciseries
{

    public static void main(String[] args)
    {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= s1.nextInt();

        int a=0;
        int b=1;

        System.out.print(a+" "+b);

        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }

    }

}