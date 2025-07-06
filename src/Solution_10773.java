import java.util.*;
import java.io.*;
public class Solution_10773 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //0을 외쳐서, 가장최근에 쓴수를 지움
        //가장최근데 쓴 수를 지운다 => 후입 선출
        //불필요한 반복문을 사용하지말것
        Stack<Integer> money=new Stack<>();
        int N=Integer.parseInt(br.readLine());
        long answer=0;
        for(int i=0; i<N; i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                answer-=money.pop();
            }
            else{
                answer+=num;
                money.push(num);
            }
        }
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
