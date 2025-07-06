import java.util.*;
import java.io.*;
//가감법 버전으로 만들어보기
public class Solution_19532 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=0;
        int y=0;
        //첫번째 a와 d의 부호가 같은지 확인
        int a=Integer.parseInt(st.nextToken());//1번식 x계수
        int b=Integer.parseInt(st.nextToken());//1번식 y계수
        int c=Integer.parseInt(st.nextToken());//1번식 상수항
        int d=Integer.parseInt(st.nextToken());//2번식 x계수
        int e=Integer.parseInt(st.nextToken());//2번식 y계수
        int f=Integer.parseInt(st.nextToken());//2번식 상수항
        br.close();

        for(int i=-999; i<=999; i++){
            for(int j=-999; j<=999; j++){
                if((a*i)+(b*j)==c && (d*i)+(e*j)==f){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        System.out.println(x+" "+y);


    }
}
