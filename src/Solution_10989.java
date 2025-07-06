import java.util.*;
import java.io.*;
public class Solution_10989 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);//역순으로 정렬
        br.close();
        for(int j=0; j<N; j++){
            bw.write(arr[j]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
