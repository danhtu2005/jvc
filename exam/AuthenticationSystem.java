import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    String username;
    String email;
    String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}

public class AuthenticationSystem {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AuthenticationSystem authSystem = new AuthenticationSystem();
        authSystem.run();
    }

    public void run() {
        while (true) {
            System.out.println("Chào mừng đến hệ thống xác thực người dùng");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. Quên mật khẩu");
            System.out.println("4. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    forgotPassword();
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    private void login() {
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập mật khẩu:");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.email.equals(email) && user.password.equals(password)) {
                System.out.println("Đăng nhập thành công. Chào mừng " + user.username);
                // Sau khi đăng nhập thành công, hiển thị các tùy chọn
                // code tại đây...
                return;
            }
        }
        System.out.println("Tài khoản hoặc mật khẩu không chính xác");
    }

    private void register() {
        System.out.println("Nhập tên người dùng:");
        String username = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập mật khẩu:");
        String password = scanner.nextLine();

        try {
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Email không hợp lệ");
            }

            if (password.length() < 7 || password.length() > 15) {
                throw new IllegalArgumentException("Mật khẩu phải từ 7 đến 15 ký tự");
            }

            for (User user : users) {
                if (user.email.equals(email)) {
                    throw new IllegalArgumentException("Email đã tồn tại");
                }
            }

            users.add(new User(username, email, password));
            System.out.println("Đăng ký thành công");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void forgotPassword() {
        System.out.println("Nhập email của bạn:");
        String email = scanner.nextLine();

        for (User user : users) {
            if (user.email.equals(email)) {
                System.out.println("Nhập mật khẩu mới:");
                String newPassword = scanner.nextLine();
                user.password = newPassword;
                System.out.println("Mật khẩu đã được thay đổi thành công.");
                login(); // tự động đăng nhập sau khi đổi mật khẩu
                return;
            }
        }
        System.out.println("Email không tồn tại trong hệ thống.");
    }

    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
