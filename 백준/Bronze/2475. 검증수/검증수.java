import java.util.*;
import java.io.*;
public class Main {
	
	static int N; //검증수
	static int sum = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); //공백을 구분자로 문자열을 토큰화
		
		//5개의 숫자를 입력 받기
		for(int i=0; i<5; i++) {
			N = Integer.parseInt(st.nextToken()); //토큰을 문자열로 가져와 정수로 변환
			sum += N * N; // 숫자의 제곱을 합에 더한다
		}
		
		int result = sum %10; //합의 마지막 자리 숫자 계산
		System.out.println(result);
	}
}
