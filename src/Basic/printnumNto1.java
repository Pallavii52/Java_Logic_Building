package Basic;

import java.util.Scanner;

public class printnumNto1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number from where you want to print: ");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
}
