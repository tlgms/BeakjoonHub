import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int diagonal = Integer.parseInt(st.nextToken());
        int heightbiyul = Integer.parseInt(st.nextToken());
        int widthbiyul = Integer.parseInt(st.nextToken());

        double skail = Math.pow(heightbiyul, 2) + Math.pow(widthbiyul, 2);
        skail = Math.sqrt(skail);
        skail = diagonal / skail;

        int width = (int)(widthbiyul * skail);
        int height = (int)(heightbiyul * skail);

        System.out.println(height + " " + width);
    }
}
