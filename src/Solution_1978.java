import java.util.*;
import java.io.*;
public class Solution_1978 {
    public static void main(String[] args)throws IOException{
        //첫째줄에있는수는 수의개수
        //둘째줄은 수들
        //소수는 약수가 본인과 1밖에없으므로 약수의 개수가 2개인것만 출력
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int val=0;
        int answer=0;
        while(count>0){
            int num=Integer.parseInt(st.nextToken());
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    val++;
                }
            }
            if(val==2){
                answer++;
            }
            val=0;
            count--;

        }
        System.out.println(answer);
        br.close();
    }
}
