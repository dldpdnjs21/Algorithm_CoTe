import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(90 <= N && N <= 100){
            System.out.println("A");
        } else if(80 <= N && N <= 89){
            System.out.println("B");
        } else if(70 <= N && N <= 79){
            System.out.println("C");
        } else if(60 <= N && N <= 69){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}