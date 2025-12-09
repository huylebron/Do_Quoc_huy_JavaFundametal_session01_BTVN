package RikkeiEdu.session4;

import java.util.Scanner;

public class kha2 {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in) ;
        System.out.println("nhao so hang cua mang ");
        int n = scanner.nextInt();
        System.out.println("nhap so cot cua amng ");



        int c = scanner.nextInt();

        int[][] arr = new int[n][c] ;

        int sumEven = 0 ;
        int sumOdd = 0 ;

        System.out.println("nhap cac phan tu cua mang ");

        for(int i = 0 ; i < n ; i ++ ) {
            for(int j = 0 ; j < c ; j ++) {

                System.out.printf("nhap phan tu [%d][%d]", i,j);
                arr[i][j] = scanner.nextInt();
                int element =  arr[i][j];
                if ( element % 2 ==0 ) {
                    sumEven += element;

                }
                else {
                    sumOdd += element;
                }

            }






        }


        System.out.println("\nTong cac so chan" + sumEven);
        System.out.println("\n Tong ac so le " + sumOdd);





    }
}