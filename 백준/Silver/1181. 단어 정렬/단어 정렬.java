import java.io.*;
import java.util.*;

public class Main {
    private static void bubbleSort(String[] a, int size) { // 감사합니다 디스토리...

        for(int i = 1; i < size; i++) {
            for(int j = 0; j < size - i; j++) {
                if(a[j].length() > a[j + 1].length()) {
                    swap(
                            a,
                            j,
                            j + 1
                    );
                }
            }
        }

    }

    private static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

//        for (String word : words) {
//            System.out.println(word);
//        }

        Arrays.sort(words);

//        for (String word : words) {
//            System.out.println(word);
//        }

        bubbleSort(words, N);

//        for (String word : words) {
//            System.out.println(word);
//        }

        String lastWord = " ";

        for (String word : words) {
            if (word.equals(lastWord)) {
                continue;
            }

            bw.write(word);
            bw.newLine();

            lastWord = word;
        }

        bw.flush();
        bw.close();
    }
}