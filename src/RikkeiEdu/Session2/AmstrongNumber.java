package RikkeiEdu.Session2;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int n = 0 ;

        boolean ValidInput = false;

        while (!ValidInput) {

            try {
                System.out.print("nhap so n ");

                n = Integer.parseInt(scanner.nextLine()) ;

                if ( n > 0 ) {
                    ValidInput = true;

                }else {
                    System.out.println("so nhap vao ko dung ");
                }
            } catch (NumberFormatException e ) {
                System.out.println("so nhap vao ko dung ");
            }

        }

        System.out.println("so armstrong tu 0 den " + n + " : ");
        for (int i = 0 ; i<= n ; i++) {
            if ( isAmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }




    private static boolean isAmstrongNumber( int num) {
        int sum = 0 ;
        int originNumber = num;

        int digit = countDigit ( num) ;

        while (num > 0  ) {
            int dg = num % 10 ;
            sum+= Math.pow(dg,digit) ;
            num /= 10 ;
        }

        return sum == originNumber;



    }

    private static int countDigit(int num) {

        if ( num == 0) {
            return 1 ;
        }

        int count = 0 ;
         while ( num !=0 ) {
             num /= 10;
             count ++;
         }
         return count;
    }


}