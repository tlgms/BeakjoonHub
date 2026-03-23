import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] word = br.readLine().toCharArray();

        String reversedWord = "";

        for (char w : word) {
            if (Character.isUpperCase(w)) {
                reversedWord += String.valueOf(w).toLowerCase();
            } else  {
                reversedWord += String.valueOf(w).toUpperCase();
            }
        }

        bw.write(String.valueOf(reversedWord));

        bw.flush();
        bw.close();
    }
}