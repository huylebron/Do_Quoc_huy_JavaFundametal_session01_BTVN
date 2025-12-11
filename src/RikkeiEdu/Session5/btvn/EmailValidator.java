package RikkeiEdu.Session5.btvn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static final String REGEX = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}";



    public static boolean isValidEmail( String email) {

        String trimedEmail = email.trim();

        Pattern pattern = Pattern.compile(REGEX) ;
        Matcher matcher  = pattern.matcher(trimedEmail) ;
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập địa chỉ email cần kiểm tra:");
        String inputEmail = scanner.nextLine();

        if (isValidEmail(inputEmail)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        scanner.close();
    }










}