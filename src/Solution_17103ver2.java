import java.io.*;

public class Solution_17103ver2 {
    public static boolean[] prime=new boolean[1000001];
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        isprime();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<N; i++){
            int num=Integer.parseInt(br.readLine());
            int answer=0;
            for(int j=2; j<=num/2; j++){
                //순서만 다르고 두 소수가 같은경우는 같은파티션이므로 제외
                if(!prime[j]){ //소수일때
                    if(!prime[num-j]){
                        answer++;
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void isprime(){
        prime[0]=prime[1]=true; //true는 소수아님
        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j=i*i; j<prime.length; j+=i){
                prime[j]=true;
            }
        }
    }

}
