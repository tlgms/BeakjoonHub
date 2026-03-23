import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        sc.nextLine();
        String a = sc.nextLine();
        String b;

        char[] arr = a.toCharArray();

        for (int i = 0; i < count - 1; i++) {
            b =  sc.nextLine();
            for  (int j = 0; j < a.length(); j++) {
                if(a.charAt(j) != b.charAt(j)) arr[j] = '?';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}