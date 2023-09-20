import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = {"","một", "hai", "ba", "bốn","năm","sáu","bảy","tám","chín"};
        System.out.print("Nhập số nhỏ hơn 10: ");
        int number  = sc.nextInt();
        if(number < 0 || number > 9) {
            System.out.println("Số nhập chỉ trong khoảng 0 - 9");
        } else {
            System.out.println(arr[number]);
        }
    }
}
