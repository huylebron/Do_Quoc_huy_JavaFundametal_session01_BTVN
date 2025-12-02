package lcoj.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchInArr {

    private static final int ARRAY_SIZE = 10;

    public static List<Integer> searchingPositon(int[] array, int key) {

        List<Integer> foundPos = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                foundPos.add(i + 1);
            }
        }

        return foundPos;

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[ARRAY_SIZE];

        int k;
        for (int i = 0; i < ARRAY_SIZE; i++) {

            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();

            }
        }

        if (scanner.hasNextInt()) {
            k = scanner.nextInt();
        } else {
            System.err.println("loi");
            scanner.close();
            return;
        }


        List<Integer> results = searchingPositon(arr, k);

        if (results.isEmpty()) {
            System.out.println("-1");

        } else {
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < results.size(); i++) {
                output.append(results.get(i));
                if (i < results.size() - 1) {
                    output.append(" ");
                }
            }

            System.out.println(output.toString());

        }
        scanner.close();


    }
}