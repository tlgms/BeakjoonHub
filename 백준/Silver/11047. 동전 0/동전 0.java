import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int coinCount = Integer.parseInt(st.nextToken());
        int mustBeCash = Integer.parseInt(st.nextToken());

        int usedCoinCount = 0;

        int[] coins = new int[10];

        for(int i = 0; i < coinCount; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int coinPointer = coinCount - 1;
        while(true) {
            if(mustBeCash == 0) {
                break;
            }
            if(coins[coinPointer] <= mustBeCash) {
                usedCoinCount++;
                mustBeCash -= coins[coinPointer];
            } else {
                if(coinPointer != 0) {
                    coinPointer--;
                } else {
                    break;
                }
            }
        }

        bw.write(String.valueOf(usedCoinCount));

        bw.close();
        br.close();
    }
}