import java.util.*;
import java.io.*;
public class Solution_11651 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //y좌표를 기준으로 정렬 y좌표가 같으면 x좌표 기준으로 정렬
        int N=Integer.parseInt(br.readLine());
        int[][] arr=new int[N][2];
        //배열에 입력값을 전부 넣어줌
        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(o1,o2)->{
            return o1[1]!=o2[1]?o1[1]-o2[1]:o1[0]-o2[0];
        });
        for(int j=0; j<N; j++){
            bw.write(arr[j][0]+" "+arr[j][1]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
