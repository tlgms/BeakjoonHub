import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int N = Integer.parseInt(br.readLine());

        bw.write(
                "         ,r'\"7\n" +
                        "r`-_   ,'  ,/\n" +
                        " \\. \". L_r'\n" +
                        "   `~\\/\n" +
                        "      |\n" +
                        "      |"
        );

        bw.flush();
        bw.close();
    }
}