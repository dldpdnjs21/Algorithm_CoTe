import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

//      dp[0]과 dp[1]은 연산이 필요없으므로 0으로 설정
        dp[0] = dp[1] = 0;

        for(int i = 2; i <= N; i++) {
//          현재 수에서 1을 뺀 경우
            dp[i] = dp[i - 1] + 1;

//          현재 수가 2로 나누어떨어질 경우, 2로 나누기
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
//          현재 수가 3으로 나누어떨어질 경우, 3으로 나누기
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}