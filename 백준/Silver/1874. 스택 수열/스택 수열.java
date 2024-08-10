import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int x = 1;

        boolean b = true;
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());

            while (x <= t) {
                ad.push(x);
                sb.append("+\n");
                x++;
            }

            if (!ad.isEmpty() && ad.peek() == t) {
                ad.pop();
                sb.append("-\n");
            } else {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}