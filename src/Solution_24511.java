import java.util.*;
import java.io.*;
public class Solution_24511 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        //어차피  스택에들어가도 그냥 나오므로 큐인 원소만덱에넣어서 처리
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            //큐는 0 스택은1
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Deque<Integer> dq=new ArrayDeque<>();

        st=new StringTokenizer(br.readLine());
        for(int j=0; j<N; j++){
            int num=Integer.parseInt(st.nextToken());
            if(arr[j]==0){
                dq.offerLast(num); // 1 4이런식으로 저장해야 되므로 뒤에서부터 넣음
            }
        }  //현재 덱 1 4  첫번쨰에다 넣고 마지막껄 뺴면됨
        //한칸씩 뒤로 밀리게됨
        int size=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int k=0; k<size; k++){
            int val=Integer.parseInt(st.nextToken());
            dq.offerFirst(val);
            sb.append(dq.pollLast()).append(" ");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
