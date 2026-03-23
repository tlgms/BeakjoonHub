import java.io.*;
import java.util.*;

class Main {
    public static int IfFirstIsBlack(char[][] board) {
        char mustBeChessPiece = 'B';
        int difCount = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < board.length - 7; i++) {
            for (int j = 0; j < board[0].length - 7; j++) {
                difCount = 0;

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (mustBeChessPiece != board[k][l]) {
                            difCount++;
                        }
                        mustBeChessPiece = mustBeChessPiece == 'W' ? 'B' : 'W';
                    }
                    mustBeChessPiece = mustBeChessPiece == 'W' ? 'B' : 'W';
                }
                min = Math.min(min, difCount);
            }
        }
        return min;
    }

    public static int IfFirstIsWhite(char[][] board) {
        char mustBeChessPiece = 'W';
        int difCount = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < board.length - 7; i++) {
            for (int j = 0; j < board[0].length - 7; j++) {
                difCount = 0;

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (mustBeChessPiece != board[k][l]) {
                            difCount++;
                        }
                        mustBeChessPiece = mustBeChessPiece == 'W' ? 'B' : 'W';
                    }
                    mustBeChessPiece = mustBeChessPiece == 'W' ? 'B' : 'W';
                }
                min = Math.min(min, difCount);
            }
        }
        return min;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int difCount = 0;
        st = new StringTokenizer(br.readLine(), " ");
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        char[][] chessBoard = new char[y][x];

        for (int i = 0; i < y; i++) {
            chessBoard[i] = br.readLine().toCharArray();
        }

        int answer = Math.min(IfFirstIsBlack(chessBoard), IfFirstIsWhite(chessBoard));

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}