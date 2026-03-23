import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

//        System.out.println(0 % 2);

        char[][] chess = new char[8][8];

        for (int i = 0; i < 8; i++) {
            char[] row = br.readLine().toCharArray();
            for (int j = 0; j < 8; j++) {
                chess[i][j] = row[j];
            }
        }

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print((char) chess[i][j]);
//            }
//        }

        int chessPiece = 0;

        for (int i = 0; i < 8; i++) {
            int start = 0;

            if (i % 2 != 0) {
                start = 1;
            }

            for (int j = start; j < 8; j += 2) {
//                System.out.println(i + " " + j);
                if (chess[i][j] == 'F') {
//                    System.out.println(i + " " + j);
                    chessPiece++;
                }
            }
        }

        bw.write(String.valueOf(
                chessPiece
        ));

        bw.flush();
        bw.close();
    }
}

