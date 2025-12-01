package RikkeiEdu.Session1;

import java.util.Scanner;

public class ibmCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập cân nặng (kg)
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();

        // Nhập chiều cao (m)
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();

        // Tính chỉ số BMI
        double bmi = weight / Math.pow(height, 2);

        // In kết quả
        System.out.printf("Chỉ số BMI của bạn là: %.2f%n", bmi);

        // Phân loại BMI
        if (bmi < 18.5) {
            System.out.println("Phân loại: Gầy");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Hơi béo");
        } else {
            System.out.println("Phân loại: Béo phì");
        }

        scanner.close();
    }


}