import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int numberOfCount = Integer.parseInt(br.readLine());
        int[] numbers = new int[numberOfCount];
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < numberOfCount; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        int mustNumber = Integer.parseInt(br.readLine());
        int numberOfMustNumber = 0;
        
        for (int number : numbers) {
            if (number == mustNumber) {
                numberOfMustNumber++;
            }
        }
        
        bw.write(String.valueOf(numberOfMustNumber));
        
        bw.flush();
        bw.close();
    }
}