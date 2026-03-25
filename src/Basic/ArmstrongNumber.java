package Basic;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num=153;
        int original_num=num;
        int sum=0;
        int digits=0;
        int temp=num;

        // we count the digit in number
        while(temp!=0)
        {
            digits++;
            temp=temp/10;
        }

        while(num!=0)
        {
           int digit=num%10;
            sum= (int) (sum+Math.pow(digit,digits));
            num=num/10;
        }

        if(original_num==sum)
        {
            System.out.println("The number is Armstrong number");
        }
        else
        {
            System.out.println("The number is not Armstrong number");
        }
    }
}
