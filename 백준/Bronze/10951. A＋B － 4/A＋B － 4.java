import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line;
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line, " ");

            if (st.hasMoreTokens()) {
                bw.write(String.valueOf(
                        Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                ));
                bw.newLine();
            } else  {
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}