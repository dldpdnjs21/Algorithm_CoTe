import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double sum = 0;
		int max = 0;
		
		for(int i=0; i<N; i++) {
			int M =  Integer.parseInt(st.nextToken());
			
			if(M > max) {
				max = M;
			}
			sum += M;
		}
		double result = ((sum / max) * 100.0) / N;
		System.out.println(result);
	}
}
