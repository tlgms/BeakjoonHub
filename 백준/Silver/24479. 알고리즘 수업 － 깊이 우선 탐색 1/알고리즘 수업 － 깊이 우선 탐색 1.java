import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph = new int[1][1];
    static boolean[] visited = new boolean[1];

    static int[] order = new int[1];
    static int number = 1;

    public static void dfs(int startNode, int[][] graph) throws IOException {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (visited[node]) continue;   // 스택 DFS에서는 이게 안전함
            visited[node] = true;

            order[node] = number++;

            for (int neighbor : graph[node]) { // 오름차순 + 스택 => 실제 방문은 내림차순
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        order = new int[N + 1];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i <= N ; i++) {
            list.add(new ArrayList<>());
//            System.out.println("yes");
        }

        for (int i = 0 ; i < M ; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);

//            System.out.println(a + " " + b);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i), Comparator.reverseOrder());
        }

//        for (int i = 1; i < list.size(); i++) {
//            System.out.print(i + ": ");
//            for(int j = 0 ; j < list.get(i).size(); j++) {
//                System.out.print(list.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

        graph = new int[list.size()][];

        visited = new boolean[graph.length + 1];

        for (int i = 0; i < list.size(); i++) {
            graph[i] = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); j++) {
                graph[i][j] = list.get(i).get(j);
            }
        }

        dfs(R, graph);

        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(order[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}