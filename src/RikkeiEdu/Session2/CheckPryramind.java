package RikkeiEdu.Session2;

import java.util.Scanner;

public class CheckPryramind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh 1: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh 2: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh 3: ");
        int c = scanner.nextInt();


        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println(" loi ");
            return;
        }


        if (a == b && b == c) {
            System.out.println("Tam giác đều");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giác cân");
        } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
            System.out.println("Tam giác vuông");
        } else {
            System.out.println("Tam giác thường");
        }

        scanner.close();
    }


}