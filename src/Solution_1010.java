import java.util.*;
import java.io.*;
public class Solution_1010 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        //다리를 지을 수있는 경우의수
        // 서쪽  동쪽 순으로 주어짐 둘다 1이상 29 이하
        //다리끼리 겹쳐질 수 없음 -> 즉 크로스 안됨
        for(int i=0; i<N; i++){

        }
    }
    public static int factorial(int N){
        if(N<=1) return 1;
        return N*factorial(N-1);
    }
}
