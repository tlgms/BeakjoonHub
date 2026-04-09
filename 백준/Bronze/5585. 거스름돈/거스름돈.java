import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());

        int jandondon = (1000 - Integer.parseInt(br.readLine()));

        int jandongesu = 0;

        while (true) {
//            System.out.println(jandondon);

            if (jandondon >= 500) {
                jandondon -= 500;
                jandongesu++;

                continue;
            }

            if (jandondon >= 100) {
                jandondon -= 100;
                jandongesu++;

                continue;
            }

            if (jandondon >= 50) {
                jandondon -= 50;
                jandongesu++;

                continue;
            }

            if (jandondon >= 10) {
                jandondon -= 10;
                jandongesu++;

                continue;
            }

            if (jandondon >= 5) {
                jandondon -= 5;
                jandongesu++;

                continue;
            }

            if (jandondon >= 1) {
                jandondon--;
                jandongesu++;

                continue;
            }

            if (jandondon <= 0) {
                break;
            }
        }

        bw.write(String.valueOf(
                jandongesu
        ));

        bw.flush();
        bw.close();
    }
}