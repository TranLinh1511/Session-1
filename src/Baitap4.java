import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần check");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5==0) {
            System.out.println(number + " chia hết cho 3 và 5");
        } else {
            System.out.println(number + " không chia hết cho 3 và 5");
        }
    }
}
