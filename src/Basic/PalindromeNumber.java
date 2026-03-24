package Basic;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s1.nextInt();

        int originalNum = num;
        int reverse=0;

        while(num!=0)
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(originalNum==reverse)
        {
            System.out.println("Entered Number is Palindrome");
        }
        else
        {
            System.out.println("Entered Number is not Palindrome");
        }

    }

}
