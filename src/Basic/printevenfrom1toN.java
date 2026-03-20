package Basic;

import java.util.Scanner;

public class printevenfrom1toN {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=s1.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
