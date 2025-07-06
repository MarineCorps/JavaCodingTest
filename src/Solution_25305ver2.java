import java.io.*;
import java.util.*;
public class Solution_25305ver2 {
    public static void main(String[] args)throws IOException{
        //첫째 줄에 응시자의수, 사람의 수
        //수상할수있는 커트라인점수 계산
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken()); //응시자의 수
        int K=Integer.parseInt(st.nextToken()); //수상자의수

        Integer[] arr=new Integer[N];
        st=new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder()); //Integer같은 거로 해줘야됨

        bw.write(arr[K-1]+""); //제일높은 인덱스부터 K를 빼줌
        bw.flush();
        bw.close();
        br.close();

    }

}
