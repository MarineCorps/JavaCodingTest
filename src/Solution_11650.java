import java.util.*;
import java.io.*;
public class Solution_11650 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        //x좌표 기준으로 정렬하고 x좌표가 같은경우는 y좌표로 비교한다.
        //위치가 같은 두점은 없ㅇ므
        int[][] arr=new int[N][2];
        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[]o2){
                return  o1[0]!=o2[0]? o1[0]-o2[0]: o1[1]-o2[1];
                // 첫번째 기준 오름차순 > 두번째 기준 오름차순
                //첫원소가 같으면 => 두번째 원소로 비교해라 이뜻
            }
        });
        for(int i=0; i<N; i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
