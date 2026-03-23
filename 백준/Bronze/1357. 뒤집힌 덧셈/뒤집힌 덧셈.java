import java.io.*;
import java.util.*;

public class Main {
    static int rev(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + (n % 10);
            n /= 10;
        }
        return r;
    }

    public static void main(String[] args) throws Exception {
        Scanner fs = new Scanner(System.in);
        int X = fs.nextInt();
        int Y = fs.nextInt();

        int answer = rev(rev(X) + rev(Y));
        System.out.println(answer);
    }
}