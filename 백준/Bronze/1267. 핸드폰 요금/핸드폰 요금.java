import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] callTimes = new int[N];
        for (int i = 0; i < N; i++) {
            callTimes[i] = sc.nextInt();
        }

        int yCost = 0;
        int mCost = 0;

        for (int time : callTimes) {
            yCost += ((time / 30) + 1) * 10;
            mCost += ((time / 60) + 1) * 15;
        }

        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (mCost < yCost) {
            System.out.println("M " + mCost);
        } else { // yCost == mCost
            System.out.println("Y M " + yCost);
        }

        sc.close();
    }
}