import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextFloat();
        double b = sc.nextFloat();

        sc.close();
        System.out.println(a / b);
    }
}