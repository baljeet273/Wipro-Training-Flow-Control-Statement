
import java.util.Scanner;
public class floyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowCount = scanner.nextInt();
        if (rowCount <= 0) {
            System.out.println("Please enter a positive integer");
            System.exit(0);
        }
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }   
        scanner.close();
    }
}

