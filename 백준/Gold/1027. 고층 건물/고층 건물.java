import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numberOfBuildings = Integer.parseInt(br.readLine());

        int[] buildings = new int[numberOfBuildings];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numberOfBuildings; i++) {
            buildings[i] = Integer.parseInt(st.nextToken());
        }

        int bestView = 0;

        for (int i = 0; i < numberOfBuildings; i++) {
            double[] buildingInclination = new double[numberOfBuildings];

            for (int j = 0; j < numberOfBuildings; j++) {

                if ((i - j) == 0 || (buildings[i] - buildings[j]) == 0) {
                    buildingInclination[j] = 0;
                    continue;
                }

                buildingInclination[j] = ((double)(buildings[i] - buildings[j]) / (i - j));
            }

//            for (int j = 0; j < numberOfBuildings; j++) {
//                System.out.print(buildingInclination[j] + " ");
//            }
//            System.out.println("\n");

            int bestViweTemp = 0;

            for (int j = 0; j < i; j++) {
                boolean flag = true;

                for (int k = j + 1; k < i; k++) {
                    if (buildingInclination[j] >= buildingInclination[k]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    bestViweTemp++;
                }
            }

            for (int j = numberOfBuildings - 1; j > i; j--) {
                boolean flag = true;

                for (int k = j - 1; k > i; k--) {
                    if (buildingInclination[j] <= buildingInclination[k]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    bestViweTemp++;
                }
            }

//            System.out.println(bestViweTemp);

            if (bestViweTemp > bestView) {
                bestView = bestViweTemp;
            }
        }

        bw.write(String.valueOf(
                bestView
        ));

        bw.flush();
        bw.close();
    }
}