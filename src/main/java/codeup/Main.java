package codeup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //float a = sc.nextFloat();
        //char a = sc.next().charAt(0);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //long a = sc.nextLong();
        long a = sc.nextLong();

        long n1 = a%10;

        //System.out.printf("%4f", a);
        //System.out.printf("%.2f", a);
        if (a>=11&&a<=13) {
            System.out.println(a+"th");
        }

        else if (n1==1) {
            System.out.println(a+"st");
        }
        else if (n1==2) {
            System.out.println(a+"nd");
        }
        else if (n1==3) {
            System.out.println(a+"rd");
        }
        if (n1>=4&&n1<=10) {
            System.out.println(a+"th");
        }
        if (n1==0) {
            System.out.println(a+"th");
        }

    }
}



