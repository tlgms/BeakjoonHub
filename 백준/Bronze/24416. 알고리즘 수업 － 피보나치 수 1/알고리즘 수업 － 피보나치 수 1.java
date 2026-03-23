import java.io.*;
import java.util.*;

class Main {
    static int NumberOfExecutionsOfFibonacciFunction = 0;
    static int NumberOfExecutionsOfFibFunction = 0;

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            NumberOfExecutionsOfFibFunction++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        int[] arr = new int[n + 1];
        for (int i = 3; i <= n; i++) {
            NumberOfExecutionsOfFibonacciFunction++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number =  Integer.parseInt(br.readLine());

        fibonacci(number);
        fib(number);

        bw.write(String.valueOf(NumberOfExecutionsOfFibFunction + " " + NumberOfExecutionsOfFibonacciFunction));

        bw.close();
        br.close();
    }
}