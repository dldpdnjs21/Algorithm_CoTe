import java.util.*;
import java.io.*;
public class Main {
	
	static int N;
	static int sum = 0;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
