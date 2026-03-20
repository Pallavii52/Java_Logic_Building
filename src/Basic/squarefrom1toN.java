package Basic;

import java.util.Scanner;

public class squarefrom1toN
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Number ");
        int n=s1.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(i*i+" ");
        }
    }
}
