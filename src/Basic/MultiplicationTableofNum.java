package Basic;

import java.util.Scanner;

public class MultiplicationTableofNum
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Number for multiplication table:");
        int n=s1.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}
