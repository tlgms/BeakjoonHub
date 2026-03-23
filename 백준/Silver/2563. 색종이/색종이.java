import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int papaeCount = Integer.parseInt(br.readLine());

        int[][] drawingPaper = new int[100][100];

        int numberOfContactArea = 0;

        for (int i = 0; i < papaeCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

//            System.out.println(x + " " + y);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    drawingPaper[j][k]++;
//                    System.out.println(drawingPaper[j][k]);
//                    System.out.println(j + " " + k);
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (drawingPaper[i][j] >= 1) {
                    numberOfContactArea++;
                }
            }
        }

//        System.out.println(numberOfContactArea);
        bw.write(String.valueOf(numberOfContactArea));

        bw.flush();
        bw.close();
    }
}