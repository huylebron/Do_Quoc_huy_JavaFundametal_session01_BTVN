package RikkeiEdu.session4;

import java.util.Scanner;

public class Gioi1 {

    /**
     * @param arr mang can sap sep
     *            sap sep mang giam dan bang thuajt toan selection sort
     */
    public static void selectionSort( int[] arr) {

        int n = arr.length;

        for (int i = 0 ; i < n - 1 ; i++) {
            int max_id = i;

            for( int j = i + 1 ; j < n ; j++) {
                if ( arr[i] > arr[max_id]) {
                    max_id = j ;
                }
            }

            if ( max_id != i) {
                int temp = arr[i] ;
                arr[i] = arr[max_id] ;
                arr[max_id] = temp;

            }

        }




    }

    /**
     * @param arr
     * @param k
     * @return
     */
    public static  int linearSearch( int[] arr , int k) {

        for(int i = 0 ; i < arr.length; i++) {

            if ( arr[i] ==   k) {
                return i ;
            }
        }
        return -1;
    }


    /**
     * @param arr
     * @param k
     * @return
     */
    public static int binarySearch( int[] arr , int k ) {

        int left = 0 ;
        int right = arr.length -1 ;

        while (left <= right) {

            int mid = left + (right - left) /2 ;

            if ( arr[mid] == k) {

                return mid;
            } else if (k > arr[mid]) {

                right = mid - 1;

            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhap so luong phan tu mang : ");
        int n = scanner.nextInt();

        int [] arr = new int[n] ;

        System.out.println("nhap caca phan tu trong mang ");
        for(int i = 0 ; i < n; i++) {
            System.out.printf("phan tu thu %d", i + 1);
            arr[i] = scanner.nextInt();
        }

        selectionSort(arr);

        System.out.println("\n mang sau khi giam laf ");
        for(int  value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();

        System.out.println("nhap so can tim ");
        int target = scanner.nextInt();

        int res = linearSearch(arr,target );

        if ( res != - 1 ) {
            System.out.printf(" ket qua : so %d co tai vi tri %d\n" , target, res + 1 );
            System.out.printf("khong tim thay so %d\n", target);



        }
        scanner.close();






    }








    
}