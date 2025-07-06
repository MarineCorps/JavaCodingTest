import java.util.*;
import java.io.*;
public class Solution_1929 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());

        StringBuilder sb=new StringBuilder();
        boolean[] prime=new boolean[N+1];

        for(int i=2; i<=N; i++){
            //true = 소수아님 , false=소수
            if(prime[i]) continue; //소수가 아닌경우반복문의 끝으로 이동하여
                                   //다음 반복으로 넘어감
            if(i>=M) sb.append(i).append("\n");

            for(int j=i+i; j<=N; j+=i){ //i의 배수들을 전부 true로 바꿈
                prime[j]=true;
            }
        }
        //한줄에 하나씩 M이상 N이하의 소수

        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
    //Sieve of Eratosthenes : 에라토스테네스의 체(소수찾기 알고리즘)
}
