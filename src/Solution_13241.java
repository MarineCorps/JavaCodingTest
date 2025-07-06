import java.util.*;
import java.io.*;
public class Solution_13241 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int r=gcd(A,B);
        //나중에 최소공배수만 long으로 선언
        long gop=(long)A*B;
        long answer=gop/r;
        bw.write(answer+"");
        bw.flush();
        br.close();
        bw.close();
    }
    //최대공약수 를구함
    public static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
