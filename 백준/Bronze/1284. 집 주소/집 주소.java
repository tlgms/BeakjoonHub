import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String numberStr = br.readLine();
            if (numberStr.equals("0")) {
                break;
            }
            
            int totalWidth = 0;
            
            totalWidth += numberStr.length() + 1;

            for (int i = 0; i < numberStr.length(); i++) {
                char digit = numberStr.charAt(i);

                if (digit == '1') {
                    totalWidth += 2;
                } else if (digit == '0') {
                    totalWidth += 4;
                } else {
                    totalWidth += 3;
                }
            }
            
            System.out.println(totalWidth);
        }

        br.close();
    }
}