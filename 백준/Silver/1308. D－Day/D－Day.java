import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        LocalDate date = LocalDate.of(year, month, day);

        st = new StringTokenizer(br.readLine(), " ");
        year = Integer.parseInt(st.nextToken());
        month = Integer.parseInt(st.nextToken());
        day = Integer.parseInt(st.nextToken());

        LocalDate Dday = LocalDate.of(year, month, day);

        long d = ChronoUnit.DAYS.between(date, Dday);

        java.time.Period pd = java.time.Period.between(date, Dday);
        int y = pd.getYears();


        if (y >= 1000) {
            System.out.println("gg");
        } else {
            System.out.println("D-" + d);
        }
    }
}