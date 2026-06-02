class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int n = board.length;
        int m = board[0].length;
        
        // System.out.println(n + " " + m);
        
        int[][] boomLocation = new int[n][m];
        
        for (int i = 0; i < n; i++) { // 레전드 완전탐색
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
                    int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

                    for (int k = 0; k < 9; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];

                        if (ni >= 0 && ni < boomLocation.length && 
                            nj >= 0 && nj < boomLocation[0].length) {
                            boomLocation[ni][nj] = 1;
                            
                            // System.out.println(-1);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (boomLocation[i][j] == 0) {
                    answer++;
                    
                    // System.out.println(-1);
                }
            }
        }
        
        return answer;
    }
}