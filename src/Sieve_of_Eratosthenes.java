import java.util.*;
import java.io.*;
public class Sieve_of_Eratosthenes {
    public static boolean[] prime; // 메서드에서 사용할 배열
    public static void main(String[] args)throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        
        prime=new boolean[N+1];
        get_prime(); //함수 리콜
        
        StringBuilder sb=new StringBuilder();
        for(int i=M; i<=N; i++){
            //false는 소수
            if(!prime[i]) sb.append(i).append("\n");
            //false인 경우만 출력
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();

    }
    public static void get_prime(){
        //true=소수아님  false=소수
        prime[0]=prime[1]=true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue; //true인경우는 다음반복문으로
            //예를들어  4는이미 true이므로
            //5로 넘어가도록 continue 사용
            for(int j=i*i; j<prime.length; j+=i){
                //i의 배수들을 전부 true로
                prime[j]=true;
            }
        }
    }
}
