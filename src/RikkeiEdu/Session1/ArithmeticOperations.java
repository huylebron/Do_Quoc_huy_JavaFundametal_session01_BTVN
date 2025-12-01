package RikkeiEdu.Session1;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstName;
        int secondName;

        System.out.println("chuong trin hthuwc hien phep toan so hoc" );

        try {
            firstName = scanner.nextInt();

        } catch (java.util.InputMismatchException e ) {
            System.err.println("gia tri nhap vaof khgn udwojc noll");

            firstName =10 ;
            scanner.nextLine();
        }

        System.out.print("Vui lòng nhập giá trị cho secondNumber (int): ");
        try {
            secondName = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.err.println("Lỗi: Giá trị nhập vào không phải là số nguyên hợp lệ. Sử dụng giá trị mặc định là 3.");
            secondName = 3;
        }

        System.out.print("Vui lòng nhập giá trị cho secondNumber (int): ");
        try {
            secondName = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.err.println("Lỗi: Giá trị nhập vào không phải là số nguyên hợp lệ. Sử dụng giá trị mặc định là 3.");
            secondName = 3;
        }


        scanner.close();

        System.out.println("\n--- Kết quả Tính toán ---");
        System.out.println("Giá trị firstNumber đã nhập: " + firstName);
        System.out.println("Giá trị secondNumber đã nhập: " + secondName);

        // Yêu cầu 2: Thực hiện các phép tính và gán
        // 1. Tính Tổng
        int sum = firstName + secondName;

        // 2. Tính Hiệu
        int difference = firstName - secondName;

        // 3. Tính Tích
        int product = firstName * secondName;

        // 4. Tính Thương (Chia số nguyên)

        if (secondName != 0) {
            int quotient = firstName / secondName;
            System.out.println(String.format("%d / %d (Thương) = %d", firstName, secondName, quotient));
        } else {
            System.out.println("Không thể tính thương: secondNumber bằng 0.");
        }

        // 5. Tính Phần dư (Modulo)
        if (secondName!= 0) {
            int remainder = firstName % secondName;
            System.out.println(String.format("%d %% %d (Phần dư) = %d", firstName, secondName, remainder));
        } else {
            System.out.println("Không thể tính phần dư: secondNumber bằng 0.");
        }



        System.out.println(String.format("%d + %d (Tổng) = %d", firstName, secondName, sum));
        System.out.println(String.format("%d - %d (Hiệu) = %d", firstName, secondName, difference));
        System.out.println(String.format("%d * %d (Tích) = %d", firstName, secondName, product));
    }
}