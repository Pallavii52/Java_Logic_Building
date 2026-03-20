package Basic;

import java.util.Scanner;

public class divisiblebt5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ");
        int n=sc.nextInt();

        for(int a=1;a<=n;a++){
            if (a % 5 == 0) {
                System.out.print(a+" ");
            }
        }

    }
}
