import java.util.*;
import java.io.*;
public class Solution_11866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken(" "));
        int K=Integer.parseInt(st.nextToken(" "));
        //1번부터 N번까지의 사람이 원을 이루면서 있음
        //계속해서 줄을 이어간다는 느낌
        int count=1;
        Queue<Integer>q=new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.offer(i);
        }
        StringBuilder sb=new StringBuilder();
        sb.append("<");
        while(q.size()>1){
            if(count%K==0){
                //K번쨰인경우
                //큐에서 원소를제거하고 출력
                sb.append(q.poll()+"").append(", ");
                count++;

            }
            else{
                //K번째원소가 아닌경우
                //원소를 빼고 다시 뒤에 삽입함
                int num=q.poll();
                q.offer(num);
                count++;
            }
        }
        sb.append(q.poll()+"").append(">");
        bw.write(sb+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
