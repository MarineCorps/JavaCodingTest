import java.util.*;
import java.io.*;
//4개의좌표를 입력받고 x의 최소 최대 ,y의 최대 최소를 꼭짓점으로
public class Solution_9063 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] x_arr=new int[N];
        int[] y_arr=new int[N];

        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            x_arr[i]=Integer.parseInt(st.nextToken());
            y_arr[i]=Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(x_arr);
        Arrays.sort(y_arr);
        System.out.println((x_arr[N-1]-x_arr[0])*(y_arr[N-1]-y_arr[0]));
    }
}
