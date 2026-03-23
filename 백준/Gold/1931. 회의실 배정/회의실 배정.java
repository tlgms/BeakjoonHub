import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numberOfMeetings  = Integer.parseInt(br.readLine());
        int[][] meetings = new int[numberOfMeetings][2];

        int numberOfPossibleMeetings = 0;

        for (int i = 0; i < numberOfMeetings; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
//        for (int i = 0; i < numberOfMeetings; i++) {
//            System.out.println(meetings[i][0] + " " + meetings[i][1]);
//        }
//        System.out.println();

        int currentTime = 0;
//        for (int i = 0; i < numberOfMeetings; i++) {
//            if (currentTime > meetings[i][1]) {
//                currentTime = meetings[i][1];
////                System.out.println(currentTime);
//            }
//        }
//        numberOfPossibleMeetings++;
//        System.out.println(currentTime + " " + numberOfPossibleMeetings);
//
//        int theEarliestMeetingTime = Integer.MAX_VALUE;
//        for (int i = 0; i < numberOfMeetings; i++) {
//            for (int j = i; j < numberOfMeetings; j++) {
//                if (currentTime <= meetings[j][0]) {
//                    theEarliestMeetingTime = meetings[j][1];
//                    if (theEarliestMeetingTime > meetings[j][1]) {
//                        theEarliestMeetingTime = meetings[j][1];
//                    } else {
//                        break;
//                    }
//                }
//            }
//            currentTime = theEarliestMeetingTime;
//            numberOfPossibleMeetings++;
//            System.out.println(currentTime + " " + numberOfPossibleMeetings);
//        }

        for (int i = 0; i < numberOfMeetings; i++) {
            if (currentTime <= meetings[i][0]) {
                currentTime = meetings[i][1];
                numberOfPossibleMeetings++;
            }
        }

        //1071
        bw.write(String.valueOf(numberOfPossibleMeetings));

        bw.close();
        br.close();
    }
}