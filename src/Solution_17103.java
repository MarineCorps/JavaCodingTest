import java.util.*;
import java.io.*;
public class Solution_17103 {
    public static boolean[] prime;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //2보다 큰 짝수는 두 소수의 합으로 나타낼수있다.
        int N=Integer.parseInt(br.readLine()); //테스트 케이스 개수
        //정수가 주어졌을때 그 정수 이하의 소수를 전부구함
        //그 소수들을 배열이나 콜렉션에 저장을 해야되는데...
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<N; i++){
            int num=Integer.parseInt(br.readLine());
            sb.append(isprime(num)).append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static int isprime(int N){
        prime=new boolean[N];
        int answer=0;
        ArrayList<Integer> sosu=new ArrayList<>();
        prime[0]=prime[1]=true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue;

            for(int j=i*i; j<prime.length; j+=i){
                prime[j]=true;
            }
        }
        for(int i=0; i<prime.length; i++){
            if(!prime[i]) sosu.add(i);
        }

        for(int j=0; j<sosu.size();j++){
            int A=sosu.get(j);
            int B=N-A; //N에서 A(소수)를 뺀게 소수면 ++
            if(A>B) break; //중복을 제거아히기위한 로직(5,3)(3,5)는 같으므로
            if(!prime[B]) {
                answer++;
            }
        }
        return answer;
    }
}
