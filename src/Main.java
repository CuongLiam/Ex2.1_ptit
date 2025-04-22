import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input a: ");
        int a = scanner.nextInt();
        System.out.println("input b: ");
        int b = scanner.nextInt();

        System.out.println("area of the rectangle is: a*b = " +a*b);

    }
}