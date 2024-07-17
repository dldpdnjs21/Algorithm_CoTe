import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); //나무의 수
        int M = Integer.parseInt(st.nextToken()); //집에 가져갈 나무의 길이
        int H; //절단기 높이
        
        int[] arr = new int[N];
        
        int min = 0;
        int max = -1;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	max = Math.max(max, arr[i]);
        }
        while(min <= max) {
        	int mid = (min+max)/2;
        	long sum = 0;
        	for(int i=0; i<N; i++) {//잘린 나무의 길이 합을 구하기
        		if(arr[i] > mid) {
        			sum += arr[i] - mid;
        		}
        	}
        	if(sum < M) {//자른 나무 합이 가져갈 나무의 길이보다 작으면 자르는 위치(max)를 낮추기 
        		max = mid - 1;
        	} else {
        		min = mid + 1;
        	}
        }
        System.out.println(max);
    }
}