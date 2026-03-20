package Basic;

import java.util.Scanner;

public class printnum1toN
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("How many numbers do you want to print?");
        int n=s1.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
