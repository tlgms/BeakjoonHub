import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            left.addLast(c);
        }

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            switch (c) {
                case 'L':
                    if (!left.isEmpty()) {
                        right.addLast(left.removeLast());
                    }
                    break;
                case 'D':
                    if (!right.isEmpty()) {
                        left.addLast(right.removeLast());
                    }
                    break;
                case 'B':
                    if (!left.isEmpty()) {
                        left.removeLast();
                    }
                    break;
                case 'P':
                    char x = cmd.charAt(2);
                    left.addLast(x);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : left) sb.append(c);
        while (!right.isEmpty()) sb.append(right.removeLast());

        System.out.println(sb.toString());
    }
}