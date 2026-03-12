import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int NumberOfPlayers = Integer.parseInt(br.readLine());
        String[] players = new String[NumberOfPlayers];

        List<String> sameFirstName = new ArrayList<>();

        for (int i = 0; i < NumberOfPlayers; i++) {
            players[i] = br.readLine();
        }

        for (int i = 0; i < NumberOfPlayers; i++) {
            if (sameFirstName.contains(String.valueOf(players[i].charAt(0)))) {
                continue;
            }

            int flag = 0;

            for (int j = i ; j < NumberOfPlayers; j++) {
                if (players[i].charAt(0) == players[j].charAt(0)) {
                    flag++;
                }
            }

            if (flag >= 5) {
//                System.out.println(players[i]);

                sameFirstName.add(String.valueOf(
                        players[i].charAt(0)
                ));
            }
        }

        Collections.sort(sameFirstName);
        
        String answer;

        if (sameFirstName.isEmpty()) {
            answer = "PREDAJA";
        } else {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < sameFirstName.size(); i++) {
                sb.append(sameFirstName.get(i));
            }

            answer = sb.toString();
        }

        bw.write(answer);

        bw.flush();
        bw.close();
    }
}