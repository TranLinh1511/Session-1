import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập chiều dài a: ");
        int a  = sc.nextInt();
        System.out.print("Nhập chiều dài b: ");
        int b = sc.nextInt();
        System.out.printf("Chu vi của chiều dài %d và chiều rộng %d là: %d",a,b,(a+b)*2 );
        System.out.println();
        System.out.printf("Diện tích của chiều dài %d và chiều rộng %d là: %d", a, b, a*b);
    }
}
