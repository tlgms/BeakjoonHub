import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;

        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());
        int number3 = Integer.parseInt(br.readLine());

        ArrayList<Integer> al = new ArrayList<>();
        al.add(number1);
        al.add(number2);
        al.add(number3);

        Collections.sort(al);

        bw.write(String.valueOf(
                al.get(1)
        ));
        
        bw.flush();
        bw.close();
    }
}