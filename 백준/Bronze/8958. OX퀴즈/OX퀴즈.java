import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String result = br.readLine();
            int cnt = 0;
            int sum = 0;

            for (char c : result.toCharArray()) {
                if (c == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }

            System.out.println(sum);
        }
    }
}