import java.util.*;
import java.io.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] prices = new int[M][2];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            prices[i][0] = Integer.parseInt(st.nextToken());
            prices[i][1] = Integer.parseInt(st.nextToken());

//            System.out.println(prices[i][0] + " " + prices[i][1]);
        }

        int minPackage = prices[0][0];
        for (int i = 1; i < M; i++) {
            if (prices[i][0] < minPackage) {
                minPackage = prices[i][0];
            }
        }

        int minEach = prices[0][1];
        for (int i = 1; i < M; i++) {
            if (prices[i][1] < minEach) {
                minEach = prices[i][1];
            }
        }

//        System.out.println(minEach + " " + minPackage);

        int needCount = 6;
        
        if (N < 6) {
            needCount = N;
        }

//        System.out.println(needCount);

        if ((minEach * needCount) <= minPackage) { // 낱개가 더 쌀 경우
            bw.write(String.valueOf(
                    minEach * N
            ));

//                System.out.println("each");

            bw.flush();
            bw.close();

            return;
        }

        int price = 0;
        do {
            if (N >= 6) {
                N -= 6;
                price += minPackage;

//                System.out.println("pa " + N + " " + price);
            } else {
                if ((minEach * N) >= minPackage) {
                    N -= 6;
                    price += minPackage;

//                    System.out.println("pa " + N + " " + price);
                } else {
                    N--;
                    price += minEach;

//                    System.out.println("ec " + N + " " + price);
                }
            }

//            System.out.println("반복");

        } while (N > 0);

        bw.write(String.valueOf(
                price
        ));

//        System.out.println("package");

        bw.flush();
        bw.close();
    }
}