import java.util.*;
import java.io.*;
public class Factorial {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        br.close();
        int sum=1;
        while(N!=0){
            sum=sum*N;
            N--;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}
