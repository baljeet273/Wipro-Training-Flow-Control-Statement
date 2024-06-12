
import java.util.Scanner;
public class lastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        boolean result = last_Digit(a, b);
        System.out.println(result);
        scanner.close();
    }
    public static boolean last_Digit(int a, int b) {
        int digit1 = a % 10;
        int digit2 = b % 10;
        return digit1 == digit2;
    }
}