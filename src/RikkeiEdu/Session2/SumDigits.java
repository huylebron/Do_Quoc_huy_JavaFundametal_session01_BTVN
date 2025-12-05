package RikkeiEdu.Session2;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap so nguyen :  ");
        long n = scanner.nextLong();
        scanner.close();


        if (n < 0) n = Math.abs(n);

        long sum = 0;

        if (n == 0) {
            sum = 0;
        } else {
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
        }

        System.out.println(" tong = :  " + sum);
    }
}