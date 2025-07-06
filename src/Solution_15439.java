import java.util.*;
import java.io.*;
public class Solution_15439 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        //상의와 하의가 서로 다른 색상인 조합의 가짓수를 출력
        int N=Integer.parseInt(br.readLine());
        bw.write(N*(N-1)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
