import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int useless = Integer.parseInt(br.readLine());

        char[] str = br.readLine().toCharArray();

        int index = 0;

        int vowel = 0;

        for (char c : str) {
            switch (c) {
                case 'a':
                    vowel++;
                    break;
                case 'i':
                    vowel++;
                    break;
                case 'u':
                    vowel++;
                    break;
                case 'e':
                    vowel++;
                    break;
                case 'o':
                    vowel++;
                    break;
            }
        }

        bw.write(String.valueOf(vowel));

        bw.close();
        br.close();
    }
}