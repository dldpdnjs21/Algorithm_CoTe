import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String[] str = br.readLine().split("");	
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(str[i]);
			
		}
		System.out.println(sum);
	}
}