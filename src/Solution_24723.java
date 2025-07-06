import java.util.*;
import java.io.*;
public class Solution_24723 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        bw.write(zaegop(N)+"");
        //bw.write((int)Math.pow(2,N)+"");
        bw.flush();
        bw.close();
        br.close();
    }
    public static int zaegop(int N){
        int num=1;
        for(int i=0; i<N; i++){
            num=num*2;
        }
        return num;
    }
}
