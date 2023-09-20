import java.util.Scanner;

public class Baith3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int a = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int b = sc.nextInt();
        System.out.printf("Diện tích hình chữ nhật có chiều dài là %d chiều rộng là %d là: %d",a,b,a*b);
    }
}
