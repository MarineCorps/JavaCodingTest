import java.io.*;
public class Solution_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<N; i++){
            long prime=Long.parseLong(br.readLine());
            if(prime==0||prime==1){
                sb.append(2).append("\n");
                continue;
            }
            while(true){  //소수 찾기 알고리즘
                //제곱근까지만 검사해도됨
                long count=0;
                for(long j=2; j<=Math.sqrt(prime); j++){
                    if(prime%j==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    sb.append(prime).append("\n");
                    break;
                }
                prime++;
            }
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }

}

