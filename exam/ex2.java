public class ex2 {
    public static void main(String[] args) {
        String chuoi = "Đây là một chuỗi tiếng Việt có chứa một số chữ o.";
        int soTu = demsotu(chuoi);
        System.out.println("Số từ trong chuỗi: " + soTu);
        demvainkytu(chuoi, 'o');
    }

    public static int demsotu(String chuoi) {
        String[] tu = chuoi.split("\\s+");
        return tu.length;
    }

    public static void demvainkytu(String chuoi, char kiTu) {
        System.out.print("Vị trí của ký tự '" + kiTu + "' trong chuỗi: ");
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kiTu) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
