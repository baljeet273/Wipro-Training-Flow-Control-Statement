
import java.util.Scanner;
import java.time.Month;
public class AddMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month in numbers: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            System.exit(0);
        }
        String monthStr = Month.of(month).name();
        monthStr = monthStr.substring(0, 1).toUpperCase() + monthStr.substring(1).toLowerCase();
        System.out.println(monthStr);
        scanner.close();
    }
}

