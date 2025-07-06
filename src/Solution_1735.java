import java.util.*;
import java.io.*;
public class Solution_1735 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //그냥 분모끼리 곱한거로 분모를 통일시켜서 더한다음에 마지막에 분자 분모의
        //최대공약수를 찾아서 나눠주면됨
        StringTokenizer st=new StringTokenizer(br.readLine());
        int bunja1=Integer.parseInt(st.nextToken());
        int bunmo1=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int bunja2=Integer.parseInt(st.nextToken());
        int bunmo2=Integer.parseInt(st.nextToken());
        //분모
        int mer_bunmo=bunmo1*bunmo2; //35
        //분자의 합
        int bunjahap=(bunja1*bunmo2)+(bunja2*bunmo1); //31
        int r=gcd(bunjahap,mer_bunmo); //최대공약수를 찾았음
        //이제 찾은 최대공약수를 분자 분모 각각 나눠주면 정답임
        bw.write(bunjahap/r+" "+mer_bunmo/r);
        bw.flush();
        bw.close();
        br.close();
    }
    //재귀 함수로 구현
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

}
