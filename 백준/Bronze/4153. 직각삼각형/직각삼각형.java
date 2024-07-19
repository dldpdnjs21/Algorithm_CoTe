import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[3];
        
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i=0; i<3; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	Arrays.sort(arr);
        	if(arr[0]==0&&arr[1]==0&&arr[2]==0) {
        		break;
        	}else if((arr[0]*arr[0] + arr[1]*arr[1]) == arr[2]*arr[2]) {
        		System.out.println("right");
        	}else {
        		System.out.println("wrong");
        	}
        }
    }
}
