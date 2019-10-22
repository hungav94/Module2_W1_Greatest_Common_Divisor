import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = Math.abs(scanner.nextInt());
        System.out.print("Enter b: ");
        b = Math.abs(scanner.nextInt());

        if (a == 0 || b == 0) {
            System.out.println("No greatest common divisor");
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        }

        System.out.println("Greatest common divisor: " + a);
    }
}
