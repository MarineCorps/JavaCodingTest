import java.io.*;
public class Solution_4948 {
    public static boolean[] prime=new boolean[246913];
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //에라토스 테네스의 체 or소수찾기
        StringBuilder sb=new StringBuilder();
        isprime();
        while(true){
            int count=0;
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                break;
            }
            for(int i=num+1; i<=num*2; i++){
                if(!prime[i]){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void isprime(){
        //true=소수가 아님 false=소수임
        prime[0]=prime[1]=true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue; //true인경우는 다음반복문으로

            for(int j=i*i; j<prime.length; j+=i){
                //i의 배수들을 전부 true로
                prime[j]=true;
            }
        }

    }
}
