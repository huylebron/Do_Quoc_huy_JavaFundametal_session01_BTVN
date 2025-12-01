package RikkeiEdu.Session1;

import java.util.Scanner;

public class NhapXuatCoBan {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in) ;

        System.out.println("Nhap vao 2 canh cua hinh chu nhat:");
        System.out.print("chieu dai : " );
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("chieu rong");
        double width = Double.parseDouble(scanner.nextLine());

        double t = 2 * ( length + width);
        double s = length * width;

        System.out.println("Chu vi hinh chu nhat: " + t);
        System.out.println("Dien tich hinh chu nhat: " + s);

        scanner.close();

    }






    }