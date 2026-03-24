package Basic;

import java.util.Scanner;

public class CountDigitinNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count=0;

        while(num!=0){
            count++;
            num=num/10;
        }
        System.out.println("Total Number of Digit in Number are:"+count);
    }
}
