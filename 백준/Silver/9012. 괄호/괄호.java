import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        boolean o;

        while (count --> 0) {
            String ParenthesisString = br.readLine();
            char[] PSList = ParenthesisString.toCharArray();
            o = false;

            int openBrackets = 0;

            for (char PS : PSList) {
                switch (PS) {
                    case '(':
                        openBrackets++;
                        break;
                    case ')':
                        openBrackets--;
                        break;
                }
                if (openBrackets == -1) {
                    o = true;
                    System.out.println("NO");
                    break;
                }
            }
            if (!o) {
                if (openBrackets == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}