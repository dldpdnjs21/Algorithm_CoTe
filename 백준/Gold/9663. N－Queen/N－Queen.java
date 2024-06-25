import java.util.Scanner;

public class Main {
	static int[] spaces;
	static int N;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //체스판 한 변의 길이
		
		for(int i=1; i<N+1; i++) {
			spaces = new int[N+1];
			spaces[1] = i;//(1,i)에 퀸
			dfs(2);
		}//for문
		System.out.println(count);
		
		sc.close();
	}//main
	
	static void dfs(int depth) {
		if(depth > N) {
			count++;
			return;
		}else {
			for(int i=1; i<N+1; i++) {
				spaces[depth] = i; //(depth,i)에 퀸
				if(check(depth)) {
					dfs(depth+1);
				}
			}
		}
	}//dfs
	
	static boolean check(int depth) {
		
		for(int i=1; i<depth; i++) {
			//열이 같으면 false
			if(spaces[i]==spaces[depth]) return false;
			// 00 01 02 03
			// 10 11 12 13
			// 20 21 22 23
			// 30 31 32 33
			
			//양방향 대각선
			if(Math.abs(i-depth) == Math.abs(spaces[i]-spaces[depth]))
				return false;
		}//for문
		return true;
	}//check
}//end class


/*
 	2차원 배열을 1차원 배열로 바꾸면 효율성 UP
	2차원 배열 -> map[depth][x] = 1 로 퀸의 여부 체크
	1차원 배열 -> map[depth] = x 로 체크
	ex) map[1]=1 ==> (1,1)에 퀸이 존재 
	한 열(depth)에 퀸이 하나만 올 수 있기 때문이다
*/






