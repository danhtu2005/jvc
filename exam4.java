public class exam4 {
    public static void main(String[] args) {
        System.out.println("10 số nguyên tố đầu tiên:");
        insonguyentodautien(10);

        System.out.println("\nCác số nguyên tố nhỏ hơn 10:");
        insonhohonN(10);
    }

    public static void insonguyentodautien(int n) {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (songuyento(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }

    public static void insonhohonN(int n) {
        for (int i = 2; i < n; i++) {
            if (songuyento(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean songuyento(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
