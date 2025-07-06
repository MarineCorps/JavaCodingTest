import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //네자리수 X가 주어지면, X+1년 또는 이후에 있는 가장빠른
        //특별한 해가 언제인지 구하기
        //substring 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int target=Integer.parseInt(br.readLine())+1;
        int answer=-1;
        while(target<=9999){
            int front=target/100;
            int back=target%100;
            int gop=(int)Math.pow(front+back,2);
            if(gop==target){
                answer=target;
                break;
            }
            else{
                target++;
            }
        }
        System.out.println(answer);
    }
}
