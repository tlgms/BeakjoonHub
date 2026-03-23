import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList stack = new ArrayList();

        String command;
        int value = 0;

        int count;

        count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            command = st.nextToken();
            if (st.hasMoreTokens()) {
                value = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case "push":
                    stack.add(value);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.get(stack.size() - 1));
                        stack.remove(stack.size() - 1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.get(stack.size() - 1).toString());
                    }
                    break;
            }
        }
    }
}