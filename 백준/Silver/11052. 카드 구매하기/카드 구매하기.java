import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //구매할 카드 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N+1];
        int[] money = new int[N+1];

        for(int i=1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1; i<=N; i++){
            for(int j=i; j <= N; j++){
                money[j] = Math.max(money[j], money[j-i] + arr[i]);
            }
        }
        System.out.println(money[N]);
    }
}