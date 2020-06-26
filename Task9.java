package Unit02;

import java.util.Scanner;

//Даны три действительных числа. Возвести в квадрат те из них, значения которых
//неотрицательны, и в четвертую степень — отрицательные.

public class Task9 {
    public static void main(String[] args) {

        System.out.println("Enter a,b,c");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 0) {
            System.out.println(Math.pow(a, 4));
        } else if (a >= 0) {
            System.out.println(Math.pow(a, 2));
        }
        if (b < 0) {
            System.out.println(Math.pow(b, 4));
        } else if (b >= 0) {
            System.out.println(Math.pow(b, 2));
        }
        if (c < 0) {
            System.out.println(Math.pow(c, 4));
        } else if (c >= 0) {
            System.out.println(Math.pow(c, 2));
        }

    }
}
// К сожалению не все задачи модуля представлены. Но по имеющемуся коду значимых замечаний нет
