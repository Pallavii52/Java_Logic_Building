package Basic;

import java.util.Scanner;

public class printfactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int f=1;

        for (int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
