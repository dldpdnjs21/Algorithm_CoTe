import java.util.*;
import java.io.*;

public class Main {
	
	static int N, M;
	static int[] arr;
	static boolean[] isUsed;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M+1];
		isUsed = new boolean[N+1];
		
		dfs(0);
		
	}

	private static void dfs(int depth) {
		if(depth == M) {
			for(int i=0; i<M; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if(!isUsed[i]) {
				isUsed[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				isUsed[i] = false;
			}
		}
		
	}
}
