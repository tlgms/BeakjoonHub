import javax.smartcardio.Card;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String A  = st.nextToken();
        String B  = st.nextToken();

        int different = 0;

        int differentMin = B.length();

        int lenDiff = B.length() - A.length() + 1;

        for (int i = 0; i < lenDiff; i++) {
            different = 0;
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(j + i) != A.charAt(j)) {
                    different++;
                }
            }
            if (different < differentMin) {
                differentMin = different;
            }
        }

        bw.write(String.valueOf(differentMin));

        bw.close();
        br.close();
    }
}