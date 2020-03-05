package Unit02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Enter a,b,c and x for a*x*x + b*x + c");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int result = Math.abs(a*x*x + b*x + c);

        System.out.println(result);
    }
}
