import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int[][] field = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

            for (int j = Integer.parseInt(st.nextToken()) - 1; j >= 0; j--) {
                st = new StringTokenizer(br.readLine(), " ");

                field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            Function<int[][], List<List<int[]>>> FunctionToCountCabbages = (int[][] grid) -> {
                List<List<int[]>> clusters = new ArrayList<>();
                if (grid == null || grid.length == 0 || grid[0].length == 0) return clusters;

                int rows = grid.length;
                int cols = grid[0].length;

                boolean[][] visited = new boolean[rows][cols];

                int[] dr = {-1, 1, 0, 0};
                int[] dc = {0, 0, -1, 1};

                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        if (grid[r][c] == 1 && !visited[r][c]) {
                            List<int[]> newCluster = new ArrayList<>();
                            Deque<int[]> queue = new ArrayDeque<>();

                            queue.add(new int[]{r, c});
                            visited[r][c] = true;

                            while (!queue.isEmpty()) {
                                int[] cur = queue.poll();
                                int cr = cur[0];
                                int cc = cur[1];

                                newCluster.add(new int[]{cr, cc});

                                for (int k = 0; k < 4; k++) {
                                    int nr = cr + dr[k];
                                    int nc = cc + dc[k];

                                    if (0 <= nr && nr < rows && 0 <= nc && nc < cols
                                            && grid[nr][nc] == 1 && !visited[nr][nc]) {
                                        visited[nr][nc] = true;
                                        queue.add(new int[]{nr, nc});
                                    }
                                }
                            }
                            clusters.add(newCluster);
                        }
                    }
                }

                return clusters;
            };

            bw.write(String.valueOf(
                FunctionToCountCabbages.apply(field).size()
            ));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
