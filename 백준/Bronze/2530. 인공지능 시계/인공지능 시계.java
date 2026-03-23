import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(br.readLine().trim());

        int total = h * 3600 + m * 60 + s + d;
        total %= 24 * 3600;

        int nh = total / 3600;
        int nm = (total % 3600) / 60;
        int ns = total % 60;

        System.out.println(nh + " " + nm + " " + ns);
    }
}