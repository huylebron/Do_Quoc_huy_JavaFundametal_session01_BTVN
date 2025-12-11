package RikkeiEdu.Session5.btvn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator2 {
    private static final String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%]).{8,}$";

    private  static final Pattern pattern = Pattern.compile(regex) ;


    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        // Sử dụng đối tượng PATTERN đã được biên dịch sẵn.
        Matcher matcher = pattern.matcher(password.trim());
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- KIỂM TRA MẬT KHẨU HỢP LỆ ---");
        System.out.println("Yêu cầu: Tối thiểu 8 ký tự, 1 hoa, 1 thường, 1 số, 1 ký tự đặc biệt (@#$!%):");
        System.out.print("Nhập mật khẩu: ");

        String inputPassword = scanner.nextLine();

        if (isValidPassword(inputPassword)) {
            System.out.println("\nMật khẩu hợp lệ ✅");
        } else {
            System.out.println("\nMật khẩu không hợp lệ ❌");
            // Gợi ý về các điều kiện bị thiếu cho người dùng
            // (Thường không nên làm thế này trong thực tế vì lý do bảo mật, nhưng hữu ích cho bài tập)
            System.out.println("Kiểm tra lại các điều kiện sau:");
            if (inputPassword.length() < 8) System.out.println("- Độ dài phải ít nhất 8 ký tự.");
            if (!Pattern.compile(".*[A-Z].*").matcher(inputPassword).matches()) System.out.println("- Thiếu chữ cái viết hoa.");
            if (!Pattern.compile(".*[a-z].*").matcher(inputPassword).matches()) System.out.println("- Thiếu chữ cái viết thường.");
            if (!Pattern.compile(".*\\d.*").matcher(inputPassword).matches()) System.out.println("- Thiếu ký tự số.");
            if (!Pattern.compile(".*[@#$%!].*").matcher(inputPassword).matches()) System.out.println("- Thiếu ký tự đặc biệt (@#$%!).");
        }

        scanner.close();
    }




}