package RikkeiEdu.Session2;

import java.util.Scanner;

public class ReadDigitToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số từ 100-999: ");
        int number = scanner.nextInt();


        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;


        String result = "";


        switch (hundreds) {
            case 1:
                result += "Một trăm ";
                break;
            case 2:
                result += "Hai trăm ";
                break;
            case 3:
                result += "Ba trăm ";
                break;
            case 4:
                result += "Bốn trăm ";
                break;
            case 5:
                result += "Năm trăm ";
                break;
            case 6:
                result += "Sáu trăm ";
                break;
            case 7:
                result += "Bảy trăm ";
                break;
            case 8:
                result += "Tám trăm ";
                break;
            case 9:
                result += "Chín trăm ";
                break;
        }


        if (tens == 0 && units != 0) {
            result += "linh ";
        } else if (tens == 0 && units == 0) {

        } else {
            switch (tens) {
                case 1:
                    result += "mười ";
                    break;
                case 2:
                    result += "hai mươi ";
                    break;
                case 3:
                    result += "ba mươi ";
                    break;
                case 4:
                    result += "bốn mươi ";
                    break;
                case 5:
                    result += "năm mươi ";
                    break;
                case 6:
                    result += "sáu mươi ";
                    break;
                case 7:
                    result += "bảy mươi ";
                    break;
                case 8:
                    result += "tám mươi ";
                    break;
                case 9:
                    result += "chín mươi ";
                    break;
            }
        }


        if (units != 0 && tens != 0) {
            switch (units) {
                case 1:
                    result += "mốt";
                    break;
                case 2:
                    result += "hai";
                    break;
                case 3:
                    result += "ba";
                    break;
                case 4:
                    result += "tư";
                    break;
                case 5:
                    result += "lăm";
                    break;
                case 6:
                    result += "sáu";
                    break;
                case 7:
                    result += "bảy";
                    break;
                case 8:
                    result += "tám";
                    break;
                case 9:
                    result += "chín";
                    break;
            }
        } else if (units != 0 && tens == 0) {
            switch (units) {
                case 1:
                    result += "một";
                    break;
                case 2:
                    result += "hai";
                    break;
                case 3:
                    result += "ba";
                    break;
                case 4:
                    result += "tư";
                    break;
                case 5:
                    result += "năm";
                    break;
                case 6:
                    result += "sáu";
                    break;
                case 7:
                    result += "bảy";
                    break;
                case 8:
                    result += "tám";
                    break;
                case 9:
                    result += "chín";
                    break;
            }
        }


        if (result.endsWith(" ")) {
            result = result.substring(0, result.length() - 1);
        }

        System.out.println(result);
    }
}