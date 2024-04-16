import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Thông tin của mảng:");
        inmang(array);

        System.out.println("Các phần tử trên đường chéo chính:");
        inphantuduongcheo(array);

        int[][] newArray = new int[rows][cols];
        System.out.println("Nhập các phần tử của mảng thứ hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("newArray[" + i + "][" + j + "]: ");
                newArray[i][j] = scanner.nextInt();
            }
        }
        int[][] sumArray = in2mang(array, newArray);
        System.out.println("Kết quả sau khi cộng hai mảng:");
        inmang(sumArray);

        scanner.close();
    }
    public static void inmang(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inphantuduongcheo(int[][] array) {
        for (int i = 0; i < array.length && i < array[0].length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
    }
    public static int[][] in2mang(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int cols = array1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }
}
