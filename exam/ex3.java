import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        int songaunhien = random.nextInt(100) + 1;
        System.out.println("Số ngẫu nhiên được sinh ra: " + songaunhien);
        if (Number(songaunhien)) {
            System.out.println(songaunhien + " là số nguyên tố.");
        } else {
            System.out.println(songaunhien + " không là số nguyên tố.");
        }
    }

        public static boolean Number(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
