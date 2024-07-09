import java.util.*;
import java.io.*;
public class Main {
	
	static int N;
	static int sum = 0;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); 
		
		if(((N%4==0) && (N%100!=0)) || (N%400==0)){
			System.out.println("1");
		}else 
			System.out.println("0");
		sc.close();
	}
}
