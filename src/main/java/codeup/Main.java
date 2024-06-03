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
        //String a = sc.nextLine();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum=a+(a*b)*i;
        }

        System.out.println(sum);

        //System.out.printf("%4f", a);
        //System.out.printf("%.2f", a);
    }
}



