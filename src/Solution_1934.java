import java.util.*;
import java.io.*;

class Solution_1934{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<num; i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int r=gcd(a,b);
            int answer=(a*b)/r;
            sb.append(answer).append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}