
import java.util.Scanner;
public class gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender (Male/Female): ");
        String gender1 = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a numeric value.");
            scanner.close();
            return;
        }
        scanner.close();
        if (age < 1 || age >= 120) {
            System.out.println("Invalid age");
            return;
        }
        if (gender1.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest == 8.2%");
            } else if (age >= 59 && age <= 120) {
                System.out.println("Interest == 7.6%");
            }
        } else if (gender1.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 60) {
                System.out.println("Interest == 9.2%");
            } else if (age >= 61 && age <= 120) {
                System.out.println("Interest == 8.3%");
            }
        }
    }
}
