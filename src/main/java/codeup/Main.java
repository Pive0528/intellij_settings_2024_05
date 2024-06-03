package codeup;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //float a = sc.nextFloat();
        //char a = sc.next().charAt(0);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //long a = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = b%a;
        long d = a%b;
        //System.out.printf("%4f", a);
        //System.out.printf("%.2f", a);
        if (c==0) {
            System.out.printf("%d*%d=%d", a, b/a, b);
        }
        else if (d==0) {
            System.out.printf("%d*%d=%d", b, a/b, a);
        }
        else if (c!=0||d!=0) {
            System.out.println("none");
        }

    }
}



