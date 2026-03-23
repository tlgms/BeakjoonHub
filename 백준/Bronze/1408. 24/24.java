import java.io.*;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalTime t1 = LocalTime.parse(br.readLine());
        LocalTime t2 = LocalTime.parse(br.readLine());
        
        long s1 = t1.toSecondOfDay();
        long s2 = t2.toSecondOfDay();

        final long DAY = 24 * 3600L;
        long diff = Math.floorMod(s2 - s1, DAY);

        long hh = diff / 3600;
        long mm = (diff % 3600) / 60;
        long ss = diff % 60;

        System.out.printf("%02d:%02d:%02d%n", hh, mm, ss);
    }
}