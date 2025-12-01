package RikkeiEdu.Session1;

import java.util.Scanner;

public class TinhDienTichHinhTron   {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("loi"    );


        scanner.close();

        double radius = 0 ;

        if ( scanner.hasNextDouble()) {
            radius = scanner.nextDouble()  ;
        }

        if (radius < 0 ) {
            System.out.println("loi ko am " );
            radius = 0 ;
        }

        double s = Math.PI * radius * radius ;


        System.out.println("ban kinh nhap :" + radius   );

        System.out.println();

        double s_test = 3.14 * radius *radius;


        System.out.printf("s: %.2f%n", s_test);
        scanner.close();

    }
}