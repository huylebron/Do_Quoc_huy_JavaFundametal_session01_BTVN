package RikkeiEdu.Session1;

import java.util.Scanner;

public class CountRoad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = scanner.nextDouble();
        speed = speed < 0 ? 0 : speed;

        System.out.println(" nhap time  :   ");

        double time = scanner.nextDouble();
        time = time < 0 ? 0 : time ;

        double distance  =speed * time  ;

        System.out.println( " quang duowng  = %.2f%n" + distance);









    }

}