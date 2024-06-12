import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ip = sc.nextInt();
        int op = 0;
        int i = (int) Math.pow(10, String.valueOf(ip).length() - 1);
        
        while (ip != 0) {
            int digit = ip % 10;
            op += digit * i;
            i /= 10;
            ip /= 10;
        }
        System.out.println("Reversed number: " + op);
        sc.close();
    }
}



