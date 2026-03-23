import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Queue<Integer> queue = new LinkedList<Integer>();

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
                    queue.add(value);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                        queue.remove();
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "top":
                    bw.write(queue.peek() + "\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(((LinkedList<Integer>) queue).get(queue.size() - 1) + "\n");
                    }
                    break;
            }
        }
        bw.close();
    }
}