package Basic;

import java.util.Scanner;

public class SumofDigitinNum {

    public static void main(String[] args)
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=s2.nextInt();

        int sum=0;
        while(num!=0)
        {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("The Sum is:"+sum);

    }
}
