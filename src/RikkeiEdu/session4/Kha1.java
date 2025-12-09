package RikkeiEdu.session4;

import lcoj.easy.ArrayTransform;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class Kha1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so luong phan tu cua mang ");

        int n = scanner.nextInt();

        int[] arr = new int[n];


        System.out.println("nhap cac phan tu mang ");

        for (int i = 0; i < n; i++) {
            System.out.printf("phan tu thu %d:", i + 1);
            arr[i] = scanner.nextInt();


        }

        System.out.println(" mang sau khi sap sep giam dan la : ");
        Integer[] arrWrapper = Arrays.stream(arr)
                        .boxed()
                                .toArray(Integer[] ::new);
        Arrays.sort(arrWrapper,Collections.reverseOrder());




        System.out.println();

        scanner.close();

    }





}