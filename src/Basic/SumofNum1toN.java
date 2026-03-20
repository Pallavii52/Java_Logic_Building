package Basic;

import java.util.Scanner;

public class SumofNum1toN
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s1.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
