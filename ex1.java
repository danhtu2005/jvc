public class ex1 {
    public static void main(String[] args) {
        hinhvuong();
        System.out.println();
        tamgiac();
    }

    public static void hinhvuong() {
        System.out.println("Square:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void tamgiac() {
        System.out.println("Triangle:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
