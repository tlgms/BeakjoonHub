import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int P = Integer.parseInt(br.readLine());

        int studentOfSfClassCount = 0;
        int studentOfEbClassCount = 0;
        int studentOfAiClassCount = 0;

        int studentOfNoneClass = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            switch (G)  {
                case 1:
                    studentOfNoneClass++;
                    break;
                case 2:
                    if (C == 1 || C == 2) {
                        studentOfSfClassCount++;
                    } else if (C == 3) {
                        studentOfEbClassCount++;
                    } else {
                        studentOfAiClassCount++;
                    }
                    break;
                case 3:
                    if (C == 1 || C == 2) {
                        studentOfSfClassCount++;
                    } else if (C == 3) {
                        studentOfEbClassCount++;
                    } else {
                        studentOfAiClassCount++;
                    }
            }
        }

        bw.write(studentOfSfClassCount + "\n");
        bw.write(studentOfEbClassCount + "\n");
        bw.write(studentOfAiClassCount + "\n");
        bw.write(studentOfNoneClass + "\n");

        bw.flush();
        bw.close();
    }
}