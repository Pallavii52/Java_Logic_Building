package Basic;

import java.util.Scanner;

public class CkeckPrime {
      public static void main(String[] args)
      {
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter number");
            int num=s1.nextInt();

            boolean isprime= true;

            for(int i=2;i<=num/2;i++) {
                  if (num % i == 0) {
                        isprime = false;
                        break;
                  }
            }
            if(isprime && num>1)
            {
                  System.out.println(num+" is Prime number");
            }
            else
            {
                  System.out.println(num+" is not Prime number");
            }

      }

}
