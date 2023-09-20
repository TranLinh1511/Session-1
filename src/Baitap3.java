import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập điểm môn toán: ");
        int toan = sc.nextInt();
        System.out.print("Nhập điểm môn anh: ");
        int anh = sc.nextInt();
        System.out.print("Nhập điểm môn văn: ");
        int van = sc.nextInt();
        System.out.print("Nhập điểm môn lý: ");
        int ly = sc.nextInt();
        System.out.print("Nhập điểm môn hóa: ");
        int hoa = sc.nextInt();
        float dtb = (toan + anh + van + ly + hoa)/5f;
        System.out.println("Điểm trung bình của bạn là: " + dtb);
        if(dtb <= 10 && dtb >= 8) {
            System.out.println("Xếp hạng giỏi.");
        } else if(dtb >= 6.5 && dtb < 8) {
            System.out.println("Xếp hạng khá.");
        }else {
            System.out.println("Xếp hạng tb.");
        }
    }

}
