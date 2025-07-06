import java.util.*;
import java.io.*;
public class Solution_11050 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //이항정리란 a b 가 주어졌을때 a개중에서 b개를 뽑는 경우의 수
        /*
        *     a!
        * (a-b)!*b!
        * */
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken(" "));
        int K=Integer.parseInt(st.nextToken(" "));
        br.close();

        int val=factorial(N)/(factorial(K)*factorial(N-K));

        bw.write(val+"");
        bw.flush();
        bw.close();
    }
    public static int factorial(int N){
        if(N<=1) return 1;
        return N*factorial(N-1);
    }

}
