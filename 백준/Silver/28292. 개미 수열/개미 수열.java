import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        if (N <= 2) System.out.print(1);
        else if (N <= 5) System.out.print(2);
        else System.out.print(3);
    }
}