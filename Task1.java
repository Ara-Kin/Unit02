package Unit02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Numbers are NOT equal");
        } else if (a < b) {
            System.out.println("Numbers are NOT equal");
        } else System.out.println("Numbers are equal");

    }
}



