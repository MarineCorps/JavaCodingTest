import java.io.*;
import java.util.*;
public class Solution_25305 {
    public static void main(String[] args)throws IOException{
        //첫째 줄에 응시자의수, 사람의 수
        //수상할수있는 커트라인점수 계산
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()); //응시자의 수
        int K=Integer.parseInt(st.nextToken()); //수상자의수
        int[] arr=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[N-K]); //제일높은 인덱스부터 K를 빼줌
        br.close();

    }

}
