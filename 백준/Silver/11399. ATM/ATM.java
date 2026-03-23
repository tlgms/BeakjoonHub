import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int personCount = Integer.parseInt(br.readLine());
        int[] personHowTakeTimes = new int[personCount];
        int[] personTakeTimes = new int[personCount];

        int totalTime = 0;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < personCount; i++) {
            personHowTakeTimes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(personHowTakeTimes);

        for (int i = 0; i < personCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                personTakeTimes[i] += personHowTakeTimes[j];
            }
        }

        for (int i = 0; i < personCount; i++) {
            totalTime += personTakeTimes[i];
        }

        bw.write(String.valueOf(totalTime));

        bw.close();
        br.close();
    }
}