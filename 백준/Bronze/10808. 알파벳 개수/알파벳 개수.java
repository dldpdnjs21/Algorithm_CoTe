import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = br.readLine();

        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i)-97;
            arr[a]++;
        }
        for(int j=0; j<26; j++){
            System.out.print(arr[j] +" ");
        }
    }
}