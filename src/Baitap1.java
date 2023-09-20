import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        System.out.println("Nhập số cần chuyển đổi: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println(readNumber(number));
    }

    public static String readNumber(int number) {
        String[] defaultNumber = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {
            return "zero";
        } else if (number > 0 && number < 9) {
            return defaultNumber[number];
        } else if (number > 10 && number < 99 && number % 10 == 0) {
            return teens[number / 10];
        } else if (number > 10 && number < 99) {
            return tens[number / 10] + " " + defaultNumber[number % 10];
        } else if (number >= 100 && number <= 999) {
            return number % 100 == 0 ?
                    (defaultNumber[number / 100] + " hundred ") :
                    defaultNumber[number / 100] + " hundred " + readNumber(number % 100);
        } else {
            return "Number out of range (1-999)";
        }
    }
}
