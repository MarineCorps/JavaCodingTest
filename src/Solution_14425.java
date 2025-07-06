import java.util.*;
import java.io.*;
public class Solution_14425 {
    public static void main(String[] args)throws IOException{
        HashSet<String> str=new HashSet<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //첫째 줄에 문자열의 개수 N과 검사해야되는 M개의 문자열
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());//집합의 수
        int M=Integer.parseInt(st.nextToken());//검사해야하는 문자열
        for(int i=0; i<N; i++){
            str.add(br.readLine());
        }
        int count=0;
        for(int j=0; j<M; j++){
            if(str.contains(br.readLine())){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
